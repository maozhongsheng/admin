package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminSlotAuditMapper;
import com.mk.ad.service.AdminSlotAuditService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminSlotAudit;
import com.mk.ad.vo.AdminSlotAuditExample;
import com.mk.ad.vo.Request.AdminSlotAuditRequestDTO;
import com.mk.ad.vo.Response.AdminSlotAuditResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
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
public class AdminSlotAuditServiceImpl implements AdminSlotAuditService {

    @Autowired
    AdminSlotAuditMapper adminSlotAuditMapper;

    @Override
    public LarkPageInfoVo<AdminSlotAuditResponseDTO> getSlotList(AdminSlotAuditRequestDTO adminSlotAuditRequestDTO) {
        AdminSlotAuditExample example = new AdminSlotAuditExample();
        AdminSlotAuditExample.Criteria criteria = example.createCriteria();

        //模糊查询
        if(adminSlotAuditRequestDTO.getStatus() != null){
            criteria.andStatusEqualTo(adminSlotAuditRequestDTO.getStatus());//状态
        }

        PageHelper.startPage(adminSlotAuditRequestDTO.getPage(),adminSlotAuditRequestDTO.getLimit());
        List<AdminSlotAudit> adminSlotAudits = adminSlotAuditMapper.selectByExample(example);
        PageInfo<AdminSlotAudit> pageInfo = new PageInfo<>(adminSlotAudits);
        List<AdminSlotAuditResponseDTO> list = adminSlotAudits.stream().map(msg ->{
            AdminSlotAuditResponseDTO event = new AdminSlotAuditResponseDTO();
            event.setId(msg.getId());
            event.setSspName(msg.getSsp_name());
            event.setMediaName(msg.getMedia_name());
            event.setSlotName(msg.getSlot_name());
            event.setSettlementBasisId(msg.getSettlement_basis_id());
            event.setStatus(msg.getStatus());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminSlotAuditResponseDTO>().pageZset(list, (int) pageInfo.getTotal(),adminSlotAuditRequestDTO.getLimit(), adminSlotAuditRequestDTO.getPage());
    }

    @Override
    public Integer updateSlotAuditStatus(Map params) {

        Integer resutl =  adminSlotAuditMapper.updateSlotAuditStatus(params);

        return resutl;
    }
}
