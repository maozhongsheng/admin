package com.mk.ad.controller;


import com.mk.ad.service.IndexImportService;
import com.mk.ad.utils.DateSumUtils;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.IndexImportRequestDTO;
import com.mk.ad.vo.Response.IndexImportResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class IndexImportController {

    @Autowired
    private IndexImportService indexImportService;

    @ApiOperation(value = "导入excel")
    @RequestMapping(value = "/api/adminImport", method = RequestMethod.POST)
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
                Map map = new HashMap();
                //List<Map> mapList = new ArrayList<>();
                //mapList.add(map);
                for(int r = 0; r < 20; r++)
                    if (null != row.getCell(r)) {
                        row.getCell(r).setCellType(CellType.STRING);
                        if (r == 0) {
                            String time = row.getCell(r).getStringCellValue();
                            int timeI = Integer.valueOf(time);
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                            String dateString = "1900-01-01";
                            Date date1 = null;
                            try {
                                            date1 = format.parse(dateString);
                                 } catch (ParseException e) {
                                            e.printStackTrace();
                                 }
                            Date date2 = DateSumUtils.addDate(date1, timeI-2);
                            String dateStr = format.format(date2);
                            map.put(String.valueOf(r), dateStr);
                        } else if (r >= 1) {
                            map.put(String.valueOf(r), row.getCell(r).getStringCellValue());
                        }
                    } else {
                        map.put(String.valueOf(r), "");
                    }
//                List<IndexImport> list =  indexImportService.impot(map);
                indexImportService.impot(map);
//                if (null != list){
//                    return new ResponseResult(list);
//                }
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


    @ApiOperation(value = "导入报表查询")
    @RequestMapping(value = "/api/importDataList", method = RequestMethod.POST)
    public ResponseResult importDataList (@RequestBody IndexImportRequestDTO indexImportRequestDTO) {
        LarkPageInfoVo<IndexImportResponseDTO> list = indexImportService.importDataList(indexImportRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "数据同步修改状态")
    @RequestMapping(value = "/api/upImportStatus/{id}/{if_update}", method = RequestMethod.POST)
    public ResponseResult upImportStatus(@PathVariable("id") Long id ,@PathVariable("if_update") Integer if_update) throws Exception {
        Integer result =indexImportService.upImportStatus(id,if_update);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "导入报表删除")
    @RequestMapping(value = "/api/importDataRemove/{id}", method = RequestMethod.POST)
    public ResponseResult importRemove(@PathVariable("id") Long id) throws Exception {
        return new ResponseResult(indexImportService.importRemove(id));
    }

    @ApiOperation(value = "SSP更新数据查询")
    @RequestMapping(value = "/api/importSspList", method = RequestMethod.POST)
    public ResponseResult importSspList (@RequestBody IndexImportRequestDTO indexImportRequestDTO) {
        LarkPageInfoVo<IndexImportResponseDTO> list = indexImportService.importSspList(indexImportRequestDTO);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "下载模板")
    @RequestMapping(value = "/api/downLoadTemplate", method = RequestMethod.POST)
    public void downLoadTemplate (HttpServletResponse response) {
        indexImportService.downLoadTemplate(response);
    }
}
