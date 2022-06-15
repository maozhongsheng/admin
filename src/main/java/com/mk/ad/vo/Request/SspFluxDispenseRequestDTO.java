package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 流量分发接受参数
 */
@Data
public class SspFluxDispenseRequestDTO implements Serializable {
    private String id;//广告位主键

    private String mediaName;//媒体名称

    private long mediaId;//媒体id

    private String slotId;//广告位id

    private String media_id;//广告位id

    private String slotName;//广告位名称

    private List bussiness_type_one;//行业类型一级名称

    private List request_rate;//请求比例

    private Integer cooperation_type;//合作类型_0-cpc，1-cpm

    private BigDecimal cp_price;//千次展示价格/千次点击的价格

    private Integer formal_status;

    private String directional_status;

    private String lowest_status;
    private String timeout;

    private String alliance_id;

    private String alliance_slot_id;

    private List<SlotMake> slotmake;

    private Integer pageSize = 10;//每页数量

    private Integer pageNum = 1;//页码

    private static final long serialVersionUID = 1L;
}
