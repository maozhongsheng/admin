package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminSspAccountRequestDTO implements Serializable {

    private Integer id;//主键

    private String companyName;//公司名称

    private String companyAbbreviation;//公司名称

    private String sspId; //sspId

    private Integer status;//状态

    private Integer enableStatus; //启动状态

    private String userId;//用户id

    private Integer companyType;//公司类型

    private String licenseNumber;//营业执照注册号

    private String organizationCode;//组织机构代码

    private String shareholder;//股东姓名

    private String licenseImage;//营业执照图片

    private Integer dockingWay;//对接方式

    private String contacts;//联系人

    private String phone;//联系电话

    private String email;//邮箱

    private String password;//密码

    private String provinceId; //省id

    private String cityId;//市id

    private String areaId;//区id

    private String address;//地址

    private Integer settlementWay;//结算方式

//    private String profit;//利润

    private String payee;//收款方户名

    private String bankDeposit;//开户行

    private String bankAccount;//银行账户

    private String start;//开始时间

    private String end;//结束时间

    private String upper;//上游

    private String upstreamData;//上游数据

    private Integer pageSize = 10;//

    private Integer pageNum = 1;//

    private String refuse;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date due_date;

    private static final long serialVersionUID = 1L;
}
