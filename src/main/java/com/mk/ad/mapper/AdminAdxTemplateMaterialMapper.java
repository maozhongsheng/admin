package com.mk.ad.mapper;

import com.mk.ad.vo.AdminAdxTemplateMaterialExample;
import com.mk.ad.vo.AdminAdxTemplateMaterial;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminAdxTemplateMaterialMapper {
    long countByExample(AdminAdxTemplateMaterialExample example);

    int deleteByExample(AdminAdxTemplateMaterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminAdxTemplateMaterial record);

    int insertSelective(AdminAdxTemplateMaterial record);

    List<AdminAdxTemplateMaterial> selectByExample(AdminAdxTemplateMaterialExample example);

    AdminAdxTemplateMaterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminAdxTemplateMaterial record, @Param("example") AdminAdxTemplateMaterialExample example);

    int updateByExample(@Param("record") AdminAdxTemplateMaterial record, @Param("example") AdminAdxTemplateMaterialExample example);

    int updateByPrimaryKeySelective(AdminAdxTemplateMaterial record);

    int updateByPrimaryKey(AdminAdxTemplateMaterial record);


    List<Map> selectByid(String id);

    Integer updateTemplateDeleteStatus(Map params);

    int deleteByMid(String id);


}