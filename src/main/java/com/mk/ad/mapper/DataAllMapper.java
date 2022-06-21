package com.mk.ad.mapper;

import com.mk.ad.vo.DataAll;
import com.mk.ad.vo.DataAllExample;
import java.util.List;

import com.mk.ad.vo.MkAdmin;
import com.mk.ad.vo.Request.DataAllRequestDTO;
import org.apache.ibatis.annotations.Param;

public interface DataAllMapper {
    long countByExample(DataAllExample example);

    int deleteByExample(DataAllExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DataAll record);

    int insertSelective(DataAll record);

    List<DataAll> selectByExample(DataAllExample example);

    DataAll selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DataAll record, @Param("example") DataAllExample example);

    int updateByExample(@Param("record") DataAll record, @Param("example") DataAllExample example);

    int updateByPrimaryKeySelective(DataAll record);

    int updateByPrimaryKey(DataAll record);

    String selectDataAllReq(DataAllRequestDTO request);

    String selectDataAllRes(DataAllRequestDTO request);

    String selectDataAllPv(DataAllRequestDTO request);

    String selectDataAllCk(DataAllRequestDTO request);

    Integer selectDataListCount(DataAllRequestDTO request);

    Integer selectDataListCountHour(DataAllRequestDTO request);

    List<MkAdmin> getDataList(DataAllRequestDTO request);
}