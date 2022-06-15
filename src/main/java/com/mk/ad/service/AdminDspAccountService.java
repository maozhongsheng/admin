package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminDspAccountRequestDTO;
import com.mk.ad.vo.Response.AdminDspAccountResponseDTO;

import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface AdminDspAccountService {
    LarkPageInfoVo<AdminDspAccountResponseDTO> getDspList(AdminDspAccountRequestDTO adminDspAccountRequestDTO);

    Integer insertDsp(AdminDspAccountRequestDTO adminDsp);

    AdminDspAccountResponseDTO getDspInfo(Long id);

    Integer updateDsp(AdminDspAccountRequestDTO adminDspAccount);

    Integer UpdateDspStatus(Map params);

    Integer updateDspAccount(AdminDspAccountRequestDTO adminDspAccount);
}
