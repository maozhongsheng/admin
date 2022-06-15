package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class AdminAdxMouldRequestDTO implements Serializable {
    private String id;

    private String template_id;

    private String template_name;

    private List template_type;

    private String template_description;

    private String template_photo;

    private Integer slot_type;

    private Integer adx_id;

    private String adx_name;

    private Integer status;

    private String promotion_type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    private Integer delete_status;

    private Integer limit = 10;

    private Integer page = 1;

    private File image;

    private static final long serialVersionUID = 1L;
}
