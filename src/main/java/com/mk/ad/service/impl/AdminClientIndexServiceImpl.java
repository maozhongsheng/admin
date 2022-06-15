package com.mk.ad.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.mk.ad.mapper.*;
import com.mk.ad.service.AdminClientIndexService;
import com.mk.ad.utils.RedisUtil;
import com.mk.ad.vo.*;
import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.Response.RedisDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Service
@Repository
public class AdminClientIndexServiceImpl implements AdminClientIndexService {

    @Autowired
    SspMediaMapper sspMediaMapper;

    @Autowired
    SspAdSlotMapper sspAdSlotMapper;

    @Autowired
    AdminSspAccountMapper adminSspAccountMapper;

    @Autowired
    DataSlotTypeMapper dataSlotTypeMapper;

    @Autowired
    private UpperReachesMapper upperReachesMapper;

    @Autowired
    private AdvertisingAllianceMapper advertisingAllianceMapper;

    @Resource
    private RedisUtil redisUtil;


    @Override
    public String adminSelectMediaName(AdminClientIndexDTO adminClientIndexDTO) {
        String adminSelectMediaName = sspMediaMapper.adminSelectMediaName(adminClientIndexDTO);
        return adminSelectMediaName;
    }

    @Override
    public String adminSelectSlotName(AdminClientIndexDTO adminClientIndexDTO) {
        String adminSelectSlotName = sspAdSlotMapper.adminSelectSlotName(adminClientIndexDTO);
        return adminSelectSlotName;
    }

    @Override
    public String adminSelectSspCompanyName(AdminClientIndexDTO adminClientIndexDTO) {
        String adminSelectSspCompanyName = adminSspAccountMapper.adminSelectSspCompanyName(adminClientIndexDTO);
        return adminSelectSspCompanyName;
    }

    @Override
    public String adminSelectSlotTypeName(AdminClientIndexDTO adminClientIndexDTO) {
        String adminSelectSlotTypeName = dataSlotTypeMapper.adminSelectSlotTypeName(adminClientIndexDTO);
        return adminSelectSlotTypeName;
    }

    @Override
    public Map selectRequetBySlotId(String slot_id) {
        Map requet = sspAdSlotMapper.selectRequetBySlotId(slot_id);
        return requet;
    }

    @Override
    public Map selectUpperBySlotId(String slot_id) {
        Map upper = sspAdSlotMapper.selectUpperBySlotId(slot_id);
        return upper;
    }

    @Override
    public String adminSelectUnionName(AdminClientIndexDTO adminClientIndexDTO) {
        String adminSelectUnionName = upperReachesMapper.adminSelectUnionName(adminClientIndexDTO);
        return adminSelectUnionName;
    }

    @Override
    public List<String> adminSelectUnionMediaName(AdminClientIndexDTO adminClientIndexDTO) {
        List<String> adminSelectUnionMediaName = advertisingAllianceMapper.adminSelectUnionMediaName(adminClientIndexDTO);
        return adminSelectUnionMediaName;
    }

    @Override
    public List<String> adminSelectUnionSlotName(AdminClientIndexDTO adminClientIndexDTO) {
        List<String> adminSelectUnionSlotName = advertisingAllianceMapper.adminSelectUnionSlotName(adminClientIndexDTO);
        return adminSelectUnionSlotName;
    }

    @Override
    public List<RedisDTO> sspSelectAll() {
        List<RedisDTO> list = new ArrayList<>();
        List<AdminSspAccount> sspAccount = adminSspAccountMapper.sspSelectAll();
        for (int j = 0; j < sspAccount.size(); j++) {
            Map map = new HashMap();
            map.put("SspId",sspAccount.get(j).getId());
            map.put("SspName",sspAccount.get(j).getCompany_name());
            redisUtil.set(sspAccount.get(j).getId().toString()+"0Ssp", JSONObject.toJSONString(map));
        }

        List<SspMedia> sspMedia = sspMediaMapper.sspMediaSelectAll();
        for (int j = 0; j < sspMedia.size(); j++) {
            Map map = new HashMap();
            map.put("SspMediaId",sspMedia.get(j).getId());
            map.put("SspMediaName",sspMedia.get(j).getMedia_name());
            redisUtil.set(sspMedia.get(j).getId().toString()+"0SspMedia", JSONObject.toJSONString(map));
        }

        List<SspAdSlot> sspAdSlots = sspAdSlotMapper.sspAdSlotSelectAll();
        for (int j = 0; j < sspAdSlots.size(); j++) {
            Map map = new HashMap();
            map.put("SspAdSlotId",sspAdSlots.get(j).getId());
            map.put("SspAdSlotName",sspAdSlots.get(j).getSlot_name());
            redisUtil.set(sspAdSlots.get(j).getId().toString()+"0SspAdSlot", JSONObject.toJSONString(map));
        }

        List<DataSlotType> dataSlotTypes = dataSlotTypeMapper.sspSlotTypeSelectAll();
        for (int j = 0; j < dataSlotTypes.size(); j++) {
            Map map = new HashMap();
            map.put("SspSlotTypeId",dataSlotTypes.get(j).getSlot_type_id());
            map.put("SspSlotTypeName",dataSlotTypes.get(j).getSlot_type_name());
            redisUtil.set(dataSlotTypes.get(j).getSlot_type_id().toString()+"0SlotType", JSONObject.toJSONString(map));
        }

        List<UpperReaches> upperReaches = upperReachesMapper.upperSelectAll();
        for (int j = 0; j < upperReaches.size(); j++) {
            Map map = new HashMap();
            map.put("UpperId",upperReaches.get(j).getId());
            map.put("UpperName",upperReaches.get(j).getCorporate_abbreviation());
            redisUtil.set(upperReaches.get(j).getId().toString()+"0Upper", JSONObject.toJSONString(map));
        }

        List<AdvertisingAlliance> advertisingAlliances = advertisingAllianceMapper.dspMediaSelectAll();
        for (int j = 0; j < advertisingAlliances.size(); j++) {
            Map map = new HashMap();
            map.put("DspMediaId",advertisingAlliances.get(j).getApp_id());
            map.put("DspMediaName",advertisingAlliances.get(j).getApp_name());
            redisUtil.set(advertisingAlliances.get(j).getApp_id()+"0DspMedia", JSONObject.toJSONString(map));
        }

        List<AdvertisingAlliance> advertisingAlliancesSlot = advertisingAllianceMapper.dspSlotSelectAll();
        for (int j = 0; j < advertisingAlliancesSlot.size(); j++) {
            Map map = new HashMap();
            map.put("DspSlotId",advertisingAlliancesSlot.get(j).getAdvert_id());
            map.put("DspSlotName",advertisingAlliancesSlot.get(j).getAdvert_name());
            redisUtil.set(advertisingAlliancesSlot.get(j).getAdvert_id()+"0DspSlot", JSONObject.toJSONString(map));
        }

        return list;
    }

}
