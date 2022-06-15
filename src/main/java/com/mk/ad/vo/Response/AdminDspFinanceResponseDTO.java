package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AdminDspFinanceResponseDTO implements Serializable {
    private Integer id;

    private String corporate_name;

    private String company_profile;

    private String user_id;

    private String user_name;

    private Integer deal_type;

    private String account_name;

    private String account_show;

    private String bank_deposit;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    private String bank_account;

    private Integer customer_type;//客户类型(1:代理;2:直客;3:OEM;4:子客户;5:二级代理商)

    private String total_recharge;

    private String refund_amount;

    private String total_consume;

    private String money;

    private String return_balance;

    private String total_balance;


    private static final long serialVersionUID = 1L;
}
