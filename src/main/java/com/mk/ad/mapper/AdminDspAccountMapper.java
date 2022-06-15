package com.mk.ad.mapper;

import com.mk.ad.vo.AdminDspAccount;
import com.mk.ad.vo.AdminDspAccountExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminDspAccountMapper {
    long countByExample(AdminDspAccountExample example);

    int deleteByExample(AdminDspAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminDspAccount record);

    int insertSelective(AdminDspAccount record);

    List<AdminDspAccount> selectByExample(AdminDspAccountExample example);

    AdminDspAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminDspAccount record, @Param("example") AdminDspAccountExample example);

    int updateByExample(@Param("record") AdminDspAccount record, @Param("example") AdminDspAccountExample example);

    int updateByPrimaryKeySelective(AdminDspAccount record);

    int updateByPrimaryKey(AdminDspAccount record);

    Integer UpdateDspStatus(Map params);
}