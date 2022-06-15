package com.mk.ad.mapper.mymapper;

import com.mk.ad.mapper.AdminSspAccountMapper;
import com.mk.ad.vo.AdminSspAccount;
import org.apache.ibatis.annotations.Select;

public interface MyAdminSspAccountMapper extends AdminSspAccountMapper {

    @Select("select * from admin_ssp_account where user_id = #{user_id}")
    AdminSspAccount selectByUserId(String user_id);
}
