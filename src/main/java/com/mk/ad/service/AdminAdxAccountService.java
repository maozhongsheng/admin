package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdxAccount;
import com.mk.ad.vo.Request.AdminAdxAccountRequestDTO;
import com.mk.ad.vo.Response.AdminAdxAccountResponseDTO;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
public interface AdminAdxAccountService {
    LarkPageInfoVo<AdminAdxAccountResponseDTO> getAdxList(AdminAdxAccountRequestDTO adminAdxAccountRequestDTO);

    Integer insertAdx(AdminAdxAccount adminAdxAccount);

    Integer UpdateAdxAcc(AdminAdxAccount adminAdxAccount);

    AdminAdxAccountRequestDTO getAdxInfo(Long id);
}
