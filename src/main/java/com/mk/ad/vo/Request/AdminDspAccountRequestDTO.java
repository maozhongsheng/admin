package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminDspAccountRequestDTO implements Serializable {
    private Long id;

    private String userId;

    private String companyName;

    private Integer companyType;

    private Integer status;

    private Integer industryType;

    private String licenseNumber;

    private String organizationCode;

    private String shareholder;

    private String licenseImage;

    private Integer dockingWay;

    private String contacts;//联系人

    private String phone;//联系电话

    private String email;//邮箱

    private String password;//密码

    private String address;//地址

    private Integer settlementWay;

    private String profit;

    private String payee;

    private String bankDeposit;

    private String bankAccount;

    private String account_name;

    private String bank_deposit;

    private String bank_account;

    private Date createTime;

    private Date updateTime;

    private Date lastTime;

    private Integer isDeleted;

    private Integer limit = 10;//

    private Integer page = 1;//

    private static final long serialVersionUID = 1L;
}
