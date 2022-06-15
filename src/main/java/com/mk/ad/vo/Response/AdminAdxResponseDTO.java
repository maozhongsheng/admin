package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.ad.vo.AdminSlot;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class AdminAdxResponseDTO implements Serializable {
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

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date policyDate;

    private Integer rebateId;

    private String rebate;

    private String profit;

    private Integer settlementBasisId;

    private String payee;

    private String bankDeposit;

    private String bankAccount;

    private String chargeId;

    private String apiFile;

    private Integer status;

    private List<AdminSlot> list;

    private static final long serialVersionUID = 1L;
}
