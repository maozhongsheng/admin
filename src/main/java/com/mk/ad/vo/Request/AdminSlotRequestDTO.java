package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminSlotRequestDTO implements Serializable {
    private Long id;

    private Integer adx_id;

    private String media_name;

    private Integer media_industry_one;

    private Integer media_industry_two;

    private String media_id;

    private Integer platform_id;

    private Integer operation_id;

    private Integer slot_id;

    private String slot_name;

    private String slot_class;

    private Integer slot_type;

    private String slot_type_name;

    private String extension_id;

    private String creative_id;

    private String creative_template;

    private Integer settlement_id;

    private Integer settlement_unit_price;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date_start;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date_end;

    private Integer status;

    private Integer is_deleted;

    private Long upper_id;

    private String upper_slot;

    private String upper_ecpm;

    private String downstream_ecpm;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
