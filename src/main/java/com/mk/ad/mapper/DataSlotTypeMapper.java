package com.mk.ad.mapper;

import com.mk.ad.vo.DataSlotType;
import com.mk.ad.vo.DataSlotTypeExample;
import com.mk.ad.vo.Request.AdminClientIndexDTO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataSlotTypeMapper {
    long countByExample(DataSlotTypeExample example);

    int deleteByExample(DataSlotTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DataSlotType record);

    int insertSelective(DataSlotType record);

    List<DataSlotType> selectByExample(DataSlotTypeExample example);

    DataSlotType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DataSlotType record, @Param("example") DataSlotTypeExample example);

    int updateByExample(@Param("record") DataSlotType record, @Param("example") DataSlotTypeExample example);

    int updateByPrimaryKeySelective(DataSlotType record);

    int updateByPrimaryKey(DataSlotType record);

    String adminSelectSlotTypeName(AdminClientIndexDTO adminClientIndexDTO);

    List<DataSlotType> sspSlotTypeSelectAll();
}