package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdx;
import com.mk.ad.vo.Response.Adx.AdminAdxETwoSlotResponseDTO;
import com.mk.ad.vo.Request.AdminAdxRequestDTO;
import com.mk.ad.vo.Response.Adx.AdminAdxETwoResponseDTO;
import com.mk.ad.vo.Response.AdminAdxResponseDTO;

import java.text.ParseException;
import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface AdminAdxService {
    LarkPageInfoVo<AdminAdxResponseDTO> getAdxList(AdminAdxRequestDTO adminAdxRequestDTO);

    Integer insertAdx(AdminAdx adminAdx);

    Integer UpdateAdx(AdminAdx adminAdx);

    AdminAdxResponseDTO getAdxId(Long id);

    Integer upADXStatus(Long id, Integer status);

    LarkPageInfoVo<AdminAdxResponseDTO> getSspMoneyList(AdminAdxRequestDTO adminAdxRequestDTO) throws ParseException;

    Integer updateAdxMoney(Map params);

    LarkPageInfoVo<AdminAdxETwoResponseDTO> getAdxETwoSlotList(AdminAdxRequestDTO adminAdxRequestDTO);

    Integer getAdxETwoSlot(AdminAdxRequestDTO adminAdxRequestDTO);

    AdminAdxETwoSlotResponseDTO getAdxETwoSlotById(AdminAdxRequestDTO adminAdxRequestDTO);
}
