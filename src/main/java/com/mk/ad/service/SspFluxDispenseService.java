package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Request.SspFluxDispenseRequestDTO;
import com.mk.ad.vo.Response.SspFluxDispenseResponseDTO;
import com.mk.ad.vo.Response.SspFluxFlowResponseDTO;

import java.util.List;
import java.util.Map;

/**
 * ssp流量分发
 *
 * @author yjn
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface SspFluxDispenseService {

    LarkPageInfoVo<SspFluxDispenseResponseDTO> getSspFluxDispenseList(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO);

    Integer updateSlotFlux(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO);

    SspFluxDispenseRequestDTO selectById(Long id);

    List<Map> selectAll();

    List<Map> selectAdvertisement(SspAdSlotRequestDTO sspAdSlotRequestDTO);

    LarkPageInfoVo<SspFluxFlowResponseDTO> getSspFlowList(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO);

    Integer updateSlotFormal(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO);

    Integer updateSlotDirectional(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO);

    Integer updateAllianceSlotFlux(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO);

    SspFluxDispenseResponseDTO selectAllianceSlotFlux(Integer id);

    Integer sspFluxtoRedis();
}
