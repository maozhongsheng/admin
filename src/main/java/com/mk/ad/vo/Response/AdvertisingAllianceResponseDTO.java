package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdvertisingAllianceResponseDTO implements Serializable {
    private Integer id;

    private String advert_name;

    private String advert_id;

    private String size;

    private String os_type;

    private String app_id;

    private String app_name;

    private String ad_slot_type;

    private String app_bundle;

    private String app_version;

    private static final long serialVersionUID = 1L;
}
