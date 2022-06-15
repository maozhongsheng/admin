package com.mk.ad.vo.Response;

import com.mk.ad.vo.Request.SlotMake;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 流量分发返回参数
 */
@Data
public class SspFluxDispenseResponseDTO implements Serializable {
    private Integer id;//主键-广告位id

    private String slotName;//广告位名称

    private Integer render_type;//结算类型

    private Integer mediaId;//媒体id

    private String mediaName;//所属媒体

    private String alliance_id;//广告联盟id

    private String alliance_slot_id;//广告联盟广告位id

    private BigDecimal cp_price;//价格

    private Integer formal_status;//是否开启正式

    private String lowest_status;//打底状态

    private String timeout;//

    private List<SlotMake> slotmake;

    private String request_rate;//请求比例

    private String directional_status;//请求比例

    private Integer cooperation_type;//合作类型_0-cpc，1-cpm

    private static final long serialVersionUID = 1L;
}
