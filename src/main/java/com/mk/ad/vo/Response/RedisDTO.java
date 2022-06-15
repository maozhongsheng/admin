package com.mk.ad.vo.Response;


import lombok.Data;

import java.io.Serializable;

@Data
public class RedisDTO implements Serializable {

    private Long sspId;

    private String sspName;
}
