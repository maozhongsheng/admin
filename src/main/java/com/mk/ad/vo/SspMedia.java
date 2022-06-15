package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class SspMedia implements Serializable {
    private Long id;

    private Integer platform_type;

    private Integer store_id;

    private String detail_url;

    private String media_name;

    private Integer media_type_id;

    private Integer media_category_id;

    private String keywords;

    private String media_desc;

    private String package_name;

    private Integer relation_type;

    private String register_certificate;

    private String mandate_certificate;

    private Integer cooperation_status;

    private String web_domain;

    private String web_record;

    private Integer media_examine_status;

    private String record_url;

    private Date create_time;

    private Date update_time;

    private Integer is_deleted;

    private Long ssp_id;

    private String user_id;

    private String sha_data;

    private Date start_date;

    private Date end_date;

    private String ua_examples;

    private String refuse;

    private Integer account;

    private Integer settlement_type;

    private String divide;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlatform_type() {
        return platform_type;
    }

    public void setPlatform_type(Integer platform_type) {
        this.platform_type = platform_type;
    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }

    public String getMedia_name() {
        return media_name;
    }

    public void setMedia_name(String media_name) {
        this.media_name = media_name;
    }

    public Integer getMedia_type_id() {
        return media_type_id;
    }

    public void setMedia_type_id(Integer media_type_id) {
        this.media_type_id = media_type_id;
    }

    public Integer getMedia_category_id() {
        return media_category_id;
    }

    public void setMedia_category_id(Integer media_category_id) {
        this.media_category_id = media_category_id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMedia_desc() {
        return media_desc;
    }

    public void setMedia_desc(String media_desc) {
        this.media_desc = media_desc;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public Integer getRelation_type() {
        return relation_type;
    }

    public void setRelation_type(Integer relation_type) {
        this.relation_type = relation_type;
    }

    public String getRegister_certificate() {
        return register_certificate;
    }

    public void setRegister_certificate(String register_certificate) {
        this.register_certificate = register_certificate;
    }

    public String getMandate_certificate() {
        return mandate_certificate;
    }

    public void setMandate_certificate(String mandate_certificate) {
        this.mandate_certificate = mandate_certificate;
    }

    public Integer getCooperation_status() {
        return cooperation_status;
    }

    public void setCooperation_status(Integer cooperation_status) {
        this.cooperation_status = cooperation_status;
    }

    public String getWeb_domain() {
        return web_domain;
    }

    public void setWeb_domain(String web_domain) {
        this.web_domain = web_domain;
    }

    public String getWeb_record() {
        return web_record;
    }

    public void setWeb_record(String web_record) {
        this.web_record = web_record;
    }

    public Integer getMedia_examine_status() {
        return media_examine_status;
    }

    public void setMedia_examine_status(Integer media_examine_status) {
        this.media_examine_status = media_examine_status;
    }

    public String getRecord_url() {
        return record_url;
    }

    public void setRecord_url(String record_url) {
        this.record_url = record_url;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Long getSsp_id() {
        return ssp_id;
    }

    public void setSsp_id(Long ssp_id) {
        this.ssp_id = ssp_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSha_data() {
        return sha_data;
    }

    public void setSha_data(String sha_data) {
        this.sha_data = sha_data;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getUa_examples() {
        return ua_examples;
    }

    public void setUa_examples(String ua_examples) {
        this.ua_examples = ua_examples;
    }

    public String getRefuse() {
        return refuse;
    }

    public void setRefuse(String refuse) {
        this.refuse = refuse;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getSettlement_type() {
        return settlement_type;
    }

    public void setSettlement_type(Integer settlement_type) {
        this.settlement_type = settlement_type;
    }

    public String getDivide() {
        return divide;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", platform_type=").append(platform_type);
        sb.append(", store_id=").append(store_id);
        sb.append(", detail_url=").append(detail_url);
        sb.append(", media_name=").append(media_name);
        sb.append(", media_type_id=").append(media_type_id);
        sb.append(", media_category_id=").append(media_category_id);
        sb.append(", keywords=").append(keywords);
        sb.append(", media_desc=").append(media_desc);
        sb.append(", package_name=").append(package_name);
        sb.append(", relation_type=").append(relation_type);
        sb.append(", register_certificate=").append(register_certificate);
        sb.append(", mandate_certificate=").append(mandate_certificate);
        sb.append(", cooperation_status=").append(cooperation_status);
        sb.append(", web_domain=").append(web_domain);
        sb.append(", web_record=").append(web_record);
        sb.append(", media_examine_status=").append(media_examine_status);
        sb.append(", record_url=").append(record_url);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", ssp_id=").append(ssp_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", sha_data=").append(sha_data);
        sb.append(", start_date=").append(start_date);
        sb.append(", end_date=").append(end_date);
        sb.append(", ua_examples=").append(ua_examples);
        sb.append(", refuse=").append(refuse);
        sb.append(", account=").append(account);
        sb.append(", settlement_type=").append(settlement_type);
        sb.append(", divide=").append(divide);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SspMedia other = (SspMedia) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlatform_type() == null ? other.getPlatform_type() == null : this.getPlatform_type().equals(other.getPlatform_type()))
            && (this.getStore_id() == null ? other.getStore_id() == null : this.getStore_id().equals(other.getStore_id()))
            && (this.getDetail_url() == null ? other.getDetail_url() == null : this.getDetail_url().equals(other.getDetail_url()))
            && (this.getMedia_name() == null ? other.getMedia_name() == null : this.getMedia_name().equals(other.getMedia_name()))
            && (this.getMedia_type_id() == null ? other.getMedia_type_id() == null : this.getMedia_type_id().equals(other.getMedia_type_id()))
            && (this.getMedia_category_id() == null ? other.getMedia_category_id() == null : this.getMedia_category_id().equals(other.getMedia_category_id()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getMedia_desc() == null ? other.getMedia_desc() == null : this.getMedia_desc().equals(other.getMedia_desc()))
            && (this.getPackage_name() == null ? other.getPackage_name() == null : this.getPackage_name().equals(other.getPackage_name()))
            && (this.getRelation_type() == null ? other.getRelation_type() == null : this.getRelation_type().equals(other.getRelation_type()))
            && (this.getRegister_certificate() == null ? other.getRegister_certificate() == null : this.getRegister_certificate().equals(other.getRegister_certificate()))
            && (this.getMandate_certificate() == null ? other.getMandate_certificate() == null : this.getMandate_certificate().equals(other.getMandate_certificate()))
            && (this.getCooperation_status() == null ? other.getCooperation_status() == null : this.getCooperation_status().equals(other.getCooperation_status()))
            && (this.getWeb_domain() == null ? other.getWeb_domain() == null : this.getWeb_domain().equals(other.getWeb_domain()))
            && (this.getWeb_record() == null ? other.getWeb_record() == null : this.getWeb_record().equals(other.getWeb_record()))
            && (this.getMedia_examine_status() == null ? other.getMedia_examine_status() == null : this.getMedia_examine_status().equals(other.getMedia_examine_status()))
            && (this.getRecord_url() == null ? other.getRecord_url() == null : this.getRecord_url().equals(other.getRecord_url()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()))
            && (this.getSsp_id() == null ? other.getSsp_id() == null : this.getSsp_id().equals(other.getSsp_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getSha_data() == null ? other.getSha_data() == null : this.getSha_data().equals(other.getSha_data()))
            && (this.getStart_date() == null ? other.getStart_date() == null : this.getStart_date().equals(other.getStart_date()))
            && (this.getEnd_date() == null ? other.getEnd_date() == null : this.getEnd_date().equals(other.getEnd_date()))
            && (this.getUa_examples() == null ? other.getUa_examples() == null : this.getUa_examples().equals(other.getUa_examples()))
            && (this.getRefuse() == null ? other.getRefuse() == null : this.getRefuse().equals(other.getRefuse()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getSettlement_type() == null ? other.getSettlement_type() == null : this.getSettlement_type().equals(other.getSettlement_type()))
            && (this.getDivide() == null ? other.getDivide() == null : this.getDivide().equals(other.getDivide()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlatform_type() == null) ? 0 : getPlatform_type().hashCode());
        result = prime * result + ((getStore_id() == null) ? 0 : getStore_id().hashCode());
        result = prime * result + ((getDetail_url() == null) ? 0 : getDetail_url().hashCode());
        result = prime * result + ((getMedia_name() == null) ? 0 : getMedia_name().hashCode());
        result = prime * result + ((getMedia_type_id() == null) ? 0 : getMedia_type_id().hashCode());
        result = prime * result + ((getMedia_category_id() == null) ? 0 : getMedia_category_id().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getMedia_desc() == null) ? 0 : getMedia_desc().hashCode());
        result = prime * result + ((getPackage_name() == null) ? 0 : getPackage_name().hashCode());
        result = prime * result + ((getRelation_type() == null) ? 0 : getRelation_type().hashCode());
        result = prime * result + ((getRegister_certificate() == null) ? 0 : getRegister_certificate().hashCode());
        result = prime * result + ((getMandate_certificate() == null) ? 0 : getMandate_certificate().hashCode());
        result = prime * result + ((getCooperation_status() == null) ? 0 : getCooperation_status().hashCode());
        result = prime * result + ((getWeb_domain() == null) ? 0 : getWeb_domain().hashCode());
        result = prime * result + ((getWeb_record() == null) ? 0 : getWeb_record().hashCode());
        result = prime * result + ((getMedia_examine_status() == null) ? 0 : getMedia_examine_status().hashCode());
        result = prime * result + ((getRecord_url() == null) ? 0 : getRecord_url().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        result = prime * result + ((getSsp_id() == null) ? 0 : getSsp_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getSha_data() == null) ? 0 : getSha_data().hashCode());
        result = prime * result + ((getStart_date() == null) ? 0 : getStart_date().hashCode());
        result = prime * result + ((getEnd_date() == null) ? 0 : getEnd_date().hashCode());
        result = prime * result + ((getUa_examples() == null) ? 0 : getUa_examples().hashCode());
        result = prime * result + ((getRefuse() == null) ? 0 : getRefuse().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getSettlement_type() == null) ? 0 : getSettlement_type().hashCode());
        result = prime * result + ((getDivide() == null) ? 0 : getDivide().hashCode());
        return result;
    }
}