package com.mk.ad.vo;

import java.io.Serializable;

public class DataSlotType implements Serializable {
    private Long id;

    private String slot_type_name;

    private Integer slot_type_id;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlot_type_name() {
        return slot_type_name;
    }

    public void setSlot_type_name(String slot_type_name) {
        this.slot_type_name = slot_type_name;
    }

    public Integer getSlot_type_id() {
        return slot_type_id;
    }

    public void setSlot_type_id(Integer slot_type_id) {
        this.slot_type_id = slot_type_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", slot_type_name=").append(slot_type_name);
        sb.append(", slot_type_id=").append(slot_type_id);
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
        DataSlotType other = (DataSlotType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSlot_type_name() == null ? other.getSlot_type_name() == null : this.getSlot_type_name().equals(other.getSlot_type_name()))
            && (this.getSlot_type_id() == null ? other.getSlot_type_id() == null : this.getSlot_type_id().equals(other.getSlot_type_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSlot_type_name() == null) ? 0 : getSlot_type_name().hashCode());
        result = prime * result + ((getSlot_type_id() == null) ? 0 : getSlot_type_id().hashCode());
        return result;
    }
}