package com.mk.ad.mapper;

import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.UpperReaches;
import com.mk.ad.vo.UpperReachesExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UpperReachesMapper {
    long countByExample(UpperReachesExample example);

    int deleteByExample(UpperReachesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpperReaches record);

    int insertSelective(UpperReaches record);

    List<UpperReaches> selectByExample(UpperReachesExample example);

    UpperReaches selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpperReaches record, @Param("example") UpperReachesExample example);

    int updateByExample(@Param("record") UpperReaches record, @Param("example") UpperReachesExample example);

    int updateByPrimaryKeySelective(UpperReaches record);

    int updateByPrimaryKey(UpperReaches record);

    Integer selectIdByname(String upper);

    List<Map> selectsoltIdByUpperId(Integer id);

    String adminSelectUnionName(AdminClientIndexDTO adminClientIndexDTO);

    List selectUnion();

    List<UpperReaches> upperSelectAll();
}