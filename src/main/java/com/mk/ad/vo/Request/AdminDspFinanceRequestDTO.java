package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminDspFinanceRequestDTO implements Serializable {
    private String id;

    private String company_profile;

    private Integer customer_type;

    private Integer cash_type;

    private Integer deal_type;

    private Integer transfer_amount;

    private Integer return_balance;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
