package com.mk.ad.mapper;

import com.mk.ad.vo.DspFinance;
import com.mk.ad.vo.DspFinanceExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DspFinanceMapper {
    long countByExample(DspFinanceExample example);

    int deleteByExample(DspFinanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DspFinance record);

    int insertSelective(DspFinance record);

    List<DspFinance> selectByExample(DspFinanceExample example);

    DspFinance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DspFinance record, @Param("example") DspFinanceExample example);

    int updateByExample(@Param("record") DspFinance record, @Param("example") DspFinanceExample example);

    int updateByPrimaryKeySelective(DspFinance record);

    int updateByPrimaryKey(DspFinance record);

    Map getMoney(Integer id);

    Integer addMoney(Map pream);

    Integer reduceReMoney(Map pream);

    Integer selectTotalBalance(Integer id);
}