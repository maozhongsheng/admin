package com.mk.ad.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdvertisingAllianceMapper;
import com.mk.ad.mapper.UpperReachesMapper;
import com.mk.ad.service.UpperReachesService;
import com.mk.ad.utils.ExcelExport;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.RedisUtil;
import com.mk.ad.vo.AdvertisingAlliance;
import com.mk.ad.vo.AdvertisingAllianceExample;
import com.mk.ad.vo.Request.AdminUnionSlotRequestDTO;
import com.mk.ad.vo.Request.DownloadTest;
import com.mk.ad.vo.Request.UpperReachesRequestDTO;
import com.mk.ad.vo.Request.UpperSlotRequestDTO;
import com.mk.ad.vo.Response.AdvertisingAllianceResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.UpperReachesResponseDTO;
import com.mk.ad.vo.UpperReaches;
import com.mk.ad.vo.UpperReachesExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2021/3/8 13:22
 */
@Slf4j
@Service
@Repository
public class UpperReachesServiceImpl implements UpperReachesService {

    @Autowired
    private UpperReachesMapper upperReachesMapper;

    @Autowired
    private AdvertisingAllianceMapper advertisingAllianceMapper;

    @Resource
    private RedisUtil redisUtil;


    @Override
    public LarkPageInfoVo<UpperReachesResponseDTO> getUpperReachesList(UpperReachesRequestDTO upperReachesRequestDTO) {
        UpperReachesExample example = new UpperReachesExample();
        UpperReachesExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotBlank(upperReachesRequestDTO.getName())){
            Pattern pattern = Pattern.compile("[0-9]*");
            boolean matches = pattern.matcher(upperReachesRequestDTO.getName()).matches();
            if(matches){
                criteria.andIdEqualTo(Integer.valueOf(upperReachesRequestDTO.getName()));
            }else{
                if(StringUtils.isNotEmpty(upperReachesRequestDTO.getName())){
                    criteria.andCorporate_nameLike("%"+upperReachesRequestDTO.getName()+"%");
                }
            }
        }
        example.setOrderByClause("create_time desc");
        criteria.andIs_deleteEqualTo(0);
        PageHelper.startPage(upperReachesRequestDTO.getPage(),upperReachesRequestDTO.getLimit());
        List<UpperReaches> UpperReachesList = upperReachesMapper.selectByExample(example);
        PageInfo<UpperReaches> pageInfo = new PageInfo<>(UpperReachesList);
        List<UpperReachesResponseDTO> list = UpperReachesList.stream().map(msg ->{
            UpperReachesResponseDTO event = new UpperReachesResponseDTO();
            event.setId(msg.getId());
            event.setCompany_name(msg.getCorporate_name());
            event.setCorporate_abbreviation(msg.getCorporate_abbreviation());
            List media  = advertisingAllianceMapper.selectMediaByUpperId(msg.getId());
            List slot  = advertisingAllianceMapper.selectAdslotByUpperId(msg.getId());
            if(null != media){
                event.setMedia_number(media.size());
                event.setSlot_number(slot.size());
            }else{
                event.setMedia_number(0);
                event.setSlot_number(0);
            }

            return event;
        }).collect(Collectors.toList());
        return new PageImpl<UpperReachesResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), upperReachesRequestDTO.getLimit(), upperReachesRequestDTO.getPage());
    }

    @Override
    public UpperReachesResponseDTO upperReachesById(UpperReachesRequestDTO upperReachesRequestDTO) {
        UpperReachesResponseDTO upperReachesResponseDTO = new UpperReachesResponseDTO();
        UpperReaches upperReaches = upperReachesMapper.selectByPrimaryKey(upperReachesRequestDTO.getId());
        upperReachesResponseDTO.setId(upperReachesRequestDTO.getId());
        upperReachesResponseDTO.setCompany_name(upperReaches.getCorporate_name());
        upperReachesResponseDTO.setAddress(upperReaches.getAddress());
        if("1".equals(upperReaches.getAccounting_period().toString())){
            upperReachesResponseDTO.setAccounting_period("月结");
        }else if ("2".equals(upperReaches.getAccounting_period().toString())) {
            upperReachesResponseDTO.setAccounting_period("季结");
        }
        if("1".equals(upperReaches.getSettlement_cycle().toString())){
            upperReachesResponseDTO.setSettlement_cycle("30天");
        }else if ("2".equals(upperReaches.getSettlement_cycle().toString())) {
            upperReachesResponseDTO.setSettlement_cycle("60天");
        }else if ("3".equals(upperReaches.getSettlement_cycle().toString())) {
            upperReachesResponseDTO.setSettlement_cycle("90天");
        }
        upperReachesResponseDTO.setAccounting_period_id(upperReaches.getAccounting_period());
        upperReachesResponseDTO.setSettlement_cycle_id(upperReaches.getSettlement_cycle());
        upperReachesResponseDTO.setPhone(upperReaches.getPhone());
        upperReachesResponseDTO.setContacts(upperReaches.getContacts());
        upperReachesResponseDTO.setCorporate_abbreviation(upperReaches.getCorporate_abbreviation());
        return upperReachesResponseDTO;
    }

    @Override
    public Integer upperReachesAdd(UpperReachesRequestDTO upperReachesRequestDTO) {
        UpperReaches upperReaches = new UpperReaches();
        upperReaches.setContacts(upperReachesRequestDTO.getContacts());
        upperReaches.setAddress(upperReachesRequestDTO.getAddress());
        upperReaches.setAccounting_period(upperReachesRequestDTO.getAccounting_period());
        upperReaches.setPhone(upperReachesRequestDTO.getPhone());
        upperReaches.setCorporate_name(upperReachesRequestDTO.getCompany_name());
        upperReaches.setCreate_time(new Date());
        upperReaches.setSettlement_cycle(upperReachesRequestDTO.getSettlement_cycle());
        upperReaches.setIs_delete(0);
        upperReaches.setCorporate_abbreviation(upperReachesRequestDTO.getCorporate_abbreviation());
        return upperReachesMapper.insertSelective(upperReaches);
    }

    @Override
    public Integer upperReachesEdit(UpperReachesRequestDTO upperReachesRequestDTO) {
        UpperReaches upperReaches = new UpperReaches();
        upperReaches.setId(upperReachesRequestDTO.getId());
        upperReaches.setContacts(upperReachesRequestDTO.getContacts());
        upperReaches.setAddress(upperReachesRequestDTO.getAddress());
        upperReaches.setAccounting_period(upperReachesRequestDTO.getAccounting_period());
        upperReaches.setPhone(upperReachesRequestDTO.getPhone());
        upperReaches.setCorporate_name(upperReachesRequestDTO.getCompany_name());
        upperReaches.setSettlement_cycle(upperReachesRequestDTO.getSettlement_cycle());
        upperReaches.setCorporate_abbreviation(upperReachesRequestDTO.getCorporate_abbreviation());
        return upperReachesMapper.updateByPrimaryKeySelective(upperReaches);
    }

    @Override
    public Integer deleteupperReaches(UpperReachesRequestDTO upperReachesRequestDTO) {
        UpperReaches upperReaches = new UpperReaches();
        upperReaches.setId(upperReachesRequestDTO.getId());
        upperReaches.setIs_delete(1);
        return upperReachesMapper.updateByPrimaryKeySelective(upperReaches);
    }

    @Override
    public List getUpperList(UpperReachesRequestDTO upperReachesRequestDTO) {
        UpperReachesExample example = new UpperReachesExample();
        UpperReachesExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotBlank(upperReachesRequestDTO.getName())){
            Pattern pattern = Pattern.compile("[0-9]*");
            boolean matches = pattern.matcher(upperReachesRequestDTO.getName()).matches();
            if(matches){
                criteria.andIdEqualTo(Integer.valueOf(upperReachesRequestDTO.getName()));
            }else{
                criteria.andCorporate_nameLike("%"+upperReachesRequestDTO.getName()+"%");
            }
        }
        example.setOrderByClause("create_time desc");
        criteria.andIs_deleteEqualTo(0);
        List<UpperReaches> UpperReachesList = upperReachesMapper.selectByExample(example);
        List<UpperReachesResponseDTO> list = UpperReachesList.stream().map(msg ->{
            UpperReachesResponseDTO event = new UpperReachesResponseDTO();
            event.setId(msg.getId());
            event.setCompany_name(msg.getCorporate_name());
            return event;
        }).collect(Collectors.toList());
        return list;
    }

    @Override
    public LarkPageInfoVo<AdvertisingAllianceResponseDTO> getUpperSlotListByid(UpperReachesRequestDTO upperReachesRequestDTO) {
        AdvertisingAllianceExample example = new AdvertisingAllianceExample();
        AdvertisingAllianceExample.Criteria criteria = example.createCriteria();

        criteria.andUpper_idEqualTo(upperReachesRequestDTO.getId());
        example.setOrderByClause("create_time desc");
        PageHelper.startPage(upperReachesRequestDTO.getPage(),upperReachesRequestDTO.getLimit());
        List<AdvertisingAlliance> AdvertisingAllianceList = advertisingAllianceMapper.selectByExample(example);
        PageInfo<AdvertisingAlliance> pageInfo = new PageInfo<>(AdvertisingAllianceList);
        List<AdvertisingAllianceResponseDTO> list = AdvertisingAllianceList.stream().map(msg ->{
            AdvertisingAllianceResponseDTO event = new AdvertisingAllianceResponseDTO();
            event.setId(msg.getId());
            event.setAdvert_name(msg.getAdvert_name());
            event.setAdvert_id(msg.getAdvert_id());
            event.setSize(msg.getSize());
            event.setOs_type(msg.getOs_type());
            event.setApp_id(msg.getApp_id());
            event.setApp_name(msg.getApp_name());
            event.setAd_slot_type(msg.getAd_slot_type());
            event.setApp_bundle(msg.getApp_bundle());
            event.setApp_version(msg.getApp_version());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdvertisingAllianceResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), upperReachesRequestDTO.getLimit(), upperReachesRequestDTO.getPage());
    }

    @Override
    public void download(HttpServletResponse response) {

        List<DownloadTest> list = new ArrayList();
        DownloadTest downloadTest = new DownloadTest();
        downloadTest.setUpper("同程旅行");
        downloadTest.setMedia_name("");
        downloadTest.setAdslot_type("信息流tab1");
        downloadTest.setAd_slot("同程旅行-安卓-tab1");
        downloadTest.setOs_type("安卓");
        downloadTest.setApp_id("db7f4be8");
        downloadTest.setTager_id("7363424");
        downloadTest.setSize("500*600");
        downloadTest.setApp_buulde("com.tongcheng.android");
        downloadTest.setApp_version("1.3.7");
        downloadTest.setBeizhu("");
        list.add(downloadTest);
        String [] arr = new String[]{"广告联盟","媒体名称","广告位分类","广告位","系统","应用id","客户后台","客户尺寸","包名","应用版本号","备注"};
        ExcelExport.export(response,list,arr);


    }

    @Override
    public Integer insertinto(List list) {
        AdvertisingAlliance advertisingAlliance = new AdvertisingAlliance();
        advertisingAlliance.setUpper_id(upperReachesMapper.selectIdByname(list.get(0).toString()));
        advertisingAlliance.setApp_name(list.get(1).toString());
        advertisingAlliance.setAd_slot_type(list.get(2).toString());
        advertisingAlliance.setAdvert_name(list.get(3).toString());
        advertisingAlliance.setOs_type(list.get(4).toString());
        advertisingAlliance.setApp_id(list.get(5).toString());
        advertisingAlliance.setAdvert_id(list.get(6).toString());
        advertisingAlliance.setSize(list.get(7).toString());
        advertisingAlliance.setApp_bundle(list.get(8).toString());
        return advertisingAllianceMapper.insertSelective(advertisingAlliance);
    }

    @Override
    public void insertintom(Map map) {

        AdvertisingAlliance advertisingAlliance = new AdvertisingAlliance();
        Integer integer = upperReachesMapper.selectIdByname(map.get("0").toString());
        if(null != integer) {
            advertisingAlliance.setUpper_id(integer);
            advertisingAlliance.setApp_name(map.get("1").toString());
            advertisingAlliance.setAd_slot_type(map.get("2").toString());
            advertisingAlliance.setAdvert_name(map.get("3").toString());
            advertisingAlliance.setOs_type(map.get("4").toString());
            advertisingAlliance.setApp_id(map.get("5").toString());
            advertisingAlliance.setAdvert_id(map.get("6").toString());
            advertisingAlliance.setSize(map.get("7").toString());
            advertisingAlliance.setApp_bundle(map.get("8").toString());
            advertisingAlliance.setApp_version(map.get("9").toString());
            advertisingAllianceMapper.insertSelective(advertisingAlliance);
        }
    }

    @Override
    public List<Map> getUpperSlotTree(UpperReachesRequestDTO upperReachesRequestDTO) {
        UpperReachesExample example = new UpperReachesExample();
        UpperReachesExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotBlank(upperReachesRequestDTO.getName())){
            Pattern pattern = Pattern.compile("[0-9]*");
            boolean matches = pattern.matcher(upperReachesRequestDTO.getName()).matches();
            if(matches){
                criteria.andIdEqualTo(Integer.valueOf(upperReachesRequestDTO.getName()));
            }else{
                criteria.andCorporate_nameLike("%"+upperReachesRequestDTO.getName()+"%");
            }
        }
        example.setOrderByClause("create_time desc");
        criteria.andIs_deleteEqualTo(0);
        List<UpperReaches> UpperReachesList = upperReachesMapper.selectByExample(example);

        List<Map> alliance = new ArrayList();

        for (int i = 0; i<UpperReachesList.size(); i++) {
            Map map = new HashMap();
            map.put("alliance_id",UpperReachesList.get(i).getId());
            map.put("corporate_name",UpperReachesList.get(i).getCorporate_name());
            List<Map> slot = upperReachesMapper.selectsoltIdByUpperId(UpperReachesList.get(i).getId());
            map.put("list",slot);
            alliance.add(map);
        }


        return alliance;
    }

    @Override
    public List<String> adminUnionSlotId(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO) {
        if(StringUtils.isEmpty(adminUnionSlotRequestDTO.getDsp_id().get(0)) && StringUtils.isEmpty(adminUnionSlotRequestDTO.getDsp_media().get(0)) && StringUtils.isEmpty(adminUnionSlotRequestDTO.getDsp_slot().get(0))){
            return null;
        }
        if(StringUtils.isEmpty(adminUnionSlotRequestDTO.getDsp_id().get(0))){
            adminUnionSlotRequestDTO.setDsp_id(null);
        }
        if(StringUtils.isEmpty(adminUnionSlotRequestDTO.getDsp_media().get(0))){
            adminUnionSlotRequestDTO.setDsp_media(null);
        }
        if(StringUtils.isEmpty(adminUnionSlotRequestDTO.getDsp_slot().get(0))){
            adminUnionSlotRequestDTO.setDsp_slot(null);
        }

        List<String> adminUnionSlotId = advertisingAllianceMapper.adminUnionMapper(adminUnionSlotRequestDTO);
        return adminUnionSlotId;
    }

    @Override
    public List adminIndexUnionMedia(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO) {
        List list = advertisingAllianceMapper.adminIndexUnionMedia(adminUnionSlotRequestDTO);
        return list;
    }

    @Override
    public List adminIndexUnionSlot(AdminUnionSlotRequestDTO adminUnionSlotRequestDTO) {
        List list = advertisingAllianceMapper.adminIndexUnionSlot(adminUnionSlotRequestDTO);
        return list;
    }

    @Override
    public Integer upperAlltoRedis() {
        List<AdvertisingAlliance> advertisingAlliances = advertisingAllianceMapper.selectByExample(null);
        for (int i = 0 ;i < advertisingAlliances.size(); i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("dsp_id",advertisingAlliances.get(i).getUpper_id());
            hashMap.put("app_id",advertisingAlliances.get(i).getApp_id());
            hashMap.put("app_name",advertisingAlliances.get(i).getApp_name());
            hashMap.put("bundle",advertisingAlliances.get(i).getApp_bundle());
            hashMap.put("version",advertisingAlliances.get(i).getApp_version());
            hashMap.put("tag_id",advertisingAlliances.get(i).getAdvert_id());
            hashMap.put("size",advertisingAlliances.get(i).getSize());
            hashMap.put("slot_type",advertisingAlliances.get(i).getAd_slot_type());
            hashMap.put("os",advertisingAlliances.get(i).getOs_type());
            redisUtil.set(advertisingAlliances.get(i).getId().toString(), JSONObject.toJSONString(hashMap));
        }
        return 1;
    }

    @Override
    public Integer deleteAlltoRedis() {
        Long keys = redisUtil.deleteAll();
        log.info("删除Redis中缓存数为:"+keys);
        return 1;
    }


    @Override
    public Integer insertUpperSlot(UpperSlotRequestDTO upperSlotRequestDTO) {

        List slotName = advertisingAllianceMapper.selectSlotName();
        if(slotName.contains(upperSlotRequestDTO.getAdvert_name())){
            return 2;
        }

        AdvertisingAlliance advertisingAlliance = new AdvertisingAlliance();
        advertisingAlliance.setUpper_id(upperSlotRequestDTO.getUpper_id());
        advertisingAlliance.setAdvert_name(upperSlotRequestDTO.getAdvert_name());
        advertisingAlliance.setAdvert_id(upperSlotRequestDTO.getAdvert_id());
        advertisingAlliance.setSize(upperSlotRequestDTO.getSize());
        advertisingAlliance.setOs_type(upperSlotRequestDTO.getOs_type());
        advertisingAlliance.setApp_id(upperSlotRequestDTO.getApp_id());
        advertisingAlliance.setApp_name(upperSlotRequestDTO.getApp_name());
        advertisingAlliance.setAd_slot_type(upperSlotRequestDTO.getAd_slot_type());
        advertisingAlliance.setApp_bundle(upperSlotRequestDTO.getApp_bundle());
        advertisingAlliance.setApp_version(upperSlotRequestDTO.getApp_version());

        //缓存联盟广告位信息
        HashMap hashMap = new HashMap();
        hashMap.put("dsp_id",upperSlotRequestDTO.getUpper_id().toString());
        hashMap.put("app_id",upperSlotRequestDTO.getApp_id());
        hashMap.put("app_name",upperSlotRequestDTO.getApp_name());
        hashMap.put("bundle",upperSlotRequestDTO.getApp_bundle());
        hashMap.put("version",upperSlotRequestDTO.getApp_version());
        hashMap.put("tag_id",upperSlotRequestDTO.getAdvert_id());
        hashMap.put("size",upperSlotRequestDTO.getSize());
        hashMap.put("slot_type",upperSlotRequestDTO.getAd_slot_type());
        hashMap.put("os",upperSlotRequestDTO.getOs_type());

        advertisingAllianceMapper.insertSelective(advertisingAlliance);
        String id = advertisingAllianceMapper.selectidByslotid(upperSlotRequestDTO.getAdvert_id());
        redisUtil.set(id,JSONObject.toJSONString(hashMap));
        return 1;
    }

    @Override
    public Integer updateUpperSlot(UpperSlotRequestDTO upperSlotRequestDTO) {
        AdvertisingAlliance advertisingAlliance = new AdvertisingAlliance();
        advertisingAlliance.setId(upperSlotRequestDTO.getId());
        advertisingAlliance.setAdvert_name(upperSlotRequestDTO.getAdvert_name());
        advertisingAlliance.setAdvert_id(upperSlotRequestDTO.getAdvert_id());
        advertisingAlliance.setSize(upperSlotRequestDTO.getSize());
        advertisingAlliance.setOs_type(upperSlotRequestDTO.getOs_type());
        advertisingAlliance.setApp_id(upperSlotRequestDTO.getApp_id());
        advertisingAlliance.setApp_name(upperSlotRequestDTO.getApp_name());
        advertisingAlliance.setAd_slot_type(upperSlotRequestDTO.getAd_slot_type());
        advertisingAlliance.setApp_bundle(upperSlotRequestDTO.getApp_bundle());
        advertisingAlliance.setApp_version(upperSlotRequestDTO.getApp_version());

        //缓存联盟广告位信息
        HashMap hashMap = new HashMap();
        hashMap.put("dsp_id",upperSlotRequestDTO.getUpper_id().toString());
        hashMap.put("app_id",upperSlotRequestDTO.getApp_id());
        hashMap.put("app_name",upperSlotRequestDTO.getApp_name());
        hashMap.put("bundle",upperSlotRequestDTO.getApp_bundle());
        hashMap.put("version",upperSlotRequestDTO.getApp_version());
        hashMap.put("tag_id",upperSlotRequestDTO.getAdvert_id());
        hashMap.put("size",upperSlotRequestDTO.getSize());
        hashMap.put("slot_type",upperSlotRequestDTO.getAd_slot_type());
        hashMap.put("os",upperSlotRequestDTO.getOs_type());
        redisUtil.del(upperSlotRequestDTO.getId().toString());
        redisUtil.set(upperSlotRequestDTO.getId().toString(),JSONObject.toJSONString(hashMap));
        return advertisingAllianceMapper.updateByPrimaryKeySelective(advertisingAlliance);
    }

    @Override
    public List selectUnion() {
        List list = new ArrayList<>();
        List union = upperReachesMapper.selectUnion();
        List media = advertisingAllianceMapper.selectMedia();
        List slot = advertisingAllianceMapper.selectSlot();
        list.add(union);
        list.add(media);
        list.add(slot);
        return list;
    }



}