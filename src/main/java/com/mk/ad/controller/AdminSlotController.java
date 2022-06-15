package com.mk.ad.controller;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminSlot;
import com.mk.ad.vo.Request.AdminSlotRequestDTO;
import com.mk.ad.vo.Response.AdminSlotResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.service.AdminSlotService;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
public class AdminSlotController {

    @Autowired
    public AdminSlotService adminSlotService;


    @ApiOperation(value = "admin广告位页面查询")
    @RequestMapping(value = "/api/adminSlotList", method = RequestMethod.POST)
    public ResponseResult getSlotList(@RequestBody AdminSlotRequestDTO adminSlotRequestDTO) throws Exception {
        LarkPageInfoVo<AdminSlotResponseDTO> list = adminSlotService.getSlotList(adminSlotRequestDTO);
        return new ResponseResult(list);
    }


    @ApiOperation(value = "adminSSP页面查询详情")
    @RequestMapping(value = "/api/adminSlotId/{id}", method = RequestMethod.POST)
    public ResponseResult getSlotInfo(@PathVariable("id") Long id) throws Exception {
        AdminSlotRequestDTO adminSlotRequestDTO = adminSlotService.getSlotInfo(id);
        return new ResponseResult(adminSlotRequestDTO);
    }


    @ApiOperation(value = "admin广告位添加")
    @RequestMapping(value = "/api/adminSlotAdd", method = RequestMethod.POST)
    public ResponseResult insertSlot(@RequestBody AdminSlot adminSlot) throws Exception {
        Integer result = adminSlotService.insertSlot(adminSlot);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "admin广告位修改")
    @RequestMapping(value = "/api/adminSlotEdit", method = RequestMethod.POST)
    public ResponseResult UpdateSlot(@RequestBody AdminSlot adminSlot) throws Exception {
        Integer result =adminSlotService.UpdateSlot(adminSlot);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "admin广告位删除")
    @RequestMapping(value = "/api/adminSlotRemove/{id}", method = RequestMethod.POST)
    public ResponseResult removeSlot(@PathVariable("id") String id) throws Exception {
        String[] gpIds = id.split(",");
        List<Long> list = new ArrayList<>();
        for(String str : gpIds){
            list.add(Long.parseLong(str));
        }
        return new ResponseResult(adminSlotService.removeSlot(list));
    }


    @ApiOperation(value = "admin广告位修改状态")
    @RequestMapping(value = "/api/upAdminSlotStatus", method = RequestMethod.POST)
    public ResponseResult upDataSlotStatus(@RequestBody AdminSlotRequestDTO adminSlotRequestDTO) throws Exception {
        Integer result =adminSlotService.upDataSlotStatus(adminSlotRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "广告位查询创意模板")
    @RequestMapping(value = "/api/adminSlotCreativeTemplate", method = RequestMethod.POST)
    public ResponseResult adminSlotCreativeTemplate(@RequestBody AdminSlot adminSlot) throws Exception {

       List<Map> mapList = adminSlotService.adminSlotCreativeTemplate(adminSlot.getIds());
        return new ResponseResult(mapList);
    }

}
