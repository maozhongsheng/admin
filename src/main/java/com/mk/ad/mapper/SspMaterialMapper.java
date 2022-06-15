package com.mk.ad.mapper;

import com.mk.ad.vo.SspMaterial;
import com.mk.ad.vo.SspMaterialExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SspMaterialMapper {
    long countByExample(SspMaterialExample example);

    int deleteByExample(SspMaterialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SspMaterial record);

    int insertSelective(SspMaterial record);

    List<SspMaterial> selectByExample(SspMaterialExample example);

    SspMaterial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SspMaterial record, @Param("example") SspMaterialExample example);

    int updateByExample(@Param("record") SspMaterial record, @Param("example") SspMaterialExample example);

    int updateByPrimaryKeySelective(SspMaterial record);

    int updateByPrimaryKey(SspMaterial record);
}