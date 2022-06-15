package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AdminClientIndexDTO implements Serializable {

    /**  媒体id*/
    private String media_id;

    /**  广告位id*/
    private String slot_id;

    /**  广告位类型*/
    private String slot_type;

    /**  ssp公司id*/
    private String ssp_id;

    /**  联盟id*/
    private String dsp_id;

    /**  联盟媒体*/
    private String dsp_media;

    /**  联盟广告位*/
    private String dsp_slot;

}
