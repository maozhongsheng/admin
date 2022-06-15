package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminDspAccountMapper;
import com.mk.ad.mapper.DspCustomerManagementMapper;
import com.mk.ad.mapper.SysUserMapper;
import com.mk.ad.mapper.mymapper.MyBussinessTypeOneMapper;
import com.mk.ad.service.AdminDspAccountService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.PasswordUtils;
import com.mk.ad.vo.AdminDspAccount;
import com.mk.ad.vo.AdminDspAccountExample;
import com.mk.ad.vo.DspCustomerManagement;
import com.mk.ad.vo.Request.AdminDspAccountRequestDTO;
import com.mk.ad.vo.Response.AdminDspAccountResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
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
public class AdminDspAccountServiceImpl implements AdminDspAccountService {

    @Autowired
    AdminDspAccountMapper adminDspAccountMapper;

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    MyBussinessTypeOneMapper myBussinessTypeOneMapper;

    @Autowired
    DspCustomerManagementMapper dspCustomerManagementMapper;

    @Override
    public LarkPageInfoVo<AdminDspAccountResponseDTO> getDspList(AdminDspAccountRequestDTO adminDspAccountRequestDTO) {
        AdminDspAccountExample example = new AdminDspAccountExample();
        AdminDspAccountExample.Criteria criteria = example.createCriteria();

        if (adminDspAccountRequestDTO.getIndustryType() != null){
            criteria.andIndustry_typeEqualTo(adminDspAccountRequestDTO.getIndustryType());
        }

        if (adminDspAccountRequestDTO.getStatus() != null){
            criteria.andStatusEqualTo(adminDspAccountRequestDTO.getStatus());
        }

        if(StringUtils.isNotBlank(adminDspAccountRequestDTO.getCompanyName())){
            criteria.andCompany_nameEqualTo(adminDspAccountRequestDTO.getCompanyName());
        }

        PageHelper.startPage(adminDspAccountRequestDTO.getPage(),adminDspAccountRequestDTO.getLimit());
        List<AdminDspAccount> adminDspList = adminDspAccountMapper.selectByExample(example);
        PageInfo<AdminDspAccount> pageInfo = new PageInfo<>(adminDspList);
        List<AdminDspAccountResponseDTO> list = adminDspList.stream().map(msg ->{
//            SysUser sysUser = sysUserMapper.selectByPrimaryKey(msg.getUser_id());//根据userid查询用户信息
            AdminDspAccountResponseDTO event = new AdminDspAccountResponseDTO();//账户信息
            event.setId(msg.getId());
            event.setCompanyName(msg.getCompany_name());
            event.setStatus(msg.getStatus());
            event.setIndustryType(msg.getIndustry_type());
            event.setLicenseNumber(msg.getLicense_number());
            event.setOrganizationCode(msg.getOrganization_code());
            event.setShareholder(msg.getShareholder());
            event.setLicenseImage(msg.getLicense_image());
            event.setDockingWay(msg.getDocking_way());
//            event.setContacts(sysUser.getReal_name());
//            event.setPhone(sysUser.getPhone());
//            event.setEmail(sysUser.getEmail());
//            event.setPassword(sysUser.getPassword());
//            event.setAddress(sysUser.getAddress());
            event.setSettlementWay(msg.getSettlement_way());
            event.setProfit(msg.getProfit());
            event.setPayee(msg.getPayee());
            event.setBankDeposit(msg.getBank_deposit());
            event.setBankAccount(msg.getBank_account());
            event.setCreateTime(msg.getCreate_time());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String create = format.format(msg.getCreate_time());
            if(msg.getLast_time()!=null){
                String endTime = format.format(msg.getLast_time());
                event.setEndTime(endTime);
            }

            event.setCreateT(create);


            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminDspAccountResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminDspAccountRequestDTO.getLimit(), adminDspAccountRequestDTO.getPage());
    }

    @Override
    public Integer insertDsp(AdminDspAccountRequestDTO adminDsp) {
        //用户信息存入user表
        SysUser sysUser = new SysUser();
        sysUser.setId(UUID.randomUUID().toString());
        String salt= PasswordUtils.getSalt();
        String ecdPwd=PasswordUtils.encode(adminDsp.getPassword(),salt);
        sysUser.setSalt(salt);
        sysUser.setPassword(ecdPwd);
        sysUser.setReal_name(adminDsp.getContacts());
        sysUser.setPhone(adminDsp.getPhone());
        sysUser.setUsername(adminDsp.getEmail());
        sysUser.setEmail(adminDsp.getEmail());
        sysUser.setAddress(adminDsp.getAddress());
        sysUser.setCreate_time(new Date());
        sysUser.setDeleted(1);
        sysUser.setSystem_id(2);
        sysUserMapper.insertSelective(sysUser);

        //账户信息存入账户表
        AdminDspAccount ada = new AdminDspAccount();
        ada.setUser_id(sysUser.getId());
        ada.setCompany_name(adminDsp.getCompanyName());
        ada.setIndustry_type(adminDsp.getIndustryType());
        ada.setLicense_number(adminDsp.getLicenseNumber());
        ada.setOrganization_code(adminDsp.getOrganizationCode());
        ada.setShareholder(adminDsp.getShareholder());
        ada.setLicense_image(adminDsp.getLicenseImage());
        ada.setDocking_way(adminDsp.getDockingWay());
        ada.setSettlement_way(adminDsp.getSettlementWay());
        ada.setPayee(adminDsp.getPayee());
        ada.setBank_deposit(adminDsp.getBankDeposit());
        ada.setBank_account(adminDsp.getBankAccount());
        ada.setCreate_time(new Date());
        ada.setStatus(0);
        ada.setIs_deleted(1);

        return adminDspAccountMapper.insertSelective(ada);
    }

    @Override
    public AdminDspAccountResponseDTO getDspInfo(Long id) {
        AdminDspAccount adminDspAccount = adminDspAccountMapper.selectByPrimaryKey(id);//账户信息
        AdminDspAccountResponseDTO asr = new AdminDspAccountResponseDTO();
        asr.setId(adminDspAccount.getId());
        asr.setCompanyName(adminDspAccount.getCompany_name());
        asr.setStatus(adminDspAccount.getStatus());
        asr.setIndustryType(adminDspAccount.getIndustry_type());
        asr.setLicenseNumber(adminDspAccount.getLicense_number());
        asr.setOrganizationCode(adminDspAccount.getOrganization_code());
        asr.setShareholder(adminDspAccount.getShareholder());
        asr.setLicenseImage(adminDspAccount.getLicense_image());
        asr.setDockingWay(adminDspAccount.getDocking_way());
        asr.setSettlementWay(adminDspAccount.getSettlement_way());
        asr.setProfit(adminDspAccount.getProfit());
        asr.setPayee(adminDspAccount.getPayee());
        asr.setBankDeposit(adminDspAccount.getBank_deposit());
        asr.setBankAccount(adminDspAccount.getBank_account());
        asr.setCreateTime(adminDspAccount.getCreate_time());

        SysUser su = sysUserMapper.selectByPrimaryKey(adminDspAccount.getUser_id());//用户id
        asr.setContacts(su.getReal_name());
        asr.setPhone(su.getPhone());
        asr.setEmail(su.getEmail());
        asr.setPassword(su.getPassword());
        asr.setAddress(su.getAddress());

        return asr;
    }

    @Override
    public Integer updateDsp(AdminDspAccountRequestDTO adminDspAccount) {
        SysUser sysUser = new SysUser();
        sysUser.setId(adminDspAccount.getUserId());
        sysUser.setReal_name(adminDspAccount.getContacts());
        sysUser.setPhone(adminDspAccount.getPhone());
        sysUser.setEmail(adminDspAccount.getEmail());
        sysUser.setAddress(adminDspAccount.getAddress());
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public Integer UpdateDspStatus(Map params) {
        Integer resutl =  adminDspAccountMapper.UpdateDspStatus(params);

        return resutl;
    }

    @Override
    public Integer updateDspAccount(AdminDspAccountRequestDTO adminDspAccount) {
        DspCustomerManagement dspCustomerManagement = new DspCustomerManagement();
        dspCustomerManagement.setId(Integer.valueOf(adminDspAccount.getId().toString()));
        dspCustomerManagement.setAccount_name(adminDspAccount.getAccount_name());
        dspCustomerManagement.setBank_deposit(adminDspAccount.getBank_deposit());
        dspCustomerManagement.setBank_account(adminDspAccount.getBank_account());
        return dspCustomerManagementMapper.updateByPrimaryKeySelective(dspCustomerManagement);
    }
}
