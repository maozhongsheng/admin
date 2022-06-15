package com.mk.ad.mapper;

import com.mk.ad.vo.AdminAdx;
import com.mk.ad.vo.AdminAdxExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminAdxMapper {
    long countByExample(AdminAdxExample example);

    int deleteByExample(AdminAdxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminAdx record);

    int insertSelective(AdminAdx record);

    List<AdminAdx> selectByExample(AdminAdxExample example);

    AdminAdx selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminAdx record, @Param("example") AdminAdxExample example);

    int updateByExample(@Param("record") AdminAdx record, @Param("example") AdminAdxExample example);

    int updateByPrimaryKeySelective(AdminAdx record);

    int updateByPrimaryKey(AdminAdx record);

    Integer updateAdxMoney(Map params);

    Integer upADXStatus(Long id, Integer status);
}