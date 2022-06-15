package com.mk.ad.controller;


import com.mk.ad.service.SspAdSlotService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.vo.Response.SspAdSlotResponseDTO;
import com.mk.ad.service.SspMediaService;
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
 * @date 2021/3/22 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class SspAdSlotController {

    @Autowired
    private SspMediaService sspMediaService;

    @Autowired
    private SspAdSlotService sspAdSlotService;

    @ApiOperation(value = "SSP广告位审核")
    @RequestMapping(value = "/api/adminSlotStatus", method = RequestMethod.POST)
    public ResponseResult updateSlotStatus(@RequestBody SspAdSlotRequestDTO sspAdSlotRequestDTO) throws Exception {
        Integer result =sspAdSlotService.updateSlotStatus(sspAdSlotRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "SSP广告位审核列表")
    @RequestMapping(value = "/api/sspSlotList", method = RequestMethod.POST)
    public ResponseResult selectSlotList(@RequestBody SspAdSlotRequestDTO sspAdSlotRequestDTO) throws Exception {
        LarkPageInfoVo<SspAdSlotResponseDTO> slotList = sspAdSlotService.getSlotList(sspAdSlotRequestDTO);
        return new ResponseResult(slotList);
    }
}
