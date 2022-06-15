package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdminSlotAuditResponseDTO implements Serializable {
    private Long id;

    private String sspName;

    private String mediaName;

    private String slotName;

    private Integer settlementBasisId;

    private Integer status;

    private static final long serialVersionUID = 1L;
}
