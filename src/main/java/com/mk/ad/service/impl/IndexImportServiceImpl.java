package com.mk.ad.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.mk.ad.mapper.IndexImportMapper;
import com.mk.ad.service.IndexImportService;
import com.mk.ad.utils.ExcelExport1;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.RedisUtil;
import com.mk.ad.vo.IndexImport;
import com.mk.ad.vo.Request.IndexImportRequestDTO;
import com.mk.ad.vo.Response.IndexImportResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.TemplateResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


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
public class IndexImportServiceImpl implements IndexImportService {

    @Autowired
    private IndexImportMapper indexImportMapper;

    @Resource
    private RedisUtil redisUtil;

    @Override
    public void impot(Map map) {
        IndexImport indexImport = new IndexImport();
            String time1 = map.get("0").toString();
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = null;
            try {
                date1 = format.parse(time1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            indexImport.setDate(date1);
            indexImport.setPublish_id(map.get("1").toString());
            indexImport.setMedia_id(map.get("2").toString());
            indexImport.setSlot_type(map.get("3").toString());
            indexImport.setPos_id(map.get("4").toString());
            indexImport.setIf_update(0);
            indexImport.setCost(Float.valueOf(map.get("5").toString()));
            indexImport.setPv(Integer.valueOf(map.get("6").toString()));
            indexImport.setClick(Integer.valueOf(map.get("7").toString()));
            indexImport.setClick_rate(Float.valueOf(map.get("8").toString()));
            indexImport.setEcpm(Float.valueOf(map.get("9").toString()));
            indexImport.setEcpc(Float.valueOf(map.get("10").toString()).floatValue());
            indexImport.setIs_deleted(1);
            indexImportMapper.insertSelective(indexImport);
    }

    @Override
    public LarkPageInfoVo<IndexImportResponseDTO> importDataList(IndexImportRequestDTO indexImportRequestDTO) {
        List<IndexImportResponseDTO> list = new ArrayList<>();
        Integer pageNum = (indexImportRequestDTO.getPageNum()-1) * indexImportRequestDTO.getPageSize();
        indexImportRequestDTO.setPageNum(pageNum);
        PageHelper.startPage(indexImportRequestDTO.getPageNum(),indexImportRequestDTO.getPageSize());
        List<IndexImport> cmp = null;
        try {
            cmp = indexImportMapper.importDataList(indexImportRequestDTO);// drunk, fix later
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer count = indexImportMapper.selectImportDataListCount(indexImportRequestDTO);
        for (IndexImport indexImport : cmp) {
            IndexImportResponseDTO dto = new IndexImportResponseDTO();
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            DecimalFormat dff = new DecimalFormat("#,###,##0");

            dto.setId(indexImport.getId());//id
            dto.setDate(indexImport.getDate());//??????

            //??????????????????
            if(null != indexImport.getPublish_id()){
                Object o = redisUtil.get(indexImport.getPublish_id()+"0Ssp");//???redis?????????????????????
                HashMap hashMap = JSONObject.parseObject(o.toString().replace("=", ":"), HashMap.class);
                String sspName = hashMap.get("SspName").toString();
                dto.setSspName(sspName);//??????id
            }

            //??????????????????
            if(null != indexImport.getMedia_id()) {
                Object o = redisUtil.get(indexImport.getMedia_id()+"0SspMedia");//???redis?????????????????????
                HashMap hashMap = JSONObject.parseObject(o.toString().replace("=", ":"), HashMap.class);
                String SspMediaName = hashMap.get("SspMediaName").toString();
                dto.setMediaName(SspMediaName);//??????
            }

            //?????????????????????
            if(null != indexImport.getPos_id()) {
                Object o = redisUtil.get(indexImport.getPos_id()+"0SspAdSlot");//???redis????????????????????????
                HashMap hashMap = JSONObject.parseObject(o.toString().replace("=", ":"), HashMap.class);
                String SspAdSlotName = hashMap.get("SspAdSlotName").toString();
                dto.setSlotName(SspAdSlotName);//?????????
            }

            //???????????????????????????
            if(null != indexImport.getSlot_type()) {
                Object o = redisUtil.get(indexImport.getSlot_type()+"0SlotType");//???redis????????????????????????
                HashMap hashMap = JSONObject.parseObject(o.toString().replace("=", ":"), HashMap.class);
                String SspSlotTypeName = hashMap.get("SspSlotTypeName").toString();
                dto.setSlotType(SspSlotTypeName);//???????????????
            }

            dto.setStatus(indexImport.getIf_update());//??????

            String num = df.format(indexImport.getCost());
            dto.setNums(num);//?????????

            String pv = dff.format(indexImport.getPv());
            dto.setPv(pv);//??????

            String click = dff.format(indexImport.getClick());
            dto.setClick(click);//??????

            String clickTr = df.format(indexImport.getClick_rate());
            dto.setCkTr(clickTr);//?????????

            String eCpm = df.format(indexImport.getEcpm());
            dto.setECpm(eCpm);//eCpm

            String cpc = df.format(indexImport.getEcpc());
            dto.setCpc(cpc);//cpc

            list.add(dto);
        }

        return new PageImpl<IndexImportResponseDTO>().pageZset(list, (int) count, indexImportRequestDTO.getPageSize(), indexImportRequestDTO.getPageNum());
    }

    @Override
    public Integer upImportStatus(Long id, Integer if_update) {
        return indexImportMapper.upImportStatus(id,if_update);
    }

    @Override
    public int importRemove(Long id) {
        return indexImportMapper.deleteByPrimaryKey(id);
    }

    @Override
    public LarkPageInfoVo<IndexImportResponseDTO> importSspList(IndexImportRequestDTO indexImportRequestDTO) {
        List<IndexImportResponseDTO> list = new ArrayList<>();
        Integer pageNum = (indexImportRequestDTO.getPageNum()-1) * indexImportRequestDTO.getPageSize();
        indexImportRequestDTO.setPageNum(pageNum);
        PageHelper.startPage(indexImportRequestDTO.getPageNum(),indexImportRequestDTO.getPageSize());
        List<IndexImport> cmp = null;
        try {
            cmp = indexImportMapper.importSspList(indexImportRequestDTO);// drunk, fix later
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer count = indexImportMapper.selectImportDataListCount(indexImportRequestDTO);
        for (IndexImport indexImport : cmp) {
            IndexImportResponseDTO dto = new IndexImportResponseDTO();
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            DecimalFormat dff = new DecimalFormat("#,###,##0");

            dto.setDate(indexImport.getDate());//??????

            //??????????????????
            if(null != indexImport.getMedia_id()) {
                Object o = redisUtil.get(indexImport.getMedia_id()+"0SspMedia");//???redis?????????????????????
                HashMap hashMap = JSONObject.parseObject(o.toString().replace("=", ":"), HashMap.class);
                String SspMediaName = hashMap.get("SspMediaName").toString();
                dto.setMediaName(SspMediaName);//??????
            }

            //?????????????????????
            if(null != indexImport.getPos_id()) {
                Object o = redisUtil.get(indexImport.getPos_id()+"0SspAdSlot");//???redis????????????????????????
                HashMap hashMap = JSONObject.parseObject(o.toString().replace("=", ":"), HashMap.class);
                String SspAdSlotName = hashMap.get("SspAdSlotName").toString();
                dto.setSlotName(SspAdSlotName);//?????????
            }

            //???????????????????????????
            if(null != indexImport.getSlot_type()) {
                Object o = redisUtil.get(indexImport.getSlot_type()+"0SlotType");//???redis????????????????????????
                HashMap hashMap = JSONObject.parseObject(o.toString().replace("=", ":"), HashMap.class);
                String SspSlotTypeName = hashMap.get("SspSlotTypeName").toString();
                dto.setSlotType(SspSlotTypeName);//???????????????
            }

            dto.setStatus(indexImport.getIf_update());//??????

            String num = df.format(indexImport.getCost());
            dto.setNums(num);//?????????

            String pv = dff.format(indexImport.getPv());
            dto.setPv(pv);//??????

            String click = dff.format(indexImport.getClick());
            dto.setClick(click);//??????

            String clickTr = df.format(indexImport.getClick_rate());
            dto.setCkTr(clickTr);//?????????

            String eCpm = df.format(indexImport.getEcpm());
            dto.setECpm(eCpm);//eCpm

            String cpc = df.format(indexImport.getEcpc());
            dto.setCpc(cpc);//cpc

            list.add(dto);
        }
        return new PageImpl<IndexImportResponseDTO>().pageZset(list, (int) count, indexImportRequestDTO.getPageSize(), indexImportRequestDTO.getPageNum());
    }

    @Override
    public void downLoadTemplate(HttpServletResponse response) {
        List<TemplateResponseDTO> list = new ArrayList<>();
        TemplateResponseDTO dto = new TemplateResponseDTO();
            dto.setDate(null);//??????
            dto.setSspName(null);//??????id
            dto.setMediaName(null);//??????
            dto.setSlotName(null);//?????????
            dto.setSlotType(null);//???????????????
            dto.setNums(null);//?????????
            dto.setPv(null);//??????
            dto.setClick(null);//??????
            dto.setCkTr(null);//?????????
            dto.setECpm(null);//eCpm
            dto.setCpc(null);//cpc
        list.add(dto);

        //????????????
        String [] arr  = new String[]{"??????","??????id","??????id","???????????????id","?????????id","??????","?????????","?????????","?????????","ECPM","ECPC"};
        ExcelExport1.export(response,list,arr);
    }


}
