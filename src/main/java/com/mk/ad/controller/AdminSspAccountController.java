package com.mk.ad.controller;


import com.mk.ad.service.AdminSspAccountService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminIndexSlotRequestDTO;
import com.mk.ad.vo.Request.AdminSspAccountRequestDTO;
import com.mk.ad.vo.Request.AdminSspUserRequestDTO;
import com.mk.ad.vo.Response.AdminSspAccountResponseDTO;
import com.mk.ad.vo.Response.AdminSspFinancialResponseDTO;
import com.mk.ad.vo.Response.AdminSspUserResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.utils.ResponseStatus;

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
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminSspAccountController {

    @Autowired
    public AdminSspAccountService adminSspService;


    @ApiOperation(value = "adminSSP页面查询")
    @RequestMapping(value = "/api/adminSspList", method = RequestMethod.POST)
    public ResponseResult getSspList(@RequestBody AdminSspAccountRequestDTO adminSspRequestDTO) throws Exception {
        LarkPageInfoVo<AdminSspAccountResponseDTO> list = adminSspService.getSspList(adminSspRequestDTO);
        return new ResponseResult(list);
    }


    @ApiOperation(value = "adminSSP页面查询详情")
    @RequestMapping(value = "/api/adminSspId/{id}", method = RequestMethod.POST)
    public ResponseResult getSspInfo(@PathVariable("id") Long id) throws Exception {
        AdminSspAccountResponseDTO adminSspAccountResponseDTO = adminSspService.getSspInfo(id);
        return new ResponseResult(adminSspAccountResponseDTO);
    }

    @ApiOperation(value = "adminSSP财务数据返回")
    @RequestMapping(value = "/api/selectFinancial/{user_id}", method = RequestMethod.POST)
    public ResponseResult selectFinancial(@PathVariable("user_id") String user_id) throws Exception {
        AdminSspFinancialResponseDTO adminSspFinancialResponseDTO = adminSspService.selectFinancial(user_id);
        return new ResponseResult(adminSspFinancialResponseDTO);
    }


    @ApiOperation(value = "AdminSspAccount添加")
    @RequestMapping(value = "/api/adminSspAdd", method = RequestMethod.POST)
    public ResponseResult insertSsp(@RequestBody AdminSspAccountRequestDTO adminSsp) throws Exception {
        Integer result = adminSspService.insertSsp(adminSsp);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        else if(result == 2){
            return new ResponseResult(ResponseStatus.EMAIL_CHECK_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "adminSSP修改")
    @RequestMapping(value = "/api/adminSspEdit", method = RequestMethod.POST)
    public ResponseResult UpdateSsp(@RequestBody AdminSspAccountRequestDTO adminSsp) throws Exception {
        Integer result =adminSspService.UpdateSsp(adminSsp);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "adminSSP账户审核")
    @RequestMapping(value = "/api/adminSspStatus", method = RequestMethod.POST)
    public ResponseResult updateStatus(@RequestBody AdminSspAccountRequestDTO adminSspRequestDTO) throws Exception {

        Integer result =adminSspService.UpdateSspStatus(adminSspRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminSSP账户审核")
    @RequestMapping(value = "/api/adminSspExamine", method = RequestMethod.POST)
    public ResponseResult getSspExamine(@RequestBody AdminSspAccountRequestDTO adminSspRequestDTO) throws Exception {
        LarkPageInfoVo<AdminSspAccountResponseDTO> sspExamine = adminSspService.getSspExamine(adminSspRequestDTO);
        return new ResponseResult(sspExamine);
    }

    @ApiOperation(value = "SSP列表修改状态")
    @RequestMapping(value = "/api/upDataSspStatus/{id}/{status}", method = RequestMethod.POST)
    public ResponseResult upDataSspStatus(@PathVariable("id") Long id ,@PathVariable("status") Integer status) throws Exception {
        Integer result =adminSspService.upDataSspStatus(id,status);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminSSP财务信息")
    @RequestMapping(value = "/api/adminSspMoneyList", method = RequestMethod.POST)
    public ResponseResult getSspMoneyList(@RequestBody AdminSspAccountRequestDTO adminSspRequestDTO) throws Exception {
        LarkPageInfoVo<AdminSspAccountResponseDTO> list = adminSspService.getSspMoneyList(adminSspRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "adminSSP财务信息修改")
    @RequestMapping(value = "/api/adminSspMoneyUpdate", method = RequestMethod.POST)
    public ResponseResult updateSspMoney(@RequestBody AdminSspAccountRequestDTO adminSspRequestDTO) throws Exception {
        Map params = new HashMap();
        String id = adminSspRequestDTO.getId().toString();
        String payee = adminSspRequestDTO.getPayee();
        String bankDeposit = adminSspRequestDTO.getBankDeposit();
        String bankAccount = adminSspRequestDTO.getBankAccount();
        params.put("id",id);
        params.put("payee",payee);
        params.put("bankDeposit",bankDeposit);
        params.put("bankAccount",bankAccount);
        Integer result =adminSspService.updateSspMoney(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "DSP根据条件查询广告位id")
    @RequestMapping(value = "/api/dspIndexSelectSlotId", method = RequestMethod.POST)
    public List<String> dspIndexSelectSlotId(@RequestBody AdminIndexSlotRequestDTO adminIndexSlotRequestDTO) throws Exception {
        List<String> dspIndexSelectSlotId = adminSspService.dspIndexSelectSlotId(adminIndexSlotRequestDTO);
        return  dspIndexSelectSlotId;
    }

    @ApiOperation(value = "ADMIN根据条件查询广告位id")
    @RequestMapping(value = "/api/adminIndexSlotId", method = RequestMethod.POST)
    public List<String> adminIndexSlotId(@RequestBody AdminIndexSlotRequestDTO adminIndexSlotRequestDTO) throws Exception {
        List<String> adminIndexSlotId = adminSspService.adminIndexSlotId(adminIndexSlotRequestDTO);
        return  adminIndexSlotId;
    }


    @ApiOperation(value = "根据公司id查询媒体id和名称")
    @RequestMapping(value = "/api/adminIndexMedia", method = RequestMethod.POST)
    public ResponseResult adminIndexMedia(@RequestBody AdminIndexSlotRequestDTO adminIndexSlotRequestDTO) throws Exception {
        List list = adminSspService.adminIndexMedia(adminIndexSlotRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "adminSSP银行账户修改")
    @RequestMapping(value = "/api/adminSspBankEdit", method = RequestMethod.POST)
    public ResponseResult UpdateAdminSspBankEdit(@RequestBody AdminSspAccountRequestDTO adminSsp) throws Exception {
        Integer result =adminSspService.UpdateAdminSspBankEdit(adminSsp);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminSSP用户管理页面查询")
    @RequestMapping(value = "/api/adminSspUserList", method = RequestMethod.POST)
    public ResponseResult getAdminSspUserList(@RequestBody AdminSspUserRequestDTO adminSspUserRequestDTO) throws Exception {
        LarkPageInfoVo<AdminSspUserResponseDTO> list = adminSspService.getAdminSspUserList(adminSspUserRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "adminSSP用户管理删除")
    @RequestMapping(value = "/api/adminSspUserDelete", method = RequestMethod.POST)
    public ResponseResult UpdateAdminSspUserDelete(@RequestBody AdminSspUserRequestDTO adminUser) throws Exception {
        Integer result =adminSspService.UpdateAdminSspUserDelete(adminUser);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminSSP用户管理修改状态")
    @RequestMapping(value = "/api/adminSspUserEdit", method = RequestMethod.POST)
    public ResponseResult UpdateAdminSspUserEdit(@RequestBody AdminSspUserRequestDTO adminUser) throws Exception {
        Integer result =adminSspService.UpdateAdminSspUserEdit(adminUser);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "AdminSsp用户管理添加")
    @RequestMapping(value = "/api/adminSspUserAdd", method = RequestMethod.POST)
    public ResponseResult insertAdminSspUserAdd(@RequestBody AdminSspUserRequestDTO adminSsp) throws Exception {
        Integer result = adminSspService.insertAdminSspUserAdd(adminSsp);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        else if(result == 2){
            return new ResponseResult(ResponseStatus.EMAIL_CHECK_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminSSP用户管理删除")
    @RequestMapping(value = "/api/adminSspDelete", method = RequestMethod.POST)
    public ResponseResult DeleteSsp(@RequestBody AdminSspUserRequestDTO adminUser) throws Exception {
        Integer result =adminSspService.DeleteSsp(adminUser);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

}
