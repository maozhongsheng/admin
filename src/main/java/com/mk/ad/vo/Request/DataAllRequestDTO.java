package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class DataAllRequestDTO implements Serializable {
    /**  开始时间*/
    private Date dateStart;

    /**  结束时间*/
    private Date  dateEnd;

    /**  ck广告位id*/
    private String pos_id;

    /**  媒体id*/
    private String media_id;

    /**  广告位id*/
    private String slot_id;

    /**  广告类型id*/
    private String slot_type;

    /**  公司名称*/
    private String company_name_id;


    /**  联盟广告位id*/
    private String dsp_pos_id;

    /**  联盟*/
    private String dsp_id;

    /**  联盟媒体*/
    private String dsp_media;

    /**  联盟广告位*/
    private String dsp_slot;


    /**  日期*/
    private Integer date_group;
    /**  日期（小时）*/
    private Integer hour_group;
    /**  SSP名称*/
    private Integer publish_id_group;
    /**  媒体*/
    private Integer media_group;
    /**  广告位*/
    private Integer slot_group;
    /**  广告位类型*/
    private Integer slot_type_group;
    /**  联盟*/
    private Integer dsp_name_group;
    /**  联盟媒体*/
    private Integer dsp_media_group;
    /**  联盟广告位*/
    private Integer dsp_slot_group;

    /**  页码*/
    private Integer pageNum = 1;

    /**  每页条数*/
    private Integer pageSize = 10;

}
