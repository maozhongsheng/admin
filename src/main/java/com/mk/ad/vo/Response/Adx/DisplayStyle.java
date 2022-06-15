package com.mk.ad.vo.Response.Adx;

import lombok.Data;

import java.util.List;

@Data
public class DisplayStyle {
    private int display_id;
    private String style_name;
    private String show_style;
    private String platform;
    private String memo;
    private int file_count;
    private List<SizeList> size_list;
}
