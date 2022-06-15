package com.mk.ad.controller;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdx;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.service.AdminAdxService;
import com.mk.ad.utils.ResponseStatus;
import com.mk.ad.vo.Request.AdminAdxRequestDTO;
import com.mk.ad.vo.Response.Adx.AdminAdxETwoResponseDTO;
import com.mk.ad.vo.Response.AdminAdxResponseDTO;
import com.mk.ad.vo.Response.Adx.AdminAdxETwoSlotResponseDTO;
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
 * @date 2021/3/8 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminAdxController {

    @Autowired
    public AdminAdxService adminAdxService;


    @ApiOperation(value = "ADX页面查询")
    @RequestMapping(value = "/api/adxList", method = RequestMethod.POST)
    public ResponseResult getAdxList(@RequestBody AdminAdxRequestDTO adminAdxRequestDTO) throws Exception {
        LarkPageInfoVo<AdminAdxResponseDTO> list = adminAdxService.getAdxList(adminAdxRequestDTO);
        return new ResponseResult(list);
    }


    @ApiOperation(value = "ADX页面id查询")
    @RequestMapping(value = "/api/adxGetId/{id}", method = RequestMethod.POST)
    public ResponseResult getAdxId(@PathVariable("id") Long id) throws Exception {
        AdminAdxResponseDTO adminAdxResponseDTO = adminAdxService.getAdxId(id);
        return new ResponseResult(adminAdxResponseDTO);
    }


    @ApiOperation(value = "ADX添加")
    @RequestMapping(value = "/api/adxAdd", method = RequestMethod.POST)
        public ResponseResult insertAdx(@RequestBody AdminAdx adminAdx) throws Exception {
        Integer result =adminAdxService.insertAdx(adminAdx);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "ADX修改")
    @RequestMapping(value = "/api/adxEdit", method = RequestMethod.POST)
    public ResponseResult UpdateAdx(@RequestBody AdminAdx adminAdx) throws Exception {
        Integer result = adminAdxService.UpdateAdx(adminAdx);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "ADX修改状态")
    @RequestMapping(value = "/api/upADXStatus/{id}/{status}", method = RequestMethod.POST)
    public ResponseResult upADXStatus(@PathVariable("id") Long id ,@PathVariable("status") Integer status) throws Exception {
        Integer result =adminAdxService.upADXStatus(id,status);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminADX财务信息")
    @RequestMapping(value = "/api/adminAdxMoneyList", method = RequestMethod.POST)
    public ResponseResult getAdxMoneyList(@RequestBody AdminAdxRequestDTO adminAdxRequestDTO) throws Exception {
        LarkPageInfoVo<AdminAdxResponseDTO> list = adminAdxService.getSspMoneyList(adminAdxRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "adminADX财务信息修改")
    @RequestMapping(value = "/api/adminAdxMoneyUpdate", method = RequestMethod.POST)
    public ResponseResult updateAdxMoney(@RequestBody AdminAdxRequestDTO adminAdxRequestDTO) throws Exception {
        Map params = new HashMap();
        String id = adminAdxRequestDTO.getId().toString();
        String payee = adminAdxRequestDTO.getPayee();
        String bankDeposit = adminAdxRequestDTO.getBankDeposit();
        String bankAccount = adminAdxRequestDTO.getBankAccount();
        params.put("id",id);
        params.put("payee",payee);
        params.put("bankDeposit",bankDeposit);
        params.put("bankAccount",bankAccount);
        Integer result =adminAdxService.updateAdxMoney(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "admin查询ADX2345广告位列表")
    @RequestMapping(value = "/api/adminAdxETwoSlotList", method = RequestMethod.POST)
    public ResponseResult getAdxETwoSlotList(@RequestBody AdminAdxRequestDTO adminAdxRequestDTO) throws Exception {
        LarkPageInfoVo<AdminAdxETwoResponseDTO> list = adminAdxService.getAdxETwoSlotList(adminAdxRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "adminADX234根据广告位id查询详情并插入表中")
    @RequestMapping(value = "/api/adminAdxETwoSlot", method = RequestMethod.POST)
    public ResponseResult getAdxETwoSlot(@RequestBody AdminAdxRequestDTO adminAdxRequestDTO) throws Exception {
        Integer result = adminAdxService.getAdxETwoSlot(adminAdxRequestDTO);
        if(1001 == result){
            return new ResponseResult(ResponseStatus.SLOT_ID_CHECK_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "adminADX234根据广告位id查询详情")
    @RequestMapping(value = "/api/adminAdxETwoSlotById", method = RequestMethod.POST)
    public ResponseResult getAdxETwoSlotById(@RequestBody AdminAdxRequestDTO adminAdxRequestDTO) throws Exception {
        AdminAdxETwoSlotResponseDTO result = adminAdxService.getAdxETwoSlotById(adminAdxRequestDTO);
        return new ResponseResult(result);
    }

}
