package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.DspCustomerManagementMapper;
import com.mk.ad.mapper.DspFinanceMapper;
import com.mk.ad.mapper.SysUserMapper;
import com.mk.ad.service.DspFinanceService;
import com.mk.ad.utils.IDGen;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.*;
import com.mk.ad.vo.Request.AdminDspFinanceRequestDTO;
import com.mk.ad.vo.Response.AdminDspFinanceResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
@Slf4j
@Service
@Repository
public class DspFinanceServiceImpl implements DspFinanceService {

    @Autowired
    private DspFinanceMapper dspFinanceMapper;
    @Autowired
    private DspCustomerManagementMapper dspCustomerManagementMapper;
    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public LarkPageInfoVo<AdminDspFinanceResponseDTO> getDspFinanceList(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO) {

        DspCustomerManagementExample example = new DspCustomerManagementExample();
        DspCustomerManagementExample.Criteria criteria = example.createCriteria();
        if(0 != adminDspFinanceRequestDTO.getCustomer_type()){
            criteria.andCustomer_typeEqualTo(adminDspFinanceRequestDTO.getCustomer_type());
        }else{
            List ll = new ArrayList<>();ll.add(1);ll.add(2);
            criteria.andCustomer_typeIn(ll);
        }
        if(!"".equals(adminDspFinanceRequestDTO.getCompany_profile())){
            criteria.andCompany_profileLike("%"+adminDspFinanceRequestDTO.getCompany_profile()+"%");
        }
        PageHelper.startPage(adminDspFinanceRequestDTO.getPage(),adminDspFinanceRequestDTO.getLimit());
        List<DspCustomerManagement> dspCustomerManagements = dspCustomerManagementMapper.selectByExample(example);
        PageInfo<DspCustomerManagement> pageInfo = new PageInfo<>(dspCustomerManagements);
        List<AdminDspFinanceResponseDTO> list = dspCustomerManagements.stream().map(msg ->{
            AdminDspFinanceResponseDTO event = new AdminDspFinanceResponseDTO();
            event.setId(msg.getId());
            event.setCorporate_name(msg.getCorporate_name());
            event.setCompany_profile(msg.getCompany_profile());
            event.setCustomer_type(msg.getCustomer_type());
            Map result =dspFinanceMapper.getMoney(msg.getId());
            event.setTotal_recharge(BigDecimal.valueOf(Integer.valueOf(result.get("total_recharge").toString()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            event.setRefund_amount(BigDecimal.valueOf(Integer.valueOf(result.get("refund_amount").toString()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            event.setTotal_consume(BigDecimal.valueOf(Integer.valueOf(result.get("total_consume").toString()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            event.setMoney(BigDecimal.valueOf(Integer.valueOf(result.get("money").toString()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            event.setReturn_balance(BigDecimal.valueOf(Integer.valueOf(result.get("return_balance").toString()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            event.setTotal_balance(BigDecimal.valueOf(Integer.valueOf(result.get("total_balance").toString()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminDspFinanceResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminDspFinanceRequestDTO.getLimit(), adminDspFinanceRequestDTO.getPage());
    }

    @Override
    public Integer DspupdateFinance(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO, String userId) {
        Map pream = new HashMap();
        DspFinance dspFinance = new DspFinance();
        Integer transfer_amount = adminDspFinanceRequestDTO.getTransfer_amount() * 10000;
        Integer return_balance = adminDspFinanceRequestDTO.getReturn_balance() * 10000;
        Integer id = Integer.valueOf(adminDspFinanceRequestDTO.getId());
        pream.put("id",id);
        pream.put("transfer_amount",transfer_amount);
        pream.put("return_balance",return_balance);
        Integer i = 0 ;
        if(1 == adminDspFinanceRequestDTO.getDeal_type()){
            //修改用户金额
            i = dspFinanceMapper.addMoney(pream);

            //添加日志
            dspFinance.setCreate_time(new Date());
            dspFinance.setId(Integer.valueOf(IDGen.generateNumber()));
            dspFinance.setMid(id);
            dspFinance.setDeal_type(adminDspFinanceRequestDTO.getDeal_type());
            dspFinance.setSystem_type(1);
            dspFinance.setUser_id(userId);
            dspFinance.setAccount_show(transfer_amount.toString());
            Integer tt = dspFinanceMapper.selectTotalBalance(id);
            dspFinance.setTotal_balance(tt);
            i = dspFinanceMapper.insertSelective(dspFinance);

        }else if(2 == adminDspFinanceRequestDTO.getDeal_type()){
            //修改用户金额
            i = dspFinanceMapper.reduceReMoney(pream);

            //添加日志
            dspFinance.setCreate_time(new Date());
            dspFinance.setId(Integer.valueOf(IDGen.generateNumber()));
            dspFinance.setMid(id);
            dspFinance.setDeal_type(adminDspFinanceRequestDTO.getDeal_type());
            dspFinance.setSystem_type(1);
            dspFinance.setUser_id(userId);
            dspFinance.setAccount_show(transfer_amount.toString());
            Integer tt = dspFinanceMapper.selectTotalBalance(id);
            dspFinance.setTotal_balance(Integer.valueOf(tt));
            i = dspFinanceMapper.insertSelective(dspFinance);

        }

        return i;
    }

    @Override
    public LarkPageInfoVo<AdminDspFinanceResponseDTO> getBankAccountList(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO) {

        DspCustomerManagementExample example = new DspCustomerManagementExample();
        DspCustomerManagementExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(adminDspFinanceRequestDTO.getCompany_profile())){
            Pattern pattern = Pattern.compile("[0-9]*");
            boolean matches = pattern.matcher(adminDspFinanceRequestDTO.getCompany_profile()).matches();
            if(matches){
                criteria.andIdEqualTo(Integer.valueOf(adminDspFinanceRequestDTO.getCompany_profile()));
            }else{
                criteria.andCorporate_nameLike("%"+adminDspFinanceRequestDTO.getCompany_profile()+"%");
            }
        }
        example.setOrderByClause("creat_time desc");
        PageHelper.startPage(adminDspFinanceRequestDTO.getPage(),adminDspFinanceRequestDTO.getLimit());
        List<DspCustomerManagement> dspCustomerManagements = dspCustomerManagementMapper.selectByExample(example);
        PageInfo<DspCustomerManagement> pageInfo = new PageInfo<>(dspCustomerManagements);
        List<AdminDspFinanceResponseDTO> list = dspCustomerManagements.stream().map(msg ->{
            AdminDspFinanceResponseDTO event = new AdminDspFinanceResponseDTO();
            event.setId(msg.getId());
            event.setCorporate_name(msg.getCorporate_name());
            event.setCompany_profile(msg.getCompany_profile());
            event.setAccount_name(msg.getAccount_name());
            event.setBank_deposit(msg.getBank_deposit());
            event.setBank_account(msg.getBank_account());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminDspFinanceResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminDspFinanceRequestDTO.getLimit(), adminDspFinanceRequestDTO.getPage());
    }

    @Override
    public LarkPageInfoVo<AdminDspFinanceResponseDTO> getDspFinanceLogList(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO) {

        DspFinanceExample example = new DspFinanceExample();
        DspFinanceExample.Criteria criteria = example.createCriteria();

        if(0 != adminDspFinanceRequestDTO.getDeal_type()){
            criteria.andDeal_typeEqualTo(adminDspFinanceRequestDTO.getDeal_type());
        }
        if(StringUtils.isNotEmpty(adminDspFinanceRequestDTO.getId())){
            criteria.andIdEqualTo(Integer.valueOf(adminDspFinanceRequestDTO.getId()));
        }


        criteria.andSystem_typeEqualTo(1);
        example.setOrderByClause("create_time desc");
        PageHelper.startPage(adminDspFinanceRequestDTO.getPage(),adminDspFinanceRequestDTO.getLimit());
        List<DspFinance> dspFinance = dspFinanceMapper.selectByExample(example);
        PageInfo<DspFinance> pageInfo = new PageInfo<>(dspFinance);
        List<AdminDspFinanceResponseDTO> list = dspFinance.stream().map(msg ->{
            AdminDspFinanceResponseDTO event = new AdminDspFinanceResponseDTO();
            event.setId(msg.getMid());
            event.setCreate_time(msg.getCreate_time());
            event.setUser_id(msg.getUser_id());
            SysUser sysUser = sysUserMapper.selectByPrimaryKey(msg.getUser_id());
            event.setUser_name(sysUser.getReal_name());
            DspCustomerManagement dspCustomerManagement = dspCustomerManagementMapper.selectByPrimaryKey(msg.getMid());
            event.setCorporate_name(dspCustomerManagement.getCorporate_name());
            event.setCompany_profile(dspCustomerManagement.getCompany_profile());
            event.setCustomer_type(dspCustomerManagement.getCustomer_type());
            event.setTotal_balance(BigDecimal.valueOf(Integer.valueOf(msg.getTotal_balance().toString()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            event.setAccount_show(BigDecimal.valueOf(Integer.valueOf(msg.getAccount_show()).doubleValue()/10000).setScale(2, RoundingMode.HALF_UP).toString());
            event.setDeal_type(msg.getDeal_type());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminDspFinanceResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminDspFinanceRequestDTO.getLimit(), adminDspFinanceRequestDTO.getPage());
    }
}