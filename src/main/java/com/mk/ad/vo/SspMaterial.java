package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class SspMaterial implements Serializable {
    private Integer id;

    private Integer upper_id;

    private String upper_name;

    private Integer upper_slot_id;

    private String upper_slot_name;

    private String keywords;

    private Integer type;

    private String material;

    private Integer status;

    private Integer material_w;

    private Integer material_h;

    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpper_id() {
        return upper_id;
    }

    public void setUpper_id(Integer upper_id) {
        this.upper_id = upper_id;
    }

    public String getUpper_name() {
        return upper_name;
    }

    public void setUpper_name(String upper_name) {
        this.upper_name = upper_name;
    }

    public Integer getUpper_slot_id() {
        return upper_slot_id;
    }

    public void setUpper_slot_id(Integer upper_slot_id) {
        this.upper_slot_id = upper_slot_id;
    }

    public String getUpper_slot_name() {
        return upper_slot_name;
    }

    public void setUpper_slot_name(String upper_slot_name) {
        this.upper_slot_name = upper_slot_name;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMaterial_w() {
        return material_w;
    }

    public void setMaterial_w(Integer material_w) {
        this.material_w = material_w;
    }

    public Integer getMaterial_h() {
        return material_h;
    }

    public void setMaterial_h(Integer material_h) {
        this.material_h = material_h;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", upper_id=").append(upper_id);
        sb.append(", upper_name=").append(upper_name);
        sb.append(", upper_slot_id=").append(upper_slot_id);
        sb.append(", upper_slot_name=").append(upper_slot_name);
        sb.append(", keywords=").append(keywords);
        sb.append(", type=").append(type);
        sb.append(", material=").append(material);
        sb.append(", status=").append(status);
        sb.append(", material_w=").append(material_w);
        sb.append(", material_h=").append(material_h);
        sb.append(", create_time=").append(create_time);
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
        SspMaterial other = (SspMaterial) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUpper_id() == null ? other.getUpper_id() == null : this.getUpper_id().equals(other.getUpper_id()))
            && (this.getUpper_name() == null ? other.getUpper_name() == null : this.getUpper_name().equals(other.getUpper_name()))
            && (this.getUpper_slot_id() == null ? other.getUpper_slot_id() == null : this.getUpper_slot_id().equals(other.getUpper_slot_id()))
            && (this.getUpper_slot_name() == null ? other.getUpper_slot_name() == null : this.getUpper_slot_name().equals(other.getUpper_slot_name()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMaterial() == null ? other.getMaterial() == null : this.getMaterial().equals(other.getMaterial()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMaterial_w() == null ? other.getMaterial_w() == null : this.getMaterial_w().equals(other.getMaterial_w()))
            && (this.getMaterial_h() == null ? other.getMaterial_h() == null : this.getMaterial_h().equals(other.getMaterial_h()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUpper_id() == null) ? 0 : getUpper_id().hashCode());
        result = prime * result + ((getUpper_name() == null) ? 0 : getUpper_name().hashCode());
        result = prime * result + ((getUpper_slot_id() == null) ? 0 : getUpper_slot_id().hashCode());
        result = prime * result + ((getUpper_slot_name() == null) ? 0 : getUpper_slot_name().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMaterial() == null) ? 0 : getMaterial().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMaterial_w() == null) ? 0 : getMaterial_w().hashCode());
        result = prime * result + ((getMaterial_h() == null) ? 0 : getMaterial_h().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}