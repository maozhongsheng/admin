package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;


@Data
public class AdminAdPlanResponseDTO implements Serializable {
    private Long id;

    private String creative_template;

    private static final long serialVersionUID = 1L;
}