package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminDspAccountResponseDTO implements Serializable {
    private Long id;

    private String userId;

    private String companyName;

    private Integer status;

    private Integer industryType;

    private String licenseNumber;

    private String organizationCode;

    private String shareholder;

    private String licenseImage;

    private Integer dockingWay;

    private String contacts;

    private String phone;

    private String email;

    private String password;

    private String address;

    private Integer settlementWay;

    private String profit;

    private String payee;

    private String bankDeposit;

    private String bankAccount;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    private String createT;

    private String endTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updateTime;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lastTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}
