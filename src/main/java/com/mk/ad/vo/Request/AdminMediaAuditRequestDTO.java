package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdminMediaAuditRequestDTO implements Serializable {
    private Long id;

    private Integer sspId;

    private String sspName;

    private String mediaName;

    private String registerCertificate;

    private String mandateCertificate;

    private Integer status;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
