package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminSspUserResponseDTO implements Serializable {
    private String id;

    private String userName;

    private String email;

    private String createId;

    private Integer status;

    private String createName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastTime;


    private static final long serialVersionUID = 1L;
}
