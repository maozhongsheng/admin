package com.mk.ad.service;


import com.mk.ad.vo.Request.BussinessTypeOneRequestDTO;
import com.mk.ad.vo.Response.BussinessTypeOneResponseDTO;

import java.util.List;

/**
 * admin一级类型
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface BussinessTypeOneService {
    List<BussinessTypeOneResponseDTO> getBussinessType(BussinessTypeOneRequestDTO bussinessTypeOneRequestDTO);
}
