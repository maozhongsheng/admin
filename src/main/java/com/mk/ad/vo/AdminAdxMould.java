package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AdminAdxMould implements Serializable {
    private Integer id;

    private String template_id;

    private String template_name;

    private String template_type_name;

    private String template_type;

    private String template_description;

    private String template_photo;

    private Integer slot_type;

    private Integer adx_id;

    private Integer status;

    private String promotion_type;

    private Date create_time;

    private Integer delete_status;
    private List<AdminAdxTemplateMaterial> list;
    private static final long serialVersionUID = 1L;

    public List<AdminAdxTemplateMaterial> getList() {
        return list;
    }

    public void setList(List<AdminAdxTemplateMaterial> list) {
        this.list = list;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
    }

    public String getTemplate_type_name() {
        return template_type_name;
    }

    public void setTemplate_type_name(String template_type_name) {
        this.template_type_name = template_type_name;
    }

    public String getTemplate_type() {
        return template_type;
    }

    public void setTemplate_type(String template_type) {
        this.template_type = template_type;
    }

    public String getTemplate_description() {
        return template_description;
    }

    public void setTemplate_description(String template_description) {
        this.template_description = template_description;
    }

    public String getTemplate_photo() {
        return template_photo;
    }

    public void setTemplate_photo(String template_photo) {
        this.template_photo = template_photo;
    }

    public Integer getSlot_type() {
        return slot_type;
    }

    public void setSlot_type(Integer slot_type) {
        this.slot_type = slot_type;
    }

    public Integer getAdx_id() {
        return adx_id;
    }

    public void setAdx_id(Integer adx_id) {
        this.adx_id = adx_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPromotion_type() {
        return promotion_type;
    }

    public void setPromotion_type(String promotion_type) {
        this.promotion_type = promotion_type;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", template_id=").append(template_id);
        sb.append(", template_name=").append(template_name);
        sb.append(", template_type_name=").append(template_type_name);
        sb.append(", template_type=").append(template_type);
        sb.append(", template_description=").append(template_description);
        sb.append(", template_photo=").append(template_photo);
        sb.append(", slot_type=").append(slot_type);
        sb.append(", adx_id=").append(adx_id);
        sb.append(", status=").append(status);
        sb.append(", promotion_type=").append(promotion_type);
        sb.append(", create_time=").append(create_time);
        sb.append(", delete_status=").append(delete_status);
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
        AdminAdxMould other = (AdminAdxMould) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTemplate_id() == null ? other.getTemplate_id() == null : this.getTemplate_id().equals(other.getTemplate_id()))
            && (this.getTemplate_name() == null ? other.getTemplate_name() == null : this.getTemplate_name().equals(other.getTemplate_name()))
            && (this.getTemplate_type_name() == null ? other.getTemplate_type_name() == null : this.getTemplate_type_name().equals(other.getTemplate_type_name()))
            && (this.getTemplate_type() == null ? other.getTemplate_type() == null : this.getTemplate_type().equals(other.getTemplate_type()))
            && (this.getTemplate_description() == null ? other.getTemplate_description() == null : this.getTemplate_description().equals(other.getTemplate_description()))
            && (this.getTemplate_photo() == null ? other.getTemplate_photo() == null : this.getTemplate_photo().equals(other.getTemplate_photo()))
            && (this.getSlot_type() == null ? other.getSlot_type() == null : this.getSlot_type().equals(other.getSlot_type()))
            && (this.getAdx_id() == null ? other.getAdx_id() == null : this.getAdx_id().equals(other.getAdx_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPromotion_type() == null ? other.getPromotion_type() == null : this.getPromotion_type().equals(other.getPromotion_type()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getDelete_status() == null ? other.getDelete_status() == null : this.getDelete_status().equals(other.getDelete_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTemplate_id() == null) ? 0 : getTemplate_id().hashCode());
        result = prime * result + ((getTemplate_name() == null) ? 0 : getTemplate_name().hashCode());
        result = prime * result + ((getTemplate_type_name() == null) ? 0 : getTemplate_type_name().hashCode());
        result = prime * result + ((getTemplate_type() == null) ? 0 : getTemplate_type().hashCode());
        result = prime * result + ((getTemplate_description() == null) ? 0 : getTemplate_description().hashCode());
        result = prime * result + ((getTemplate_photo() == null) ? 0 : getTemplate_photo().hashCode());
        result = prime * result + ((getSlot_type() == null) ? 0 : getSlot_type().hashCode());
        result = prime * result + ((getAdx_id() == null) ? 0 : getAdx_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPromotion_type() == null) ? 0 : getPromotion_type().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getDelete_status() == null) ? 0 : getDelete_status().hashCode());
        return result;
    }
}