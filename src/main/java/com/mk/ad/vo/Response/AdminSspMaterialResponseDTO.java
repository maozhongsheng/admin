package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdminSspMaterialResponseDTO implements Serializable {

    private Integer id;

    private Integer upper_id;

    private String upper_name;

    private Integer upper_slot_id;

    private String upper_slot_name;

    private String keywords;

    private String material;

    private Integer type;

    private Integer status;

    private Integer w;

    private Integer h;

    private String create_time;

    private static final long serialVersionUID = 1L;
}
