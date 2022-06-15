package com.mk.ad.vo.Response.Adx;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AdminAdxETwoResponseDTO implements Serializable {
    private int	 seat_id;

    private String seat_name;

    private float floor_price;

    private List bcat;

    private List media_plat;

    private String update;

    private String desc;

    private static final long serialVersionUID = 1L;
}
