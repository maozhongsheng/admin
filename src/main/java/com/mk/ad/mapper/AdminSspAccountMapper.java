package com.mk.ad.mapper;

import com.mk.ad.vo.AdminSspAccount;
import com.mk.ad.vo.AdminSspAccountExample;
import com.mk.ad.vo.Request.AdminClientIndexDTO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminSspAccountMapper {
    long countByExample(AdminSspAccountExample example);

    int deleteByExample(AdminSspAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminSspAccount record);

    int insertSelective(AdminSspAccount record);

    List<AdminSspAccount> selectByExample(AdminSspAccountExample example);

    AdminSspAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminSspAccount record, @Param("example") AdminSspAccountExample example);

    int updateByExample(@Param("record") AdminSspAccount record, @Param("example") AdminSspAccountExample example);

    int updateByPrimaryKeySelective(AdminSspAccount record);

    int updateByPrimaryKey(AdminSspAccount record);

    Integer UpdateSspStatus(Map params);

    Integer updateSspMoney(Map params);

    Integer upDataSspStatus(Long id, Integer status);

    String adminSelectSspCompanyName(AdminClientIndexDTO adminClientIndexDTO);

    AdminSspAccount selectAccount(Long id);

    List<AdminSspAccount> sspSelectAll();
}