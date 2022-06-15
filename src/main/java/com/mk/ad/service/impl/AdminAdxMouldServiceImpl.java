package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.service.AdminAdxMouldService;
import com.mk.ad.mapper.AdminAdxAccountMapper;
import com.mk.ad.mapper.AdminAdxMapper;
import com.mk.ad.mapper.AdminAdxMouldMapper;
import com.mk.ad.mapper.AdminAdxTemplateMaterialMapper;
import com.mk.ad.utils.IDGen;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdx;
import com.mk.ad.vo.AdminAdxMould;
import com.mk.ad.vo.AdminAdxMouldExample;
import com.mk.ad.vo.AdminAdxTemplateMaterial;

import com.mk.ad.vo.Request.AdminAdxMouldRequestDTO;
import com.mk.ad.vo.Response.AdminAdxMouldResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2021/3/8 13:22
 */
@Slf4j
@Service
@Repository
public class AdminAdxMouldServiceImpl implements AdminAdxMouldService {

    @Autowired
    AdminAdxAccountMapper adminAdxAccountMapper;

    @Autowired
    private AdminAdxMouldMapper adminAdxMouldMapper;

    @Autowired
    private AdminAdxMapper adminAdxMapper;

    @Autowired
    private AdminAdxTemplateMaterialMapper adminAdxTemplateMaterialMapper;

    @Override
    public LarkPageInfoVo<AdminAdxMouldResponseDTO> getAdxMouldList(AdminAdxMouldRequestDTO adminAdxMouldRequestDTO) {

        AdminAdxMouldExample example = new AdminAdxMouldExample();
        AdminAdxMouldExample.Criteria criteria = example.createCriteria();

        if (adminAdxMouldRequestDTO.getSlot_type() != null){
            criteria.andSlot_typeEqualTo(Integer.parseInt(adminAdxMouldRequestDTO.getSlot_type().toString()));
        }

        if (adminAdxMouldRequestDTO.getAdx_id() != null){
            criteria.andAdx_idEqualTo(adminAdxMouldRequestDTO.getAdx_id());
        }

        if (adminAdxMouldRequestDTO.getTemplate_type() != null){
            criteria.andTemplate_typeIn(adminAdxMouldRequestDTO.getTemplate_type());
        }

        if (adminAdxMouldRequestDTO.getTemplate_id() != null){
            criteria.andTemplate_idLike(adminAdxMouldRequestDTO.getTemplate_id());
        }

        if(StringUtils.isNotBlank(adminAdxMouldRequestDTO.getTemplate_name())){
            criteria.andTemplate_nameLike(adminAdxMouldRequestDTO.getTemplate_name());
        }
        if(adminAdxMouldRequestDTO.getStatus()!=null) {
            criteria.andStatusEqualTo(Integer.valueOf(adminAdxMouldRequestDTO.getStatus()));
        }
        if(adminAdxMouldRequestDTO.getAdx_id()!=null){
            criteria.andAdx_idEqualTo(adminAdxMouldRequestDTO.getAdx_id());
        }
            criteria.andDelete_statusEqualTo(0);
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(adminAdxMouldRequestDTO.getPage(),adminAdxMouldRequestDTO.getLimit());
        List<AdminAdxMould> adminAdxMouldList = adminAdxMouldMapper.selectByExample(example);
        PageInfo<AdminAdxMould> pageInfo = new PageInfo<>(adminAdxMouldList);
        List<AdminAdxMouldResponseDTO> list = adminAdxMouldList.stream().map(msg ->{
            AdminAdxMouldResponseDTO event = new AdminAdxMouldResponseDTO();
            AdminAdx adminAdx = adminAdxMapper.selectByPrimaryKey(Long.valueOf(msg.getAdx_id().toString()));
            String name = adminAdxMouldMapper.getAdxSlotName(msg.getSlot_type());
            event.setAdx_name(adminAdx.getAdx_name());
            event.setId(msg.getId());
            event.setAdx_id(msg.getAdx_id());
            event.setCreate_time(msg.getCreate_time());
            event.setDelete_status(msg.getDelete_status());
            event.setStatus(msg.getStatus());
            event.setSlot_type(msg.getSlot_type());
            event.setPromotion_type(msg.getPromotion_type());
            event.setTemplate_id(msg.getTemplate_id());
            event.setTemplate_name(msg.getTemplate_name());
            event.setTemplate_type(msg.getTemplate_type());
            event.setTemplate_photo(msg.getTemplate_photo());
            event.setSlot_type(msg.getSlot_type());
            event.setTemplate_description(msg.getTemplate_description());
            event.setTemplate_type_name(msg.getTemplate_type_name());
            event.setSlot_name(name);
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminAdxMouldResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminAdxMouldRequestDTO.getLimit(), adminAdxMouldRequestDTO.getPage());
    }

    @Override
    public List<Map> getAdxSlotList() {
        List<Map> result = null;
        result =  adminAdxMouldMapper.getAdxSlotList();
        return result;
    }

    @Override
    public Integer updateStatus(Map params) {

        Integer resutl =  adminAdxMouldMapper.updateStatus(params);

        return resutl;
    }

    @Override
    public Integer updateDeleteStatus(Map params) {
        Integer resutl =  adminAdxMouldMapper.updateDeleteStatus(params);

        return resutl;
    }

    @Override
    public List<Map> getAdxMouldListA() {
        List<Map> result = null;
        result =  adminAdxMouldMapper.getAdxMouldListA();
        return result;
    }

    @Override
    public Integer insertAdxMould(AdminAdxMould adminAdxMould) {
        Long l = Long.valueOf(IDGen.generateNumber());
        adminAdxMould.setId(l.intValue());
        adminAdxMould.setDelete_status(0);
        adminAdxMould.setCreate_time(new Date());
        adminAdxMould.setStatus(0);
        int insert = adminAdxMouldMapper.insert(adminAdxMould);
        List<AdminAdxTemplateMaterial> list = adminAdxMould.getList();
        if(list!=null){
        for (int i = 0; i < list.size() ; i++ ){
            AdminAdxTemplateMaterial adminAdxTemplateMaterial = new AdminAdxTemplateMaterial();
            adminAdxTemplateMaterial.setMid(l.intValue());
            adminAdxTemplateMaterial.setMaterial_size(list.get(i).getMaterial_size());
            adminAdxTemplateMaterial.setMaterial_time(list.get(i).getMaterial_time());
            adminAdxTemplateMaterial.setMaterial_time_max(list.get(i).getMaterial_time_max());
            adminAdxTemplateMaterial.setMaterial_type(list.get(i).getMaterial_type());
            adminAdxTemplateMaterial.setDelete_status(0);
            adminAdxTemplateMaterial.setMaterial_description(list.get(i).getMaterial_description());
            adminAdxTemplateMaterial.setMaterial_specification(list.get(i).getMaterial_specification());
            adminAdxTemplateMaterial.setPhoto_count(list.get(i).getPhoto_count());
            adminAdxTemplateMaterial.setOrder_id(list.get(i).getOrder_id());
            adminAdxTemplateMaterial.setMust_pass(list.get(i).getMust_pass());
            adminAdxTemplateMaterialMapper.insert(adminAdxTemplateMaterial);
        }
        }
        return insert ;
    }

    @Override
    public Map getAdxMouldInfo(Map params) {
        Map result = new HashMap();
        String id = params.get("id").toString();
        AdminAdxMould adminAdxMould = adminAdxMouldMapper.selectByPrimaryKey(id);
        result.put("adminAdxMould",adminAdxMould);
        String tid = params.get("id").toString();
        List<Map> template =adminAdxTemplateMaterialMapper.selectByid(tid);
        result.put("adminAdxTemplate",template);
        return result;
    }

    @Override
    public Integer UpdateAdxMould(AdminAdxMould adminAdxMould) {
        int result = adminAdxMouldMapper.updateByPrimaryKeySelective(adminAdxMould);
        List<AdminAdxTemplateMaterial> list = adminAdxMould.getList();
        if(list != null){
            int j =adminAdxTemplateMaterialMapper.deleteByMid(adminAdxMould.getId().toString());
            for (int i = 0; i < list.size() ; i++){
                AdminAdxTemplateMaterial adminAdxTemplateMaterial = new AdminAdxTemplateMaterial();
                adminAdxTemplateMaterial.setMid(adminAdxMould.getId());
                adminAdxTemplateMaterial.setMaterial_size(list.get(i).getMaterial_size());
                adminAdxTemplateMaterial.setMaterial_time(list.get(i).getMaterial_time());
                adminAdxTemplateMaterial.setMaterial_type(list.get(i).getMaterial_type());
                adminAdxTemplateMaterial.setDelete_status(0);
                adminAdxTemplateMaterial.setMaterial_description(list.get(i).getMaterial_description());
                adminAdxTemplateMaterial.setMaterial_specification(list.get(i).getMaterial_specification());
                adminAdxTemplateMaterial.setPhoto_count(list.get(i).getPhoto_count());
                adminAdxTemplateMaterial.setOrder_id(list.get(i).getOrder_id());
                adminAdxTemplateMaterial.setMust_pass(list.get(i).getMust_pass());
                adminAdxTemplateMaterialMapper.insert(adminAdxTemplateMaterial);
            }
        }

        return result;
    }

    @Override
    public Integer updateTemplateDeleteStatus(Map params) {
        Integer resutl =  adminAdxTemplateMaterialMapper.updateTemplateDeleteStatus(params);

        return resutl;
    }


}