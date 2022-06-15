package com.mk.ad.controller;


import com.mk.ad.service.BussinessTypeTwoService;
import com.mk.ad.vo.Response.BussinessTypeTwoResponseDTO;
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
public class BussinessTypeTwoController {

    @Autowired
    public BussinessTypeTwoService bussinessTypeTwoService;

    @ApiOperation(value = "媒体字典查询")
    @RequestMapping(value = "/api/bussinessTwo/{typeId}", method = RequestMethod.POST)
    public ResponseResult getBussinessTwoType(@PathVariable("typeId") Integer typeId) throws Exception {
        List<BussinessTypeTwoResponseDTO> list = bussinessTypeTwoService.getBussinessTwoType(typeId);
        return new ResponseResult(list);
    }
}
