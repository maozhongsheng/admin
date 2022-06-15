package com.mk.ad.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminAdxMapper;
import com.mk.ad.mapper.AdminSlotMapper;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminAdx;
import com.mk.ad.vo.AdminAdxExample;
import com.mk.ad.vo.Response.Adx.AdminAdxETwoSlotResponseDTO;
import com.mk.ad.vo.Response.Adx.DisplayStyle;
import com.mk.ad.vo.Response.Adx.SizeList;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.service.AdminAdxService;
import com.mk.ad.vo.AdminSlot;
import com.mk.ad.vo.ETwoAddBidRequest;
import com.mk.ad.vo.Request.AdminAdxRequestDTO;
import com.mk.ad.vo.Response.Adx.AdminAdxETwoResponseDTO;
import com.mk.ad.vo.Response.AdminAdxResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
public class AdminAdxServiceImpl implements AdminAdxService {

    @Autowired
    AdminAdxMapper adminAdxMapper;

    @Autowired
    AdminSlotMapper adminSlotMapper;

    @Override
    public LarkPageInfoVo<AdminAdxResponseDTO> getAdxList(AdminAdxRequestDTO adminAdxRequestDTO) {
        AdminAdxExample example = new AdminAdxExample();
        AdminAdxExample.Criteria criteria = example.createCriteria();

        //模糊查询
        if(adminAdxRequestDTO.getAdxType() != null){
            criteria.andAdx_typeEqualTo(adminAdxRequestDTO.getAdxType());//ADX类型
        }

        if(adminAdxRequestDTO.getSettlementId() != null){
            criteria.andSettlement_idEqualTo(adminAdxRequestDTO.getSettlementId());//结算类型
        }

        if(adminAdxRequestDTO.getSettlementBasisId() != null){
            criteria.andSettlement_basis_idEqualTo(adminAdxRequestDTO.getSettlementBasisId());//结算依据
        }

        if(adminAdxRequestDTO.getAdxId() != null){
            criteria.andAdx_idEqualTo(adminAdxRequestDTO.getAdxId());//ADXID
        }

        if(adminAdxRequestDTO.getStatus() != null){
            criteria.andStatusEqualTo(adminAdxRequestDTO.getStatus());//状态
        }

        if(StringUtils.isNotBlank(adminAdxRequestDTO.getAdxName())){//ADX名称
            criteria.andAdx_nameEqualTo(adminAdxRequestDTO.getAdxName());
        }

        PageHelper.startPage(adminAdxRequestDTO.getPage(),adminAdxRequestDTO.getLimit());
        List<AdminAdx> adminAdxList = adminAdxMapper.selectByExample(example);
        PageInfo<AdminAdx> pageInfo = new PageInfo<>(adminAdxList);
        List<AdminAdxResponseDTO> list = adminAdxList.stream().map(msg ->{
            AdminAdxResponseDTO event = new AdminAdxResponseDTO();
            event.setId(msg.getId());
            event.setAdxId(msg.getAdx_id());
            event.setAdxName(msg.getAdx_name());
            event.setAdxType(msg.getAdx_type());
            event.setAdxNameCompany(msg.getAdx_name_company());
            event.setAdxToken(msg.getAdx_token());
            event.setAdxKey(msg.getAdx_key());
            event.setAdxValue(msg.getAdx_value());
            event.setAdxTypeId(msg.getAdx_type_id());
            event.setSettlementId(msg.getSettlement_id());
            event.setPolicyDate(msg.getPolicy_date());
            event.setRebateId(msg.getRebate_id());
            event.setRebate(msg.getRebate());
            event.setProfit(msg.getProfit());
            event.setSettlementBasisId(msg.getSettlement_basis_id());
            event.setPayee(msg.getPayee());
            event.setBankDeposit(msg.getBank_deposit());
            event.setBankAccount(msg.getBank_account());
            event.setChargeId(msg.getCharge_id());
            event.setApiFile(msg.getApi_file());
            event.setStatus(msg.getStatus());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminAdxResponseDTO>().pageZset(list, (int) pageInfo.getTotal(),adminAdxRequestDTO.getLimit(), adminAdxRequestDTO.getPage());
    }

    @Override
    public Integer insertAdx(AdminAdx adminAdx) {
        adminAdx.setStatus(0);
        return adminAdxMapper.insertSelective(adminAdx);
    }

    @Override
    public Integer UpdateAdx(AdminAdx adminAdx) {
        return adminAdxMapper.updateByPrimaryKeySelective(adminAdx);
    }

    @Override
    public AdminAdxResponseDTO getAdxId(Long id) {
        AdminAdx adminAdx = adminAdxMapper.selectByPrimaryKey(id);
        AdminAdxResponseDTO aar = new AdminAdxResponseDTO();
        aar.setAdxId(adminAdx.getAdx_id());
        aar.setAdxName(adminAdx.getAdx_name());
        aar.setAdxType(adminAdx.getAdx_type());
        aar.setAdxNameCompany(adminAdx.getAdx_name_company());
        aar.setAdxToken(adminAdx.getAdx_token());
        aar.setAdxKey(adminAdx.getAdx_key());
        aar.setAdxValue(adminAdx.getAdx_value());
        aar.setAdxTypeId(adminAdx.getAdx_type_id());
        aar.setSettlementId(adminAdx.getSettlement_id());
        aar.setPolicyDate(adminAdx.getPolicy_date());
        aar.setRebateId(adminAdx.getRebate_id());
        aar.setRebate(adminAdx.getRebate());
        aar.setProfit(adminAdx.getProfit());
        aar.setSettlementBasisId(adminAdx.getSettlement_basis_id());
        aar.setPayee(adminAdx.getPayee());
        aar.setBankDeposit(adminAdx.getBank_deposit());
        aar.setBankAccount(adminAdx.getBank_account());
        aar.setChargeId(adminAdx.getCharge_id());
        aar.setApiFile(adminAdx.getApi_file());
        aar.setStatus(adminAdx.getStatus());
        List<AdminSlot> list = adminSlotMapper.selectAdxId(Long.parseLong(adminAdx.getId().toString()));
        aar.setList(list);
        return aar;
    }

    @Override
    public Integer upADXStatus(Long id, Integer status) {
        return adminAdxMapper.upADXStatus(id,status);
    }

    @Override
    public LarkPageInfoVo<AdminAdxResponseDTO> getSspMoneyList(AdminAdxRequestDTO adminAdxRequestDTO) throws ParseException {
        AdminAdxExample example = new AdminAdxExample();
        AdminAdxExample.Criteria criteria = example.createCriteria();

        if(null != adminAdxRequestDTO.getId()){
            criteria.andIdEqualTo(Long.valueOf(adminAdxRequestDTO.getId().toString()));
        }
        if(0 != adminAdxRequestDTO.getSettlementId()){
            criteria.andSettlement_idEqualTo(adminAdxRequestDTO.getSettlementId());
        }
        if(!"".equals(adminAdxRequestDTO.getStart()) && !"".equals(adminAdxRequestDTO.getEnd())){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date start = sdf.parse(adminAdxRequestDTO.getStart());
            Date end = sdf.parse(adminAdxRequestDTO.getEnd());
            criteria.andCreate_timeBetween(start,end);

        }
        if(null != adminAdxRequestDTO.getAdxId()){
            criteria.andAdx_idEqualTo(adminAdxRequestDTO.getAdxId());
        }

        PageHelper.startPage(adminAdxRequestDTO.getPage(),adminAdxRequestDTO.getLimit());
        List<AdminAdx> adminAdxList = adminAdxMapper.selectByExample(example);
        PageInfo<AdminAdx> pageInfo = new PageInfo<>(adminAdxList);
        List<AdminAdxResponseDTO> list = adminAdxList.stream().map(msg ->{
            AdminAdxResponseDTO event = new AdminAdxResponseDTO();
            event.setId(msg.getId());
            event.setAdxId(msg.getAdx_id());
            event.setAdxName(msg.getAdx_name());
            event.setAdxType(msg.getAdx_type());
            event.setAdxNameCompany(msg.getAdx_name_company());
            event.setAdxToken(msg.getAdx_token());
            event.setAdxKey(msg.getAdx_key());
            event.setAdxValue(msg.getAdx_value());
            event.setAdxTypeId(msg.getAdx_type_id());
            event.setSettlementId(msg.getSettlement_id());
            event.setPolicyDate(msg.getPolicy_date());
            event.setRebateId(msg.getRebate_id());
            event.setRebate(msg.getRebate());
            event.setProfit(msg.getProfit());
            event.setSettlementBasisId(msg.getSettlement_basis_id());
            event.setPayee(msg.getPayee());
            event.setBankDeposit(msg.getBank_deposit());
            event.setBankAccount(msg.getBank_account());
            event.setChargeId(msg.getCharge_id());
            event.setApiFile(msg.getApi_file());
            event.setStatus(msg.getStatus());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminAdxResponseDTO>().pageZset(list, (int) pageInfo.getTotal(),adminAdxRequestDTO.getLimit(), adminAdxRequestDTO.getPage());
    }

    @Override
    public Integer updateAdxMoney(Map params) {
        Integer resutl =  adminAdxMapper.updateAdxMoney(params);
        return resutl;
    }

    @Override
    public LarkPageInfoVo<AdminAdxETwoResponseDTO> getAdxETwoSlotList(AdminAdxRequestDTO adminAdxRequestDTO) {
        AdminAdx adminAdx = adminAdxMapper.selectByPrimaryKey(adminAdxRequestDTO.getId());
        ETwoAddBidRequest eTwoAddBidRequest = new ETwoAddBidRequest();
        eTwoAddBidRequest.setDspid(adminAdx.getAdx_id());
        eTwoAddBidRequest.setToken(adminAdx.getAdx_token());
        eTwoAddBidRequest.setPage(adminAdxRequestDTO.getPage());
        eTwoAddBidRequest.setSize(adminAdxRequestDTO.getLimit());

        String content = JSONObject.toJSONString(eTwoAddBidRequest);
        log.info("根据adxid查询2345广告位列表参数"+content);
        // 创建一个post请求
        HttpPost post = new HttpPost("http://e.2345.com/dsp/get_seats");
        post.setHeader("accept", "*/*");
        post.setHeader("connection", "Keep-Alive");
        post.setHeader("Content-Type", "application/json;charset=UTF-8");
        post.setEntity(new StringEntity(content, "utf-8"));
        //创建客户端
        HttpClient httpClient = HttpClients.createDefault();
        String result=null;
        try {
            HttpResponse response = httpClient.execute(post);
            int code = response.getStatusLine().getStatusCode();
            if (code == 200){
                log.info("请求成功"+code);
                result= EntityUtils.toString(response.getEntity(),"UTF-8");
            }else if (code == 204){
                log.info("204无数据！");
            } else {
                log.info("请求失败"+code);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        log.info("2345返回参数"+JSONObject.parseObject(result));
        Integer total = JSONObject.parseObject(result).getJSONObject("data").getInteger("total");
        JSONArray jsonArray = JSONObject.parseObject(result).getJSONObject("data").getJSONArray("seat_list");
        List<AdminAdxETwoResponseDTO> adminAdxETwoResponseDTOS = jsonArray.toJavaList(AdminAdxETwoResponseDTO.class);
        return new PageImpl<AdminAdxETwoResponseDTO>().pageZset(adminAdxETwoResponseDTOS, total,adminAdxRequestDTO.getLimit(), adminAdxRequestDTO.getPage());
    }

    @Override
    public Integer getAdxETwoSlot(AdminAdxRequestDTO adminAdxRequestDTO) {
        String[] split = adminAdxRequestDTO.getSlot_id().split(",");
        for (int i = 0 ;i < split.length; i++) {
            AdminAdxETwoSlotResponseDTO adminAdxETwoSlotResponseDTO = new AdminAdxETwoSlotResponseDTO();
            AdminAdx adminAdx = adminAdxMapper.selectByPrimaryKey(adminAdxRequestDTO.getId());
            ETwoAddBidRequest eTwoAddBidRequest = new ETwoAddBidRequest();
            eTwoAddBidRequest.setDspid(adminAdx.getAdx_id());
            eTwoAddBidRequest.setToken(adminAdx.getAdx_token());
            List slotlists = new ArrayList();
            slotlists.add(Integer.valueOf(split[i]));
            eTwoAddBidRequest.setSeat_id_list(slotlists);
            String content = JSONObject.toJSONString(eTwoAddBidRequest);
            log.info("根据广告位id查询2345单个广告位详情参数" + content);
            // 创建一个post请求
            HttpPost post = new HttpPost("http://e.2345.com/dsp/get_seat_details");
            post.setHeader("accept", "*/*");
            post.setHeader("connection", "Keep-Alive");
            post.setHeader("Content-Type", "application/json;charset=UTF-8");
            post.setEntity(new StringEntity(content, "utf-8"));
            //创建客户端
            HttpClient httpClient = HttpClients.createDefault();
            String result = null;
            try {
                HttpResponse response = httpClient.execute(post);
                int code = response.getStatusLine().getStatusCode();
                if (code == 200) {
                    log.info("请求成功" + code);
                    result = EntityUtils.toString(response.getEntity(), "UTF-8");
                } else if (code == 204) {
                    log.info("204无数据！");
                } else {
                    log.info("请求失败" + code);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            log.info("2345返回参数" + JSONObject.parseObject(result));
            JSONObject jsonObject = JSONObject.parseObject(result).getJSONObject("data").getJSONArray("seat_detail_list").getJSONObject(0);
            String seat_name = jsonObject.getString("seat_name");
            Integer seat_id = jsonObject.getInteger("seat_id");
            JSONArray display_style = jsonObject.getJSONArray("display_style");
            adminAdxETwoSlotResponseDTO.setSeat_id(seat_id);
            adminAdxETwoSlotResponseDTO.setSeat_name(seat_name);
            adminAdxETwoSlotResponseDTO.setDisplay_style(display_style.toJavaList(DisplayStyle.class));
            List id = adminSlotMapper.selectAdxslot();
            if(id.contains(seat_id.toString())){
                return 1001;
            }else{
                AdminSlot adminSlot = new AdminSlot();
                List<DisplayStyle> display_style1 = adminAdxETwoSlotResponseDTO.getDisplay_style();
                if(0 < display_style1.size()){
                    for(int sl = 0; sl < display_style1.size(); sl++){
                        Integer slot_type = Integer.valueOf(display_style1.get(sl).getShow_style());
                        if (6 == slot_type) {
                            adminSlot.setSlot_type(5);
                            adminSlot.setMedia_industry_two(display_style1.get(sl).getDisplay_id());
                            adminSlot.setSlot_class(display_style1.get(sl).getStyle_name());
                            List<SizeList> size_list = display_style1.get(sl).getSize_list();
                            adminSlot.setE_two_desc(size_list.get(0).getDesc());
                            adminSlot.setE_two_size(size_list.get(0).getSize());
                            adminSlot.setE_two_file_size(size_list.get(0).getFile_size());
                            adminSlot.setE_two_suffix(size_list.get(0).getSuffix());
                            break;
                        } else if (7 == slot_type) {
                            adminSlot.setSlot_type(6);
                            if(100024 == display_style1.get(sl).getDisplay_id()){
                                adminSlot.setMedia_industry_two(display_style1.get(sl).getDisplay_id());
                                adminSlot.setSlot_class(display_style1.get(sl).getStyle_name());
                                List<SizeList> size_list = display_style1.get(sl).getSize_list();
                                adminSlot.setE_two_desc(size_list.get(0).getDesc());
                                adminSlot.setE_two_size(size_list.get(0).getSize());
                                adminSlot.setE_two_file_size(size_list.get(0).getFile_size());
                                adminSlot.setE_two_suffix(size_list.get(0).getSuffix());
                                break;

                            }
                        } else if (8 == slot_type) {
                            adminSlot.setSlot_type(3);
                            if(100002 == display_style1.get(sl).getDisplay_id()){
                                adminSlot.setMedia_industry_two(display_style1.get(sl).getDisplay_id());
                                adminSlot.setSlot_class(display_style1.get(sl).getStyle_name());
                                List<SizeList> size_list = display_style1.get(sl).getSize_list();
                                adminSlot.setE_two_desc(size_list.get(0).getDesc());
                                adminSlot.setE_two_size(size_list.get(0).getSize());
                                adminSlot.setE_two_file_size(size_list.get(0).getFile_size());
                                adminSlot.setE_two_suffix(size_list.get(0).getSuffix());
                                break;

                            }
                        } else if (9 == slot_type) {
                            adminSlot.setSlot_type(1);
                            adminSlot.setMedia_industry_two(display_style1.get(sl).getDisplay_id());
                            adminSlot.setSlot_class(display_style1.get(sl).getStyle_name());
                            List<SizeList> size_list = display_style1.get(sl).getSize_list();
                            adminSlot.setE_two_desc(size_list.get(0).getDesc());
                            adminSlot.setE_two_size(size_list.get(0).getSize());
                            adminSlot.setE_two_file_size(size_list.get(0).getFile_size());
                            adminSlot.setE_two_suffix(size_list.get(0).getSuffix());
                            break;
                        } else if (10 == slot_type) {
                            adminSlot.setSlot_type(1);
                            if(100003 == display_style1.get(sl).getDisplay_id()){
                                adminSlot.setMedia_industry_two(display_style1.get(sl).getDisplay_id());
                                adminSlot.setSlot_class(display_style1.get(sl).getStyle_name());
                                List<SizeList> size_list = display_style1.get(sl).getSize_list();
                                adminSlot.setE_two_desc(size_list.get(1).getDesc());
                                adminSlot.setE_two_size(size_list.get(1).getSize());
                                adminSlot.setE_two_file_size(size_list.get(1).getFile_size());
                                adminSlot.setE_two_suffix(size_list.get(1).getSuffix());
                                break;
                            }
                        } else if (11 == slot_type) {
                            adminSlot.setSlot_type(4);
                            if(100027 == display_style1.get(sl).getDisplay_id()) {
                                adminSlot.setMedia_industry_two(display_style1.get(sl).getDisplay_id());
                                adminSlot.setSlot_class(display_style1.get(sl).getStyle_name());
                                List<SizeList> size_list = display_style1.get(sl).getSize_list();
                                adminSlot.setE_two_desc(size_list.get(0).getDesc());
                                adminSlot.setE_two_size(size_list.get(0).getSize());
                                adminSlot.setE_two_file_size(size_list.get(0).getFile_size());
                                adminSlot.setE_two_suffix(size_list.get(0).getSuffix());
                                break;
                            }
                        }
                    }
                }
                adminSlot.setAdx_id(43);
                adminSlot.setMedia_name("2345ADX");
                adminSlot.setMedia_id("10122");
                adminSlot.setPlatform_id(0);
                adminSlot.setOperation_id(1);
                adminSlot.setSlot_id(Integer.valueOf(split[i]));
                adminSlot.setSlot_name(seat_name);
                adminSlot.setExtension_id("1,2");
                adminSlot.setIs_deleted(1);
                adminSlot.setStatus(0);
                adminSlot.setSettlement_unit_price(Integer.valueOf(adminAdxRequestDTO.getFloor_price().split(",")[i]));
                adminSlot.setE_two_bcat(adminAdxRequestDTO.getBcat());
                adminSlot.setE_two_creat_time(adminAdxRequestDTO.getUpdate().split(",")[i]);
                adminSlotMapper.insertSelective(adminSlot);

            }
        }
        return 1;
    }

    @Override
    public AdminAdxETwoSlotResponseDTO getAdxETwoSlotById(AdminAdxRequestDTO adminAdxRequestDTO) {
        AdminAdxETwoSlotResponseDTO adminAdxETwoSlotResponseDTO = new AdminAdxETwoSlotResponseDTO();
        AdminAdx adminAdx = adminAdxMapper.selectByPrimaryKey(adminAdxRequestDTO.getId());
        ETwoAddBidRequest eTwoAddBidRequest = new ETwoAddBidRequest();
        eTwoAddBidRequest.setDspid(adminAdx.getAdx_id());
        eTwoAddBidRequest.setToken(adminAdx.getAdx_token());
        List slotlists = new ArrayList();
        slotlists.add(Integer.valueOf(adminAdxRequestDTO.getSlot_id()));
        eTwoAddBidRequest.setSeat_id_list(slotlists);
        String content = JSONObject.toJSONString(eTwoAddBidRequest);
        log.info("根据广告位id查询2345单个广告位详情参数" + content);
        // 创建一个post请求
        HttpPost post = new HttpPost("http://e.2345.com/dsp/get_seat_details");
        post.setHeader("accept", "*/*");
        post.setHeader("connection", "Keep-Alive");
        post.setHeader("Content-Type", "application/json;charset=UTF-8");
        post.setEntity(new StringEntity(content, "utf-8"));
        //创建客户端
        HttpClient httpClient = HttpClients.createDefault();
        String result = null;
        try {
            HttpResponse response = httpClient.execute(post);
            int code = response.getStatusLine().getStatusCode();
            if (code == 200) {
                log.info("请求成功" + code);
                result = EntityUtils.toString(response.getEntity(), "UTF-8");
            } else if (code == 204) {
                log.info("204无数据！");
            } else {
                log.info("请求失败" + code);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("2345返回参数" + JSONObject.parseObject(result));
        JSONObject jsonObject = JSONObject.parseObject(result).getJSONObject("data").getJSONArray("seat_detail_list").getJSONObject(0);
        String seat_name = jsonObject.getString("seat_name");
        Integer seat_id = jsonObject.getInteger("seat_id");
        JSONArray display_style = jsonObject.getJSONArray("display_style");
        adminAdxETwoSlotResponseDTO.setSeat_id(seat_id);
        adminAdxETwoSlotResponseDTO.setSeat_name(seat_name);
        adminAdxETwoSlotResponseDTO.setDisplay_style(display_style.toJavaList(DisplayStyle.class));
        return adminAdxETwoSlotResponseDTO;
    }

}
