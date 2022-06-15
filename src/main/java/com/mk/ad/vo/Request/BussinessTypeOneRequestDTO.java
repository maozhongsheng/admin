package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class BussinessTypeOneRequestDTO implements Serializable {
    private Long id;

    private String typeName;

    private static final long serialVersionUID = 1L;
}
