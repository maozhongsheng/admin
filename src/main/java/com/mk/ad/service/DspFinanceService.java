package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminDspFinanceRequestDTO;
import com.mk.ad.vo.Response.AdminDspFinanceResponseDTO;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface DspFinanceService {

    LarkPageInfoVo<AdminDspFinanceResponseDTO> getDspFinanceList(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO);

    Integer DspupdateFinance(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO, String userId);

    LarkPageInfoVo<AdminDspFinanceResponseDTO> getBankAccountList(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO);

    LarkPageInfoVo<AdminDspFinanceResponseDTO> getDspFinanceLogList(AdminDspFinanceRequestDTO adminDspFinanceRequestDTO);
}
