package com.mk.ad.mapper;

import com.mk.ad.vo.BussinessTypeTwo;
import com.mk.ad.vo.BussinessTypeTwoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussinessTypeTwoMapper {
    long countByExample(BussinessTypeTwoExample example);

    int deleteByExample(BussinessTypeTwoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BussinessTypeTwo record);

    int insertSelective(BussinessTypeTwo record);

    List<BussinessTypeTwo> selectByExample(BussinessTypeTwoExample example);

    BussinessTypeTwo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BussinessTypeTwo record, @Param("example") BussinessTypeTwoExample example);

    int updateByExample(@Param("record") BussinessTypeTwo record, @Param("example") BussinessTypeTwoExample example);

    int updateByPrimaryKeySelective(BussinessTypeTwo record);

    int updateByPrimaryKey(BussinessTypeTwo record);
}