package com.mk.ad.mapper;

import com.mk.ad.vo.AdminAdxAccount;
import com.mk.ad.vo.AdminAdxAccountExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminAdxAccountMapper {
    long countByExample(AdminAdxAccountExample example);

    int deleteByExample(AdminAdxAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminAdxAccount adminAdxAccount);

    int insertSelective(AdminAdxAccount record);

    List<AdminAdxAccount> selectByExample(AdminAdxAccountExample example);

    AdminAdxAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminAdxAccount record, @Param("example") AdminAdxAccountExample example);

    int updateByExample(@Param("record") AdminAdxAccount record, @Param("example") AdminAdxAccountExample example);

    int updateByPrimaryKeySelective(AdminAdxAccount record);

    int updateByPrimaryKey(AdminAdxAccount record);
}