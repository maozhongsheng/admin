package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class NotificationCenterResponseDTO implements Serializable {
    private Integer id;

    private Integer status;

    private Integer type;

    private String notification_title;

    private String notice_text;

    private Integer top;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    private Integer is_delete;

    private static final long serialVersionUID = 1L;
}
