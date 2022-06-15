package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminIndexSlotRequestDTO;
import com.mk.ad.vo.Request.AdminSspAccountRequestDTO;
import com.mk.ad.vo.Request.AdminSspUserRequestDTO;
import com.mk.ad.vo.Response.AdminSspAccountResponseDTO;
import com.mk.ad.vo.Response.AdminSspFinancialResponseDTO;
import com.mk.ad.vo.Response.AdminSspUserResponseDTO;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface AdminSspAccountService {

    LarkPageInfoVo<AdminSspAccountResponseDTO> getSspList(AdminSspAccountRequestDTO adminSspRequestDTO);

    Integer insertSsp(AdminSspAccountRequestDTO adminSsp);

    Integer UpdateSsp(AdminSspAccountRequestDTO adminSsp);

    LarkPageInfoVo<AdminSspAccountResponseDTO> getSspExamine(AdminSspAccountRequestDTO adminSspRequestDTO);

    AdminSspAccountResponseDTO getSspInfo(Long id);

    Integer UpdateSspStatus(AdminSspAccountRequestDTO adminSspRequestDTO);

    LarkPageInfoVo<AdminSspAccountResponseDTO> getSspMoneyList(AdminSspAccountRequestDTO adminSspRequestDTO) throws ParseException;

    Integer updateSspMoney(Map params);

    Integer upDataSspStatus(Long id, Integer status);

    AdminSspFinancialResponseDTO selectFinancial(String user_id);

    List<String> adminIndexSlotId(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO);


    List adminIndexMedia(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO);

    Integer UpdateAdminSspBankEdit(AdminSspAccountRequestDTO adminSsp);

    LarkPageInfoVo<AdminSspUserResponseDTO> getAdminSspUserList(AdminSspUserRequestDTO adminSspUserRequestDTO);

    Integer UpdateAdminSspUserDelete(AdminSspUserRequestDTO adminUser);

    Integer UpdateAdminSspUserEdit(AdminSspUserRequestDTO adminUser);

    Integer insertAdminSspUserAdd(AdminSspUserRequestDTO adminSsp);

    Integer DeleteSsp(AdminSspUserRequestDTO adminUser);

    List<String> dspIndexSelectSlotId(AdminIndexSlotRequestDTO adminIndexSlotRequestDTO);
}
