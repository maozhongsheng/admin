package com.mk.ad.mapper;

import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.Request.AdminIndexSlotRequestDTO;
import com.mk.ad.vo.Request.SspMediaRequestDTO;

import com.mk.ad.vo.SspMedia;
import com.mk.ad.vo.SspMediaExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SspMediaMapper {
    long countByExample(SspMediaExample example);

    int deleteByExample(SspMediaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SspMedia record);

    int insertSelective(SspMedia record);

    List<SspMedia> selectByExample(SspMediaExample example);

    SspMedia selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SspMedia record, @Param("example") SspMediaExample example);

    int updateByExample(@Param("record") SspMedia record, @Param("example") SspMediaExample example);

    int updateByPrimaryKeySelective(SspMedia record);

    int updateByPrimaryKey(SspMedia record);

    Integer updateMediaStatus(Map params);

    Map selectssp(String id);

    List<String> adminSspAccountMapper(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO);

    List mediaIdNameDTO(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO);

    String adminSelectMediaName(AdminClientIndexDTO adminClientIndexDTO);

    List<String> mediaSspId(SspMediaRequestDTO sspMediaRequestDTO);

    List<String> dspIndexSelectSlotId(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO);

    List<SspMedia> sspMediaSelectAll();
}