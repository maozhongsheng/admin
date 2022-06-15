package com.mk.ad.controller;


import com.mk.ad.service.NotificationCenterService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.NotificationCenterRequestDTO;
import com.mk.ad.vo.Response.NotificationCenterResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class NotificationCenterController {

    @Autowired
    private NotificationCenterService notificationCenterService;


    @ApiOperation(value = "SSP消息发布列表查询")
    @RequestMapping(value = "/api/notificationCenterList", method = RequestMethod.POST)
    public ResponseResult getNotificationCenterList(@RequestBody NotificationCenterRequestDTO notificationCenterRequestDTO) throws Exception {
        LarkPageInfoVo<NotificationCenterResponseDTO> list = notificationCenterService.getNotificationCenterList(notificationCenterRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "SSP消息发布根据id置顶")
    @RequestMapping(value = "/api/topNotificationCenter", method = RequestMethod.POST)
    public ResponseResult topNotificationCenter(@RequestBody NotificationCenterRequestDTO notificationCenterRequestDTO) throws Exception {
        Integer result =notificationCenterService.topNotificationCenter(notificationCenterRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "SSP消息发布根据id删除")
    @RequestMapping(value = "/api/deleteNotificationCenter", method = RequestMethod.POST)
    public ResponseResult deleteNotificationCenter(@RequestBody NotificationCenterRequestDTO notificationCenterRequestDTO) throws Exception {
        Integer result =notificationCenterService.deleteNotificationCenter(notificationCenterRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "SSP消息发布发布消息")
    @RequestMapping(value = "/api/addNotificationCenter", method = RequestMethod.POST)
    public ResponseResult addNotificationCenter(@RequestBody NotificationCenterRequestDTO notificationCenterRequestDTO) throws Exception {
        Integer result =notificationCenterService.addNotificationCenter(notificationCenterRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
}