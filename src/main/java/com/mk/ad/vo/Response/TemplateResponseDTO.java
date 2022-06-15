package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Data
public class TemplateResponseDTO implements Serializable {


    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;

    /**  SSP名称*/
    private String sspName;

    /**  媒体名称*/
    private String mediaName;

    /**  广告位类型*/
    private String slotType;

    /**  广告位名称*/
    private String slotName;

    /**  预估收入*/
    private String nums;

    /**  曝光量*/
    private String pv;

    /**  点击量*/
    private String click;

    /**  点击率*/
    private String ckTr;

    /**  eCpm*/
    private String eCpm;

    /**  cpc*/
    private String cpc;
}
