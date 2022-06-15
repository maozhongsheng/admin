package com.mk.ad.controller;


import com.mk.ad.utils.CosUtils;
import com.mk.ad.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2021/3/22 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class FillUploadController {

    @ApiOperation(value = "admin测试cos提交")
    @RequestMapping(value = "api/adxUpload", method = RequestMethod.POST)
    public ResponseResult cos(@RequestParam("file") MultipartFile file , String type) throws Exception {
        if (file.isEmpty()) {
            throw new IOException("上传文件不能为空");
        }
        //上传文件
        CosUtils client = new CosUtils();
        String url = client.uploadFile(file,type);

        return new ResponseResult(url);
    }



}