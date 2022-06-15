package com.mk.ad.mapper;

import com.mk.ad.vo.DspCustomerManagement;
import com.mk.ad.vo.DspCustomerManagementExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DspCustomerManagementMapper {
    long countByExample(DspCustomerManagementExample example);

    int deleteByExample(DspCustomerManagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DspCustomerManagement record);

    int insertSelective(DspCustomerManagement record);

    List<DspCustomerManagement> selectByExample(DspCustomerManagementExample example);

    DspCustomerManagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DspCustomerManagement record, @Param("example") DspCustomerManagementExample example);

    int updateByExample(@Param("record") DspCustomerManagement record, @Param("example") DspCustomerManagementExample example);

    int updateByPrimaryKeySelective(DspCustomerManagement record);

    int updateByPrimaryKey(DspCustomerManagement record);
}