package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminMediaAuditMapper;
import com.mk.ad.service.AdminMediaAuditService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminMediaAudit;
import com.mk.ad.vo.AdminMediaAuditExample;
import com.mk.ad.vo.Request.AdminMediaAuditRequestDTO;
import com.mk.ad.vo.Response.AdminMediaAuditResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/22 13:22
 */
@Slf4j
@Service
@Repository
public class AdminMediaAuditServiceImpl implements AdminMediaAuditService {

    @Autowired
    AdminMediaAuditMapper adminMediaAuditMapper;

    @Override
    public Integer updateMediaStatus(Map params) {

        Integer resutl =  adminMediaAuditMapper.updateMediaStatus(params);

        return resutl;

    }

    @Override
    public LarkPageInfoVo<AdminMediaAuditResponseDTO> getMediaList(AdminMediaAuditRequestDTO adminMediaAuditRequestDTO) {
        AdminMediaAuditExample example = new AdminMediaAuditExample();
        AdminMediaAuditExample.Criteria criteria = example.createCriteria();

//        //模糊查询
//        if(adminMediaAuditRequestDTO.getSspId() != null){
//            criteria.andSsp_idEqualTo(adminMediaAuditRequestDTO.getSspId());//SSP_ID类型
//        }

        if(0 < adminMediaAuditRequestDTO.getStatus()){
            criteria.andStatusEqualTo(adminMediaAuditRequestDTO.getStatus());//状态
        }

        if(StringUtils.isNotBlank(adminMediaAuditRequestDTO.getSspName())){
            criteria.andSsp_nameLike(adminMediaAuditRequestDTO.getSspName());
        }

        PageHelper.startPage(adminMediaAuditRequestDTO.getPage(),adminMediaAuditRequestDTO.getLimit());
        List<AdminMediaAudit> adminMediaAuditList = adminMediaAuditMapper.selectByExample(example);
        PageInfo<AdminMediaAudit> pageInfo = new PageInfo<>(adminMediaAuditList);
        List<AdminMediaAuditResponseDTO> list = adminMediaAuditList.stream().map(msg ->{
            AdminMediaAuditResponseDTO event = new AdminMediaAuditResponseDTO();
            event.setId(msg.getId());
            event.setSspId(msg.getSsp_id());
            event.setSspName(msg.getSsp_name());
            event.setMediaName(msg.getMedia_name());
            event.setRegisterCertificate(msg.getRegister_certificate());
            event.setMandateCertificate(msg.getMandate_certificate());
            event.setStatus(msg.getStatus());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminMediaAuditResponseDTO>().pageZset(list, (int) pageInfo.getTotal(),adminMediaAuditRequestDTO.getLimit(), adminMediaAuditRequestDTO.getPage());
    }
}
