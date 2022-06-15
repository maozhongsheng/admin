package com.mk.ad.mapper;

import com.mk.ad.vo.AdminAdxMouldExample;
import com.mk.ad.vo.AdminAdxMould;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminAdxMouldMapper {
    long countByExample(AdminAdxMouldExample example);

    int deleteByExample(AdminAdxMouldExample example);

    int deleteByPrimaryKey(String id);

    int insert(AdminAdxMould record);

    int insertSelective(AdminAdxMould record);

    List<AdminAdxMould> selectByExample(AdminAdxMouldExample example);

    AdminAdxMould selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AdminAdxMould record, @Param("example") AdminAdxMouldExample example);

    int updateByExample(@Param("record") AdminAdxMould record, @Param("example") AdminAdxMouldExample example);

    int updateByPrimaryKeySelective(AdminAdxMould record);

    int updateByPrimaryKey(AdminAdxMould record);

    List<Map> getAdxSlotList();

    Integer updateStatus(Map params);

    Integer updateDeleteStatus(Map params);

    List<Map> getAdxMouldListA();

    String getAdxSlotName(Integer slot_type);
}