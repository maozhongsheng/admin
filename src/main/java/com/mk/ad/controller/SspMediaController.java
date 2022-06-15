package com.mk.ad.controller;


import com.mk.ad.service.SspMediaService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.ResponseStatus;
import com.mk.ad.vo.Request.SspMediaRequestDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.vo.Response.SspMediaResponseDTO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
public class SspMediaController {

    @Autowired
    private SspMediaService sspMediaService;

    @ApiOperation(value = "SSP媒体审核")
    @RequestMapping(value = "/api/adminMediaStatus", method = RequestMethod.POST)
    public ResponseResult updateMediaStatus(@RequestBody SspMediaRequestDTO sspMediaRequestDTO) throws Exception {
        Map params = new HashMap();
        String id = sspMediaRequestDTO.getId().toString();
        String status = sspMediaRequestDTO.getMedia_examine_status().toString();
        String refuse = sspMediaRequestDTO.getRefuse();
        String settlement_type = sspMediaRequestDTO.getSettlement_type().toString();
        String divide = sspMediaRequestDTO.getDivide();
        params.put("id",id);
        params.put("status",status);
        params.put("refuse",refuse);
        params.put("settlement_type",settlement_type);
        params.put("divide",divide);
        Integer result =sspMediaService.updateMediaStatus(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "SSP媒体审核列表")
    @RequestMapping(value = "/api/sspMediaList", method = RequestMethod.POST)
    public ResponseResult selectMediaList(@RequestBody SspMediaRequestDTO sspMediaRequestDTO) throws Exception {
        LarkPageInfoVo<SspMediaResponseDTO> mediaList = sspMediaService.getMediaList(sspMediaRequestDTO);
        return new ResponseResult(mediaList);
    }

    @ApiOperation(value = "SSP媒体审核详情")
    @RequestMapping(value = "/api/sspMediaInfoId/{id}", method = RequestMethod.POST)
    public ResponseResult getMediatInfo(@PathVariable("id") Long id) throws Exception {
        SspMediaResponseDTO sspMediaResponseDTO = sspMediaService.getMediatInfo(id);
        return new ResponseResult(sspMediaResponseDTO);
    }

}
