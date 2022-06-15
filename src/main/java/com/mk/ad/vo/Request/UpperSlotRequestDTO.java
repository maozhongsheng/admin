package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpperSlotRequestDTO implements Serializable {
    private Integer id;

    private Integer upper_id;

    private String app_name;

    private String app_id;

    private String ad_slot_type;

    private String advert_name;

    private String os_type;

    private String app_bundle;

    private String size;

    private String advert_id;

    private String app_version;

    private static final long serialVersionUID = 1L;
}
