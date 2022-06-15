package com.mk.ad.controller;


import com.mk.ad.service.AdminClientIndexService;
import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.Response.RedisDTO;
import com.mk.ad.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminClientIndexController {

    @Autowired
    public AdminClientIndexService adminClientIndexService;

    @ApiOperation(value = "ADMIN根据媒体id查询媒体名称")
    @RequestMapping(value = "/api/adminSelectMediaName", method = RequestMethod.POST)
    public String adminSelectMediaName(@RequestBody AdminClientIndexDTO adminClientIndexDTO) throws Exception {
        String adminSelectMediaName = adminClientIndexService.adminSelectMediaName(adminClientIndexDTO);
        return  adminSelectMediaName;
    }

    @ApiOperation(value = "ADMIN根据广告位id查询广告位名称")
    @RequestMapping(value = "/api/adminSelectSlotName", method = RequestMethod.POST)
    public String adminSelectSlotName(@RequestBody AdminClientIndexDTO adminClientIndexDTO) throws Exception {
        String adminSelectSlotName = adminClientIndexService.adminSelectSlotName(adminClientIndexDTO);
        return  adminSelectSlotName;
    }

    @ApiOperation(value = "ADMIN根据ssp_id查询公司名称")
    @RequestMapping(value = "/api/adminSelectSspCompanyName", method = RequestMethod.POST)
    public String adminSelectSspCompanyName(@RequestBody AdminClientIndexDTO adminClientIndexDTO) throws Exception {
        String adminSelectSspCompanyName = adminClientIndexService.adminSelectSspCompanyName(adminClientIndexDTO);
        return  adminSelectSspCompanyName;
    }

    @ApiOperation(value = "ADMIN根据广告位类型查询类型名称")
    @RequestMapping(value = "/api/adminSelectSlotTypeName", method = RequestMethod.POST)
    public String adminSelectSlotTypeName(@RequestBody AdminClientIndexDTO adminClientIndexDTO) throws Exception {
        String adminSelectSlotTypeName = adminClientIndexService.adminSelectSlotTypeName(adminClientIndexDTO);
        return  adminSelectSlotTypeName;
    }

    @ApiOperation(value = "ADMIN根据dsp_id查询联盟名称")
    @RequestMapping(value = "/api/adminSelectUnionName", method = RequestMethod.POST)
    public String adminSelectUnionName(@RequestBody AdminClientIndexDTO adminClientIndexDTO) throws Exception {
        String adminSelectUnionName = adminClientIndexService.adminSelectUnionName(adminClientIndexDTO);
        return  adminSelectUnionName;
    }

    @ApiOperation(value = "ADMIN根据ad_id查询联盟媒体名称")
    @RequestMapping(value = "/api/adminSelectUnionMediaName", method = RequestMethod.POST)
    public List<String> adminSelectUnionMediaName(@RequestBody AdminClientIndexDTO adminClientIndexDTO) throws Exception {
        List<String> adminSelectUnionMediaName = adminClientIndexService.adminSelectUnionMediaName(adminClientIndexDTO);
        return  adminSelectUnionMediaName;
    }

    @ApiOperation(value = "ADMIN根据dsp_slot查询联盟广告名称")
    @RequestMapping(value = "/api/adminSelectUnionSlotName", method = RequestMethod.POST)
    public List<String> adminSelectUnionSlotName(@RequestBody AdminClientIndexDTO adminClientIndexDTO) throws Exception {
        List<String> adminSelectUnionSlotName = adminClientIndexService.adminSelectUnionSlotName(adminClientIndexDTO);
        return  adminSelectUnionSlotName;
    }

    @ApiOperation(value = "admin根据广告位id查找分配比例以及广告联盟广告位")
    @RequestMapping(value = "/api/selectRequetBySlotId", method = RequestMethod.POST)
    public Map selectRequetBySlotId(@RequestBody String slot_id) throws Exception {
        Map result = adminClientIndexService.selectRequetBySlotId(slot_id);
        return  result;
    }
    @ApiOperation(value = "admin根据广告联盟广告位查询所有数据")
    @RequestMapping(value = "/api/selectUpperBySlotId", method = RequestMethod.POST)
    public Map selectUpperBySlotId(@RequestBody String slot_id) throws Exception {
        Map result = adminClientIndexService.selectUpperBySlotId(slot_id);
        return  result;
    }

    @ApiOperation(value = "导入SSP名称和id数据进入redis")
    @RequestMapping(value = "/api/sspAlltoRedis", method = RequestMethod.POST)
    public ResponseResult sspAlltoRedis() throws Exception {
        List<RedisDTO> redisDTO = adminClientIndexService.sspSelectAll();
        return new ResponseResult(redisDTO);
    }

}
