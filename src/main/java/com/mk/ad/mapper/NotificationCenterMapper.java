package com.mk.ad.mapper;

import com.mk.ad.vo.NotificationCenter;
import com.mk.ad.vo.NotificationCenterExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotificationCenterMapper {
    long countByExample(NotificationCenterExample example);

    int deleteByExample(NotificationCenterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NotificationCenter record);

    int insertSelective(NotificationCenter record);

    List<NotificationCenter> selectByExample(NotificationCenterExample example);

    NotificationCenter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NotificationCenter record, @Param("example") NotificationCenterExample example);

    int updateByExample(@Param("record") NotificationCenter record, @Param("example") NotificationCenterExample example);

    int updateByPrimaryKeySelective(NotificationCenter record);

    int updateByPrimaryKey(NotificationCenter record);
}