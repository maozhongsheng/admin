package com.mk.ad.service;

import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.IndexImportRequestDTO;
import com.mk.ad.vo.Response.IndexImportResponseDTO;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface IndexImportService {
    void impot(Map map);

    LarkPageInfoVo<IndexImportResponseDTO> importDataList(IndexImportRequestDTO indexImportRequestDTO);

    Integer upImportStatus(Long id, Integer if_update);

    LarkPageInfoVo<IndexImportResponseDTO> importSspList(IndexImportRequestDTO indexImportRequestDTO);

    void downLoadTemplate(HttpServletResponse response);

    int importRemove(Long id);
}
