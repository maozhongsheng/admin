package com.mk.ad.vo;

import lombok.Data;

@Data
public class RedisUpperSlot {
    private String dsp_id;//dsp联盟id
    private String app_id;//联盟Appid
    private String app_name;//联盟App名称
    private String bundle;//包名
    private String version;//App版本
    private String tag_id;//dsp联盟广告位id
    private String size;//联盟广告位宽高
    private String slot_type;//广告位类型
    private String os;//系统版本号
}
