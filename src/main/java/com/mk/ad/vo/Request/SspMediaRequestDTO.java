package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SspMediaRequestDTO implements Serializable {
    private Long id;

    /**  SspId数组*/
    private List<String> s_id;

    private Integer platform_type;

    private Integer store_id;

    private String detail_url;

    private String media_name;

    private Integer media_type_id;

    private Integer media_category_id;

    private String keywords;

    private String media_desc;

    private String package_name;

    private Integer relation_type;

    private String register_certificate;

    private String mandate_certificate;

    private Integer cooperation_status;

    private String web_domain;

    private String web_record;

    private Integer media_examine_status;

    private String record_url;

    private Date create_time;

    private Date update_time;

    private Integer is_deleted;

    private Long ssp_id;

    private String ssp_name;

    private String refuse;

    private Integer settlement_type;

    private String divide;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
