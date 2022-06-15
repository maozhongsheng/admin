package com.mk.ad.mapper;

import com.mk.ad.vo.AdminSlotAudit;
import com.mk.ad.vo.AdminSlotAuditExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminSlotAuditMapper {
    long countByExample(AdminSlotAuditExample example);

    int deleteByExample(AdminSlotAuditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminSlotAudit record);

    int insertSelective(AdminSlotAudit record);

    List<AdminSlotAudit> selectByExample(AdminSlotAuditExample example);

    AdminSlotAudit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminSlotAudit record, @Param("example") AdminSlotAuditExample example);

    int updateByExample(@Param("record") AdminSlotAudit record, @Param("example") AdminSlotAuditExample example);

    int updateByPrimaryKeySelective(AdminSlotAudit record);

    int updateByPrimaryKey(AdminSlotAudit record);

    Integer updateSlotAuditStatus(Map params);
}