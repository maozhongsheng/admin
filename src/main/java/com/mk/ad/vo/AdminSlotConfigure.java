package com.mk.ad.vo;

import java.io.Serializable;

public class AdminSlotConfigure implements Serializable {
    /**  主键*/
    private Long id;

    /**  广告位id*/
    private Integer slot_id;

    /**  一级行业类型*/
    private Integer bussiness_type_id;

    /**  单价*/
    private Integer cp_price;

    private Integer cooperation_type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(Integer slot_id) {
        this.slot_id = slot_id;
    }

    public Integer getBussiness_type_id() {
        return bussiness_type_id;
    }

    public void setBussiness_type_id(Integer bussiness_type_id) {
        this.bussiness_type_id = bussiness_type_id;
    }

    public Integer getCp_price() {
        return cp_price;
    }

    public void setCp_price(Integer cp_price) {
        this.cp_price = cp_price;
    }

    public Integer getCooperation_type() {
        return cooperation_type;
    }

    public void setCooperation_type(Integer cooperation_type) {
        this.cooperation_type = cooperation_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", slot_id=").append(slot_id);
        sb.append(", bussiness_type_id=").append(bussiness_type_id);
        sb.append(", cp_price=").append(cp_price);
        sb.append(", cooperation_type=").append(cooperation_type);
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
        AdminSlotConfigure other = (AdminSlotConfigure) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSlot_id() == null ? other.getSlot_id() == null : this.getSlot_id().equals(other.getSlot_id()))
            && (this.getBussiness_type_id() == null ? other.getBussiness_type_id() == null : this.getBussiness_type_id().equals(other.getBussiness_type_id()))
            && (this.getCp_price() == null ? other.getCp_price() == null : this.getCp_price().equals(other.getCp_price()))
            && (this.getCooperation_type() == null ? other.getCooperation_type() == null : this.getCooperation_type().equals(other.getCooperation_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSlot_id() == null) ? 0 : getSlot_id().hashCode());
        result = prime * result + ((getBussiness_type_id() == null) ? 0 : getBussiness_type_id().hashCode());
        result = prime * result + ((getCp_price() == null) ? 0 : getCp_price().hashCode());
        result = prime * result + ((getCooperation_type() == null) ? 0 : getCooperation_type().hashCode());
        return result;
    }
}