package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Response.SspAdSlotResponseDTO;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/22 13:22
 */
public interface SspAdSlotService {
    LarkPageInfoVo<SspAdSlotResponseDTO> getSlotList(SspAdSlotRequestDTO sspAdSlotRequestDTO);

    Integer updateSlotStatus(SspAdSlotRequestDTO sspAdSlotRequestDTO);
}
