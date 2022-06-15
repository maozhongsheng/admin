package com.mk.ad.mapper;

import com.mk.ad.vo.AdminMediaAudit;
import com.mk.ad.vo.AdminMediaAuditExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminMediaAuditMapper {
    long countByExample(AdminMediaAuditExample example);

    int deleteByExample(AdminMediaAuditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminMediaAudit record);

    int insertSelective(AdminMediaAudit record);

    List<AdminMediaAudit> selectByExample(AdminMediaAuditExample example);

    AdminMediaAudit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminMediaAudit record, @Param("example") AdminMediaAuditExample example);

    int updateByExample(@Param("record") AdminMediaAudit record, @Param("example") AdminMediaAuditExample example);

    int updateByPrimaryKeySelective(AdminMediaAudit record);

    int updateByPrimaryKey(AdminMediaAudit record);

    Integer updateMediaStatus(Map params);
}