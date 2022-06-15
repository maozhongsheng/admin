package com.mk.ad.service;


import com.mk.ad.vo.Response.BussinessTypeTwoResponseDTO;

import java.util.List;

/**
 * admin二级类型
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */

public interface BussinessTypeTwoService {
    List<BussinessTypeTwoResponseDTO> getBussinessTwoType(Integer typeId);
}
