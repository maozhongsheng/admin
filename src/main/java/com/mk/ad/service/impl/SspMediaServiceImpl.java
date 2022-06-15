package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.AdminMediaAuditMapper;
import com.mk.ad.mapper.AdminSspAccountMapper;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.mapper.SysUserMapper;
import com.mk.ad.service.SspMediaService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.AdminSspAccount;
import com.mk.ad.vo.Request.SspMediaRequestDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.SspMediaResponseDTO;
import com.mk.ad.vo.SspMedia;
import com.mk.ad.vo.SspMediaExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * admin
 *
 * @author gj
 * @version 1.0
 * @date 2021/3/22 13:22
 */
@Slf4j
@Service
@Repository
public class SspMediaServiceImpl implements SspMediaService {

    @Autowired
    AdminMediaAuditMapper adminMediaAuditMapper;
    @Autowired
    SspMediaMapper sspMediaMapper;
    @Autowired
    AdminSspAccountMapper adminSspAccountMapper;
    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public Integer updateMediaStatus(Map params) {

        Integer resutl =  sspMediaMapper.updateMediaStatus(params);

        return resutl;

    }

    @Override
    public SspMediaResponseDTO getMediatInfo(Long id) {
        SspMedia sspMedia = sspMediaMapper.selectByPrimaryKey(id);
        SspMediaResponseDTO smr = new SspMediaResponseDTO();
        smr.setId(sspMedia.getId());
        smr.setPlatform_type(sspMedia.getPlatform_type());
        smr.setStore_id(sspMedia.getStore_id());
        smr.setDetail_url(sspMedia.getDetail_url());
        smr.setMedia_name(sspMedia.getMedia_name());
        smr.setMedia_type_id(sspMedia.getMedia_type_id());
        smr.setMedia_category_id(sspMedia.getMedia_category_id());
        smr.setKeywords(sspMedia.getKeywords());
        smr.setMedia_desc(sspMedia.getMedia_desc());
        smr.setPackage_name(sspMedia.getPackage_name());
        smr.setRelation_type(sspMedia.getRelation_type());
        smr.setRegister_certificate(sspMedia.getRegister_certificate());
        smr.setMandate_certificate(sspMedia.getMandate_certificate());
        smr.setCooperation_status(sspMedia.getCooperation_status());
        smr.setWeb_domain(sspMedia.getWeb_domain());
        smr.setWeb_record(sspMedia.getWeb_record());
        smr.setMedia_examine_status(sspMedia.getMedia_examine_status());
        smr.setRecord_url(sspMedia.getRecord_url());
        smr.setIs_deleted(sspMedia.getIs_deleted());
        smr.setUser_id(sspMedia.getUser_id());
        smr.setSha_data(sspMedia.getSha_data());
        smr.setStart_date(sspMedia.getStart_date());
        smr.setEnd_date(sspMedia.getEnd_date());
        smr.setUa_examples(sspMedia.getUa_examples());
        smr.setRefuse(sspMedia.getRefuse());
        AdminSspAccount adminSspAccount = adminSspAccountMapper.selectAccount(id);
        smr.setAccount_id(adminSspAccount.getId());
        smr.setAccount_name(adminSspAccount.getCompany_name());
        return smr;
    }

    @Override
    public LarkPageInfoVo<SspMediaResponseDTO> getMediaList(SspMediaRequestDTO sspMediaRequestDTO) {
        SspMediaExample example = new SspMediaExample();
        SspMediaExample.Criteria criteria = example.createCriteria();



        sspMediaRequestDTO.setS_id(sspMediaMapper.mediaSspId(sspMediaRequestDTO));
        if(sspMediaRequestDTO.getS_id() == null){
            sspMediaRequestDTO.setS_id(null);
        }else if(sspMediaRequestDTO.getS_id().size()==0){
            sspMediaRequestDTO.setS_id(null);
        }else if(sspMediaRequestDTO.getS_id() != null){
            criteria.andUser_idIn(sspMediaRequestDTO.getS_id());
        }

        //媒体审核媒体名称-模糊查询
        if(StringUtils.isNotBlank(sspMediaRequestDTO.getMedia_name())){
            criteria.andMedia_nameLike("%"+sspMediaRequestDTO.getMedia_name()+"%");
        }

        if(null != sspMediaRequestDTO.getMedia_examine_status()){
            criteria.andMedia_examine_statusEqualTo(sspMediaRequestDTO.getMedia_examine_status());//状态
        }

//        if(StringUtils.isNotBlank(sspMediaRequestDTO.getSspName())){
//            criteria.andSsp_nameLike(sspMediaRequestDTO.getSspName());
//        }
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(sspMediaRequestDTO.getPage(),sspMediaRequestDTO.getLimit());
        List<SspMedia> sspMediaList = sspMediaMapper.selectByExample(example);
        PageInfo<SspMedia> pageInfo = new PageInfo<>(sspMediaList);
        List<SspMediaResponseDTO> list = sspMediaList.stream().map(msg ->{
            SspMediaResponseDTO event = new SspMediaResponseDTO();
            Map result = sspMediaMapper.selectssp(msg.getUser_id());
            if(null!=result){
                event.setSsp_id(Long.valueOf(result.get("sspId").toString()));
                event.setSsp_name(result.get("sspName").toString());
            }else{
              event.setSsp_id(Long.valueOf(1));
              event.setSsp_name("超级管理员");
            }
            event.setId(msg.getId());
            event.setRegister_certificate(msg.getRegister_certificate());
            event.setMandate_certificate(msg.getMandate_certificate());
            event.setMedia_name(msg.getMedia_name());
            event.setMedia_examine_status(msg.getMedia_examine_status());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<SspMediaResponseDTO>().pageZset(list, (int) pageInfo.getTotal(),sspMediaRequestDTO.getLimit(), sspMediaRequestDTO.getPage());
    }
}
