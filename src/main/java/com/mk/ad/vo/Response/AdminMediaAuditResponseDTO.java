package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminMediaAuditResponseDTO implements Serializable {
    private Long id;

    private Integer sspId;

    private String sspName;

    private String mediaName;

    private String registerCertificate;

    private String mandateCertificate;

    private Integer status;

    private static final long serialVersionUID = 1L;
}
