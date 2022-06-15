package com.mk.ad.service.impl;


import com.mk.ad.mapper.CityMapper;
import com.mk.ad.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2021/3/22 13:22
 */
@Slf4j
@Service
@Repository
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;


    @Override
    public Map selectCity(Map params) {
        Map result = new HashMap();
        List<Map> province = cityMapper.queryProvince(params);
        List<Map> city =   cityMapper.queryCity(params);
        List<Map> area =  cityMapper.queryArea(params);
        result.put("province",province);
        result.put("city",city);
        result.put("area",area);


        return result;
    }
}
