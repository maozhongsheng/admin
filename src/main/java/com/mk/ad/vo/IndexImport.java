package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class IndexImport implements Serializable {
    private Long id;

    private Date date;

    private String publish_id;

    private String media_id;

    private String slot_type;

    private String pos_id;

    private Integer if_update;

    private Float cost;

    private Integer pv;

    private Integer click;

    private Float click_rate;

    private Float ecpm;

    private Float ecpc;

    private Integer is_deleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPublish_id() {
        return publish_id;
    }

    public void setPublish_id(String publish_id) {
        this.publish_id = publish_id;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public String getSlot_type() {
        return slot_type;
    }

    public void setSlot_type(String slot_type) {
        this.slot_type = slot_type;
    }

    public String getPos_id() {
        return pos_id;
    }

    public void setPos_id(String pos_id) {
        this.pos_id = pos_id;
    }

    public Integer getIf_update() {
        return if_update;
    }

    public void setIf_update(Integer if_update) {
        this.if_update = if_update;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Float getClick_rate() {
        return click_rate;
    }

    public void setClick_rate(Float click_rate) {
        this.click_rate = click_rate;
    }

    public Float getEcpm() {
        return ecpm;
    }

    public void setEcpm(Float ecpm) {
        this.ecpm = ecpm;
    }

    public Float getEcpc() {
        return ecpc;
    }

    public void setEcpc(Float ecpc) {
        this.ecpc = ecpc;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", publish_id=").append(publish_id);
        sb.append(", media_id=").append(media_id);
        sb.append(", slot_type=").append(slot_type);
        sb.append(", pos_id=").append(pos_id);
        sb.append(", if_update=").append(if_update);
        sb.append(", cost=").append(cost);
        sb.append(", pv=").append(pv);
        sb.append(", click=").append(click);
        sb.append(", click_rate=").append(click_rate);
        sb.append(", ecpm=").append(ecpm);
        sb.append(", ecpc=").append(ecpc);
        sb.append(", is_deleted=").append(is_deleted);
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
        IndexImport other = (IndexImport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getPublish_id() == null ? other.getPublish_id() == null : this.getPublish_id().equals(other.getPublish_id()))
            && (this.getMedia_id() == null ? other.getMedia_id() == null : this.getMedia_id().equals(other.getMedia_id()))
            && (this.getSlot_type() == null ? other.getSlot_type() == null : this.getSlot_type().equals(other.getSlot_type()))
            && (this.getPos_id() == null ? other.getPos_id() == null : this.getPos_id().equals(other.getPos_id()))
            && (this.getIf_update() == null ? other.getIf_update() == null : this.getIf_update().equals(other.getIf_update()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getPv() == null ? other.getPv() == null : this.getPv().equals(other.getPv()))
            && (this.getClick() == null ? other.getClick() == null : this.getClick().equals(other.getClick()))
            && (this.getClick_rate() == null ? other.getClick_rate() == null : this.getClick_rate().equals(other.getClick_rate()))
            && (this.getEcpm() == null ? other.getEcpm() == null : this.getEcpm().equals(other.getEcpm()))
            && (this.getEcpc() == null ? other.getEcpc() == null : this.getEcpc().equals(other.getEcpc()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getPublish_id() == null) ? 0 : getPublish_id().hashCode());
        result = prime * result + ((getMedia_id() == null) ? 0 : getMedia_id().hashCode());
        result = prime * result + ((getSlot_type() == null) ? 0 : getSlot_type().hashCode());
        result = prime * result + ((getPos_id() == null) ? 0 : getPos_id().hashCode());
        result = prime * result + ((getIf_update() == null) ? 0 : getIf_update().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getPv() == null) ? 0 : getPv().hashCode());
        result = prime * result + ((getClick() == null) ? 0 : getClick().hashCode());
        result = prime * result + ((getClick_rate() == null) ? 0 : getClick_rate().hashCode());
        result = prime * result + ((getEcpm() == null) ? 0 : getEcpm().hashCode());
        result = prime * result + ((getEcpc() == null) ? 0 : getEcpc().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }
}