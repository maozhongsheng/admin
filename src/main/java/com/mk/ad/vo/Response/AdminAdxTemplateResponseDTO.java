package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminAdxTemplateResponseDTO implements Serializable {

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

    private static final long serialVersionUID = 1L;
}
