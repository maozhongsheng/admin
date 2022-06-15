package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminSspAccountResponseDTO implements Serializable {
    private Long id;

    private Long sspId;

    private String sspType;

    private String companyName;

    private String companyAbbreviation;

    private Integer status;

    private Integer companyType;

    private Integer enableStatus;

    private String licenseNumber;

    private String organizationCode;

    private String shareholderName;

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

    private String creatTime;

    private String endTime;

    private String userId;

    private String bankAccount;

    private Integer shengId;

    private Integer shiId;

    private Integer quId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date due_date;

    private static final long serialVersionUID = 1L;
}
