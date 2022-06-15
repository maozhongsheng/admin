package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class DspCustomerManagement implements Serializable {
    private Integer id;

    private String user_id;

    private Integer business_type_id;

    private Integer customer_type;

    private String corporate_name;

    private String company_profile;

    private String sales_id;

    private String optimizer_id;

    private Integer industry_classification_id;

    private Date deadline;

    private String business_license;

    private String filing;

    private String identity_cards;

    private String industry_qualification_id;

    private String industry_qualification_file;

    private String media_id;

    private String account_balance;

    private String rejection_remarks;

    private Integer examiner_status;

    private Integer outside_status;

    private Integer status;

    private Integer superior_agency_id;

    private Date creat_time;

    private String examiner_id;

    private Date examiner_time;

    private Integer qualifications_type;

    private String account_name;

    private String bank_deposit;

    private String bank_account;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getBusiness_type_id() {
        return business_type_id;
    }

    public void setBusiness_type_id(Integer business_type_id) {
        this.business_type_id = business_type_id;
    }

    public Integer getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(Integer customer_type) {
        this.customer_type = customer_type;
    }

    public String getCorporate_name() {
        return corporate_name;
    }

    public void setCorporate_name(String corporate_name) {
        this.corporate_name = corporate_name;
    }

    public String getCompany_profile() {
        return company_profile;
    }

    public void setCompany_profile(String company_profile) {
        this.company_profile = company_profile;
    }

    public String getSales_id() {
        return sales_id;
    }

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }

    public String getOptimizer_id() {
        return optimizer_id;
    }

    public void setOptimizer_id(String optimizer_id) {
        this.optimizer_id = optimizer_id;
    }

    public Integer getIndustry_classification_id() {
        return industry_classification_id;
    }

    public void setIndustry_classification_id(Integer industry_classification_id) {
        this.industry_classification_id = industry_classification_id;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getBusiness_license() {
        return business_license;
    }

    public void setBusiness_license(String business_license) {
        this.business_license = business_license;
    }

    public String getFiling() {
        return filing;
    }

    public void setFiling(String filing) {
        this.filing = filing;
    }

    public String getIdentity_cards() {
        return identity_cards;
    }

    public void setIdentity_cards(String identity_cards) {
        this.identity_cards = identity_cards;
    }

    public String getIndustry_qualification_id() {
        return industry_qualification_id;
    }

    public void setIndustry_qualification_id(String industry_qualification_id) {
        this.industry_qualification_id = industry_qualification_id;
    }

    public String getIndustry_qualification_file() {
        return industry_qualification_file;
    }

    public void setIndustry_qualification_file(String industry_qualification_file) {
        this.industry_qualification_file = industry_qualification_file;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public String getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(String account_balance) {
        this.account_balance = account_balance;
    }

    public String getRejection_remarks() {
        return rejection_remarks;
    }

    public void setRejection_remarks(String rejection_remarks) {
        this.rejection_remarks = rejection_remarks;
    }

    public Integer getExaminer_status() {
        return examiner_status;
    }

    public void setExaminer_status(Integer examiner_status) {
        this.examiner_status = examiner_status;
    }

    public Integer getOutside_status() {
        return outside_status;
    }

    public void setOutside_status(Integer outside_status) {
        this.outside_status = outside_status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSuperior_agency_id() {
        return superior_agency_id;
    }

    public void setSuperior_agency_id(Integer superior_agency_id) {
        this.superior_agency_id = superior_agency_id;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public String getExaminer_id() {
        return examiner_id;
    }

    public void setExaminer_id(String examiner_id) {
        this.examiner_id = examiner_id;
    }

    public Date getExaminer_time() {
        return examiner_time;
    }

    public void setExaminer_time(Date examiner_time) {
        this.examiner_time = examiner_time;
    }

    public Integer getQualifications_type() {
        return qualifications_type;
    }

    public void setQualifications_type(Integer qualifications_type) {
        this.qualifications_type = qualifications_type;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", business_type_id=").append(business_type_id);
        sb.append(", customer_type=").append(customer_type);
        sb.append(", corporate_name=").append(corporate_name);
        sb.append(", company_profile=").append(company_profile);
        sb.append(", sales_id=").append(sales_id);
        sb.append(", optimizer_id=").append(optimizer_id);
        sb.append(", industry_classification_id=").append(industry_classification_id);
        sb.append(", deadline=").append(deadline);
        sb.append(", business_license=").append(business_license);
        sb.append(", filing=").append(filing);
        sb.append(", identity_cards=").append(identity_cards);
        sb.append(", industry_qualification_id=").append(industry_qualification_id);
        sb.append(", industry_qualification_file=").append(industry_qualification_file);
        sb.append(", media_id=").append(media_id);
        sb.append(", account_balance=").append(account_balance);
        sb.append(", rejection_remarks=").append(rejection_remarks);
        sb.append(", examiner_status=").append(examiner_status);
        sb.append(", outside_status=").append(outside_status);
        sb.append(", status=").append(status);
        sb.append(", superior_agency_id=").append(superior_agency_id);
        sb.append(", creat_time=").append(creat_time);
        sb.append(", examiner_id=").append(examiner_id);
        sb.append(", examiner_time=").append(examiner_time);
        sb.append(", qualifications_type=").append(qualifications_type);
        sb.append(", account_name=").append(account_name);
        sb.append(", bank_deposit=").append(bank_deposit);
        sb.append(", bank_account=").append(bank_account);
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
        DspCustomerManagement other = (DspCustomerManagement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getBusiness_type_id() == null ? other.getBusiness_type_id() == null : this.getBusiness_type_id().equals(other.getBusiness_type_id()))
            && (this.getCustomer_type() == null ? other.getCustomer_type() == null : this.getCustomer_type().equals(other.getCustomer_type()))
            && (this.getCorporate_name() == null ? other.getCorporate_name() == null : this.getCorporate_name().equals(other.getCorporate_name()))
            && (this.getCompany_profile() == null ? other.getCompany_profile() == null : this.getCompany_profile().equals(other.getCompany_profile()))
            && (this.getSales_id() == null ? other.getSales_id() == null : this.getSales_id().equals(other.getSales_id()))
            && (this.getOptimizer_id() == null ? other.getOptimizer_id() == null : this.getOptimizer_id().equals(other.getOptimizer_id()))
            && (this.getIndustry_classification_id() == null ? other.getIndustry_classification_id() == null : this.getIndustry_classification_id().equals(other.getIndustry_classification_id()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getBusiness_license() == null ? other.getBusiness_license() == null : this.getBusiness_license().equals(other.getBusiness_license()))
            && (this.getFiling() == null ? other.getFiling() == null : this.getFiling().equals(other.getFiling()))
            && (this.getIdentity_cards() == null ? other.getIdentity_cards() == null : this.getIdentity_cards().equals(other.getIdentity_cards()))
            && (this.getIndustry_qualification_id() == null ? other.getIndustry_qualification_id() == null : this.getIndustry_qualification_id().equals(other.getIndustry_qualification_id()))
            && (this.getIndustry_qualification_file() == null ? other.getIndustry_qualification_file() == null : this.getIndustry_qualification_file().equals(other.getIndustry_qualification_file()))
            && (this.getMedia_id() == null ? other.getMedia_id() == null : this.getMedia_id().equals(other.getMedia_id()))
            && (this.getAccount_balance() == null ? other.getAccount_balance() == null : this.getAccount_balance().equals(other.getAccount_balance()))
            && (this.getRejection_remarks() == null ? other.getRejection_remarks() == null : this.getRejection_remarks().equals(other.getRejection_remarks()))
            && (this.getExaminer_status() == null ? other.getExaminer_status() == null : this.getExaminer_status().equals(other.getExaminer_status()))
            && (this.getOutside_status() == null ? other.getOutside_status() == null : this.getOutside_status().equals(other.getOutside_status()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSuperior_agency_id() == null ? other.getSuperior_agency_id() == null : this.getSuperior_agency_id().equals(other.getSuperior_agency_id()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getExaminer_id() == null ? other.getExaminer_id() == null : this.getExaminer_id().equals(other.getExaminer_id()))
            && (this.getExaminer_time() == null ? other.getExaminer_time() == null : this.getExaminer_time().equals(other.getExaminer_time()))
            && (this.getQualifications_type() == null ? other.getQualifications_type() == null : this.getQualifications_type().equals(other.getQualifications_type()))
            && (this.getAccount_name() == null ? other.getAccount_name() == null : this.getAccount_name().equals(other.getAccount_name()))
            && (this.getBank_deposit() == null ? other.getBank_deposit() == null : this.getBank_deposit().equals(other.getBank_deposit()))
            && (this.getBank_account() == null ? other.getBank_account() == null : this.getBank_account().equals(other.getBank_account()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getBusiness_type_id() == null) ? 0 : getBusiness_type_id().hashCode());
        result = prime * result + ((getCustomer_type() == null) ? 0 : getCustomer_type().hashCode());
        result = prime * result + ((getCorporate_name() == null) ? 0 : getCorporate_name().hashCode());
        result = prime * result + ((getCompany_profile() == null) ? 0 : getCompany_profile().hashCode());
        result = prime * result + ((getSales_id() == null) ? 0 : getSales_id().hashCode());
        result = prime * result + ((getOptimizer_id() == null) ? 0 : getOptimizer_id().hashCode());
        result = prime * result + ((getIndustry_classification_id() == null) ? 0 : getIndustry_classification_id().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getBusiness_license() == null) ? 0 : getBusiness_license().hashCode());
        result = prime * result + ((getFiling() == null) ? 0 : getFiling().hashCode());
        result = prime * result + ((getIdentity_cards() == null) ? 0 : getIdentity_cards().hashCode());
        result = prime * result + ((getIndustry_qualification_id() == null) ? 0 : getIndustry_qualification_id().hashCode());
        result = prime * result + ((getIndustry_qualification_file() == null) ? 0 : getIndustry_qualification_file().hashCode());
        result = prime * result + ((getMedia_id() == null) ? 0 : getMedia_id().hashCode());
        result = prime * result + ((getAccount_balance() == null) ? 0 : getAccount_balance().hashCode());
        result = prime * result + ((getRejection_remarks() == null) ? 0 : getRejection_remarks().hashCode());
        result = prime * result + ((getExaminer_status() == null) ? 0 : getExaminer_status().hashCode());
        result = prime * result + ((getOutside_status() == null) ? 0 : getOutside_status().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSuperior_agency_id() == null) ? 0 : getSuperior_agency_id().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getExaminer_id() == null) ? 0 : getExaminer_id().hashCode());
        result = prime * result + ((getExaminer_time() == null) ? 0 : getExaminer_time().hashCode());
        result = prime * result + ((getQualifications_type() == null) ? 0 : getQualifications_type().hashCode());
        result = prime * result + ((getAccount_name() == null) ? 0 : getAccount_name().hashCode());
        result = prime * result + ((getBank_deposit() == null) ? 0 : getBank_deposit().hashCode());
        result = prime * result + ((getBank_account() == null) ? 0 : getBank_account().hashCode());
        return result;
    }
}