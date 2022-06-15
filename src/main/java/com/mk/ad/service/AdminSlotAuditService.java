package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminSlotAuditRequestDTO;
import com.mk.ad.vo.Response.AdminSlotAuditResponseDTO;

import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/22 13:22
 */
public interface AdminSlotAuditService {
    LarkPageInfoVo<AdminSlotAuditResponseDTO> getSlotList(AdminSlotAuditRequestDTO adminSlotAuditRequestDTO);

    Integer updateSlotAuditStatus(Map params);
}
