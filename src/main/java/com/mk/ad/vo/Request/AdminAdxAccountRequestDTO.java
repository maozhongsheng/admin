package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminAdxAccountRequestDTO implements Serializable {
    private Long id;

    private String companyName;

    private Integer state;

    private Integer companyType;

    private String licenseNumber;

    private String organizationCode;

    private String shareholderName;

    private String licenseImage;

    private Integer dockingId;

    private String contacts;

    private String contactNumber;

    private String email;

    private String password;

    private Integer addressId;

    private Date creationTime;

    private Date lastTime;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
