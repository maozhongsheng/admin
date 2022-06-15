package com.mk.ad.controller;


import com.mk.ad.service.BussinessTypeOneService;
import com.mk.ad.vo.Request.BussinessTypeOneRequestDTO;
import com.mk.ad.vo.Response.BussinessTypeOneResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
public class BussinessTypeOneController {

    @Autowired
    public BussinessTypeOneService bussinessTypeOneService;

    @ApiOperation(value = "一级类型")
    @RequestMapping(value = "/api/bussinessOne", method = RequestMethod.POST)
    public ResponseResult getBussinessType(@RequestBody BussinessTypeOneRequestDTO bussinessTypeOneRequestDTO) throws Exception {
        List<BussinessTypeOneResponseDTO> list = bussinessTypeOneService.getBussinessType(bussinessTypeOneRequestDTO);
        return new ResponseResult(list);
    }
}
