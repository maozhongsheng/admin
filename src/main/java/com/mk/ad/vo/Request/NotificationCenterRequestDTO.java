package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class NotificationCenterRequestDTO implements Serializable {
    private Integer id;

    private Integer type;

    private Integer top;

    private String notification_title;

    private String notice_text;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
