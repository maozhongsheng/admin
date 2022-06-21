package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DataAllResponseDTO implements Serializable {
    /**  点击率*/
    private String clickTr;

    /**  广告位曝光率*/
    private String adEx;

    /**  广告位填充率*/
    private String fillOs;

    /**  广告位请求量*/
    private String req;

    /**  广告位返回量*/
    private String fill;

    /**  曝光量*/
    private String pv;

    /**  点击量*/
    private String click;



}
