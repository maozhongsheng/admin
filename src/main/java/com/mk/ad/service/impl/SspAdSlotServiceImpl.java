package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminMediaAuditMapper;
import com.mk.ad.mapper.AdminSspAccountMapper;
import com.mk.ad.mapper.SspAdSlotMapper;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.service.SspAdSlotService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.SspAdSlotResponseDTO;
import com.mk.ad.vo.SspAdSlot;
import com.mk.ad.vo.SspAdSlotExample;
import com.mk.ad.vo.SspMedia;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
public class SspAdSlotServiceImpl implements SspAdSlotService {

    @Autowired
    AdminMediaAuditMapper adminMediaAuditMapper;
    @Autowired
    SspMediaMapper sspMediaMapper;
    @Autowired
    AdminSspAccountMapper adminSspAccountMapper;
    @Autowired
    SspAdSlotMapper sspAdSlotMapper;


    @Override
    public Integer updateSlotStatus(SspAdSlotRequestDTO sspAdSlotRequestDTO) {
        Map params = new HashMap();
        String id = sspAdSlotRequestDTO.getId().toString();
        String status = sspAdSlotRequestDTO.getSlot_examine_status().toString();
        String upper_id = sspAdSlotRequestDTO.getUpper_id();
        String upper_slot = sspAdSlotRequestDTO.getUpper_slot();
        String upper_ecpm = sspAdSlotRequestDTO.getUpper_ecpm();
        String downstream_ecpm = sspAdSlotRequestDTO.getDownstream_ecpm();
        params.put("id",id);
        params.put("status",status);
        params.put("upper_id",upper_id);
        params.put("upper_slot",upper_slot);
        params.put("upper_ecpm",upper_ecpm);
        params.put("downstream_ecpm",downstream_ecpm);

        return sspAdSlotMapper.updateSlotStatus(params);

    }

    @Override
    public LarkPageInfoVo<SspAdSlotResponseDTO> getSlotList(SspAdSlotRequestDTO sspAdSlotRequestDTO) {
        SspAdSlotExample example = new SspAdSlotExample();
        SspAdSlotExample.Criteria criteria = example.createCriteria();


        if(sspAdSlotRequestDTO.getSsp_id()!=null){
            criteria.andSsp_idEqualTo(Integer.valueOf(sspAdSlotRequestDTO.getSsp_id().toString()));
        }

        if(null !=  sspAdSlotRequestDTO.getSlot_examine_status()){
            criteria.andSlot_examine_statusEqualTo(sspAdSlotRequestDTO.getSlot_examine_status());//状态
        }
        if(null != sspAdSlotRequestDTO.getSlot_status()){
            criteria.andSlot_statusEqualTo(sspAdSlotRequestDTO.getSlot_status());
        }
        criteria.andIs_deletedEqualTo(1);
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(sspAdSlotRequestDTO.getPage(),sspAdSlotRequestDTO.getLimit());
        List<SspAdSlot> sspSlotList = sspAdSlotMapper.selectByExample(example);
        PageInfo<SspAdSlot> pageInfo = new PageInfo<>(sspSlotList);
        List<SspAdSlotResponseDTO> list = sspSlotList.stream().map(msg ->{
            SspAdSlotResponseDTO event = new SspAdSlotResponseDTO();
            SspMedia sspMedia = sspMediaMapper.selectByPrimaryKey(msg.getMedia_id().longValue());
            event.setSsp_media_name(sspMedia.getMedia_name());
            Map result = sspMediaMapper.selectssp(msg.getUser_id());
            event.setMedia_id(msg.getMedia_id());
            event.setId(Long.valueOf(msg.getId()));
            event.setSlot_name(msg.getSlot_name());
            event.setSlot_examine_status(msg.getSlot_examine_status());
            event.setSlot_status(msg.getSlot_status());
            if(null!=result){
                event.setSsp_id(Long.valueOf(result.get("sspId").toString()));
                event.setSsp_name(result.get("sspName").toString());
            }
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<SspAdSlotResponseDTO>().pageZset(list, (int) pageInfo.getTotal(),sspAdSlotRequestDTO.getLimit(), sspAdSlotRequestDTO.getPage());
    }
}
