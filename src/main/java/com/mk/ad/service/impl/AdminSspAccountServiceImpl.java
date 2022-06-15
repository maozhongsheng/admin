package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.service.AdminSspAccountService;
import com.mk.ad.mapper.AdminSspAccountMapper;
import com.mk.ad.mapper.DataMediaTypeMapper;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.mapper.SysUserMapper;
import com.mk.ad.mapper.mymapper.MyAdminSspAccountMapper;
import com.mk.ad.utils.IDGen;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.PasswordUtils;
import com.mk.ad.vo.AdminSspAccount;
import com.mk.ad.vo.AdminSspAccountExample;
import com.mk.ad.vo.Response.AdminSspAccountResponseDTO;
import com.mk.ad.vo.Response.AdminSspFinancialResponseDTO;
import com.mk.ad.vo.Response.AdminSspUserResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.SysUser;
import com.mk.ad.vo.SysUserExample;
import com.mk.ad.vo.Request.AdminIndexSlotRequestDTO;
import com.mk.ad.vo.Request.AdminSspAccountRequestDTO;
import com.mk.ad.vo.Request.AdminSspUserRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class AdminSspAccountServiceImpl implements AdminSspAccountService {

    @Autowired
    AdminSspAccountMapper adminSspAccountMapper;

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    SspMediaMapper sspMediaMapper;

    @Autowired
    DataMediaTypeMapper dataMediaTypeMapper;

    @Autowired
    MyAdminSspAccountMapper myAdminSspAccountMapper;

    @Override
    public LarkPageInfoVo<AdminSspAccountResponseDTO> getSspList(AdminSspAccountRequestDTO adminSspRequestDTO) {
        AdminSspAccountExample example = new AdminSspAccountExample();
        AdminSspAccountExample.Criteria criteria = example.createCriteria();

        if (adminSspRequestDTO.getId() != null){
            criteria.andIdEqualTo(adminSspRequestDTO.getId().longValue());
        }

        if ( adminSspRequestDTO.getCompanyType()!= null){
            criteria.andCompany_typeEqualTo(adminSspRequestDTO.getCompanyType());
        }

        if ( adminSspRequestDTO.getStatus()!= null){
            criteria.andStatusEqualTo(adminSspRequestDTO.getStatus());
        }

        if (adminSspRequestDTO.getSettlementWay() != null){
            criteria.andSettlement_wayEqualTo(adminSspRequestDTO.getSettlementWay());
        }

        if(StringUtils.isNotBlank(adminSspRequestDTO.getCompanyName())){
            criteria.andCompany_nameLike("%"+adminSspRequestDTO.getCompanyName()+"%");
        }
        if(adminSspRequestDTO.getEnableStatus()!= null){
            criteria.andEnable_statusEqualTo(adminSspRequestDTO.getEnableStatus());
        }
        criteria.andIs_deletedEqualTo(1);
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(adminSspRequestDTO.getPageNum(),adminSspRequestDTO.getPageSize());
        List<AdminSspAccount> adminSspList = adminSspAccountMapper.selectByExample(example);
        PageInfo<AdminSspAccount> pageInfo = new PageInfo<>(adminSspList);
        List<AdminSspAccountResponseDTO> list = adminSspList.stream().map(msg ->{
            SysUser sysUser = sysUserMapper.selectByPrimaryKey(msg.getUser_id());//根据userid查询用户信息
            AdminSspAccountResponseDTO event = new AdminSspAccountResponseDTO();//账户信息
            event.setId(msg.getId());
            event.setCompanyName(msg.getCompany_name());
            event.setStatus(msg.getStatus());
            event.setCompanyType(msg.getCompany_type());
            event.setCompanyAbbreviation(msg.getCompany_abbreviation());
            event.setLicenseNumber(msg.getLicense_number());
            event.setOrganizationCode(msg.getOrganization_code());
            event.setShareholderName(msg.getShareholder());
            event.setLicenseImage(msg.getLicense_image());
            event.setDockingWay(msg.getDocking_way());
            event.setContacts(sysUser.getReal_name());
            event.setPhone(sysUser.getPhone());
            event.setEmail(sysUser.getEmail());
            event.setPassword(sysUser.getPassword());
            event.setAddress(sysUser.getAddress());
            event.setSettlementWay(msg.getSettlement_way());
            event.setProfit(msg.getProfit());
            event.setPayee(msg.getPayee());
            event.setBankDeposit(msg.getBank_deposit());
            event.setBankAccount(msg.getBank_account());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String creatTime = formatter.format(msg.getCreate_time());
            if(msg.getLast_time()!=null){
                String UpdateTime = formatter.format(msg.getLast_time());
                event.setEndTime(UpdateTime);
            }
            event.setCreatTime(creatTime);
            event.setCreationTime(msg.getCreate_time());
            event.setLastTime(sysUser.getLast_time());
            event.setEnableStatus(msg.getEnable_status());
            event.setUserId(msg.getUser_id());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminSspAccountResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminSspRequestDTO.getPageSize(), adminSspRequestDTO.getPageNum());
    }

    @Override
    public Integer insertSsp(AdminSspAccountRequestDTO adminSsp) {
        //判断是否有重复的email
        List email = sysUserMapper.selectemail();
        if(email.contains(adminSsp.getEmail())){
            return 2;
        }
        //用户信息存入user表
        SysUser sysUser = new SysUser();
        sysUser.setId(UUID.randomUUID().toString());
        String password = "8888888";
        String salt= PasswordUtils.getSalt();
        String ecdPwd=PasswordUtils.encode(password,salt);
        sysUser.setSalt(salt);
        sysUser.setPassword(ecdPwd);
        sysUser.setReal_name(adminSsp.getContacts());
        sysUser.setPhone(adminSsp.getPhone());
        sysUser.setUsername(adminSsp.getEmail());
        sysUser.setNick_name(adminSsp.getCompanyName());
        sysUser.setEmail(adminSsp.getEmail());
        String provinceId = adminSsp.getProvinceId();
        String cityId = adminSsp.getCityId();
        String areaId = adminSsp.getAreaId();
        String detailed = adminSsp.getAddress();
        String provincename = sysUserMapper.selectProvince(provinceId);
        String cityname = sysUserMapper.selectCity(cityId);
        String areaname = sysUserMapper.selectArea(areaId);
        String address = provincename+","+cityname+","+areaname+","+detailed;
        sysUser.setAddress(address);
        sysUser.setCreate_time(new Date());
        sysUser.setDeleted(1);
        sysUser.setSystem_id(3);
        sysUser.setStatus(2);
        sysUserMapper.insertSelective(sysUser);

        //账户信息存入账户表
        AdminSspAccount asa = new AdminSspAccount();
        asa.setId(Long.valueOf(IDGen.generateNumber()));
        asa.setUser_id(sysUser.getId());
        asa.setCompany_name(adminSsp.getCompanyName());
        asa.setCompany_type(adminSsp.getCompanyType());
        asa.setLicense_number(adminSsp.getLicenseNumber());
        asa.setDue_date(adminSsp.getDue_date());
        asa.setOrganization_code(adminSsp.getOrganizationCode());
        asa.setShareholder(adminSsp.getShareholder());
        asa.setLicense_image(adminSsp.getLicenseImage());
        asa.setDocking_way(adminSsp.getDockingWay());
        asa.setSettlement_way(adminSsp.getSettlementWay());
        asa.setPayee(adminSsp.getPayee());
        asa.setBank_deposit(adminSsp.getBankDeposit());
        asa.setBank_account(adminSsp.getBankAccount());
        asa.setCreate_time(new Date());
        asa.setStatus(0);
        asa.setIs_deleted(1);
        asa.setEnable_status(1);
        asa.setCompany_abbreviation(adminSsp.getCompanyAbbreviation());
        return adminSspAccountMapper.insertSelective(asa);
    }

    //修改user表
    @Override
    public Integer UpdateSsp(AdminSspAccountRequestDTO adminSsp) {
        SysUser sysUser = new SysUser();
        sysUser.setId(adminSsp.getUserId());
        sysUser.setReal_name(adminSsp.getContacts());
        sysUser.setPhone(adminSsp.getPhone());
        sysUser.setEmail(adminSsp.getEmail());
        String provinceId = adminSsp.getProvinceId();
        String cityId = adminSsp.getCityId();
        String areaId = adminSsp.getAreaId();
        String detailed = adminSsp.getAddress();
        String provincename = sysUserMapper.selectProvince(provinceId);
        String cityname = sysUserMapper.selectCity(cityId);
        String areaname = sysUserMapper.selectArea(areaId);
        String address = provincename+","+cityname+","+areaname+","+detailed;
        sysUser.setAddress(address);
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public LarkPageInfoVo<AdminSspAccountResponseDTO> getSspExamine(AdminSspAccountRequestDTO adminSspRequestDTO) {
        AdminSspAccountExample example = new AdminSspAccountExample();
        AdminSspAccountExample.Criteria criteria = example.createCriteria();

        if (adminSspRequestDTO.getCompanyType() != null){
            criteria.andCompany_typeEqualTo(adminSspRequestDTO.getCompanyType());
        }

        if (adminSspRequestDTO.getStatus() != null){
            criteria.andSettlement_wayEqualTo(adminSspRequestDTO.getCompanyType());
        }
        PageHelper.startPage(adminSspRequestDTO.getPageNum(),adminSspRequestDTO.getPageSize());
        List<AdminSspAccount> adminSspList = adminSspAccountMapper.selectByExample(example);
        PageInfo<AdminSspAccount> pageInfo = new PageInfo<>(adminSspList);
        List<AdminSspAccountResponseDTO> list = adminSspList.stream().map(msg ->{
            AdminSspAccountResponseDTO event = new AdminSspAccountResponseDTO();
            event.setId(msg.getId());
            event.setCompanyName(msg.getCompany_name());
            event.setCompanyType(msg.getCompany_type());
            event.setStatus(msg.getStatus());
            event.setLicenseImage(msg.getLicense_image());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminSspAccountResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminSspRequestDTO.getPageSize(), adminSspRequestDTO.getPageNum());
    }

    @Override
    public AdminSspAccountResponseDTO getSspInfo(Long id) {
        AdminSspAccount adminSsp = adminSspAccountMapper.selectByPrimaryKey(id);//账户信息
        AdminSspAccountResponseDTO asr = new AdminSspAccountResponseDTO();
        asr.setId(adminSsp.getId());
        asr.setCompanyName(adminSsp.getCompany_name());
        asr.setStatus(adminSsp.getStatus());
        asr.setCompanyType(adminSsp.getCompany_type());
        asr.setLicenseNumber(adminSsp.getLicense_number());
        asr.setDue_date(adminSsp.getDue_date());
        asr.setOrganizationCode(adminSsp.getOrganization_code());
        asr.setShareholderName(adminSsp.getShareholder());
        asr.setLicenseImage(adminSsp.getLicense_image());
        asr.setDockingWay(adminSsp.getDocking_way());
        asr.setSettlementWay(adminSsp.getSettlement_way());
        asr.setProfit(adminSsp.getProfit());
        asr.setPayee(adminSsp.getPayee());
        asr.setBankDeposit(adminSsp.getBank_deposit());
        asr.setBankAccount(adminSsp.getBank_account());
        asr.setCompanyAbbreviation(adminSsp.getCompany_abbreviation());

        SysUser su = sysUserMapper.selectByPrimaryKey(adminSsp.getUser_id());//用户id
        asr.setUserId(adminSsp.getUser_id());
        asr.setContacts(su.getReal_name());
        asr.setPhone(su.getPhone());
        asr.setEmail(su.getEmail());
        asr.setPassword(su.getPassword());
        asr.setAddress(su.getAddress());
        if(null != su.getAddress()) {
            String xiangqing = "";
            String endid ="";
            String cid ="";
            String sid = "";
            String[] sourceStrArray = su.getAddress().split(",");
            for (int i = 0; i < sourceStrArray.length; i++) {
                if(sourceStrArray.length - i == 1){
                    xiangqing = sourceStrArray[i];

                }
                else if (sourceStrArray.length - i == 3){
                    String s = sourceStrArray[i].toString();
                    cid  = sysUserMapper.selectid(s).toString();


                }
                else if (sourceStrArray.length - i == 4){
                    String s = sourceStrArray[i].toString();
                    sid  = sysUserMapper.selectid(s).toString();
                }
                else  if (sourceStrArray.length - i == 2){
                    String s = sourceStrArray[i].toString();
                    String t = sourceStrArray[i-1].toString();
                    Integer c = sysUserMapper.selectid(t);
                    Map pream = new HashMap();
                    pream.put("s",s);
                    pream.put("c",c);
                    endid =sysUserMapper.selectendid(pream).toString();
                }
            }
            asr.setShengId(Integer.valueOf(sid));
            asr.setShiId(Integer.valueOf(cid));
            asr.setQuId(Integer.valueOf(endid));
        }

        return asr;
    }

    @Override
    public AdminSspFinancialResponseDTO selectFinancial(String user_id) {
        AdminSspAccount adminSsp = myAdminSspAccountMapper.selectByUserId(user_id);//账户信息
        AdminSspFinancialResponseDTO asr = new AdminSspFinancialResponseDTO();
        asr.setPayee(adminSsp.getPayee());
        asr.setBankAccount(adminSsp.getBank_account());
        asr.setBankDeposit(adminSsp.getBank_deposit());
        return asr;
    }


    @Override
    public Integer upDataSspStatus(Long id, Integer status) {
        SysUser sysUser = new SysUser();
        AdminSspAccount adminSspAccount = adminSspAccountMapper.selectByPrimaryKey(id);
        sysUser.setId(adminSspAccount.getUser_id());
        if(2 == status){
            sysUser.setStatus(2);
            sysUserMapper.updateByPrimaryKeySelective(sysUser);
        }
        return adminSspAccountMapper.upDataSspStatus(id, status);
    }



    @Override
    public Integer UpdateSspStatus(AdminSspAccountRequestDTO adminSspRequestDTO) {

        Map params = new HashMap();
        String id = adminSspRequestDTO.getId().toString();
        String status = adminSspRequestDTO.getStatus().toString();
        String refuse = adminSspRequestDTO.getRefuse();
        params.put("id",id);
        params.put("status",status);
        params.put("refuse",refuse);
        AdminSspAccount adminSspAccount = adminSspAccountMapper.selectByPrimaryKey(Long.valueOf(params.get("id").toString()));
        Integer resutl =  adminSspAccountMapper.UpdateSspStatus(params);
        SysUser sysUser = new SysUser();
        sysUser.setId(adminSspAccount.getUser_id());
        if(("2").equals(params.get("status").toString())){
            sysUser.setStatus(2);
        }else{
            sysUser.setStatus(1);
        }
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
        return resutl;
    }

    @Override
    public LarkPageInfoVo<AdminSspAccountResponseDTO> getSspMoneyList(AdminSspAccountRequestDTO adminSspRequestDTO) throws ParseException {
        AdminSspAccountExample example = new AdminSspAccountExample();
        AdminSspAccountExample.Criteria criteria = example.createCriteria();

        if(null != adminSspRequestDTO.getId()){
            criteria.andIdEqualTo(Long.valueOf(adminSspRequestDTO.getId().toString()));
        }
        if(0 < adminSspRequestDTO.getSettlementWay()){
            criteria.andSettlement_wayEqualTo(adminSspRequestDTO.getSettlementWay());
        }

        if(!"".equals(adminSspRequestDTO.getStart()) && !"".equals(adminSspRequestDTO.getEnd())){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date start = sdf.parse(adminSspRequestDTO.getStart());
            Date end = sdf.parse(adminSspRequestDTO.getEnd());
            criteria.andCreate_timeBetween(start,end);
        }

        if(!"".equals(adminSspRequestDTO.getSspId())){
            criteria.andSsp_idEqualTo(Long.valueOf(adminSspRequestDTO.getSspId()));
        }

        PageHelper.startPage(adminSspRequestDTO.getPageNum(),adminSspRequestDTO.getPageSize());
        List<AdminSspAccount> adminSspList = adminSspAccountMapper.selectByExample(example);
        PageInfo<AdminSspAccount> pageInfo = new PageInfo<>(adminSspList);
        List<AdminSspAccountResponseDTO> list = adminSspList.stream().map(msg ->{
            SysUser sysUser = sysUserMapper.selectByPrimaryKey(msg.getUser_id());//根据userid查询用户信息
//            SspMedia sspMedia = sspMediaMapper.selectByPrimaryKey(Integer.valueOf(msg.getSsp_id().toString()));
//            DataMediaType dataMediaType = dataMediaTypeMapper.selectByPrimaryKey(Long.valueOf(sspMedia.getMedia_type_id().toString()));
            AdminSspAccountResponseDTO event = new AdminSspAccountResponseDTO();//账户信息
            Map result = sspMediaMapper.selectssp(msg.getUser_id());
            if(null!=result){
                event.setSspId(Long.valueOf(result.get("sspId").toString()));
                event.setSspType(result.get("sspName").toString());
            }else{
                event.setSspId(Long.valueOf(1));
                event.setSspType("超级管理员");
            }
            event.setId(msg.getId());
            event.setCompanyName(msg.getCompany_name());
            event.setStatus(msg.getStatus());
            event.setCompanyType(msg.getCompany_type());
            event.setLicenseNumber(msg.getLicense_number());
            event.setOrganizationCode(msg.getOrganization_code());
            event.setShareholderName(msg.getShareholder());
            event.setLicenseImage(msg.getLicense_image());
            event.setDockingWay(msg.getDocking_way());
            event.setContacts(sysUser.getReal_name());
            event.setPhone(sysUser.getPhone());
            event.setEmail(sysUser.getEmail());
            event.setPassword(sysUser.getPassword());
            event.setAddress(sysUser.getAddress());
            event.setSettlementWay(msg.getSettlement_way());
            event.setProfit(msg.getProfit());
            event.setPayee(msg.getPayee());
            event.setBankDeposit(msg.getBank_deposit());
            event.setBankAccount(msg.getBank_account());
            event.setCreationTime(msg.getCreate_time());
            event.setLastTime(msg.getLast_time());
            event.setEnableStatus(msg.getEnable_status());
//            event.setSspId(msg.getSsp_id());
//            event.setSspType(dataMediaType.getType_name());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminSspAccountResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminSspRequestDTO.getPageSize(), adminSspRequestDTO.getPageNum());
    }

    @Override
    public Integer updateSspMoney(Map params) {
        Integer resutl =  adminSspAccountMapper.updateSspMoney(params);
        return resutl;
    }

    @Override
    public List<String> dspIndexSelectSlotId(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO) {
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getCompany_name_id().get(0)) && StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_id().get(0)) && StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_type().get(0))){
            return null;
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getCompany_name_id().get(0))){
            adminIndexSlotRequestDTO.setCompany_name_id(null);
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_type().get(0))){
            adminIndexSlotRequestDTO.setSlot_type(null);
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_id().get(0))){
            adminIndexSlotRequestDTO.setSlot_id(null);
        }

        List<String> dspIndexSelectSlotId = sspMediaMapper.dspIndexSelectSlotId(adminIndexSlotRequestDTO);
        return dspIndexSelectSlotId;
    }

    @Override
    public List<String> adminIndexSlotId(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO) {
        if(null == adminIndexSlotRequestDTO.getCompany_name_id() && null == adminIndexSlotRequestDTO.getMedia_id() && null == adminIndexSlotRequestDTO.getSlot_id() && null == adminIndexSlotRequestDTO.getSlot_type()){
            return null;
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getCompany_name_id().get(0)) && StringUtils.isEmpty(adminIndexSlotRequestDTO.getMedia_id().get(0)) && StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_id().get(0)) && StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_type().get(0))){
            return null;
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getCompany_name_id().get(0))){
            adminIndexSlotRequestDTO.setCompany_name_id(null);
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_type().get(0))){
            adminIndexSlotRequestDTO.setSlot_type(null);
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getSlot_id().get(0))){
            adminIndexSlotRequestDTO.setSlot_id(null);
        }
        if(StringUtils.isEmpty(adminIndexSlotRequestDTO.getMedia_id().get(0))){
            adminIndexSlotRequestDTO.setMedia_id(null);
        }

        List<String> adminIndexSlotId = sspMediaMapper.adminSspAccountMapper(adminIndexSlotRequestDTO);
        return adminIndexSlotId;
    }

    @Override
    public List adminIndexMedia(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO) {
        List list = sspMediaMapper.mediaIdNameDTO(adminIndexSlotRequestDTO);
        return list;
    }

    @Override
    public Integer UpdateAdminSspBankEdit(AdminSspAccountRequestDTO adminSsp) {
        AdminSspAccount adminSspAccount = new AdminSspAccount();
        adminSspAccount.setId(Long.valueOf(adminSsp.getId()));
        adminSspAccount.setPayee(adminSsp.getPayee());
        adminSspAccount.setBank_deposit(adminSsp.getBankDeposit());
        adminSspAccount.setBank_account(adminSsp.getBankAccount());
        return  adminSspAccountMapper.updateByPrimaryKeySelective(adminSspAccount);
    }

    @Override
    public LarkPageInfoVo<AdminSspUserResponseDTO> getAdminSspUserList(AdminSspUserRequestDTO adminSspUserRequestDTO) {

        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();

        if(0 != adminSspUserRequestDTO.getStatus()){
            criteria.andStatusEqualTo(adminSspUserRequestDTO.getStatus());
        }
        if(StringUtils.isNotBlank(adminSspUserRequestDTO.getName())){
            Pattern pattern = Pattern.compile("[0-9]*");
            boolean matches = pattern.matcher(adminSspUserRequestDTO.getName()).matches();
            if(matches){
                criteria.andIdEqualTo(adminSspUserRequestDTO.getName());
            }else{
                criteria.andReal_nameLike("%"+adminSspUserRequestDTO.getName()+"%");
            }
        }
        criteria.andCreate_idNotEqualTo("");
        criteria.andDeletedEqualTo(1);
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(adminSspUserRequestDTO.getPageNum(),adminSspUserRequestDTO.getPageSize());
        List<SysUser> adminSspList = sysUserMapper.selectByExample(example);
        PageInfo<SysUser> pageInfo = new PageInfo<>(adminSspList);
        List<AdminSspUserResponseDTO> list = adminSspList.stream().map(msg ->{
            AdminSspUserResponseDTO event = new AdminSspUserResponseDTO();//账户信息
            event.setId(msg.getId());
            event.setUserName(msg.getReal_name());
            event.setEmail(msg.getEmail());
            SysUser sysUser = sysUserMapper.selectByPrimaryKey(msg.getCreate_id());
            event.setCreateName(sysUser.getUsername());
            event.setCreateId(msg.getCreate_id());
            event.setCreatTime(msg.getCreate_time());
            event.setLastTime(msg.getLast_time());
            event.setStatus(msg.getStatus());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminSspUserResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminSspUserRequestDTO.getPageSize(), adminSspUserRequestDTO.getPageNum());
    }

    @Override
    public Integer UpdateAdminSspUserDelete(AdminSspUserRequestDTO adminUser) {
        SysUser sysUser = new SysUser();
        sysUser.setId(adminUser.getId());
        sysUser.setDeleted(0);
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public Integer UpdateAdminSspUserEdit(AdminSspUserRequestDTO adminUser) {
        SysUser sysUser = new SysUser();
        sysUser.setId(adminUser.getId());
        sysUser.setStatus(adminUser.getStatus());
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public Integer insertAdminSspUserAdd(AdminSspUserRequestDTO adminSsp) {
        //判断是否有重复的email
        List email = sysUserMapper.selectemail();
        if(email.contains(adminSsp.getEmail())){
            return 2;
        }
        SysUser sysUser = new SysUser();
        sysUser.setId(UUID.randomUUID().toString());
        String password = adminSsp.getPassword();
        String salt= PasswordUtils.getSalt();
        String ecdPwd=PasswordUtils.encode(password,salt);
        sysUser.setSalt(salt);
        sysUser.setCreate_id(adminSsp.getCreateId());
        sysUser.setPassword(ecdPwd);
        sysUser.setPwd(adminSsp.getPassword());
        sysUser.setReal_name(adminSsp.getName());
        sysUser.setPhone(adminSsp.getPhone());
        sysUser.setUsername(adminSsp.getEmail());
        sysUser.setEmail(adminSsp.getEmail());
        sysUser.setAddress("北京,市辖区,朝阳区,百子湾");
        sysUser.setCreate_time(new Date());
        sysUser.setDeleted(1);
        sysUser.setSystem_id(3);
        sysUser.setStatus(2);
        return  sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public Integer DeleteSsp(AdminSspUserRequestDTO adminUser) {
        AdminSspAccount adminSspAccount = new AdminSspAccount();
        adminSspAccount.setId(Long.valueOf(adminUser.getId()));
        adminSspAccount.setIs_deleted(2);
        return adminSspAccountMapper.updateByPrimaryKeySelective(adminSspAccount);
    }



}
