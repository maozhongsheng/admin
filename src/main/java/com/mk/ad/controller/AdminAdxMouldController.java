package com.mk.ad.controller;


import com.mk.ad.service.AdminAdxMouldService;
import com.mk.ad.service.AdminAdxAccountService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.ResponseStatus;
import com.mk.ad.vo.AdminAdxMould;
import com.mk.ad.vo.Request.AdminAdxMouldRequestDTO;
import com.mk.ad.vo.Request.AdminAdxTemplateRequestDTO;
import com.mk.ad.vo.Response.AdminAdxMouldResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2021/3/8 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminAdxMouldController {

    @Autowired
    public AdminAdxAccountService adminAdxAccountService;

    @Autowired
    private AdminAdxMouldService adminAdxMouldService;



    @ApiOperation(value = "adminAdx创意模板页面查询")
    @RequestMapping(value = "/api/adminAdxMouldList", method = RequestMethod.POST)
    public ResponseResult getAdxMouldList(@RequestBody AdminAdxMouldRequestDTO adminAdxMouldRequestDTO) throws Exception {
        LarkPageInfoVo<AdminAdxMouldResponseDTO> list = adminAdxMouldService.getAdxMouldList(adminAdxMouldRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "ADX下拉框查询")
    @RequestMapping(value = "/api/adxMouldList", method = RequestMethod.POST)
    public ResponseResult getAdxList() throws Exception {
        List<Map> list = adminAdxMouldService.getAdxMouldListA();
        return new ResponseResult(list);
    }

    @ApiOperation(value = "广告位下拉框查询")
    @RequestMapping(value = "/api/adxMouldSlotList", method = RequestMethod.POST)
    public ResponseResult getAdxSlotList() throws Exception {
        List<Map> list = adminAdxMouldService.getAdxSlotList();
        return new ResponseResult(list);
    }

    @ApiOperation(value = "ADX创意模板列表修改启用状态")
    @RequestMapping(value = "/api/adxStatus", method = RequestMethod.POST)
    public ResponseResult updateMouldStatus(@RequestBody AdminAdxMouldRequestDTO adminAdxMouldRequestDTO) throws Exception {
        Map params = new HashMap();
        String id = adminAdxMouldRequestDTO.getId();
        String status = adminAdxMouldRequestDTO.getStatus().toString();
        params.put("id",id);
        params.put("status",status);
        Integer result =adminAdxMouldService.updateStatus(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "ADX创意模板列表根据id删除")
    @RequestMapping(value = "/api/adxDeleteStatus", method = RequestMethod.POST)
    public ResponseResult updateDeleteStatus(@RequestBody AdminAdxMouldRequestDTO adminAdxMouldRequestDTO) throws Exception {
        Map params = new HashMap();
        String id = adminAdxMouldRequestDTO.getId();
        String status = adminAdxMouldRequestDTO.getDelete_status().toString();
        params.put("id",id);
        params.put("status",status);
        Integer result =adminAdxMouldService.updateDeleteStatus(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "ADX创意模板根据id删除素材")
    @RequestMapping(value = "/api/adxTemplateDeleteStatus", method = RequestMethod.POST)
    public ResponseResult updateTemplateDeleteStatus(@RequestBody AdminAdxTemplateRequestDTO adminAdxTemplateRequestDTO) throws Exception {
        Map params = new HashMap();
        String id = adminAdxTemplateRequestDTO.getId().toString();
        String status = adminAdxTemplateRequestDTO.getDelete_status().toString();
        params.put("id",id);
        params.put("status",status);
        Integer result =adminAdxMouldService.updateTemplateDeleteStatus(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "adminAdx创意模板id查询")
    @RequestMapping(value = "/api/adminAdxMould/{id}", method = RequestMethod.POST)
    public ResponseResult getAdxMouldInfo(@PathVariable("id") String id) throws Exception {
        Map params = new HashMap();
        params.put("id",id);
        Map AdxMould = adminAdxMouldService.getAdxMouldInfo(params);
        return new ResponseResult(AdxMould);
    }


    @ApiOperation(value = "adminAdx创意模板添加")
    @RequestMapping(value = "/api/adminAdxMouldAdd", method = RequestMethod.POST)
    public ResponseResult insertAdxMould(@RequestBody AdminAdxMould adminAdxMould) throws Exception {
        Integer result =adminAdxMouldService.insertAdxMould(adminAdxMould);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "adminAdx创意模板修改")
    @RequestMapping(value = "/api/adminAdxMouldEdit", method = RequestMethod.POST)
    public ResponseResult UpdateAdxMould(@RequestBody AdminAdxMould adminAdxMould) throws Exception {
        Integer result =adminAdxMouldService.UpdateAdxMould(adminAdxMould);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }



}