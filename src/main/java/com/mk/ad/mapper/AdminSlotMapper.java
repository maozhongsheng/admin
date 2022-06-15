package com.mk.ad.mapper;

import com.mk.ad.vo.AdminSlot;
import com.mk.ad.vo.AdminSlotExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminSlotMapper {
    long countByExample(AdminSlotExample example);

    int deleteByExample(AdminSlotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminSlot record);

    int insertSelective(AdminSlot record);

    List<AdminSlot> selectByExample(AdminSlotExample example);

    AdminSlot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminSlot record, @Param("example") AdminSlotExample example);

    int updateByExample(@Param("record") AdminSlot record, @Param("example") AdminSlotExample example);

    int updateByPrimaryKeySelective(AdminSlot record);

    int updateByPrimaryKey(AdminSlot record);

    int removeSlot(List<Long> list);

    Integer upDataSlotStatus(Map params);


    Map adminSlotCreativeTemplate(Integer id);

    List<AdminSlot> selectAdxId(Long id);

    Integer selectMaxslot_id();

    List selectAdxslot();
}