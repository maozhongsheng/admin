package com.mk.ad.mapper;

import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.SspAdSlot;
import com.mk.ad.vo.SspAdSlotExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SspAdSlotMapper {
    long countByExample(SspAdSlotExample example);

    int deleteByExample(SspAdSlotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SspAdSlot record);

    int insertSelective(SspAdSlot record);

    List<SspAdSlot> selectByExample(SspAdSlotExample example);

    SspAdSlot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SspAdSlot record, @Param("example") SspAdSlotExample example);

    int updateByExample(@Param("record") SspAdSlot record, @Param("example") SspAdSlotExample example);

    int updateByPrimaryKeySelective(SspAdSlot record);

    int updateByPrimaryKey(SspAdSlot record);

    SspAdSlot selectById(Long id);

    String selectByName(String media_id);

    List<Map> selectAll();

    List<Map> selectAdvertisement();

    Integer updateSlotStatus(Map params);

    String adminSelectSlotName(AdminClientIndexDTO adminClientIndexDTO);

    Map selectUpperBySlotId(String slot_id);

    Map selectRequetBySlotId(String slot_id);

    List<Map> selectAdvertisementByMediaId(String id);

    List<SspAdSlot> sspAdSlotSelectAll();
}