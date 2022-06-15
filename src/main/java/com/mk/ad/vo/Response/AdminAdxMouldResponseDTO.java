package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminAdxMouldResponseDTO implements Serializable {

    private Integer id;

    private String template_id;

    private String template_name;

    private String template_type_name;

    private String template_type;

    private String template_description;

    private String template_photo;

    private Integer slot_type;

    private String slot_name;

    private Integer adx_id;

    private String adx_name;

    private Integer status;

    private String promotion_type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    private Integer delete_status;

    private static final long serialVersionUID = 1L;
}
