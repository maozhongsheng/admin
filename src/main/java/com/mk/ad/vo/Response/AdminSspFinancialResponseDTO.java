package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdminSspFinancialResponseDTO implements Serializable {

    private String payee;

    private String bankDeposit;

    private String bankAccount;

    private static final long serialVersionUID = 1L;
}
