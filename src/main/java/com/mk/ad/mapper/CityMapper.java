package com.mk.ad.mapper;

import java.util.List;
import java.util.Map;

public interface CityMapper {

    List<Map> queryProvince(Map params);

    List<Map> queryCity(Map params);

    List<Map> queryArea(Map params);
}