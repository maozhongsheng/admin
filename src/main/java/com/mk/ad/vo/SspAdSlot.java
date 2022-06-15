package com.mk.ad.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SspAdSlot implements Serializable {
    private Integer id;

    private Integer media_id;

    private String bussiness_type_one;

    private Integer slot_type_id;

    private Integer ad_template_id;

    private String slot_name;

    private Integer slot_status;

    private Integer business_status;

    private Integer cooperation_type;

    private Integer render_type;

    private Integer ad_pull_mode;

    private BigDecimal cp_price;

    private String requet_rate;

    private Integer slot_examine_status;

    private Date create_time;

    private Date update_time;

    private Integer is_deleted;

    private String ad_type_received;

    private Integer ssp_id;

    private String user_id;

    private Integer formal_status;

    private String directional_status;

    private String lowest_status;

    private String timeout;

    private String alliance_id;

    private String alliance_slot_id;

    private String make;

    private static final long serialVersionUID = 1L;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getLowest_status() {
        return lowest_status;
    }

    public void setLowest_status(String lowest_status) {
        this.lowest_status = lowest_status;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getAlliance_id() {
        return alliance_id;
    }

    public void setAlliance_id(String alliance_id) {
        this.alliance_id = alliance_id;
    }

    public String getAlliance_slot_id() {
        return alliance_slot_id;
    }

    public void setAlliance_slot_id(String alliance_slot_id) {
        this.alliance_slot_id = alliance_slot_id;
    }

    public Integer getFormal_status() {
        return formal_status;
    }

    public void setFormal_status(Integer formal_status) {
        this.formal_status = formal_status;
    }

    public String getDirectional_status() {
        return directional_status;
    }

    public void setDirectional_status(String directional_status) {
        this.directional_status = directional_status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedia_id() {
        return media_id;
    }

    public void setMedia_id(Integer media_id) {
        this.media_id = media_id;
    }

    public String getBussiness_type_one() {
        return bussiness_type_one;
    }

    public void setBussiness_type_one(String bussiness_type_one) {
        this.bussiness_type_one = bussiness_type_one;
    }

    public Integer getSlot_type_id() {
        return slot_type_id;
    }

    public void setSlot_type_id(Integer slot_type_id) {
        this.slot_type_id = slot_type_id;
    }

    public Integer getAd_template_id() {
        return ad_template_id;
    }

    public void setAd_template_id(Integer ad_template_id) {
        this.ad_template_id = ad_template_id;
    }

    public String getSlot_name() {
        return slot_name;
    }

    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    public Integer getSlot_status() {
        return slot_status;
    }

    public void setSlot_status(Integer slot_status) {
        this.slot_status = slot_status;
    }

    public Integer getBusiness_status() {
        return business_status;
    }

    public void setBusiness_status(Integer business_status) {
        this.business_status = business_status;
    }

    public Integer getCooperation_type() {
        return cooperation_type;
    }

    public void setCooperation_type(Integer cooperation_type) {
        this.cooperation_type = cooperation_type;
    }

    public Integer getRender_type() {
        return render_type;
    }

    public void setRender_type(Integer render_type) {
        this.render_type = render_type;
    }

    public Integer getAd_pull_mode() {
        return ad_pull_mode;
    }

    public void setAd_pull_mode(Integer ad_pull_mode) {
        this.ad_pull_mode = ad_pull_mode;
    }

    public BigDecimal getCp_price() {
        return cp_price;
    }

    public void setCp_price(BigDecimal cp_price) {
        this.cp_price = cp_price;
    }

    public String getRequet_rate() {
        return requet_rate;
    }

    public void setRequet_rate(String requet_rate) {
        this.requet_rate = requet_rate;
    }

    public Integer getSlot_examine_status() {
        return slot_examine_status;
    }

    public void setSlot_examine_status(Integer slot_examine_status) {
        this.slot_examine_status = slot_examine_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getAd_type_received() {
        return ad_type_received;
    }

    public void setAd_type_received(String ad_type_received) {
        this.ad_type_received = ad_type_received;
    }

    public Integer getSsp_id() {
        return ssp_id;
    }

    public void setSsp_id(Integer ssp_id) {
        this.ssp_id = ssp_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", media_id=").append(media_id);
        sb.append(", bussiness_type_one=").append(bussiness_type_one);
        sb.append(", slot_type_id=").append(slot_type_id);
        sb.append(", ad_template_id=").append(ad_template_id);
        sb.append(", slot_name=").append(slot_name);
        sb.append(", slot_status=").append(slot_status);
        sb.append(", business_status=").append(business_status);
        sb.append(", cooperation_type=").append(cooperation_type);
        sb.append(", render_type=").append(render_type);
        sb.append(", ad_pull_mode=").append(ad_pull_mode);
        sb.append(", cp_price=").append(cp_price);
        sb.append(", requet_rate=").append(requet_rate);
        sb.append(", slot_examine_status=").append(slot_examine_status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", ad_type_received=").append(ad_type_received);
        sb.append(", ssp_id=").append(ssp_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", formal_status=").append(formal_status);
        sb.append(", directional_status=").append(directional_status);
        sb.append(", timeout=").append(timeout);
        sb.append(", lowest_status=").append(lowest_status);
        sb.append(", alliance_id=").append(alliance_id);
        sb.append(", alliance_slot_id=").append(alliance_slot_id);
        sb.append(", make=").append(make);
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
        SspAdSlot other = (SspAdSlot) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedia_id() == null ? other.getMedia_id() == null : this.getMedia_id().equals(other.getMedia_id()))
            && (this.getBussiness_type_one() == null ? other.getBussiness_type_one() == null : this.getBussiness_type_one().equals(other.getBussiness_type_one()))
            && (this.getSlot_type_id() == null ? other.getSlot_type_id() == null : this.getSlot_type_id().equals(other.getSlot_type_id()))
            && (this.getAd_template_id() == null ? other.getAd_template_id() == null : this.getAd_template_id().equals(other.getAd_template_id()))
            && (this.getSlot_name() == null ? other.getSlot_name() == null : this.getSlot_name().equals(other.getSlot_name()))
            && (this.getSlot_status() == null ? other.getSlot_status() == null : this.getSlot_status().equals(other.getSlot_status()))
            && (this.getBusiness_status() == null ? other.getBusiness_status() == null : this.getBusiness_status().equals(other.getBusiness_status()))
            && (this.getCooperation_type() == null ? other.getCooperation_type() == null : this.getCooperation_type().equals(other.getCooperation_type()))
            && (this.getRender_type() == null ? other.getRender_type() == null : this.getRender_type().equals(other.getRender_type()))
            && (this.getAd_pull_mode() == null ? other.getAd_pull_mode() == null : this.getAd_pull_mode().equals(other.getAd_pull_mode()))
            && (this.getCp_price() == null ? other.getCp_price() == null : this.getCp_price().equals(other.getCp_price()))
            && (this.getRequet_rate() == null ? other.getRequet_rate() == null : this.getRequet_rate().equals(other.getRequet_rate()))
            && (this.getSlot_examine_status() == null ? other.getSlot_examine_status() == null : this.getSlot_examine_status().equals(other.getSlot_examine_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()))
            && (this.getAd_type_received() == null ? other.getAd_type_received() == null : this.getAd_type_received().equals(other.getAd_type_received()))
            && (this.getSsp_id() == null ? other.getSsp_id() == null : this.getSsp_id().equals(other.getSsp_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getFormal_status() == null ? other.getFormal_status() == null : this.getFormal_status().equals(other.getFormal_status()))
            && (this.getDirectional_status() == null ? other.getDirectional_status() == null : this.getDirectional_status().equals(other.getDirectional_status()))
            && (this.getLowest_status() == null ? other.getLowest_status() == null : this.getLowest_status().equals(other.getLowest_status()))
            && (this.getTimeout() == null ? other.getTimeout() == null : this.getTimeout().equals(other.getTimeout()))
            && (this.getAlliance_id() == null ? other.getAlliance_id() == null : this.getAlliance_id().equals(other.getAlliance_id()))
            && (this.getAlliance_slot_id() == null ? other.getAlliance_slot_id() == null : this.getAlliance_slot_id().equals(other.getAlliance_slot_id()))
            && (this.getMake() == null ? other.getMake() == null : this.getMake().equals(other.getMake()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedia_id() == null) ? 0 : getMedia_id().hashCode());
        result = prime * result + ((getBussiness_type_one() == null) ? 0 : getBussiness_type_one().hashCode());
        result = prime * result + ((getSlot_type_id() == null) ? 0 : getSlot_type_id().hashCode());
        result = prime * result + ((getAd_template_id() == null) ? 0 : getAd_template_id().hashCode());
        result = prime * result + ((getSlot_name() == null) ? 0 : getSlot_name().hashCode());
        result = prime * result + ((getSlot_status() == null) ? 0 : getSlot_status().hashCode());
        result = prime * result + ((getBusiness_status() == null) ? 0 : getBusiness_status().hashCode());
        result = prime * result + ((getCooperation_type() == null) ? 0 : getCooperation_type().hashCode());
        result = prime * result + ((getRender_type() == null) ? 0 : getRender_type().hashCode());
        result = prime * result + ((getAd_pull_mode() == null) ? 0 : getAd_pull_mode().hashCode());
        result = prime * result + ((getCp_price() == null) ? 0 : getCp_price().hashCode());
        result = prime * result + ((getRequet_rate() == null) ? 0 : getRequet_rate().hashCode());
        result = prime * result + ((getSlot_examine_status() == null) ? 0 : getSlot_examine_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        result = prime * result + ((getAd_type_received() == null) ? 0 : getAd_type_received().hashCode());
        result = prime * result + ((getSsp_id() == null) ? 0 : getSsp_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getFormal_status() == null) ? 0 : getFormal_status().hashCode());
        result = prime * result + ((getDirectional_status() == null) ? 0 : getDirectional_status().hashCode());
        result = prime * result + ((getLowest_status() == null) ? 0 : getLowest_status().hashCode());
        result = prime * result + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        result = prime * result + ((getAlliance_id() == null) ? 0 : getAlliance_id().hashCode());
        result = prime * result + ((getAlliance_slot_id() == null) ? 0 : getAlliance_slot_id().hashCode());
        result = prime * result + ((getMake() == null) ? 0 : getMake().hashCode());
        return result;
    }
}