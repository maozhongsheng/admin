package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminAdxAccountMapper;
import com.mk.ad.service.AdminAdxAccountService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdxAccount;
import com.mk.ad.vo.AdminAdxAccountExample;
import com.mk.ad.vo.Request.AdminAdxAccountRequestDTO;
import com.mk.ad.vo.Response.AdminAdxAccountResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
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
public class AdminAdxAccountServiceImpl implements AdminAdxAccountService {

    @Autowired
    AdminAdxAccountMapper adminAdxAccountMapper;

    @Override
    public LarkPageInfoVo<AdminAdxAccountResponseDTO> getAdxList(AdminAdxAccountRequestDTO adminAdxAccountRequestDTO) {
        AdminAdxAccountExample example = new AdminAdxAccountExample();
        AdminAdxAccountExample.Criteria criteria = example.createCriteria();

        if (adminAdxAccountRequestDTO.getCompanyType() != null){
            criteria.andCompany_typeEqualTo(adminAdxAccountRequestDTO.getCompanyType());
        }

        if (adminAdxAccountRequestDTO.getId() != null){
            criteria.andIdEqualTo(adminAdxAccountRequestDTO.getId());
        }

        if (adminAdxAccountRequestDTO.getState() != null){
            criteria.andStateEqualTo(adminAdxAccountRequestDTO.getState());
        }

        if(StringUtils.isNotBlank(adminAdxAccountRequestDTO.getCompanyName())){
            criteria.andCompany_nameEqualTo(adminAdxAccountRequestDTO.getCompanyName());
        }

        PageHelper.startPage(adminAdxAccountRequestDTO.getPage(),adminAdxAccountRequestDTO.getLimit());
        List<AdminAdxAccount> adminAdxList = adminAdxAccountMapper.selectByExample(example);
        PageInfo<AdminAdxAccount> pageInfo = new PageInfo<>(adminAdxList);
        List<AdminAdxAccountResponseDTO> list = adminAdxList.stream().map(msg ->{
            AdminAdxAccountResponseDTO event = new AdminAdxAccountResponseDTO();
            event.setId(msg.getId());
            event.setCompanyName(msg.getCompany_name());
            event.setState(msg.getState());
            event.setCompanyType(msg.getCompany_type());
            event.setLicenseNumber(msg.getLicense_number());
            event.setOrganizationCode(msg.getOrganization_code());
            event.setShareholderName(msg.getShareholder_name());
            event.setLicenseImage(msg.getLicense_image());
            event.setDockingId(msg.getDocking_id());
            event.setContacts(msg.getContacts());
            event.setContactNumber(msg.getContact_number());
            event.setEmail(msg.getEmail());
            event.setPassword(msg.getPassword());
            event.setAddressId(msg.getAddress_id());
            event.setCreationTime(msg.getCreation_time());
            event.setLastTime(msg.getLast_time());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminAdxAccountResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminAdxAccountRequestDTO.getLimit(), adminAdxAccountRequestDTO.getPage());
    }

    @Override
    public Integer insertAdx(AdminAdxAccount adminAdxAccount) {
        return adminAdxAccountMapper.insert(adminAdxAccount);
    }

    @Override
    public Integer UpdateAdxAcc(AdminAdxAccount adminAdxAccount) {
        return adminAdxAccountMapper.updateByPrimaryKeySelective(adminAdxAccount);
    }

    @Override
    public AdminAdxAccountRequestDTO getAdxInfo(Long id) {
        AdminAdxAccount adminAdxAccount = adminAdxAccountMapper.selectByPrimaryKey(id);
        AdminAdxAccountRequestDTO aaar = new AdminAdxAccountRequestDTO();
        aaar.setId(adminAdxAccount.getId());
        aaar.setCompanyName(adminAdxAccount.getCompany_name());
        aaar.setState(adminAdxAccount.getState());
        aaar.setCompanyType(adminAdxAccount.getCompany_type());
        aaar.setLicenseNumber(adminAdxAccount.getLicense_number());
        aaar.setOrganizationCode(adminAdxAccount.getOrganization_code());
        aaar.setShareholderName(adminAdxAccount.getShareholder_name());
        aaar.setLicenseImage(adminAdxAccount.getLicense_image());
        aaar.setDockingId(adminAdxAccount.getDocking_id());
        aaar.setContacts(adminAdxAccount.getContacts());
        aaar.setContactNumber(adminAdxAccount.getContact_number());
        aaar.setEmail(adminAdxAccount.getEmail());
        aaar.setPassword(adminAdxAccount.getPassword());
        aaar.setAddressId(adminAdxAccount.getAddress_id());
        aaar.setCreationTime(adminAdxAccount.getCreation_time());
        aaar.setLastTime(adminAdxAccount.getLast_time());

        return aaar;
    }

}