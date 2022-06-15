package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminUnionSlotRequestDTO;
import com.mk.ad.vo.Request.UpperReachesRequestDTO;
import com.mk.ad.vo.Request.UpperSlotRequestDTO;
import com.mk.ad.vo.Response.AdvertisingAllianceResponseDTO;
import com.mk.ad.vo.Response.UpperReachesResponseDTO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface UpperReachesService {

    LarkPageInfoVo<UpperReachesResponseDTO> getUpperReachesList(UpperReachesRequestDTO upperReachesRequestDTO);

    UpperReachesResponseDTO upperReachesById(UpperReachesRequestDTO upperReachesRequestDTO);

    Integer upperReachesAdd(UpperReachesRequestDTO upperReachesRequestDTO);

    Integer upperReachesEdit(UpperReachesRequestDTO upperReachesRequestDTO);

    Integer deleteupperReaches(UpperReachesRequestDTO upperReachesRequestDTO);

    List getUpperList(UpperReachesRequestDTO upperReachesRequestDTO);

    LarkPageInfoVo<AdvertisingAllianceResponseDTO> getUpperSlotListByid(UpperReachesRequestDTO upperReachesRequestDTO);

    void download(HttpServletResponse response);

    Integer insertinto(List list);

    void insertintom(Map map);

    List<Map> getUpperSlotTree(UpperReachesRequestDTO upperReachesRequestDTO);

    List<String> adminUnionSlotId(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO);

    List adminIndexUnionMedia(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO);

    Integer insertUpperSlot(UpperSlotRequestDTO upperSlotRequestDTO);

    Integer updateUpperSlot(UpperSlotRequestDTO upperSlotRequestDTO);

    List selectUnion();

    List adminIndexUnionSlot(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO);

    Integer upperAlltoRedis();

    Integer deleteAlltoRedis();
}
