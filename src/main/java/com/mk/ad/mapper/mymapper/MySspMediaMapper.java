package com.mk.ad.mapper.mymapper;

import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.vo.SspMedia;
import org.apache.ibatis.annotations.Select;


public interface MySspMediaMapper extends SspMediaMapper {

    @Select("select * from ssp_media where media_name = #{mediaName}")
    SspMedia getSspMediaByMediaName(String mediaName);
}