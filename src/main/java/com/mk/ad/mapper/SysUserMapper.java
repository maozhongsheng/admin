package com.mk.ad.mapper;

import com.mk.ad.vo.SysUser;
import com.mk.ad.vo.SysUserExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    @Select("select cityname from city where id = #{provinceId}")
    String selectProvince(String provinceId);
    @Select("select cityname from city where id = #{cityId}")
    String selectCity(String cityId);
    @Select("select cityname from city where id = #{province}")
    String selectArea(String province);

    List selectemail();

    Integer selectid(String s);

    Integer selectendid(Map pream);
}