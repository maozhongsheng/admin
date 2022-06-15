package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AdminSlot implements Serializable {
    private List ids;

    public List getIds() {
        return ids;
    }

    public void setIds(List ids) {
        this.ids = ids;
    }

    private Long id;

    private Integer adx_id;

    private String media_name;

    private Integer media_industry_one;

    private Integer media_industry_two;

    private String media_id;

    private Integer platform_id;

    private Integer operation_id;

    private Integer slot_id;

    private String slot_name;

    private String slot_class;

    private Integer slot_type;

    private String extension_id;

    private String creative_id;

    private String creative_template;

    private Integer settlement_id;

    private Integer settlement_unit_price;

    private Date date_start;

    private Date date_end;

    private Integer status;

    private Integer is_deleted;

    private String e_two_desc;

    private String e_two_size;

    private String e_two_file_size;

    private String e_two_suffix;

    private String e_two_creat_time;

    private String e_two_bcat;

    private static final long serialVersionUID = 1L;

    public String getE_two_creat_time() {
        return e_two_creat_time;
    }

    public void setE_two_creat_time(String e_two_creat_time) {
        this.e_two_creat_time = e_two_creat_time;
    }

    public String getE_two_bcat() {
        return e_two_bcat;
    }

    public void setE_two_bcat(String e_two_bcat) {
        this.e_two_bcat = e_two_bcat;
    }

    public String getE_two_desc() {
        return e_two_desc;
    }

    public void setE_two_desc(String e_two_desc) {
        this.e_two_desc = e_two_desc;
    }

    public String getE_two_size() {
        return e_two_size;
    }

    public void setE_two_size(String e_two_size) {
        this.e_two_size = e_two_size;
    }

    public String getE_two_file_size() {
        return e_two_file_size;
    }

    public void setE_two_file_size(String e_two_file_size) {
        this.e_two_file_size = e_two_file_size;
    }

    public String getE_two_suffix() {
        return e_two_suffix;
    }

    public void setE_two_suffix(String e_two_suffix) {
        this.e_two_suffix = e_two_suffix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAdx_id() {
        return adx_id;
    }

    public void setAdx_id(Integer adx_id) {
        this.adx_id = adx_id;
    }

    public String getMedia_name() {
        return media_name;
    }

    public void setMedia_name(String media_name) {
        this.media_name = media_name;
    }

    public Integer getMedia_industry_one() {
        return media_industry_one;
    }

    public void setMedia_industry_one(Integer media_industry_one) {
        this.media_industry_one = media_industry_one;
    }

    public Integer getMedia_industry_two() {
        return media_industry_two;
    }

    public void setMedia_industry_two(Integer media_industry_two) {
        this.media_industry_two = media_industry_two;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public Integer getPlatform_id() {
        return platform_id;
    }

    public void setPlatform_id(Integer platform_id) {
        this.platform_id = platform_id;
    }

    public Integer getOperation_id() {
        return operation_id;
    }

    public void setOperation_id(Integer operation_id) {
        this.operation_id = operation_id;
    }

    public Integer getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(Integer slot_id) {
        this.slot_id = slot_id;
    }

    public String getSlot_name() {
        return slot_name;
    }

    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    public String getSlot_class() {
        return slot_class;
    }

    public void setSlot_class(String slot_class) {
        this.slot_class = slot_class;
    }

    public Integer getSlot_type() {
        return slot_type;
    }

    public void setSlot_type(Integer slot_type) {
        this.slot_type = slot_type;
    }

    public String getExtension_id() {
        return extension_id;
    }

    public void setExtension_id(String extension_id) {
        this.extension_id = extension_id;
    }

    public String getCreative_id() {
        return creative_id;
    }

    public void setCreative_id(String creative_id) {
        this.creative_id = creative_id;
    }

    public String getCreative_template() {
        return creative_template;
    }

    public void setCreative_template(String creative_template) {
        this.creative_template = creative_template;
    }

    public Integer getSettlement_id() {
        return settlement_id;
    }

    public void setSettlement_id(Integer settlement_id) {
        this.settlement_id = settlement_id;
    }

    public Integer getSettlement_unit_price() {
        return settlement_unit_price;
    }

    public void setSettlement_unit_price(Integer settlement_unit_price) {
        this.settlement_unit_price = settlement_unit_price;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adx_id=").append(adx_id);
        sb.append(", media_name=").append(media_name);
        sb.append(", media_industry_one=").append(media_industry_one);
        sb.append(", media_industry_two=").append(media_industry_two);
        sb.append(", media_id=").append(media_id);
        sb.append(", platform_id=").append(platform_id);
        sb.append(", operation_id=").append(operation_id);
        sb.append(", slot_id=").append(slot_id);
        sb.append(", slot_name=").append(slot_name);
        sb.append(", slot_class=").append(slot_class);
        sb.append(", slot_type=").append(slot_type);
        sb.append(", extension_id=").append(extension_id);
        sb.append(", creative_id=").append(creative_id);
        sb.append(", creative_template=").append(creative_template);
        sb.append(", settlement_id=").append(settlement_id);
        sb.append(", settlement_unit_price=").append(settlement_unit_price);
        sb.append(", date_start=").append(date_start);
        sb.append(", date_end=").append(date_end);
        sb.append(", status=").append(status);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", e_two_desc=").append(e_two_desc);
        sb.append(", e_two_size=").append(e_two_size);
        sb.append(", e_two_file_size=").append(e_two_file_size);
        sb.append(", e_two_suffix=").append(e_two_suffix);
        sb.append(", e_two_creat_time=").append(e_two_creat_time);
        sb.append(", e_two_bcat=").append(e_two_bcat);
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
        AdminSlot other = (AdminSlot) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdx_id() == null ? other.getAdx_id() == null : this.getAdx_id().equals(other.getAdx_id()))
            && (this.getMedia_name() == null ? other.getMedia_name() == null : this.getMedia_name().equals(other.getMedia_name()))
            && (this.getMedia_industry_one() == null ? other.getMedia_industry_one() == null : this.getMedia_industry_one().equals(other.getMedia_industry_one()))
            && (this.getMedia_industry_two() == null ? other.getMedia_industry_two() == null : this.getMedia_industry_two().equals(other.getMedia_industry_two()))
            && (this.getMedia_id() == null ? other.getMedia_id() == null : this.getMedia_id().equals(other.getMedia_id()))
            && (this.getPlatform_id() == null ? other.getPlatform_id() == null : this.getPlatform_id().equals(other.getPlatform_id()))
            && (this.getOperation_id() == null ? other.getOperation_id() == null : this.getOperation_id().equals(other.getOperation_id()))
            && (this.getSlot_id() == null ? other.getSlot_id() == null : this.getSlot_id().equals(other.getSlot_id()))
            && (this.getSlot_name() == null ? other.getSlot_name() == null : this.getSlot_name().equals(other.getSlot_name()))
            && (this.getSlot_class() == null ? other.getSlot_class() == null : this.getSlot_class().equals(other.getSlot_class()))
            && (this.getSlot_type() == null ? other.getSlot_type() == null : this.getSlot_type().equals(other.getSlot_type()))
            && (this.getExtension_id() == null ? other.getExtension_id() == null : this.getExtension_id().equals(other.getExtension_id()))
            && (this.getCreative_id() == null ? other.getCreative_id() == null : this.getCreative_id().equals(other.getCreative_id()))
            && (this.getCreative_template() == null ? other.getCreative_template() == null : this.getCreative_template().equals(other.getCreative_template()))
            && (this.getSettlement_id() == null ? other.getSettlement_id() == null : this.getSettlement_id().equals(other.getSettlement_id()))
            && (this.getSettlement_unit_price() == null ? other.getSettlement_unit_price() == null : this.getSettlement_unit_price().equals(other.getSettlement_unit_price()))
            && (this.getDate_start() == null ? other.getDate_start() == null : this.getDate_start().equals(other.getDate_start()))
            && (this.getDate_end() == null ? other.getDate_end() == null : this.getDate_end().equals(other.getDate_end()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()))
            && (this.getE_two_desc() == null ? other.getE_two_desc() == null : this.getE_two_desc().equals(other.getE_two_desc()))
            && (this.getE_two_size() == null ? other.getE_two_size() == null : this.getE_two_size().equals(other.getE_two_size()))
            && (this.getE_two_file_size() == null ? other.getE_two_file_size() == null : this.getE_two_file_size().equals(other.getE_two_file_size()))
            && (this.getE_two_suffix() == null ? other.getE_two_suffix() == null : this.getE_two_suffix().equals(other.getE_two_suffix()))
            && (this.getE_two_creat_time() == null ? other.getE_two_creat_time() == null : this.getE_two_creat_time().equals(other.getE_two_creat_time()))
            && (this.getE_two_bcat() == null ? other.getE_two_bcat() == null : this.getE_two_bcat().equals(other.getE_two_bcat()));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdx_id() == null) ? 0 : getAdx_id().hashCode());
        result = prime * result + ((getMedia_name() == null) ? 0 : getMedia_name().hashCode());
        result = prime * result + ((getMedia_industry_one() == null) ? 0 : getMedia_industry_one().hashCode());
        result = prime * result + ((getMedia_industry_two() == null) ? 0 : getMedia_industry_two().hashCode());
        result = prime * result + ((getMedia_id() == null) ? 0 : getMedia_id().hashCode());
        result = prime * result + ((getPlatform_id() == null) ? 0 : getPlatform_id().hashCode());
        result = prime * result + ((getOperation_id() == null) ? 0 : getOperation_id().hashCode());
        result = prime * result + ((getSlot_id() == null) ? 0 : getSlot_id().hashCode());
        result = prime * result + ((getSlot_name() == null) ? 0 : getSlot_name().hashCode());
        result = prime * result + ((getSlot_class() == null) ? 0 : getSlot_class().hashCode());
        result = prime * result + ((getSlot_type() == null) ? 0 : getSlot_type().hashCode());
        result = prime * result + ((getExtension_id() == null) ? 0 : getExtension_id().hashCode());
        result = prime * result + ((getCreative_id() == null) ? 0 : getCreative_id().hashCode());
        result = prime * result + ((getCreative_template() == null) ? 0 : getCreative_template().hashCode());
        result = prime * result + ((getSettlement_id() == null) ? 0 : getSettlement_id().hashCode());
        result = prime * result + ((getSettlement_unit_price() == null) ? 0 : getSettlement_unit_price().hashCode());
        result = prime * result + ((getDate_start() == null) ? 0 : getDate_start().hashCode());
        result = prime * result + ((getDate_end() == null) ? 0 : getDate_end().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getE_two_desc() == null) ? 0 : getE_two_desc().hashCode());
        result = prime * result + ((getE_two_size() == null) ? 0 : getE_two_size().hashCode());
        result = prime * result + ((getE_two_file_size() == null) ? 0 : getE_two_file_size().hashCode());
        result = prime * result + ((getE_two_suffix() == null) ? 0 : getE_two_suffix().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        result = prime * result + ((getE_two_creat_time() == null) ? 0 : getE_two_creat_time().hashCode());
        result = prime * result + ((getE_two_bcat() == null) ? 0 : getE_two_bcat().hashCode());
        return result;
    }
}