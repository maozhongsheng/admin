package com.mk.ad.controller;

import com.mk.ad.service.AdminAdxAccountService;
import com.mk.ad.service.DataAllService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminAdxAccountRequestDTO;
import com.mk.ad.vo.Request.DataAllRequestDTO;
import com.mk.ad.vo.Response.AdminAdxAccountResponseDTO;
import com.mk.ad.vo.Response.DataAllResponseDTO;
import com.mk.ad.vo.Response.MkDownLoadResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2022/06/20 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class DataAllController {
    @Autowired
    public DataAllService dataAllService;

    @ApiOperation(value = "admin广告数据查询")
    @RequestMapping(value = "/api/selectDataAll", method = RequestMethod.POST)
    public ResponseResult getAdxList(@RequestBody DataAllRequestDTO request) throws Exception {
        DataAllResponseDTO result = dataAllService.selectDataAll(request);
        return new ResponseResult(result);
    }
    @ApiOperation(value = "广告数据报表查询")
    @RequestMapping(value = "/api/selectReportDataAll", method = RequestMethod.POST)
    public ResponseResult selectReportDataAll(@RequestBody DataAllRequestDTO request) throws Exception {
        LarkPageInfoVo<MkDownLoadResponseDTO> list = dataAllService.selectReportDataAll(request);
        return new ResponseResult(list);
    }

}
