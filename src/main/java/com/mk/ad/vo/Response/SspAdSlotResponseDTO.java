package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SspAdSlotResponseDTO implements Serializable {
    private Long id;

    private Integer media_id;

    private String bussiness_type_one;

    private Integer slot_type_id;

    private Integer ad_template_id;

    private String slot_name;

    private Integer slot_status;

    private Integer business_status;

    private Integer cooperation_type;

    private Integer render_type;

    private Integer ad_pull_mode;

    private BigDecimal cp_price;

    private String requet_rate;

    private Integer slot_examine_status;

    private Date create_time;

    private Date update_time;

    private Integer is_deleted;

    private String ad_type_received;

    private Long ssp_id;

    private String ssp_name;

    private String ssp_media_name;

    private static final long serialVersionUID = 1L;
}
