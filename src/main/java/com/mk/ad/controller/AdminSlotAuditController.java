package com.mk.ad.controller;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminSlotAuditRequestDTO;
import com.mk.ad.vo.Response.AdminSlotAuditResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.service.AdminSlotAuditService;
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
 * @date 2021/3/22 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminSlotAuditController {

    @Autowired
    public AdminSlotAuditService adminSlotAuditService;

    @ApiOperation(value = "SSP广告位")
    @RequestMapping(value = "/api/adminSlotAuditList", method = RequestMethod.POST)
    public ResponseResult getSlotList(@RequestBody AdminSlotAuditRequestDTO adminSlotAuditRequestDTO) throws Exception {
        LarkPageInfoVo<AdminSlotAuditResponseDTO> list = adminSlotAuditService.getSlotList(adminSlotAuditRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "SSP广告位审核")
    @RequestMapping(value = "/api/adminSlotAuditExaminer", method = RequestMethod.POST)
    public ResponseResult updateSlotAuditStatus(@RequestBody AdminSlotAuditRequestDTO adminSlotAuditRequestDTO) throws Exception {
        Map params = new HashMap();
        String id = adminSlotAuditRequestDTO.getId().toString();
        String status = adminSlotAuditRequestDTO.getStatus().toString();
        params.put("id",id);
        params.put("status",status);
        Integer result =adminSlotAuditService.updateSlotAuditStatus(params);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
}
