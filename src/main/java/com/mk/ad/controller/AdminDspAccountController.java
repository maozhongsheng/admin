package com.mk.ad.controller;


import com.mk.ad.service.AdminDspAccountService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminDspAccountRequestDTO;
import com.mk.ad.vo.Response.AdminDspAccountResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author gj
 * @version 1.0
 * @date 2021/4/1 14:41
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminDspAccountController {

    @Autowired
    public AdminDspAccountService adminDspAccountService;

    @ApiOperation(value = "adminDSP页面查询")
    @RequestMapping(value = "/api/adminDspList", method = RequestMethod.POST)
    public ResponseResult getDspList(@RequestBody AdminDspAccountRequestDTO adminDspAccountRequestDTO) throws Exception {
        LarkPageInfoVo<AdminDspAccountResponseDTO> list = adminDspAccountService.getDspList(adminDspAccountRequestDTO);
        return new ResponseResult(list);
    }


    @ApiOperation(value = "adminSSP页面查询详情")
    @RequestMapping(value = "/api/adminDspId/{id}", method = RequestMethod.POST)
    public ResponseResult getDspInfo(@PathVariable("id") Long id) throws Exception {
        AdminDspAccountResponseDTO adminDspAccountResponseDTO = adminDspAccountService.getDspInfo(id);
        return new ResponseResult(adminDspAccountResponseDTO);
    }


    @ApiOperation(value = "AdminSspAccount添加")
    @RequestMapping(value = "/api/adminDspAdd", method = RequestMethod.POST)
    public ResponseResult insertDsp(@RequestBody AdminDspAccountRequestDTO adminDsp) throws Exception {
        Integer result = adminDspAccountService.insertDsp(adminDsp);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "AdminSspAccount修改")
    @RequestMapping(value = "/api/adminDspEdit", method = RequestMethod.POST)
    public ResponseResult updateDsp(@RequestBody AdminDspAccountRequestDTO adminDspAccount) throws Exception {
        Integer result =adminDspAccountService.updateDsp(adminDspAccount);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminDSP修改状态")
    @RequestMapping(value = "/api/updateDspStatus", method = RequestMethod.POST)
    public ResponseResult updateDspStatus(@RequestBody AdminDspAccountRequestDTO adminDspAccount) throws Exception {
        Map params = new HashMap();
        String id = adminDspAccount.getId().toString();
        String status = adminDspAccount.getStatus().toString();
        params.put("id",id);
        params.put("status",status);
        Integer result =adminDspAccountService.UpdateDspStatus(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminDSP修改账户信息")
    @RequestMapping(value = "/api/updateDspAccount", method = RequestMethod.POST)
    public ResponseResult updateDspAccount(@RequestBody AdminDspAccountRequestDTO adminDspAccount) throws Exception {
        Integer result =adminDspAccountService.updateDspAccount(adminDspAccount);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
}
