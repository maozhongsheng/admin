package com.mk.ad.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdvertisingAllianceMapper;
import com.mk.ad.mapper.SspMaterialMapper;
import com.mk.ad.mapper.UpperReachesMapper;
import com.mk.ad.service.AdminSspMaterialService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.RedisUtil;
import com.mk.ad.vo.AdvertisingAlliance;
import com.mk.ad.vo.Request.AdminSspMaterialRequestDTO;
import com.mk.ad.vo.Response.AdminSspMaterialResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.SspMaterial;
import com.mk.ad.vo.SspMaterialExample;
import com.mk.ad.vo.UpperReaches;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2022/5/6 13:21
 */
@Slf4j
@Service
@Repository
public class AdminSspMaterialServiceImpl implements AdminSspMaterialService {

    @Autowired
    private SspMaterialMapper sspMaterialMapper;

    @Autowired
    private UpperReachesMapper upperReachesMapper;

    @Autowired
    private AdvertisingAllianceMapper advertisingAllianceMapper;

    @Resource
    private RedisUtil redisUtil;

    @Override
    public LarkPageInfoVo<AdminSspMaterialResponseDTO> getAdminsspMaterialList(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) {
        SspMaterialExample example = new SspMaterialExample();
        SspMaterialExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotEmpty(adminSspMaterialRequestDTO.getUpper_name())){
            criteria.andUpper_nameLike("%"+adminSspMaterialRequestDTO.getUpper_name()+"%");
        }
        if(StringUtils.isNotEmpty(adminSspMaterialRequestDTO.getUpper_slot_name())){
            criteria.andUpper_slot_nameLike("%"+adminSspMaterialRequestDTO.getUpper_slot_name()+"%");
        }

        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(adminSspMaterialRequestDTO.getPage(),adminSspMaterialRequestDTO.getLimit());
        List<SspMaterial> sspMaterialList = sspMaterialMapper.selectByExample(example);
        PageInfo<SspMaterial> pageInfo = new PageInfo<>(sspMaterialList);
        List<AdminSspMaterialResponseDTO> list = sspMaterialList.stream().map(msg ->{
            AdminSspMaterialResponseDTO event = new AdminSspMaterialResponseDTO();
            event.setId(msg.getId());
            event.setUpper_name(msg.getUpper_name());
            event.setUpper_slot_name(msg.getUpper_slot_name());
            event.setKeywords(msg.getKeywords());
            event.setMaterial(msg.getMaterial());
            event.setStatus(msg.getStatus());
            event.setType(msg.getType());
            event.setUpper_slot_id(msg.getUpper_slot_id());
            event.setUpper_id(msg.getUpper_id());
            event.setW(msg.getMaterial_w());
            event.setH(msg.getMaterial_h());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminSspMaterialResponseDTO>().pageZset(list, (int) pageInfo.getTotal(),adminSspMaterialRequestDTO.getLimit(), adminSspMaterialRequestDTO.getPage());
    }

    @Override
    public Integer addAdminSspMaterial(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) {
        SspMaterial sspMaterial = new SspMaterial();
        sspMaterial.setUpper_id(adminSspMaterialRequestDTO.getUpper_id());
        UpperReaches upperReaches = upperReachesMapper.selectByPrimaryKey(adminSspMaterialRequestDTO.getUpper_id());
        sspMaterial.setUpper_name(upperReaches.getCorporate_name());
        sspMaterial.setUpper_slot_id(adminSspMaterialRequestDTO.getUpper_slot_id());
        AdvertisingAlliance advertisingAlliance = advertisingAllianceMapper.selectByPrimaryKey(adminSspMaterialRequestDTO.getUpper_slot_id());
        sspMaterial.setUpper_slot_name(advertisingAlliance.getAdvert_name());
        sspMaterial.setKeywords(adminSspMaterialRequestDTO.getKeywords());
        sspMaterial.setType(adminSspMaterialRequestDTO.getType());
        sspMaterial.setMaterial(adminSspMaterialRequestDTO.getMaterial());
        sspMaterial.setMaterial_h(adminSspMaterialRequestDTO.getH());
        sspMaterial.setMaterial_w(adminSspMaterialRequestDTO.getW());
        sspMaterial.setStatus(0);
        Map result = new HashMap();
        result.put("material",adminSspMaterialRequestDTO.getMaterial());
        result.put("keywords",adminSspMaterialRequestDTO.getKeywords());
        result.put("status","0");
        result.put("type",adminSspMaterialRequestDTO.getType());
        String s = adminSspMaterialRequestDTO.getUpper_id().toString() + adminSspMaterialRequestDTO.getUpper_slot_id().toString() + adminSspMaterialRequestDTO.getType().toString() + adminSspMaterialRequestDTO.getW().toString() + adminSspMaterialRequestDTO.getH().toString();
        redisUtil.set(s, JSONObject.toJSONString(result));
        int i = sspMaterialMapper.insertSelective(sspMaterial);
        return i;
    }

    @Override
    public Integer updateAdminSspMaterial(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) {
        SspMaterial sspMaterial = new SspMaterial();
        sspMaterial.setId(adminSspMaterialRequestDTO.getId());
        sspMaterial.setUpper_id(adminSspMaterialRequestDTO.getUpper_id());
        UpperReaches upperReaches = upperReachesMapper.selectByPrimaryKey(adminSspMaterialRequestDTO.getUpper_id());
        sspMaterial.setUpper_name(upperReaches.getCorporate_name());
        sspMaterial.setUpper_slot_id(adminSspMaterialRequestDTO.getUpper_slot_id());
        AdvertisingAlliance advertisingAlliance = advertisingAllianceMapper.selectByPrimaryKey(adminSspMaterialRequestDTO.getUpper_slot_id());
        sspMaterial.setUpper_slot_name(advertisingAlliance.getAdvert_name());
        sspMaterial.setKeywords(adminSspMaterialRequestDTO.getKeywords());
        sspMaterial.setType(adminSspMaterialRequestDTO.getType());
        sspMaterial.setMaterial(adminSspMaterialRequestDTO.getMaterial());
        sspMaterial.setMaterial_w(adminSspMaterialRequestDTO.getW());
        sspMaterial.setMaterial_h(adminSspMaterialRequestDTO.getH());
        sspMaterial.setStatus(adminSspMaterialRequestDTO.getStatus());
        Map result = new HashMap();
        result.put("material",adminSspMaterialRequestDTO.getMaterial());
        result.put("keywords",adminSspMaterialRequestDTO.getKeywords());
        result.put("status",adminSspMaterialRequestDTO.getStatus());
        result.put("type",adminSspMaterialRequestDTO.getType());
        String s = adminSspMaterialRequestDTO.getUpper_id().toString() + adminSspMaterialRequestDTO.getUpper_slot_id().toString() + adminSspMaterialRequestDTO.getType().toString() + adminSspMaterialRequestDTO.getW().toString() + adminSspMaterialRequestDTO.getH().toString();
        redisUtil.del(s);
        redisUtil.set(s, JSONObject.toJSONString(result));
        int i = sspMaterialMapper.updateByPrimaryKeySelective(sspMaterial);
        return i;
    }

    @Override
    public Integer updateMaterialStatus(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) {
        SspMaterial sspMaterial = new SspMaterial();
        sspMaterial.setId(adminSspMaterialRequestDTO.getId());
        sspMaterial.setStatus(adminSspMaterialRequestDTO.getStatus());
        int i = sspMaterialMapper.updateByPrimaryKeySelective(sspMaterial);
        return i;
    }

    @Override
    public AdminSspMaterialResponseDTO adminSspMaterialById(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) {
        SspMaterial sspMaterial = sspMaterialMapper.selectByPrimaryKey(adminSspMaterialRequestDTO.getId());
        AdminSspMaterialResponseDTO adminSspMaterialResponseDTO = new AdminSspMaterialResponseDTO();
        adminSspMaterialResponseDTO.setId(sspMaterial.getId());
        adminSspMaterialResponseDTO.setUpper_id(sspMaterial.getUpper_id());
        adminSspMaterialResponseDTO.setUpper_name(sspMaterial.getUpper_name());
        adminSspMaterialResponseDTO.setUpper_slot_id(sspMaterial.getUpper_slot_id());
        adminSspMaterialResponseDTO.setUpper_slot_name(sspMaterial.getUpper_slot_name());
        adminSspMaterialResponseDTO.setType(sspMaterial.getType());
        adminSspMaterialResponseDTO.setMaterial(sspMaterial.getMaterial());
        adminSspMaterialResponseDTO.setKeywords(sspMaterial.getKeywords());
        adminSspMaterialResponseDTO.setStatus(sspMaterial.getStatus());
        adminSspMaterialResponseDTO.setW(sspMaterial.getMaterial_w());
        adminSspMaterialResponseDTO.setH(sspMaterial.getMaterial_h());
        return adminSspMaterialResponseDTO;
    }


}
