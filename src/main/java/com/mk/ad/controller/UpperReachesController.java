package com.mk.ad.controller;


import com.mk.ad.service.SspFluxDispenseService;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.AdminUnionSlotRequestDTO;
import com.mk.ad.vo.Request.UpperReachesRequestDTO;
import com.mk.ad.vo.Request.UpperSlotRequestDTO;
import com.mk.ad.vo.Response.AdvertisingAllianceResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.vo.Response.UpperReachesResponseDTO;
import com.mk.ad.service.UpperReachesService;
import com.mk.ad.utils.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2021/7/28 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class UpperReachesController {

    @Autowired
    private UpperReachesService upperReachesService;

    @Autowired
    private SspFluxDispenseService sspFluxDispenseService;


    @ApiOperation(value = "admin上游列表页面查询")
    @RequestMapping(value = "/api/upperReachesList", method = RequestMethod.POST)
    public ResponseResult getUpperReachesList(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        LarkPageInfoVo<UpperReachesResponseDTO> list = upperReachesService.getUpperReachesList(upperReachesRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "admin上游根据id查询")
    @RequestMapping(value = "/api/upperReachesById", method = RequestMethod.POST)
    public ResponseResult upperReachesById(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        UpperReachesResponseDTO upperReachesResponseDTO = upperReachesService.upperReachesById(upperReachesRequestDTO);
        return new ResponseResult(upperReachesResponseDTO);
    }


    @ApiOperation(value = "admin添加上游")
    @RequestMapping(value = "/api/upperReachesAdd", method = RequestMethod.POST)
    public ResponseResult upperReachesAdd(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        Integer result =upperReachesService.upperReachesAdd(upperReachesRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "admin编辑上游")
    @RequestMapping(value = "/api/upperReachesEdit", method = RequestMethod.POST)
    public ResponseResult upperReachesEdit(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        Integer result =upperReachesService.upperReachesEdit(upperReachesRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "admin根据id删除上游")
    @RequestMapping(value = "/api/deleteupperReaches", method = RequestMethod.POST)
    public ResponseResult deleteupperReaches(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        Integer result =upperReachesService.deleteupperReaches(upperReachesRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
    @ApiOperation(value = "admin上游列表查询")
    @RequestMapping(value = "/api/upperList", method = RequestMethod.POST)
    public ResponseResult getUpperList(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        List list = upperReachesService.getUpperList(upperReachesRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "admin上游列表查询树")
    @RequestMapping(value = "/api/upperSlotTree", method = RequestMethod.POST)
    public ResponseResult getUpperSlotTree(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        List<Map> list = upperReachesService.getUpperSlotTree(upperReachesRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "admin对应广告联盟添加广告位")
    @RequestMapping(value = "/api/insertUpperSlot", method = RequestMethod.POST)
    public ResponseResult insertUpperSlot(@RequestBody UpperSlotRequestDTO upperSlotRequestDTO) throws Exception {
        Integer result = upperReachesService.insertUpperSlot(upperSlotRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }else if (result == 2){
            return new ResponseResult(ResponseStatus.SLOT_NAME_CHECK_ERROR);
        }
        return new ResponseResult();
    }@ApiOperation(value = "admin对应广告联盟编辑广告位")
    @RequestMapping(value = "/api/updateUpperSlot", method = RequestMethod.POST)
    public ResponseResult updateUpperSlot(@RequestBody UpperSlotRequestDTO upperSlotRequestDTO) throws Exception {
        Integer result = upperReachesService.updateUpperSlot(upperSlotRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "admin上游列表根据广告联盟id查询广告位")
    @RequestMapping(value = "/api/upperslotList", method = RequestMethod.POST)
    public ResponseResult getUpperSlotList(@RequestBody UpperReachesRequestDTO upperReachesRequestDTO) throws Exception {
        LarkPageInfoVo<AdvertisingAllianceResponseDTO> list = upperReachesService.getUpperSlotListByid(upperReachesRequestDTO);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "下载excel")
    @RequestMapping(value = "/api/downloadExcel", method = RequestMethod.POST)
    public ResponseResult downloadExcel(HttpServletResponse response) throws Exception {
        upperReachesService.download(response);
        return null;
    }
    @ApiOperation(value = "导入excel")
    @RequestMapping(value = "/api/import", method = RequestMethod.POST)
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult importWatchExcel(@RequestParam("excelFile") MultipartFile xlsFile) throws Exception {
        if (xlsFile.isEmpty()) {
            return new ResponseResult( "导入文件为空！");
        }
        Workbook wb = null;
        InputStream im = null;
        try {
            im = xlsFile.getInputStream();
            wb = WorkbookFactory.create(im);
            // 根据页面index 获取sheet页
            Sheet sheet = wb.getSheetAt(0);
            Row row = null;
            // 循环sheet页中数据从第x行开始,例:第3行开始为导入数据
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                // 获取每一行数据
                row = sheet.getRow(i);
           //     List list = new ArrayList();
                Map map = new HashMap();
                for(int r = 0; r < 10; r++){
                    if(null != row.getCell(r)){
                        row.getCell(r).setCellType(CellType.STRING);
                        map.put(String.valueOf(r),row.getCell(r).getStringCellValue());
                    }else{
                        map.put(String.valueOf(r),"");
                    }
                }
              upperReachesService.insertintom(map);
            }
        } catch (Exception e1) {
            // 回滚数据
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e1.printStackTrace();
        } finally {
            try {
                im.close();
                wb.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "根据联盟条件查询联盟广告位id")
    @RequestMapping(value = "/api/adminUnionSlotId", method = RequestMethod.POST)
    public List<String> adminUnionSlotId(@RequestBody AdminUnionSlotRequestDTO adminUnionSlotRequestDTO) throws Exception {
        List<String> adminUnionSlotId = upperReachesService.adminUnionSlotId(adminUnionSlotRequestDTO);
        return  adminUnionSlotId;
    }

    @ApiOperation(value = "根据联盟id查询联盟媒体id")
    @RequestMapping(value = "/api/adminIndexUnionMedia", method = RequestMethod.POST)
    public ResponseResult adminIndexUnionMedia(@RequestBody AdminUnionSlotRequestDTO adminUnionSlotRequestDTO) throws Exception {
        List list = upperReachesService.adminIndexUnionMedia(adminUnionSlotRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "根据联盟id查询联盟媒体id和联盟广告位id")
    @RequestMapping(value = "/api/adminIndexUnionSlot", method = RequestMethod.POST)
    public ResponseResult adminIndexUnionSlot(@RequestBody AdminUnionSlotRequestDTO adminUnionSlotRequestDTO) throws Exception {
        List list = upperReachesService.adminIndexUnionSlot(adminUnionSlotRequestDTO);
        return new ResponseResult(list);
    }


    @ApiOperation(value = "查询联盟和媒体和广告位")
    @RequestMapping(value = "/api/selectUnion", method = RequestMethod.POST)
    public ResponseResult selectUnion() throws Exception {
        List list = upperReachesService.selectUnion();
        return new ResponseResult(list);
    }
    @ApiOperation(value = "导入所有联盟数据进入redis")
    @RequestMapping(value = "/api/upperAlltoRedis", method = RequestMethod.POST)
    public ResponseResult upperAlltoRedis() throws Exception {
        Integer i = upperReachesService.upperAlltoRedis();
        sspFluxDispenseService.sspFluxtoRedis();
        return new ResponseResult(i);
    }
    @ApiOperation(value = "删除Redis中所有数据")
    @RequestMapping(value = "/api/deleteAlltoRedis", method = RequestMethod.POST)
    public ResponseResult deleteAlltoRedis() throws Exception {
        Integer i = upperReachesService.deleteAlltoRedis();
        return new ResponseResult(i);
    }


}