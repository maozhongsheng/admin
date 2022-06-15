package com.mk.ad.mapper;

import com.mk.ad.vo.IndexImport;
import com.mk.ad.vo.IndexImportExample;
import com.mk.ad.vo.Request.IndexImportRequestDTO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IndexImportMapper {
    long countByExample(IndexImportExample example);

    int deleteByExample(IndexImportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IndexImport record);

    int insertSelective(IndexImport record);

    List<IndexImport> selectByExample(IndexImportExample example);

    IndexImport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IndexImport record, @Param("example") IndexImportExample example);

    int updateByExample(@Param("record") IndexImport record, @Param("example") IndexImportExample example);

    int updateByPrimaryKeySelective(IndexImport record);

    int updateByPrimaryKey(IndexImport record);

    List<IndexImport> importDataList(IndexImportRequestDTO indexImportRequestDTO);

    Integer selectImportDataListCount(IndexImportRequestDTO indexImportRequestDTO);

    Integer upImportStatus(Long id, Integer if_update);

    int importDataRemove(List<Long> list);

    List<IndexImport> importSspList(IndexImportRequestDTO indexImportRequestDTO);

    List<IndexImport> selectIdByname(IndexImport indexImport);
}