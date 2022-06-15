package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminSspMaterialRequestDTO;
import com.mk.ad.vo.Response.AdminSspMaterialResponseDTO;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2022/5/6 13:21
 */
public interface AdminSspMaterialService {
    LarkPageInfoVo<AdminSspMaterialResponseDTO> getAdminsspMaterialList(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO);

    Integer addAdminSspMaterial(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO);

    Integer updateAdminSspMaterial(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO);

    Integer updateMaterialStatus(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO);

    AdminSspMaterialResponseDTO adminSspMaterialById(AdminSspMaterialRequestDTO adminSspMaterialRequestDTO);
}
