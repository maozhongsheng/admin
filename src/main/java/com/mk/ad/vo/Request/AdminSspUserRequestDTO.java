package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminSspUserRequestDTO implements Serializable {

    private String id;//主键

    private Integer status;

    private String createId;

    private String name;

    private String phone;

    private String email;

    private String password;

    private Integer pageSize = 10;//

    private Integer pageNum = 1;//

    private static final long serialVersionUID = 1L;
}
