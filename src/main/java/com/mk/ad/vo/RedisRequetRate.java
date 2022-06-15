package com.mk.ad.vo;

import lombok.Data;

@Data
public class RedisRequetRate {
    private String directional_status;//开关状态
    private String dsp_slot_id;//联盟广告位id
    private String requet_rate;//流量百分比
}
