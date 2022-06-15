package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminMediaAuditRequestDTO;
import com.mk.ad.vo.Response.AdminMediaAuditResponseDTO;

import java.util.Map;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/22 13:22
 */
public interface AdminMediaAuditService {
    LarkPageInfoVo<AdminMediaAuditResponseDTO> getMediaList(AdminMediaAuditRequestDTO adminMediaAuditRequestDTO);

    Integer updateMediaStatus(Map params);
}
