package com.mk.ad.vo;

import lombok.Data;

import java.util.List;

@Data
public class ETwoAddBidRequest {
    private String token;
    private int dspid;
    private int page;
    private int size;
    private List seat_id_list;
}
