package com.mk.ad.vo;

import java.io.Serializable;

public class AdminMediaAudit implements Serializable {
    private Long id;

    private Integer ssp_id;

    private String ssp_name;

    private String media_name;

    private String register_certificate;

    private String mandate_certificate;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSsp_id() {
        return ssp_id;
    }

    public void setSsp_id(Integer ssp_id) {
        this.ssp_id = ssp_id;
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
        sb.append(", ssp_id=").append(ssp_id);
        sb.append(", ssp_name=").append(ssp_name);
        sb.append(", media_name=").append(media_name);
        sb.append(", register_certificate=").append(register_certificate);
        sb.append(", mandate_certificate=").append(mandate_certificate);
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
        AdminMediaAudit other = (AdminMediaAudit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSsp_id() == null ? other.getSsp_id() == null : this.getSsp_id().equals(other.getSsp_id()))
            && (this.getSsp_name() == null ? other.getSsp_name() == null : this.getSsp_name().equals(other.getSsp_name()))
            && (this.getMedia_name() == null ? other.getMedia_name() == null : this.getMedia_name().equals(other.getMedia_name()))
            && (this.getRegister_certificate() == null ? other.getRegister_certificate() == null : this.getRegister_certificate().equals(other.getRegister_certificate()))
            && (this.getMandate_certificate() == null ? other.getMandate_certificate() == null : this.getMandate_certificate().equals(other.getMandate_certificate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSsp_id() == null) ? 0 : getSsp_id().hashCode());
        result = prime * result + ((getSsp_name() == null) ? 0 : getSsp_name().hashCode());
        result = prime * result + ((getMedia_name() == null) ? 0 : getMedia_name().hashCode());
        result = prime * result + ((getRegister_certificate() == null) ? 0 : getRegister_certificate().hashCode());
        result = prime * result + ((getMandate_certificate() == null) ? 0 : getMandate_certificate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}