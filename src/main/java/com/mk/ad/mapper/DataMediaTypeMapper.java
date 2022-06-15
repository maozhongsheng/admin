package com.mk.ad.mapper;

import com.mk.ad.vo.DataMediaType;
import com.mk.ad.vo.DataMediaTypeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataMediaTypeMapper {
    long countByExample(DataMediaTypeExample example);

    int deleteByExample(DataMediaTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DataMediaType record);

    int insertSelective(DataMediaType record);

    List<DataMediaType> selectByExample(DataMediaTypeExample example);

    DataMediaType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DataMediaType record, @Param("example") DataMediaTypeExample example);

    int updateByExample(@Param("record") DataMediaType record, @Param("example") DataMediaTypeExample example);

    int updateByPrimaryKeySelective(DataMediaType record);

    int updateByPrimaryKey(DataMediaType record);
}