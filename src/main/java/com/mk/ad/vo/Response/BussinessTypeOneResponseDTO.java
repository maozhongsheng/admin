package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class BussinessTypeOneResponseDTO implements Serializable {
    private Long id;

    private String typeName;

    private static final long serialVersionUID = 1L;
}
