package com.mk.ad.mapper;

import com.mk.ad.vo.AdvertisingAlliance;
import com.mk.ad.vo.AdvertisingAllianceExample;
import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.Request.AdminUnionSlotRequestDTO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AdvertisingAllianceMapper {
    long countByExample(AdvertisingAllianceExample example);

    int deleteByExample(AdvertisingAllianceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdvertisingAlliance record);

    int insertSelective(AdvertisingAlliance record);

    List<AdvertisingAlliance> selectByExample(AdvertisingAllianceExample example);

    AdvertisingAlliance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdvertisingAlliance record, @Param("example") AdvertisingAllianceExample example);

    int updateByExample(@Param("record") AdvertisingAlliance record, @Param("example") AdvertisingAllianceExample example);

    int updateByPrimaryKeySelective(AdvertisingAlliance record);

    int updateByPrimaryKey(AdvertisingAlliance record);

    List selectMediaByUpperId(Integer id);

    List selectAdslotByUpperId(Integer id);

    List<String> adminUnionMapper(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO);

    List<String> adminSelectUnionMediaName(AdminClientIndexDTO adminClientIndexDTO);

    List<String> adminSelectUnionSlotName(AdminClientIndexDTO adminClientIndexDTO);

    List adminIndexUnionMedia(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO);

    List adminIndexUnionSlot(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO);

    List selectMedia();

    List selectSlot();


    String selectidByslotid(String id);

    List selectSlotName();

    List<AdvertisingAlliance> dspMediaSelectAll();

    List<AdvertisingAlliance> dspSlotSelectAll();
}