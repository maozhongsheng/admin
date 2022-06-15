package com.mk.ad.controller;


import com.mk.ad.service.AdminSspMaterialService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminSspMaterialRequestDTO;
import com.mk.ad.vo.Response.AdminSspMaterialResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2022/5/6 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminSspMaterialController {

    @Autowired
    public AdminSspMaterialService adminSspMaterialService;


    @ApiOperation(value = "Admin素材替换页面查询")
    @RequestMapping(value = "/api/adminsspMaterialList", method = RequestMethod.POST)
    public ResponseResult getAdxList(@RequestBody AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) throws Exception {
        LarkPageInfoVo<AdminSspMaterialResponseDTO> list = adminSspMaterialService.getAdminsspMaterialList(adminSspMaterialRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "Admin素材替换新增")
    @RequestMapping(value = "/api/addAdminSspMaterial", method = RequestMethod.POST)
    public ResponseResult addAdminSspMaterial(@RequestBody AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) throws Exception {
        Integer result =adminSspMaterialService.addAdminSspMaterial(adminSspMaterialRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "Admin素材替换修改")
    @RequestMapping(value = "/api/updateAdminSspMaterial", method = RequestMethod.POST)
    public ResponseResult updateAdminSspMaterial(@RequestBody AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) throws Exception {
        Integer result =adminSspMaterialService.updateAdminSspMaterial(adminSspMaterialRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "Admin素材替换修改状态")
    @RequestMapping(value = "/api/updateMaterialStatus", method = RequestMethod.POST)
    public ResponseResult updateMaterialStatus(@RequestBody AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) throws Exception {
        Integer result =adminSspMaterialService.updateMaterialStatus(adminSspMaterialRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "Admin素材替换详情")
    @RequestMapping(value = "/api/adminSspMaterialById", method = RequestMethod.POST)
    public ResponseResult adminSspMaterialById(@RequestBody AdminSspMaterialRequestDTO adminSspMaterialRequestDTO) throws Exception {
        AdminSspMaterialResponseDTO adminSspMaterialResponseDTO =adminSspMaterialService.adminSspMaterialById(adminSspMaterialRequestDTO);
        return new ResponseResult(adminSspMaterialResponseDTO);
    }
}
