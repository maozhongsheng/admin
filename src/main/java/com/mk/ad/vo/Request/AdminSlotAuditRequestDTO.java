package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdminSlotAuditRequestDTO implements Serializable {
    private Long id;

    private String sspName;

    private String mediaName;

    private String slotName;

    private Integer settlementBasisId;

    private Integer status;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
