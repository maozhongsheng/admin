package com.mk.ad.service.impl;


import com.mk.ad.mapper.*;
import com.mk.ad.service.DataAllService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.MkAdmin;
import com.mk.ad.vo.Request.AdminClientIndexDTO;
import com.mk.ad.vo.Request.DataAllRequestDTO;
import com.mk.ad.vo.Response.DataAllResponseDTO;
import com.mk.ad.vo.Response.MkDownLoadResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2022/06/20 13:22
 */
@Slf4j
@Service
@Repository
public class DataAllServiceImpl implements DataAllService {

    @Autowired
    private DataAllMapper dataAllMapper;

    @Autowired
    private AdminSspAccountMapper adminSspAccountMapper;

    @Autowired
    private SspMediaMapper sspMediaMapper;

    @Autowired
    private SspAdSlotMapper sspAdSlotMapper;

    @Autowired
    private DataSlotTypeMapper dataSlotTypeMapper;

    @Autowired
    private UpperReachesMapper upperReachesMapper;

    @Autowired
    private AdvertisingAllianceMapper advertisingAllianceMapper;





    @Override
    public DataAllResponseDTO selectDataAll(DataAllRequestDTO request) {
        DataAllResponseDTO dataAllResponseDTO = new DataAllResponseDTO();
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        DecimalFormat dff = new DecimalFormat("#,###,##0");
        //查询当天请求数
        String reqs = dataAllMapper.selectDataAllReq(request);
        //查询当天返回数
        String res = dataAllMapper.selectDataAllRes(request);
        //查询当天曝光
        String pv = dataAllMapper.selectDataAllPv(request);
        //查询当天点击
        String ck = dataAllMapper.selectDataAllCk(request);
        //计算填充率
        String resos = df.format(BigDecimal.valueOf(Integer.valueOf(res)).divide(BigDecimal.valueOf(Integer.valueOf(reqs))));
        //计算曝光率
        String pvos = df.format(BigDecimal.valueOf(Integer.valueOf(pv)).divide(BigDecimal.valueOf(Integer.valueOf(res))));
        //计算点击率
        String ckos = df.format(BigDecimal.valueOf(Integer.valueOf(ck)).divide(BigDecimal.valueOf(Integer.valueOf(pv))));

        dataAllResponseDTO.setPv(dff.format(BigDecimal.valueOf(Integer.valueOf(pv))));
        dataAllResponseDTO.setClick(dff.format(BigDecimal.valueOf(Integer.valueOf(ck))));
        dataAllResponseDTO.setReq(dff.format(BigDecimal.valueOf(Integer.valueOf(reqs))));
        dataAllResponseDTO.setFill(dff.format(BigDecimal.valueOf(Integer.valueOf(res))));
        dataAllResponseDTO.setFillOs(resos);
        dataAllResponseDTO.setAdEx(pvos);
        dataAllResponseDTO.setClickTr(ckos);

        return dataAllResponseDTO;
    }

    @Override
    public LarkPageInfoVo<MkDownLoadResponseDTO> selectReportDataAll(DataAllRequestDTO request) {
        List<MkDownLoadResponseDTO> list = new ArrayList<>();
        AdminClientIndexDTO adminClientIndexDTO = new AdminClientIndexDTO();
        Integer pageNum = (request.getPageNum()-1) * request.getPageSize();
        request.setPageNum(pageNum);
        //计算总数
        Integer count = null;
        if(request.getHour_group() == null){
            count = dataAllMapper.selectDataListCount(request);
        }else if(request.getHour_group() == 1){
            count = dataAllMapper.selectDataListCountHour(request);
        }
        //获取所有数据
        List<MkAdmin> cmp = dataAllMapper.getDataList(request);

        for (MkAdmin tzAdmin : cmp) {
            MkDownLoadResponseDTO tbr = new MkDownLoadResponseDTO();
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            DecimalFormat dff = new DecimalFormat("#,###,##0");
            tbr.setDate(tzAdmin.getDate());
            tbr.setDate_hour(tzAdmin.getDate_hour());//分时

            //获取账户名称
            String sspId = tzAdmin.getPublish_id();
            adminClientIndexDTO.setSsp_id(sspId);
            String ssp_name = adminSspAccountMapper.adminSelectSspCompanyName(adminClientIndexDTO);
            tbr.setSspName(ssp_name);//账户名称

            //获取媒体名称
            String mId = tzAdmin.getMedia_id();
            adminClientIndexDTO.setMedia_id(mId);
            String media_name = sspMediaMapper.adminSelectMediaName(adminClientIndexDTO);
            tbr.setMediaName(media_name);//媒体

            //获取广告位名称
            String sId = tzAdmin.getPos_id();
            adminClientIndexDTO.setSlot_id(sId);
            String slot_name = sspAdSlotMapper.adminSelectSlotName(adminClientIndexDTO);
            tbr.setSlotName(slot_name);//广告位

            //获取广告位类型名称
            String stypeId = tzAdmin.getSlot_type();
            adminClientIndexDTO.setSlot_type(stypeId);
            String slot_type_name = dataSlotTypeMapper.adminSelectSlotTypeName(adminClientIndexDTO);
            tbr.setSlotType(slot_type_name);//广告位类型

            //获取联盟名称
            String dspId = tzAdmin.getDsp_id();
            adminClientIndexDTO.setDsp_id(dspId);
            String dsp_name = upperReachesMapper.adminSelectUnionName(adminClientIndexDTO);
            tbr.setDspName(dsp_name);//联盟名称

            //获取联盟媒体名称
            String dspMediaId = tzAdmin.getDsp_media_id();
            adminClientIndexDTO.setDsp_media(dspMediaId);
            List<String> dsp_media = advertisingAllianceMapper.adminSelectUnionMediaName(adminClientIndexDTO);
            for (int j = 0; j < dsp_media.size(); j++){
                tbr.setDspMedia(dsp_media.get(j));//联盟媒体
            }

            //获取联盟广告位名称
            String dspSlotId = tzAdmin.getDsp_pos_id();
            adminClientIndexDTO.setDsp_slot(dspSlotId);
            List<String> dsp_slot = advertisingAllianceMapper.adminSelectUnionSlotName(adminClientIndexDTO);
            for (int j = 0; j < dsp_slot.size(); j++) {
                tbr.setDspSlot(dsp_slot.get(j));//联盟广告
            }

            String req = dff.format(tzAdmin.getReqs());
            tbr.setDownstream_req(req);//广告位请求量
            String fill = dff.format(tzAdmin.getFills());
            tbr.setDownstream_fill(fill);//广告位返回量


            String fillOs = df.format(tzAdmin.getFills().divide(tzAdmin.getReqs()));
            tbr.setDownstream_fillOs(fillOs);//广告位填充率
            String pv = dff.format(tzAdmin.getPvs());
            tbr.setPv(pv);//曝光量
            String adExs = df.format(tzAdmin.getPvs().divide(tzAdmin.getFills()));
            tbr.setDownstream_pv(adExs);//广告位曝光率
            String click = dff.format(tzAdmin.getCk());
            tbr.setClick(click);//点击量
            String ckTr = df.format(tzAdmin.getCk().divide(tzAdmin.getPvs()));
            tbr.setCkTr(ckTr);//点击率
            tbr.setDownstream_dspMedia_fillOs(fillOs);//媒体广告位填充率
            tbr.setDownstream_dsp_req("0");//媒体广告请求量
            tbr.setDownstream_dsp_fill("0");//媒体广告返回量
            tbr.setDownstream_dsp_fillOs("0");//媒体广告填充率
            tbr.setDownload_start(tzAdmin.getDownload_start());//下载开始
            tbr.setDownload_end(tzAdmin.getDownload_end());//下载结束
            tbr.setDeeplink(tzAdmin.getDeeplink());//唤醒成功
            tbr.setIdeeplink(tzAdmin.getIdeeplink());//唤醒失败
            tbr.setInstall_start(tzAdmin.getInstall_start());//开始安装
            tbr.setInstall_end(tzAdmin.getInstall_end());//安装成功
            list.add(tbr);
        }
        return new PageImpl<MkDownLoadResponseDTO>().pageZset(list, count, request.getPageSize(), request.getPageNum());
    }
}