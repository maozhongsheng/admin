package com.mk.ad.vo;

import java.io.Serializable;

public class AdminSlotAudit implements Serializable {
    private Long id;

    private String ssp_name;

    private String media_name;

    private String slot_name;

    private Integer settlement_basis_id;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSsp_name() {
        return ssp_name;
    }

    public void setSsp_name(String ssp_name) {
        this.ssp_name = ssp_name;
    }

    public String getMedia_name() {
        return media_name;
    }

    public void setMedia_name(String media_name) {
        this.media_name = media_name;
    }

    public String getSlot_name() {
        return slot_name;
    }

    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    public Integer getSettlement_basis_id() {
        return settlement_basis_id;
    }

    public void setSettlement_basis_id(Integer settlement_basis_id) {
        this.settlement_basis_id = settlement_basis_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ssp_name=").append(ssp_name);
        sb.append(", media_name=").append(media_name);
        sb.append(", slot_name=").append(slot_name);
        sb.append(", settlement_basis_id=").append(settlement_basis_id);
        sb.append(", status=").append(status);
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
        AdminSlotAudit other = (AdminSlotAudit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSsp_name() == null ? other.getSsp_name() == null : this.getSsp_name().equals(other.getSsp_name()))
            && (this.getMedia_name() == null ? other.getMedia_name() == null : this.getMedia_name().equals(other.getMedia_name()))
            && (this.getSlot_name() == null ? other.getSlot_name() == null : this.getSlot_name().equals(other.getSlot_name()))
            && (this.getSettlement_basis_id() == null ? other.getSettlement_basis_id() == null : this.getSettlement_basis_id().equals(other.getSettlement_basis_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSsp_name() == null) ? 0 : getSsp_name().hashCode());
        result = prime * result + ((getMedia_name() == null) ? 0 : getMedia_name().hashCode());
        result = prime * result + ((getSlot_name() == null) ? 0 : getSlot_name().hashCode());
        result = prime * result + ((getSettlement_basis_id() == null) ? 0 : getSettlement_basis_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}