package com.mk.ad.mapper;

import com.mk.ad.vo.BussinessTypeOne;
import com.mk.ad.vo.BussinessTypeOneExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussinessTypeOneMapper {
    long countByExample(BussinessTypeOneExample example);

    int deleteByExample(BussinessTypeOneExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BussinessTypeOne record);

    int insertSelective(BussinessTypeOne record);

    List<BussinessTypeOne> selectByExample(BussinessTypeOneExample example);

    BussinessTypeOne selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BussinessTypeOne record, @Param("example") BussinessTypeOneExample example);

    int updateByExample(@Param("record") BussinessTypeOne record, @Param("example") BussinessTypeOneExample example);

    int updateByPrimaryKeySelective(BussinessTypeOne record);

    int updateByPrimaryKey(BussinessTypeOne record);
}