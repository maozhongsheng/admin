package com.mk.ad.mapper.mymapper;

import com.mk.ad.mapper.AdminAdxMouldMapper;
import org.apache.ibatis.annotations.Select;


public interface MyAdminAdxMouldMapper extends AdminAdxMouldMapper {

    @Select("select slot_type_name from data_slot_type where id=#{slot_type}")
    String selectSlotTypeById(Integer slot_type);
}