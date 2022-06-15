package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspMediaRequestDTO;
import com.mk.ad.vo.Response.SspMediaResponseDTO;

import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/22 13:22
 */
public interface SspMediaService {
    LarkPageInfoVo<SspMediaResponseDTO> getMediaList(SspMediaRequestDTO sspMediaRequestDTO);

    Integer updateMediaStatus(Map params);

    SspMediaResponseDTO getMediatInfo(Long id);

}
