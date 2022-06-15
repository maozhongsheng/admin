package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdxMould;
import com.mk.ad.vo.Request.AdminAdxMouldRequestDTO;
import com.mk.ad.vo.Response.AdminAdxMouldResponseDTO;

import java.util.List;
import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface AdminAdxMouldService {

    LarkPageInfoVo<AdminAdxMouldResponseDTO> getAdxMouldList(AdminAdxMouldRequestDTO adminAdxMouldRequestDTO);

    List<Map> getAdxSlotList();

    Integer updateStatus(Map params);

    Integer updateDeleteStatus(Map params);

    List<Map> getAdxMouldListA();

    Integer insertAdxMould(AdminAdxMould adminAdxMould);


    Map getAdxMouldInfo(Map params);

    Integer UpdateAdxMould(AdminAdxMould adminAdxMould);

    Integer updateTemplateDeleteStatus(Map params);

}
