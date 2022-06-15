package com.mk.ad.mapper.mymapper;

import com.mk.ad.mapper.BussinessTypeTwoMapper;
import com.mk.ad.vo.BussinessTypeTwo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyBussinessTypeTwoMapper extends BussinessTypeTwoMapper {

    @Select("select id,category_name from bussiness_type_two where type_id = #{type_id}")
    List<BussinessTypeTwo> selectBussinessTwoType(Integer typeId);
}
