package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

@Data
public class AdminSspMaterialRequestDTO implements Serializable {

    private Integer id;

    private Integer upper_id;

    private String upper_name;

    private Integer upper_slot_id;

    private Integer w;

    private Integer h;

    private String upper_slot_name;

    private String keywords;

    private Integer type;

    private String material;

    private Integer status;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
