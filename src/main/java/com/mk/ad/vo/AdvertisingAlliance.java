package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class AdvertisingAlliance implements Serializable {
    private Integer id;

    private Integer upper_id;

    private String advert_name;

    private String advert_id;

    private String size;

    private String os_type;

    private String app_id;

    private String app_name;

    private String ad_slot_type;

    private String app_bundle;

    private String app_version;

    private Date create_time;

    private static final long serialVersionUID = 1L;

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }


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

    public String getAdvert_name() {
        return advert_name;
    }

    public void setAdvert_name(String advert_name) {
        this.advert_name = advert_name;
    }

    public String getAdvert_id() {
        return advert_id;
    }

    public void setAdvert_id(String advert_id) {
        this.advert_id = advert_id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOs_type() {
        return os_type;
    }

    public void setOs_type(String os_type) {
        this.os_type = os_type;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getAd_slot_type() {
        return ad_slot_type;
    }

    public void setAd_slot_type(String ad_slot_type) {
        this.ad_slot_type = ad_slot_type;
    }

    public String getApp_bundle() {
        return app_bundle;
    }

    public void setApp_bundle(String app_bundle) {
        this.app_bundle = app_bundle;
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
        sb.append(", advert_name=").append(advert_name);
        sb.append(", advert_id=").append(advert_id);
        sb.append(", size=").append(size);
        sb.append(", os_type=").append(os_type);
        sb.append(", app_id=").append(app_id);
        sb.append(", app_name=").append(app_name);
        sb.append(", ad_slot_type=").append(ad_slot_type);
        sb.append(", app_bundle=").append(app_bundle);
        sb.append(", app_version=").append(app_version);
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
        AdvertisingAlliance other = (AdvertisingAlliance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUpper_id() == null ? other.getUpper_id() == null : this.getUpper_id().equals(other.getUpper_id()))
            && (this.getAdvert_name() == null ? other.getAdvert_name() == null : this.getAdvert_name().equals(other.getAdvert_name()))
            && (this.getAdvert_id() == null ? other.getAdvert_id() == null : this.getAdvert_id().equals(other.getAdvert_id()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getOs_type() == null ? other.getOs_type() == null : this.getOs_type().equals(other.getOs_type()))
            && (this.getApp_id() == null ? other.getApp_id() == null : this.getApp_id().equals(other.getApp_id()))
            && (this.getApp_name() == null ? other.getApp_name() == null : this.getApp_name().equals(other.getApp_name()))
            && (this.getAd_slot_type() == null ? other.getAd_slot_type() == null : this.getAd_slot_type().equals(other.getAd_slot_type()))
            && (this.getApp_bundle() == null ? other.getApp_bundle() == null : this.getApp_bundle().equals(other.getApp_bundle()))
            && (this.getApp_version() == null ? other.getApp_version() == null : this.getApp_version().equals(other.getApp_version()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUpper_id() == null) ? 0 : getUpper_id().hashCode());
        result = prime * result + ((getAdvert_name() == null) ? 0 : getAdvert_name().hashCode());
        result = prime * result + ((getAdvert_id() == null) ? 0 : getAdvert_id().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getOs_type() == null) ? 0 : getOs_type().hashCode());
        result = prime * result + ((getApp_id() == null) ? 0 : getApp_id().hashCode());
        result = prime * result + ((getApp_name() == null) ? 0 : getApp_name().hashCode());
        result = prime * result + ((getAd_slot_type() == null) ? 0 : getAd_slot_type().hashCode());
        result = prime * result + ((getApp_bundle() == null) ? 0 : getApp_bundle().hashCode());
        result = prime * result + ((getApp_version() == null) ? 0 : getApp_version().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}