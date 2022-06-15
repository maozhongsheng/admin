package com.mk.ad.mapper;

import com.mk.ad.vo.AdminSlotConfigure;
import com.mk.ad.vo.AdminSlotConfigureExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminSlotConfigureMapper {
    long countByExample(AdminSlotConfigureExample example);

    int deleteByExample(AdminSlotConfigureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminSlotConfigure record);

    int insertSelective(AdminSlotConfigure record);

    List<AdminSlotConfigure> selectByExample(AdminSlotConfigureExample example);

    AdminSlotConfigure selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminSlotConfigure record, @Param("example") AdminSlotConfigureExample example);

    int updateByExample(@Param("record") AdminSlotConfigure record, @Param("example") AdminSlotConfigureExample example);

    int updateByPrimaryKeySelective(AdminSlotConfigure record);

    int updateByPrimaryKey(AdminSlotConfigure record);
}