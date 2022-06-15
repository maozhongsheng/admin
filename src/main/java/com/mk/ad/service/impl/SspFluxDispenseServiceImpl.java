package com.mk.ad.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.SspAdSlotMapper;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.mapper.mymapper.MySspMediaMapper;
import com.mk.ad.service.SspFluxDispenseService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.RedisUtil;
import com.mk.ad.vo.Request.SlotMake;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Request.SspFluxDispenseRequestDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.SspFluxDispenseResponseDTO;
import com.mk.ad.vo.Response.SspFluxFlowResponseDTO;
import com.mk.ad.vo.SspAdSlot;
import com.mk.ad.vo.SspAdSlotExample;
import com.mk.ad.vo.SspMedia;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/8 13:22
 */
@Slf4j
@Service
@Repository
public class SspFluxDispenseServiceImpl implements SspFluxDispenseService {

    @Autowired
    SspAdSlotMapper sspAdSlotMapper;

    @Autowired
    MySspMediaMapper mySspMediaMapper;

    @Autowired
    SspMediaMapper sspMediaMapper;

    @Resource
    private RedisUtil redisUtil;

    BigDecimal num2 = new BigDecimal(1000);

    /**
     * 流量分发-广告位列表
     * @param sspFluxDispenseRequestDTO
     * @return
     */
    @Override
    public LarkPageInfoVo<SspFluxDispenseResponseDTO> getSspFluxDispenseList(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) {
        SspAdSlotExample example = new SspAdSlotExample();
        SspAdSlotExample.Criteria criteria = example.createCriteria();

        SspMedia sspMedia = mySspMediaMapper.getSspMediaByMediaName(sspFluxDispenseRequestDTO.getMediaName());//根据媒体名称查询媒体信息
        //模糊查询
        if(sspMedia != null){
            if (null != sspMedia.getId()){
                criteria.andIdEqualTo(Integer.valueOf(sspMedia.getId().toString()));
            }
        }
        if(StringUtils.isNotEmpty(sspFluxDispenseRequestDTO.getId())){
            criteria.andIdEqualTo(Integer.parseInt(sspFluxDispenseRequestDTO.getId()));
        }
        if(0 < sspFluxDispenseRequestDTO.getMediaId()){
            criteria.andMedia_idEqualTo(Integer.parseInt(String.valueOf(sspFluxDispenseRequestDTO.getMediaId())));
        }
        if (!"".equals(sspFluxDispenseRequestDTO.getSlotName())){
            criteria.andSlot_nameEqualTo(sspFluxDispenseRequestDTO.getSlotName());
        }
        criteria.andIs_deletedEqualTo(1);
        PageHelper.startPage(sspFluxDispenseRequestDTO.getPageNum(),sspFluxDispenseRequestDTO.getPageSize());
        List<SspAdSlot> sspAdSlots = sspAdSlotMapper.selectByExample(example);
        PageInfo<SspAdSlot> pageInfo = new PageInfo<>(sspAdSlots);
        List<SspFluxDispenseResponseDTO> list = sspAdSlots.stream().map(msg -> {
            SspFluxDispenseResponseDTO sfdr = new SspFluxDispenseResponseDTO();
            sfdr.setId(msg.getId());
            sfdr.setSlotName(msg.getSlot_name());
            sfdr.setRender_type(msg.getRender_type());
            sfdr.setMediaId(msg.getMedia_id());
            if (null != sspMediaMapper.selectByPrimaryKey(msg.getMedia_id().longValue())){
                sfdr.setMediaName(sspMediaMapper.selectByPrimaryKey(msg.getMedia_id().longValue()).getMedia_name());
            }
            return sfdr;
        }).collect(Collectors.toList());
        return new PageImpl<SspFluxDispenseResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), sspFluxDispenseRequestDTO.getPageSize(), sspFluxDispenseRequestDTO.getPageNum());

    }

    /**
     * 修改ssp流量分发广告位配置
     * @param sfdrList
     * @return
     */
    @Override
    public Integer updateSlotFlux(SspFluxDispenseRequestDTO sfdrList) {
            SspAdSlot sas = new SspAdSlot();

        List bussiness_type_one = sfdrList.getBussiness_type_one();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i<bussiness_type_one.size() ; i++){
            if(i<bussiness_type_one.size()-1){
                sb.append(bussiness_type_one.get(i) + ",");
            }else {
                sb.append(bussiness_type_one.get(i));
            }
        }
        String bu = sb.toString();

            List request_rate = sfdrList.getRequest_rate();
             StringBuffer sd = new StringBuffer();
            for(int i  = 0 ; i<request_rate.size(); i++){
                if(i<request_rate.size()-1){
                    sd.append(request_rate.get(i) + ",");
                }else {
                    sd.append(request_rate.get(i));
                }

            }
        String re = sd.toString();

            sas.setId(Integer.parseInt(String.valueOf(sfdrList.getId())));
            sas.setRequet_rate(re);
            sas.setBussiness_type_one(bu);
            sas.setCooperation_type(sfdrList.getCooperation_type());
            sas.setCp_price(sfdrList.getCp_price());
            sas.setDirectional_status(sfdrList.getDirectional_status());
            sas.setFormal_status(sfdrList.getFormal_status());
            Integer integer = sspAdSlotMapper.updateByPrimaryKeySelective(sas);

        return integer;
    }

    @Override
    public SspFluxDispenseRequestDTO selectById(Long id) {
        SspAdSlot ss =   sspAdSlotMapper.selectById(id);
        String media_id = ss.getMedia_id().toString();
        String mname ="";
        if("".equals(media_id)){
        mname = "";
        }else{
            mname =  sspAdSlotMapper.selectByName(media_id);
        }
        String bussiness_type_one = ss.getBussiness_type_one();
        List<String> strings = Arrays.asList(bussiness_type_one);
        String requet_rate = ss.getRequet_rate();
        List<String> requet = Arrays.asList(requet_rate);
        SspFluxDispenseRequestDTO ssp = new SspFluxDispenseRequestDTO();

        ssp.setMediaName(mname);
        ssp.setBussiness_type_one(strings);
        ssp.setRequest_rate(requet);
        ssp.setId(ss.getId().toString());
        ssp.setCp_price(ss.getCp_price());
        ssp.setCooperation_type(ss.getCooperation_type());
        ssp.setSlotName(ss.getSlot_name());
        ssp.setDirectional_status(ss.getDirectional_status());
        ssp.setFormal_status(ss.getFormal_status());
        return ssp;
    }

    @Override
    public   List<Map> selectAll() {
        List<Map> result = null;
        result =  sspAdSlotMapper.selectAll();
        return result;
    }

    @Override
    public List<Map> selectAdvertisement(SspAdSlotRequestDTO sspAdSlotRequestDTO) {
        List<Map> result = null;
        if(null != sspAdSlotRequestDTO.getMedia_id()){
            result =  sspAdSlotMapper.selectAdvertisementByMediaId(sspAdSlotRequestDTO.getMedia_id().toString());
        }else{
            result =  sspAdSlotMapper.selectAdvertisement();
        }
        return result;
    }

    @Override
    public LarkPageInfoVo<SspFluxFlowResponseDTO> getSspFlowList(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) {
        SspAdSlotExample example = new SspAdSlotExample();
        SspAdSlotExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotEmpty(sspFluxDispenseRequestDTO.getSlotId())){
            criteria.andIdEqualTo(Integer.valueOf(sspFluxDispenseRequestDTO.getSlotId()));
        }
        if(StringUtils.isNotEmpty(sspFluxDispenseRequestDTO.getMedia_id())){
            criteria.andMedia_idEqualTo(Integer.valueOf(sspFluxDispenseRequestDTO.getMedia_id()));
        }

        if(StringUtils.isNotEmpty(sspFluxDispenseRequestDTO.getSlotName())){
            criteria.andSlot_nameLike("%"+sspFluxDispenseRequestDTO.getSlotName()+"%");
        }


        criteria.andIs_deletedEqualTo(1);
        criteria.andSlot_statusEqualTo(1);
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(sspFluxDispenseRequestDTO.getPageNum(),sspFluxDispenseRequestDTO.getPageSize());
        List<SspAdSlot> sspAdSlots = sspAdSlotMapper.selectByExample(example);
        PageInfo<SspAdSlot> pageInfo = new PageInfo<>(sspAdSlots);
        List<SspFluxFlowResponseDTO> list = sspAdSlots.stream().map(msg -> {
            SspFluxFlowResponseDTO sfdr = new SspFluxFlowResponseDTO();
            sfdr.setId(Long.valueOf(msg.getId().toString()));
            sfdr.setSlotName(msg.getSlot_name());
            sfdr.setCooperation_type(msg.getCooperation_type());
            sfdr.setMediaId(msg.getMedia_id());
            if (null != sspMediaMapper.selectByPrimaryKey(msg.getMedia_id().longValue())){
                sfdr.setMediaName(sspMediaMapper.selectByPrimaryKey(msg.getMedia_id().longValue()).getMedia_name());
            }
            sfdr.setFormal_status(msg.getFormal_status());
            sfdr.setDirectional_status(msg.getDirectional_status());
            sfdr.setCp_price(msg.getCp_price().divide(num2));
            if(StringUtils.isNotEmpty(msg.getAlliance_id())){
                sfdr.setNumber(msg.getAlliance_id().split(",").length);
            }else{
                sfdr.setNumber(0);
            }

            return sfdr;
        }).collect(Collectors.toList());
        return new PageImpl<SspFluxFlowResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), sspFluxDispenseRequestDTO.getPageSize(), sspFluxDispenseRequestDTO.getPageNum());

    }

    @Override
    public Integer updateSlotFormal(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) {
        SspAdSlot sspAdSlot = new SspAdSlot();
        sspAdSlot.setId(Integer.valueOf(sspFluxDispenseRequestDTO.getId()));
        sspAdSlot.setFormal_status(sspFluxDispenseRequestDTO.getFormal_status());
        return  sspAdSlotMapper.updateByPrimaryKeySelective(sspAdSlot);
    }

    @Override
    public Integer updateSlotDirectional(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) {
        SspAdSlot sspAdSlot = new SspAdSlot();
        sspAdSlot.setId(Integer.valueOf(sspFluxDispenseRequestDTO.getId()));
        sspAdSlot.setDirectional_status(sspFluxDispenseRequestDTO.getDirectional_status());
        return  sspAdSlotMapper.updateByPrimaryKeySelective(sspAdSlot);
    }

    @Override
    public Integer updateAllianceSlotFlux(SspFluxDispenseRequestDTO sspFluxDispenseRequestDTO) {
        SspAdSlot sas = new SspAdSlot();
        List request_rate = sspFluxDispenseRequestDTO.getRequest_rate();
        StringBuffer sd = new StringBuffer();
        for (int i = 0; i < request_rate.size(); i++) {
            if (i < request_rate.size() - 1) {
                sd.append(request_rate.get(i) + ",");
            } else {
                sd.append(request_rate.get(i));
            }

        }
        String re = sd.toString();
        List<SlotMake> slotmake = sspFluxDispenseRequestDTO.getSlotmake();
        StringBuffer ma = new StringBuffer();
        for (int i = 0; i < slotmake.size(); i++) {
            if (i < slotmake.size() - 1) {
                ma.append(slotmake.get(i).getMake() + "|");
            } else {
                ma.append(slotmake.get(i).getMake());
            }

        }
        sas.setId(Integer.parseInt(sspFluxDispenseRequestDTO.getId()));
        sas.setRequet_rate(re);
        sas.setAlliance_id(sspFluxDispenseRequestDTO.getAlliance_id());
        sas.setAlliance_slot_id(sspFluxDispenseRequestDTO.getAlliance_slot_id());
        sas.setCooperation_type(sspFluxDispenseRequestDTO.getCooperation_type());
        sas.setCp_price(sspFluxDispenseRequestDTO.getCp_price().multiply(num2));
        sas.setDirectional_status(sspFluxDispenseRequestDTO.getDirectional_status());
        sas.setFormal_status(sspFluxDispenseRequestDTO.getFormal_status());
        sas.setLowest_status(sspFluxDispenseRequestDTO.getLowest_status());
        sas.setTimeout(sspFluxDispenseRequestDTO.getTimeout());
        sas.setMake(ma.toString());
        Integer integer = sspAdSlotMapper.updateByPrimaryKeySelective(sas);
        HashMap map = new HashMap();
        map.put("directional_status",sspFluxDispenseRequestDTO.getDirectional_status());
        map.put("dsp_slot_id",sspFluxDispenseRequestDTO.getAlliance_slot_id());
        map.put("requet_rate",re);
        map.put("test",sspFluxDispenseRequestDTO.getFormal_status());
        map.put("price",sspFluxDispenseRequestDTO.getCp_price().multiply(num2));
        map.put("lowest_status",sspFluxDispenseRequestDTO.getLowest_status());
        map.put("timeout",sspFluxDispenseRequestDTO.getTimeout());
        if(0 < slotmake.size()){
            map.put("make",ma.toString());
        }else{
            map.put("make","");
        }
        if(null != redisUtil.get(sspFluxDispenseRequestDTO.getId())){
            redisUtil.del(sspFluxDispenseRequestDTO.getId());
            redisUtil.set(sspFluxDispenseRequestDTO.getId(),JSONObject.toJSONString(map));
        }else{
            redisUtil.set(sspFluxDispenseRequestDTO.getId(),JSONObject.toJSONString(map));
        }
        return integer;
    }

    @Override
    public SspFluxDispenseResponseDTO selectAllianceSlotFlux(Integer id) {
        SspFluxDispenseResponseDTO sspFluxDispenseResponseDTO = new SspFluxDispenseResponseDTO();
        SspAdSlot sspAdSlot = sspAdSlotMapper.selectByPrimaryKey(id);
        sspFluxDispenseResponseDTO.setId(sspAdSlot.getId());
        sspFluxDispenseResponseDTO.setAlliance_id(sspAdSlot.getAlliance_id());
        sspFluxDispenseResponseDTO.setAlliance_slot_id(sspAdSlot.getAlliance_slot_id());
        sspFluxDispenseResponseDTO.setFormal_status(sspAdSlot.getFormal_status());
        sspFluxDispenseResponseDTO.setCooperation_type(sspAdSlot.getCooperation_type());
        sspFluxDispenseResponseDTO.setCp_price(sspAdSlot.getCp_price().divide(num2));
        sspFluxDispenseResponseDTO.setRequest_rate(sspAdSlot.getRequet_rate());
        sspFluxDispenseResponseDTO.setDirectional_status(sspAdSlot.getDirectional_status());
        sspFluxDispenseResponseDTO.setLowest_status(sspAdSlot.getLowest_status());
        sspFluxDispenseResponseDTO.setTimeout(sspAdSlot.getTimeout());
        List<SlotMake> slotmanke = new ArrayList();
        if(StringUtils.isNotEmpty(sspAdSlot.getAlliance_slot_id())){
            String[] split = sspAdSlot.getAlliance_slot_id().split(",");
            if(StringUtils.isNotEmpty(sspAdSlot.getMake())){
                String[] split1 = sspAdSlot.getMake().split("\\|");
                for(int i = 0; i < split.length; i++){
                    SlotMake slotMake = new SlotMake();
                    slotMake.setId(split[i]);
                    slotMake.setMake(split1[i]);
                    slotmanke.add(slotMake);
                }
            }
        }
        sspFluxDispenseResponseDTO.setSlotmake(slotmanke);
        return sspFluxDispenseResponseDTO;
    }

    @Override
    public Integer sspFluxtoRedis() {
        List<SspAdSlot> sspAdSlots = sspAdSlotMapper.selectByExample(null);
        for (int i = 0 ;i < sspAdSlots.size(); i++) {
            HashMap map = new HashMap();
            map.put("directional_status",sspAdSlots.get(i).getDirectional_status());
            map.put("dsp_slot_id",sspAdSlots.get(i).getAlliance_slot_id());
            map.put("requet_rate",sspAdSlots.get(i).getRequet_rate());
            map.put("lowest_status",sspAdSlots.get(i).getLowest_status());
            map.put("timeout",sspAdSlots.get(i).getTimeout());
            if(null != sspAdSlots.get(i).getFormal_status()){
                map.put("test",sspAdSlots.get(i).getFormal_status());
            }else{
                map.put("test",0);
            }

            if(null != sspAdSlots.get(i).getCp_price()){
                map.put("price",sspAdSlots.get(i).getCp_price().toString());
            }else{
                map.put("price","0");
            }

            redisUtil.set(sspAdSlots.get(i).getId().toString(), JSONObject.toJSONString(map));
        }
        return 1;
    }
}
