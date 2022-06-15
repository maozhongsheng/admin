package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminSlotMapper;
import com.mk.ad.mapper.mymapper.MyAdminAdxMouldMapper;
import com.mk.ad.mapper.mymapper.MyBussinessTypeOneMapper;
import com.mk.ad.service.AdminSlotService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminSlot;
import com.mk.ad.vo.AdminSlotExample;
import com.mk.ad.vo.Request.AdminSlotRequestDTO;
import com.mk.ad.vo.Response.AdminSlotResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class AdminSlotServiceImpl implements AdminSlotService {

    @Autowired
    AdminSlotMapper adminSlotMapper;

    @Autowired
    MyBussinessTypeOneMapper myBussinessTypeOneMapper;

    @Autowired
    MyAdminAdxMouldMapper myAdminAdxMouldMapper;


    @Override
    public LarkPageInfoVo<AdminSlotResponseDTO> getSlotList(AdminSlotRequestDTO adminSlotRequestDTO) {
        AdminSlotExample example = new AdminSlotExample();
        AdminSlotExample.Criteria criteria = example.createCriteria();
        //模糊查询
        if(adminSlotRequestDTO.getAdx_id() != null){
            criteria.andAdx_idEqualTo(adminSlotRequestDTO.getAdx_id());//所属adx
        }

        if(StringUtils.isNotBlank(adminSlotRequestDTO.getMedia_name())){
            criteria.andMedia_nameLike("%"+adminSlotRequestDTO.getMedia_name()+"%");//媒体名称
        }

        if(adminSlotRequestDTO.getSlot_type() != null){
            criteria.andSlot_typeEqualTo(adminSlotRequestDTO.getSlot_type());//广告位类型
        }

        if(adminSlotRequestDTO.getSettlement_id() != null){
            criteria.andSettlement_idEqualTo(adminSlotRequestDTO.getSettlement_id());//结算方式
        }

        if(adminSlotRequestDTO.getStatus() != null){
            criteria.andStatusEqualTo(adminSlotRequestDTO.getStatus());//状态
        }

        if(adminSlotRequestDTO.getSlot_id() != null){
            criteria.andSlot_idEqualTo(adminSlotRequestDTO.getSlot_id());//广告位ID
        }

        if(StringUtils.isNotBlank(adminSlotRequestDTO.getSlot_name())){
            criteria.andSlot_nameLike("%"+adminSlotRequestDTO.getSlot_name()+"%");//广告位名称
        }

        criteria.andIs_deletedEqualTo(1);

        PageHelper.startPage(adminSlotRequestDTO.getPage(),adminSlotRequestDTO.getLimit());
        List<AdminSlot> adminSlotList = adminSlotMapper.selectByExample(example);
        PageInfo<AdminSlot> pageInfo = new PageInfo<>(adminSlotList);
        List<AdminSlotResponseDTO> list = adminSlotList.stream().map(msg ->{
            AdminSlotResponseDTO event = new AdminSlotResponseDTO();
            event.setId(msg.getId());
            event.setAdx_id(msg.getAdx_id());
            event.setMedia_name(msg.getMedia_name());
            event.setMedia_industry_one(msg.getMedia_industry_one());
            event.setMedia_industry_two(msg.getMedia_industry_two());
            event.setMedia_id(msg.getMedia_id());
            event.setPlatform_id(msg.getPlatform_id());
            event.setOperation_id(msg.getOperation_id());
            event.setSlot_id(msg.getSlot_id());
            event.setSlot_name(msg.getSlot_name());
            event.setSlot_class(msg.getSlot_class());
            event.setSlot_type(msg.getSlot_type());
            event.setExtension_id(msg.getExtension_id());
            event.setCreative_id(msg.getCreative_id());
            event.setCreative_template(msg.getCreative_template());
            event.setSettlement_id(msg.getSettlement_id());
            event.setSettlement_unit_price(msg.getSettlement_unit_price());
            event.setDate_start(msg.getDate_start());
            event.setDate_end(msg.getDate_end());
            event.setStatus(msg.getStatus());
            event.setIs_deleted(msg.getIs_deleted());
            event.setUpdate(msg.getE_two_creat_time());
            event.setBcat(msg.getE_two_bcat());
            if(null != msg.getSettlement_unit_price()){
                event.setFloor_price(msg.getSettlement_unit_price().toString());
            }
            event.setSlot_type_name(myAdminAdxMouldMapper.selectSlotTypeById(msg.getSlot_type()));
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminSlotResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminSlotRequestDTO.getLimit(), adminSlotRequestDTO.getPage());
    }

    @Override
    public Integer insertSlot(AdminSlot adminSlot) {
        adminSlot.setStatus(0);
        adminSlot.setIs_deleted(1);
        Integer slot = adminSlotMapper.selectMaxslot_id();
        adminSlot.setSlot_id(slot+1);
        return adminSlotMapper.insertSelective(adminSlot);
    }

    @Override
    public Integer UpdateSlot(AdminSlot adminSlot) {
        return adminSlotMapper.updateByPrimaryKeySelective(adminSlot);
    }

    @Override
    public AdminSlotRequestDTO getSlotInfo(Long id) {
        AdminSlot adminSlot = adminSlotMapper.selectByPrimaryKey(id);
        AdminSlotRequestDTO aaar = new AdminSlotRequestDTO();
        aaar.setId(adminSlot.getId());
        aaar.setAdx_id(adminSlot.getAdx_id());
        aaar.setMedia_name(adminSlot.getMedia_name());
        aaar.setMedia_industry_one(adminSlot.getMedia_industry_one());
        aaar.setMedia_industry_two(adminSlot.getMedia_industry_two());
        aaar.setMedia_id(adminSlot.getMedia_id());
        aaar.setPlatform_id(adminSlot.getPlatform_id());
        aaar.setOperation_id(adminSlot.getOperation_id());
        aaar.setSlot_id(adminSlot.getSlot_id());
        aaar.setSlot_name(adminSlot.getSlot_name());
        aaar.setSlot_class(adminSlot.getSlot_class());
        aaar.setSlot_type(adminSlot.getSlot_type());
        aaar.setExtension_id(adminSlot.getExtension_id());
        aaar.setCreative_id(adminSlot.getCreative_id());
        aaar.setCreative_template(adminSlot.getCreative_template());
        aaar.setSettlement_id(adminSlot.getSettlement_id());
        aaar.setSettlement_unit_price(adminSlot.getSettlement_unit_price());
        aaar.setDate_start(adminSlot.getDate_start());
        aaar.setDate_end(adminSlot.getDate_end());
        aaar.setStatus(adminSlot.getStatus());
        aaar.setIs_deleted(adminSlot.getIs_deleted());
        return aaar;
    }

    @Override
    public int removeSlot(List<Long> list) {
        return adminSlotMapper.removeSlot(list);
    }

    @Override
    public Integer upDataSlotStatus( AdminSlotRequestDTO adminSlotRequestDTO) {
        Map params = new HashMap();
        String id = adminSlotRequestDTO.getId().toString();
        String status = adminSlotRequestDTO.getStatus().toString();
        params.put("id",id);
        params.put("status",status);
        return adminSlotMapper.upDataSlotStatus(params);
    }

    @Override
    public List<Map> adminSlotCreativeTemplate(List id) {
        List<Map> list1 = new ArrayList();
        for(int i = 0 ; i<id.size() ; i++){
            Map result = new HashMap();
            Map list = adminSlotMapper.adminSlotCreativeTemplate(Integer.valueOf(id.get(i).toString()));
            String id1 = list.get("id").toString();
            String slotName = list.get("slot_name").toString();
            String name = list.get("name").toString();
            result.put("id",id1);
            result.put("slot_name",slotName);
            result.put("name",name);
            list1.add(result);
        }
        return list1;
    }


}
