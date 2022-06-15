package com.mk.ad.controller;


import com.mk.ad.service.AdminAdxAccountService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdxAccount;
import com.mk.ad.vo.Request.AdminAdxAccountRequestDTO;
import com.mk.ad.vo.Response.AdminAdxAccountResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminAdxAccountController {

    @Autowired
    public AdminAdxAccountService adminAdxAccountService;


    @ApiOperation(value = "adminAdx账户列表页面查询")
    @RequestMapping(value = "/api/adminAdxAccList", method = RequestMethod.POST)
    public ResponseResult getAdxList(@RequestBody AdminAdxAccountRequestDTO adminAdxAccountRequestDTO) throws Exception {
        LarkPageInfoVo<AdminAdxAccountResponseDTO> list = adminAdxAccountService.getAdxList(adminAdxAccountRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "adminAdx账户列表id查询")
    @RequestMapping(value = "/api/adminAdxAccId/{id}", method = RequestMethod.POST)
    public ResponseResult getAdxInfo(@PathVariable("id") Long id) throws Exception {
        AdminAdxAccountRequestDTO adminAdxAccountRequestDTO = adminAdxAccountService.getAdxInfo(id);
        return new ResponseResult(adminAdxAccountRequestDTO);
    }


    @ApiOperation(value = "adminAdx账户列表添加")
    @RequestMapping(value = "/api/adminAdxAccAdd", method = RequestMethod.POST)
    public ResponseResult insertAdx(@RequestBody AdminAdxAccount adminAdxAccount) throws Exception {
        Integer result =adminAdxAccountService.insertAdx(adminAdxAccount);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "adminAdx账户列表修改")
    @RequestMapping(value = "/api/adminAdxAccEdit", method = RequestMethod.POST)
    public ResponseResult UpdateAdxAcc(@RequestBody AdminAdxAccount adminAdxAccount) throws Exception {
        Integer result =adminAdxAccountService.UpdateAdxAcc(adminAdxAccount);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
}