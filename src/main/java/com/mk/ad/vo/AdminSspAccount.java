package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class AdminSspAccount implements Serializable {
    private Long id;

    private String user_id;

    private String company_name;

    private String company_abbreviation;

    private Integer status;

    private Integer company_type;

    private String license_number;

    private Date due_date;

    private String organization_code;

    private String shareholder;

    private String license_image;

    private Integer docking_way;

    private Integer settlement_way;

    private String profit;

    private String payee;

    private String bank_deposit;

    private String bank_account;

    private Date create_time;

    private Date update_time;

    private Date last_time;

    private Integer is_deleted;

    private Integer enable_status;

    private Long ssp_id;

    private String refuse;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCompany_type() {
        return company_type;
    }

    public void setCompany_type(Integer company_type) {
        this.company_type = company_type;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public String getOrganization_code() {
        return organization_code;
    }

    public void setOrganization_code(String organization_code) {
        this.organization_code = organization_code;
    }

    public String getShareholder() {
        return shareholder;
    }

    public void setShareholder(String shareholder) {
        this.shareholder = shareholder;
    }

    public String getLicense_image() {
        return license_image;
    }

    public void setLicense_image(String license_image) {
        this.license_image = license_image;
    }

    public Integer getDocking_way() {
        return docking_way;
    }

    public void setDocking_way(Integer docking_way) {
        this.docking_way = docking_way;
    }

    public Integer getSettlement_way() {
        return settlement_way;
    }

    public void setSettlement_way(Integer settlement_way) {
        this.settlement_way = settlement_way;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getBank_deposit() {
        return bank_deposit;
    }

    public void setBank_deposit(String bank_deposit) {
        this.bank_deposit = bank_deposit;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
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

    public Date getLast_time() {
        return last_time;
    }

    public void setLast_time(Date last_time) {
        this.last_time = last_time;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Integer getEnable_status() {
        return enable_status;
    }

    public void setEnable_status(Integer enable_status) {
        this.enable_status = enable_status;
    }

    public Long getSsp_id() {
        return ssp_id;
    }

    public void setSsp_id(Long ssp_id) {
        this.ssp_id = ssp_id;
    }

    public String getRefuse() {
        return refuse;
    }

    public void setRefuse(String refuse) {
        this.refuse = refuse;
    }

    public String getCompany_abbreviation() {
        return company_abbreviation;
    }

    public void setCompany_abbreviation(String company_abbreviation) {
        this.company_abbreviation = company_abbreviation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", company_name=").append(company_name);
        sb.append(", company_abbreviation=").append(company_abbreviation);
        sb.append(", status=").append(status);
        sb.append(", company_type=").append(company_type);
        sb.append(", license_number=").append(license_number);
        sb.append(", due_date=").append(due_date);
        sb.append(", organization_code=").append(organization_code);
        sb.append(", shareholder=").append(shareholder);
        sb.append(", license_image=").append(license_image);
        sb.append(", docking_way=").append(docking_way);
        sb.append(", settlement_way=").append(settlement_way);
        sb.append(", profit=").append(profit);
        sb.append(", payee=").append(payee);
        sb.append(", bank_deposit=").append(bank_deposit);
        sb.append(", bank_account=").append(bank_account);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", last_time=").append(last_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", enable_status=").append(enable_status);
        sb.append(", ssp_id=").append(ssp_id);
        sb.append(", refuse=").append(refuse);
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
        AdminSspAccount other = (AdminSspAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getCompany_name() == null ? other.getCompany_name() == null : this.getCompany_name().equals(other.getCompany_name()))
            && (this.getCompany_abbreviation() == null ? other.getCompany_abbreviation() == null : this.getCompany_abbreviation().equals(other.getCompany_abbreviation()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCompany_type() == null ? other.getCompany_type() == null : this.getCompany_type().equals(other.getCompany_type()))
            && (this.getLicense_number() == null ? other.getLicense_number() == null : this.getLicense_number().equals(other.getLicense_number()))
            && (this.getDue_date() == null ? other.getDue_date() == null : this.getDue_date().equals(other.getDue_date()))
            && (this.getOrganization_code() == null ? other.getOrganization_code() == null : this.getOrganization_code().equals(other.getOrganization_code()))
            && (this.getShareholder() == null ? other.getShareholder() == null : this.getShareholder().equals(other.getShareholder()))
            && (this.getLicense_image() == null ? other.getLicense_image() == null : this.getLicense_image().equals(other.getLicense_image()))
            && (this.getDocking_way() == null ? other.getDocking_way() == null : this.getDocking_way().equals(other.getDocking_way()))
            && (this.getSettlement_way() == null ? other.getSettlement_way() == null : this.getSettlement_way().equals(other.getSettlement_way()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getBank_deposit() == null ? other.getBank_deposit() == null : this.getBank_deposit().equals(other.getBank_deposit()))
            && (this.getBank_account() == null ? other.getBank_account() == null : this.getBank_account().equals(other.getBank_account()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getLast_time() == null ? other.getLast_time() == null : this.getLast_time().equals(other.getLast_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()))
            && (this.getEnable_status() == null ? other.getEnable_status() == null : this.getEnable_status().equals(other.getEnable_status()))
            && (this.getSsp_id() == null ? other.getSsp_id() == null : this.getSsp_id().equals(other.getSsp_id()))
            && (this.getRefuse() == null ? other.getRefuse() == null : this.getRefuse().equals(other.getRefuse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getCompany_name() == null) ? 0 : getCompany_name().hashCode());
        result = prime * result + ((getCompany_abbreviation() == null) ? 0 : getCompany_abbreviation().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCompany_type() == null) ? 0 : getCompany_type().hashCode());
        result = prime * result + ((getLicense_number() == null) ? 0 : getLicense_number().hashCode());
        result = prime * result + ((getDue_date() == null) ? 0 : getDue_date().hashCode());
        result = prime * result + ((getOrganization_code() == null) ? 0 : getOrganization_code().hashCode());
        result = prime * result + ((getShareholder() == null) ? 0 : getShareholder().hashCode());
        result = prime * result + ((getLicense_image() == null) ? 0 : getLicense_image().hashCode());
        result = prime * result + ((getDocking_way() == null) ? 0 : getDocking_way().hashCode());
        result = prime * result + ((getSettlement_way() == null) ? 0 : getSettlement_way().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getBank_deposit() == null) ? 0 : getBank_deposit().hashCode());
        result = prime * result + ((getBank_account() == null) ? 0 : getBank_account().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getLast_time() == null) ? 0 : getLast_time().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        result = prime * result + ((getEnable_status() == null) ? 0 : getEnable_status().hashCode());
        result = prime * result + ((getSsp_id() == null) ? 0 : getSsp_id().hashCode());
        result = prime * result + ((getRefuse() == null) ? 0 : getRefuse().hashCode());
        return result;
    }
}