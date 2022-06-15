package com.mk.ad.vo;

import java.io.Serializable;

public class BussinessTypeTwo implements Serializable {
    private Long id;

    private String category_name;

    private Integer type_id;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", category_name=").append(category_name);
        sb.append(", type_id=").append(type_id);
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
        BussinessTypeTwo other = (BussinessTypeTwo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCategory_name() == null ? other.getCategory_name() == null : this.getCategory_name().equals(other.getCategory_name()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategory_name() == null) ? 0 : getCategory_name().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        return result;
    }
}