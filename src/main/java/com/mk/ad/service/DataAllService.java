package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.DataAllRequestDTO;
import com.mk.ad.vo.Response.DataAllResponseDTO;
import com.mk.ad.vo.Response.MkDownLoadResponseDTO;

/**
 * admin
 *
 * @author mzs
 * @version 1.0
 * @date 2022/06/20 13:22
 */
public interface DataAllService {

    DataAllResponseDTO selectDataAll(DataAllRequestDTO request);

    LarkPageInfoVo<MkDownLoadResponseDTO> selectReportDataAll(DataAllRequestDTO request);
}
