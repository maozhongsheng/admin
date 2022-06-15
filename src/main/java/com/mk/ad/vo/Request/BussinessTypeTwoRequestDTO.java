package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class BussinessTypeTwoRequestDTO implements Serializable {
    private Long id;

    private String categoryName;

    private Integer typeId;

    private static final long serialVersionUID = 1L;
}
