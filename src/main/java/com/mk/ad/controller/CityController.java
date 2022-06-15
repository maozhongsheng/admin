package com.mk.ad.controller;


import com.mk.ad.service.CityService;
import com.mk.ad.vo.Request.CityRequestDTO;
import com.mk.ad.vo.Response.ResponseResult;
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
public class CityController {

    @Autowired
    private CityService cityService;

    @ApiOperation(value = "三级联动")
    @RequestMapping(value = "/api/cityList", method = RequestMethod.POST)
    public ResponseResult selectCityList(@RequestBody CityRequestDTO cityRequestDTO) throws Exception {
        Map params = new HashMap();
        Long id = cityRequestDTO.getId();
        Integer pid = cityRequestDTO.getPid();
        Integer type = cityRequestDTO.getType();
        params.put("id",id);
        params.put("pid",pid);
        params.put("type",type);
        Map cityList =cityService.selectCity(params);

        return new ResponseResult(cityList);
    }

}
