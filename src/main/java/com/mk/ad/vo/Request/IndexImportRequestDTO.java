package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
public class IndexImportRequestDTO implements Serializable {

    /**  开始时间*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateStart;

    /**  结束时间*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date  dateEnd;

    /**  时间*/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private List<Date>  date;

    /**  公司名称*/
    private List<String> publish_id;

    /**  媒体id*/
    private List<String> media_id;

    /**  广告类型id*/
    private List<String> slot_type;

    /**  广告位id*/
    private List<String> pos_id;

    /**  广告位状态*/
    private Integer status;

    /**  SSP名称*/
    private Integer publish_id_group;
    /**  媒体*/
    private Integer media_group;
    /**  广告位*/
    private Integer slot_group;
    /**  广告位类型*/
    private Integer slot_type_group;

    /**  页码*/
    private Integer pageNum = 1;

    /**  每页条数*/
    private Integer pageSize = 10;
}
