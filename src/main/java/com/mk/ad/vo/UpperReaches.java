package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class UpperReaches implements Serializable {
    private Integer id;

    private String corporate_name;

    private String corporate_abbreviation;

    private String address;

    private String contacts;

    private String phone;

    private Integer settlement_cycle;

    private Integer accounting_period;

    private Date create_time;

    private Integer is_delete;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorporate_name() {
        return corporate_name;
    }

    public void setCorporate_name(String corporate_name) {
        this.corporate_name = corporate_name;
    }

    public String getCorporate_abbreviation() {
        return corporate_abbreviation;
    }

    public void setCorporate_abbreviation(String corporate_abbreviation) {
        this.corporate_abbreviation = corporate_abbreviation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSettlement_cycle() {
        return settlement_cycle;
    }

    public void setSettlement_cycle(Integer settlement_cycle) {
        this.settlement_cycle = settlement_cycle;
    }

    public Integer getAccounting_period() {
        return accounting_period;
    }

    public void setAccounting_period(Integer accounting_period) {
        this.accounting_period = accounting_period;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", corporate_name=").append(corporate_name);
        sb.append(", corporate_abbreviation=").append(corporate_abbreviation);
        sb.append(", address=").append(address);
        sb.append(", contacts=").append(contacts);
        sb.append(", phone=").append(phone);
        sb.append(", settlement_cycle=").append(settlement_cycle);
        sb.append(", accounting_period=").append(accounting_period);
        sb.append(", create_time=").append(create_time);
        sb.append(", is_delete=").append(is_delete);
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
        UpperReaches other = (UpperReaches) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCorporate_name() == null ? other.getCorporate_name() == null : this.getCorporate_name().equals(other.getCorporate_name()))
            && (this.getCorporate_abbreviation() == null ? other.getCorporate_abbreviation() == null : this.getCorporate_abbreviation().equals(other.getCorporate_abbreviation()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getSettlement_cycle() == null ? other.getSettlement_cycle() == null : this.getSettlement_cycle().equals(other.getSettlement_cycle()))
            && (this.getAccounting_period() == null ? other.getAccounting_period() == null : this.getAccounting_period().equals(other.getAccounting_period()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCorporate_name() == null) ? 0 : getCorporate_name().hashCode());
        result = prime * result + ((getCorporate_abbreviation() == null) ? 0 : getCorporate_abbreviation().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getSettlement_cycle() == null) ? 0 : getSettlement_cycle().hashCode());
        result = prime * result + ((getAccounting_period() == null) ? 0 : getAccounting_period().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }
}