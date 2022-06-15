package com.mk.ad.controller;


import com.mk.ad.service.SspFluxDispenseService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Request.SspFluxDispenseRequestDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.vo.Response.SspFluxDispenseResponseDTO;
import com.mk.ad.vo.Response.SspFluxFlowResponseDTO;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * ssp流量分发
 *
 * @author yjn
 * @version 1.0
 * @date 2021/3/8 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class SspFluxDispenseController {

    @Autowired
    public SspFluxDispenseService sspFluxDispenseService;

    @ApiOperation(value = "ssp流量分发页面查询")
    @RequestMapping(value = "/api/sspFluxDispenseList", method = RequestMethod.POST)
    public ResponseResult getSlotList(@RequestBody SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) throws Exception {
        LarkPageInfoVo<SspFluxDispenseResponseDTO> list = sspFluxDispenseService.getSspFluxDispenseList(sspFluxDispenseRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "ssp广告位配置修改")
    @RequestMapping(value = "/api/sspSlotFluxEdit", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ResponseResult updateSlotFlux(@RequestBody SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) throws Exception {
        Integer result =sspFluxDispenseService.updateSlotFlux(sspFluxDispenseRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "ssp流量分发根据id查询")
    @RequestMapping(value = "/api/sspFluxDispenseById/{id}", method = RequestMethod.POST)
    public ResponseResult selectById(@PathVariable("id") Long id) throws Exception {
        SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO = sspFluxDispenseService.selectById(id);
        return new ResponseResult(sspFluxDispenseRequestDTO);
    }

    @ApiOperation(value = "ssp查询媒体下拉框")
    @RequestMapping(value = "/api/sspFluxList", method = RequestMethod.POST)
    public ResponseResult sspFluxList() throws Exception {
        List<Map> list = sspFluxDispenseService.selectAll();
        return new ResponseResult(list);
    }
    @ApiOperation(value = "ssp查询广告位下拉框")
    @RequestMapping(value = "/api/sspAdvertisementList", method = RequestMethod.POST)
    public ResponseResult sspAdvertisementList(@RequestBody SspAdSlotRequestDTO sspAdSlotRequestDTO) throws Exception {
        List<Map> list = sspFluxDispenseService.selectAdvertisement(sspAdSlotRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "adminSSP定向流量配置")
    @RequestMapping(value = "/api/adminSspFlowList", method = RequestMethod.POST)
    public ResponseResult getSspFlowList(@RequestBody SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) throws Exception {
        LarkPageInfoVo<SspFluxFlowResponseDTO> list = sspFluxDispenseService.getSspFlowList(sspFluxDispenseRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "ssp广告位正式开启修改")
    @RequestMapping(value = "/api/sspSlotFormalEdit", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ResponseResult updateSlotFormal(@RequestBody SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) throws Exception {
        Integer result =sspFluxDispenseService.updateSlotFormal(sspFluxDispenseRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "ssp广告位定向配置修改")
    @RequestMapping(value = "/api/sspSlotDirectionalEdit", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ResponseResult updateSlotDirectional(@RequestBody SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) throws Exception {
        Integer result =sspFluxDispenseService.updateSlotDirectional(sspFluxDispenseRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "ssp广告位配置修改")
    @RequestMapping(value = "/api/sspAllianceSlotFluxEdit", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ResponseResult updateAllianceSlotFlux(@RequestBody SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) throws Exception {
        Integer result =sspFluxDispenseService.updateAllianceSlotFlux(sspFluxDispenseRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "ssp流量分发根据id查询")
    @RequestMapping(value = "/api/sspAllianceSlotFluxById/{id}", method = RequestMethod.POST)
    public ResponseResult selectAllianceSlotFluxById(@PathVariable("id") Integer id) throws Exception {
        SspFluxDispenseResponseDTO sspFluxDispenseRequestDTO = sspFluxDispenseService.selectAllianceSlotFlux(id);
        return new ResponseResult(sspFluxDispenseRequestDTO);
    }

}
