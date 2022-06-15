package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminAdxTemplateRequestDTO implements Serializable {
    private Long id;

    private Integer mid;

    private String material_description;

    private String material_type;

    private String material_specification;

    private Integer material_size;

    private Integer material_time;

    private Integer photo_count;

    private Integer order_id;

    private Integer must_pass;

    private Integer delete_status;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
