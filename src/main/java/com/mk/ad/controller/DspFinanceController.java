package com.mk.ad.controller;


import com.mk.ad.client.UserClient;
import com.mk.ad.service.DspFinanceService;
import com.mk.ad.utils.Constant;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminDspFinanceRequestDTO;
import com.mk.ad.vo.Response.AdminDspFinanceResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2021/6/2 14:34
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class DspFinanceController {

    @Autowired
    private DspFinanceService dspFinanceService;

    @Autowired
    private UserClient userClient;

    @ApiOperation(value = "adminDSP财务总览")
    @RequestMapping(value = "/api/adminDspFinanceList", method = RequestMethod.POST)
    public ResponseResult getDspFinanceList(@RequestBody AdminDspFinanceRequestDTO adminDspFinanceRequestDTO) throws Exception {
        LarkPageInfoVo<AdminDspFinanceResponseDTO> list = dspFinanceService.getDspFinanceList(adminDspFinanceRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "adminDSP划账")
    @RequestMapping(value = "/api/updateFinance", method = RequestMethod.POST)
    public ResponseResult DspupdateFinance(@RequestBody AdminDspFinanceRequestDTO adminDspFinanceRequestDTO, HttpServletRequest request) throws Exception {
        String accessToken=request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(accessToken);
        Integer result   = dspFinanceService.DspupdateFinance(adminDspFinanceRequestDTO,userId);

        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "adminDSP财务总览")
    @RequestMapping(value = "/api/adminDspFinanceLogList", method = RequestMethod.POST)
    public ResponseResult getDspFinanceLogList(@RequestBody AdminDspFinanceRequestDTO adminDspFinanceRequestDTO) throws Exception {
        LarkPageInfoVo<AdminDspFinanceResponseDTO> list = dspFinanceService.getDspFinanceLogList(adminDspFinanceRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "adminDSP银行账户")
    @RequestMapping(value = "/api/DspBankAccountList", method = RequestMethod.POST)
    public ResponseResult getBankAccountList(@RequestBody AdminDspFinanceRequestDTO adminDspFinanceRequestDTO) throws Exception {
        LarkPageInfoVo<AdminDspFinanceResponseDTO> list   = dspFinanceService.getBankAccountList(adminDspFinanceRequestDTO);
        return new ResponseResult(list);
    }

}