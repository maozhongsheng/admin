package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

@Data
public class AdminAdxRequestDTO implements Serializable {
    private Long id;

    private Integer adxId;

    private String adxName;

    private Integer adxType;

    private String adxNameCompany;

    private String adxToken;

    private String adxKey;

    private String adxValue;

    private String adxTypeId;

    private Integer settlementId;

    private Date policyDate;

    private Integer rebateId;

    private String rebate;

    private String profit;

    private Integer settlementBasisId;

    private String payee;

    private String bankDeposit;

    private String bankAccount;

    private String chargeId;

    private File apiFile;

    private Integer status;

    private String start;

    private String slot_id;

    private String floor_price;

    private String bcat;

    private String update;

    private String end;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
