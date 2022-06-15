package com.mk.ad.mapper.mymapper;

import com.mk.ad.mapper.BussinessTypeOneMapper;
import com.mk.ad.vo.BussinessTypeOne;
import com.mk.ad.vo.Request.BussinessTypeOneRequestDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyBussinessTypeOneMapper extends BussinessTypeOneMapper {


    @Select("select id,type_name from bussiness_type_one")
    List<BussinessTypeOne> selectBussinessType(BussinessTypeOneRequestDTO bussinessTypeOneRequestDTO);

    @Select("select type_name from bussiness_type_one where id=#{id}")
    String selectBussinessTypeById(Integer id);
}
