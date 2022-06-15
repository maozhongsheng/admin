package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UpperReachesRequestDTO implements Serializable {
    private Integer id;

    private String name;

    private String company_name;

    private String corporate_abbreviation;

    private String address;

    private String contacts;

    private String phone;

    private Integer settlement_cycle;

    private Integer accounting_period;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
