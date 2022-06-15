package com.mk.ad.vo.Response.Adx;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AdminAdxETwoSlotResponseDTO implements Serializable {
    private String seat_name;
    private int seat_id;
    private List<DisplayStyle> display_style;

    private static final long serialVersionUID = 1L;
}
