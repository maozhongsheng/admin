package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UpperReachesResponseDTO implements Serializable {
    private Integer id;

    private String company_name;

    private String address;

    private String contacts;

    private String phone;

    private String settlement_cycle;

    private Integer settlement_cycle_id;

    private String accounting_period;

    private Integer accounting_period_id;

    private String corporate_abbreviation;

    private Integer media_number;

    private Integer slot_number;

    private static final long serialVersionUID = 1L;
}
