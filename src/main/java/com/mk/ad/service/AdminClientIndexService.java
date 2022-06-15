package com.mk.ad.service;


import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.Response.RedisDTO;

import java.util.List;
import java.util.Map;

public interface AdminClientIndexService {

    String adminSelectMediaName(AdminClientIndexDTO adminClientIndexDTO);

    String adminSelectSlotName(AdminClientIndexDTO adminClientIndexDTO);

    String adminSelectSspCompanyName(AdminClientIndexDTO adminClientIndexDTO);

    String adminSelectSlotTypeName(AdminClientIndexDTO adminClientIndexDTO);

    Map selectRequetBySlotId(String slot_id);

    Map selectUpperBySlotId(String slot_id);

    String adminSelectUnionName(AdminClientIndexDTO adminClientIndexDTO);

    List<String> adminSelectUnionMediaName(AdminClientIndexDTO adminClientIndexDTO);

    List<String> adminSelectUnionSlotName(AdminClientIndexDTO adminClientIndexDTO);


    List<RedisDTO> sspSelectAll();
}
