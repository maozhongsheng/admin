package com.mk.ad.vo;

import java.io.Serializable;

public class AdminAdxTemplateMaterial implements Serializable {
    private Long id;

    private Integer mid;

    private String material_description;

    private String material_type;

    private String material_specification;

    private Integer material_size;

    private Integer material_time;

    private Integer material_time_max;

    private Integer photo_count;

    private Integer order_id;

    private Integer must_pass;

    private Integer delete_status;

    private static final long serialVersionUID = 1L;

    public Integer getMaterial_time_max() {
        return material_time_max;
    }

    public void setMaterial_time_max(Integer material_time_max) {
        this.material_time_max = material_time_max;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMaterial_description() {
        return material_description;
    }

    public void setMaterial_description(String material_description) {
        this.material_description = material_description;
    }

    public String getMaterial_type() {
        return material_type;
    }

    public void setMaterial_type(String material_type) {
        this.material_type = material_type;
    }

    public String getMaterial_specification() {
        return material_specification;
    }

    public void setMaterial_specification(String material_specification) {
        this.material_specification = material_specification;
    }

    public Integer getMaterial_size() {
        return material_size;
    }

    public void setMaterial_size(Integer material_size) {
        this.material_size = material_size;
    }

    public Integer getMaterial_time() {
        return material_time;
    }

    public void setMaterial_time(Integer material_time) {
        this.material_time = material_time;
    }

    public Integer getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(Integer photo_count) {
        this.photo_count = photo_count;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getMust_pass() {
        return must_pass;
    }

    public void setMust_pass(Integer must_pass) {
        this.must_pass = must_pass;
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
        sb.append(", mid=").append(mid);
        sb.append(", material_description=").append(material_description);
        sb.append(", material_type=").append(material_type);
        sb.append(", material_specification=").append(material_specification);
        sb.append(", material_size=").append(material_size);
        sb.append(", material_time=").append(material_time);
        sb.append(", material_time_max=").append(material_time_max);
        sb.append(", photo_count=").append(photo_count);
        sb.append(", order_id=").append(order_id);
        sb.append(", must_pass=").append(must_pass);
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
        AdminAdxTemplateMaterial other = (AdminAdxTemplateMaterial) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getMaterial_description() == null ? other.getMaterial_description() == null : this.getMaterial_description().equals(other.getMaterial_description()))
            && (this.getMaterial_type() == null ? other.getMaterial_type() == null : this.getMaterial_type().equals(other.getMaterial_type()))
            && (this.getMaterial_specification() == null ? other.getMaterial_specification() == null : this.getMaterial_specification().equals(other.getMaterial_specification()))
            && (this.getMaterial_size() == null ? other.getMaterial_size() == null : this.getMaterial_size().equals(other.getMaterial_size()))
            && (this.getMaterial_time() == null ? other.getMaterial_time() == null : this.getMaterial_time().equals(other.getMaterial_time()))
            && (this.getMaterial_time_max() == null ? other.getMaterial_time_max() == null : this.getMaterial_time_max().equals(other.getMaterial_time_max()))
            && (this.getPhoto_count() == null ? other.getPhoto_count() == null : this.getPhoto_count().equals(other.getPhoto_count()))
            && (this.getOrder_id() == null ? other.getOrder_id() == null : this.getOrder_id().equals(other.getOrder_id()))
            && (this.getMust_pass() == null ? other.getMust_pass() == null : this.getMust_pass().equals(other.getMust_pass()))
            && (this.getDelete_status() == null ? other.getDelete_status() == null : this.getDelete_status().equals(other.getDelete_status()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getMaterial_description() == null) ? 0 : getMaterial_description().hashCode());
        result = prime * result + ((getMaterial_type() == null) ? 0 : getMaterial_type().hashCode());
        result = prime * result + ((getMaterial_specification() == null) ? 0 : getMaterial_specification().hashCode());
        result = prime * result + ((getMaterial_size() == null) ? 0 : getMaterial_size().hashCode());
        result = prime * result + ((getMaterial_time() == null) ? 0 : getMaterial_time().hashCode());
        result = prime * result + ((getMaterial_time_max() == null) ? 0 : getMaterial_time_max().hashCode());
        result = prime * result + ((getPhoto_count() == null) ? 0 : getPhoto_count().hashCode());
        result = prime * result + ((getOrder_id() == null) ? 0 : getOrder_id().hashCode());
        result = prime * result + ((getMust_pass() == null) ? 0 : getMust_pass().hashCode());
        result = prime * result + ((getDelete_status() == null) ? 0 : getDelete_status().hashCode());
        return result;
    }
}