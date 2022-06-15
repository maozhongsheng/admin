package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class AdminAdx implements Serializable {
    private Long id;

    private Integer adx_id;

    private String adx_name;

    private Integer adx_type;

    private String adx_name_company;

    private String adx_token;

    private String adx_key;

    private String adx_value;

    private String adx_type_id;

    private Integer settlement_id;

    private Date policy_date;

    private Integer rebate_id;

    private String rebate;

    private String profit;

    private Integer settlement_basis_id;

    private String payee;

    private String bank_deposit;

    private String bank_account;

    private String charge_id;

    private String api_file;

    private Integer status;

    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAdx_id() {
        return adx_id;
    }

    public void setAdx_id(Integer adx_id) {
        this.adx_id = adx_id;
    }

    public String getAdx_name() {
        return adx_name;
    }

    public void setAdx_name(String adx_name) {
        this.adx_name = adx_name;
    }

    public Integer getAdx_type() {
        return adx_type;
    }

    public void setAdx_type(Integer adx_type) {
        this.adx_type = adx_type;
    }

    public String getAdx_name_company() {
        return adx_name_company;
    }

    public void setAdx_name_company(String adx_name_company) {
        this.adx_name_company = adx_name_company;
    }

    public String getAdx_token() {
        return adx_token;
    }

    public void setAdx_token(String adx_token) {
        this.adx_token = adx_token;
    }

    public String getAdx_key() {
        return adx_key;
    }

    public void setAdx_key(String adx_key) {
        this.adx_key = adx_key;
    }

    public String getAdx_value() {
        return adx_value;
    }

    public void setAdx_value(String adx_value) {
        this.adx_value = adx_value;
    }

    public String getAdx_type_id() {
        return adx_type_id;
    }

    public void setAdx_type_id(String adx_type_id) {
        this.adx_type_id = adx_type_id;
    }

    public Integer getSettlement_id() {
        return settlement_id;
    }

    public void setSettlement_id(Integer settlement_id) {
        this.settlement_id = settlement_id;
    }

    public Date getPolicy_date() {
        return policy_date;
    }

    public void setPolicy_date(Date policy_date) {
        this.policy_date = policy_date;
    }

    public Integer getRebate_id() {
        return rebate_id;
    }

    public void setRebate_id(Integer rebate_id) {
        this.rebate_id = rebate_id;
    }

    public String getRebate() {
        return rebate;
    }

    public void setRebate(String rebate) {
        this.rebate = rebate;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public Integer getSettlement_basis_id() {
        return settlement_basis_id;
    }

    public void setSettlement_basis_id(Integer settlement_basis_id) {
        this.settlement_basis_id = settlement_basis_id;
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

    public String getCharge_id() {
        return charge_id;
    }

    public void setCharge_id(String charge_id) {
        this.charge_id = charge_id;
    }

    public String getApi_file() {
        return api_file;
    }

    public void setApi_file(String api_file) {
        this.api_file = api_file;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", adx_id=").append(adx_id);
        sb.append(", adx_name=").append(adx_name);
        sb.append(", adx_type=").append(adx_type);
        sb.append(", adx_name_company=").append(adx_name_company);
        sb.append(", adx_token=").append(adx_token);
        sb.append(", adx_key=").append(adx_key);
        sb.append(", adx_value=").append(adx_value);
        sb.append(", adx_type_id=").append(adx_type_id);
        sb.append(", settlement_id=").append(settlement_id);
        sb.append(", policy_date=").append(policy_date);
        sb.append(", rebate_id=").append(rebate_id);
        sb.append(", rebate=").append(rebate);
        sb.append(", profit=").append(profit);
        sb.append(", settlement_basis_id=").append(settlement_basis_id);
        sb.append(", payee=").append(payee);
        sb.append(", bank_deposit=").append(bank_deposit);
        sb.append(", bank_account=").append(bank_account);
        sb.append(", charge_id=").append(charge_id);
        sb.append(", api_file=").append(api_file);
        sb.append(", status=").append(status);
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
        AdminAdx other = (AdminAdx) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdx_id() == null ? other.getAdx_id() == null : this.getAdx_id().equals(other.getAdx_id()))
            && (this.getAdx_name() == null ? other.getAdx_name() == null : this.getAdx_name().equals(other.getAdx_name()))
            && (this.getAdx_type() == null ? other.getAdx_type() == null : this.getAdx_type().equals(other.getAdx_type()))
            && (this.getAdx_name_company() == null ? other.getAdx_name_company() == null : this.getAdx_name_company().equals(other.getAdx_name_company()))
            && (this.getAdx_token() == null ? other.getAdx_token() == null : this.getAdx_token().equals(other.getAdx_token()))
            && (this.getAdx_key() == null ? other.getAdx_key() == null : this.getAdx_key().equals(other.getAdx_key()))
            && (this.getAdx_value() == null ? other.getAdx_value() == null : this.getAdx_value().equals(other.getAdx_value()))
            && (this.getAdx_type_id() == null ? other.getAdx_type_id() == null : this.getAdx_type_id().equals(other.getAdx_type_id()))
            && (this.getSettlement_id() == null ? other.getSettlement_id() == null : this.getSettlement_id().equals(other.getSettlement_id()))
            && (this.getPolicy_date() == null ? other.getPolicy_date() == null : this.getPolicy_date().equals(other.getPolicy_date()))
            && (this.getRebate_id() == null ? other.getRebate_id() == null : this.getRebate_id().equals(other.getRebate_id()))
            && (this.getRebate() == null ? other.getRebate() == null : this.getRebate().equals(other.getRebate()))
            && (this.getProfit() == null ? other.getProfit() == null : this.getProfit().equals(other.getProfit()))
            && (this.getSettlement_basis_id() == null ? other.getSettlement_basis_id() == null : this.getSettlement_basis_id().equals(other.getSettlement_basis_id()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getBank_deposit() == null ? other.getBank_deposit() == null : this.getBank_deposit().equals(other.getBank_deposit()))
            && (this.getBank_account() == null ? other.getBank_account() == null : this.getBank_account().equals(other.getBank_account()))
            && (this.getCharge_id() == null ? other.getCharge_id() == null : this.getCharge_id().equals(other.getCharge_id()))
            && (this.getApi_file() == null ? other.getApi_file() == null : this.getApi_file().equals(other.getApi_file()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdx_id() == null) ? 0 : getAdx_id().hashCode());
        result = prime * result + ((getAdx_name() == null) ? 0 : getAdx_name().hashCode());
        result = prime * result + ((getAdx_type() == null) ? 0 : getAdx_type().hashCode());
        result = prime * result + ((getAdx_name_company() == null) ? 0 : getAdx_name_company().hashCode());
        result = prime * result + ((getAdx_token() == null) ? 0 : getAdx_token().hashCode());
        result = prime * result + ((getAdx_key() == null) ? 0 : getAdx_key().hashCode());
        result = prime * result + ((getAdx_value() == null) ? 0 : getAdx_value().hashCode());
        result = prime * result + ((getAdx_type_id() == null) ? 0 : getAdx_type_id().hashCode());
        result = prime * result + ((getSettlement_id() == null) ? 0 : getSettlement_id().hashCode());
        result = prime * result + ((getPolicy_date() == null) ? 0 : getPolicy_date().hashCode());
        result = prime * result + ((getRebate_id() == null) ? 0 : getRebate_id().hashCode());
        result = prime * result + ((getRebate() == null) ? 0 : getRebate().hashCode());
        result = prime * result + ((getProfit() == null) ? 0 : getProfit().hashCode());
        result = prime * result + ((getSettlement_basis_id() == null) ? 0 : getSettlement_basis_id().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getBank_deposit() == null) ? 0 : getBank_deposit().hashCode());
        result = prime * result + ((getBank_account() == null) ? 0 : getBank_account().hashCode());
        result = prime * result + ((getCharge_id() == null) ? 0 : getCharge_id().hashCode());
        result = prime * result + ((getApi_file() == null) ? 0 : getApi_file().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}