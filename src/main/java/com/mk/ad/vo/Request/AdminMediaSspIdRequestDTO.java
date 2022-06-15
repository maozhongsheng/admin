package com.mk.ad.vo.Request;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AdminMediaSspIdRequestDTO implements Serializable {

    /**  公司名称*/
    private List<String> company_name_id;


}
