package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 流量分发返回参数
 */
@Data
public class SspFluxFlowResponseDTO implements Serializable {
    private Long id;//主键-广告位id

    private String slotName;//广告位名称

    private Integer cooperation_type;//结算类型

    private Integer mediaId;//媒体id

    private String mediaName;//所属媒体

    private Integer formal_status;

    private String directional_status;

    private BigDecimal cp_price;//千次展示价格/千次点击的价格

    private Integer number;//联盟个数

    private static final long serialVersionUID = 1L;
}
