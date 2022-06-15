package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class AdminAdxAccount implements Serializable {

    /**  主键*/
    private Long id;

    /**  公司名称*/
    private String company_name;

    /**  状态*/
    private Integer state;

    /**  公司类型*/
    private Integer company_type;

    /**  营业执照注册号*/
    private String license_number;

    /**  组织机构代码*/
    private String organization_code;

    /**  股东姓名*/
    private String shareholder_name;

    /**  上传营业执照图片*/
    private String license_image;

    /**  对接方式*/
    private Integer docking_id;

    /**  联系人*/
    private String contacts;

    /**  联系电话*/
    private String contact_number;

    /**  邮箱*/
    private String email;

    /**  密码*/
    private String password;

    /**  地址选择*/
    private Integer address_id;

    /**  创建时间*/
    private Date creation_time;

    /**  最后登陆时间*/
    private Date last_time;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getOrganization_code() {
        return organization_code;
    }

    public void setOrganization_code(String organization_code) {
        this.organization_code = organization_code;
    }

    public String getShareholder_name() {
        return shareholder_name;
    }

    public void setShareholder_name(String shareholder_name) {
        this.shareholder_name = shareholder_name;
    }

    public String getLicense_image() {
        return license_image;
    }

    public void setLicense_image(String license_image) {
        this.license_image = license_image;
    }

    public Integer getDocking_id() {
        return docking_id;
    }

    public void setDocking_id(Integer docking_id) {
        this.docking_id = docking_id;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Date getLast_time() {
        return last_time;
    }

    public void setLast_time(Date last_time) {
        this.last_time = last_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", company_name=").append(company_name);
        sb.append(", state=").append(state);
        sb.append(", company_type=").append(company_type);
        sb.append(", license_number=").append(license_number);
        sb.append(", organization_code=").append(organization_code);
        sb.append(", shareholder_name=").append(shareholder_name);
        sb.append(", license_image=").append(license_image);
        sb.append(", docking_id=").append(docking_id);
        sb.append(", contacts=").append(contacts);
        sb.append(", contact_number=").append(contact_number);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", address_id=").append(address_id);
        sb.append(", creation_time=").append(creation_time);
        sb.append(", last_time=").append(last_time);
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
        AdminAdxAccount other = (AdminAdxAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompany_name() == null ? other.getCompany_name() == null : this.getCompany_name().equals(other.getCompany_name()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCompany_type() == null ? other.getCompany_type() == null : this.getCompany_type().equals(other.getCompany_type()))
            && (this.getLicense_number() == null ? other.getLicense_number() == null : this.getLicense_number().equals(other.getLicense_number()))
            && (this.getOrganization_code() == null ? other.getOrganization_code() == null : this.getOrganization_code().equals(other.getOrganization_code()))
            && (this.getShareholder_name() == null ? other.getShareholder_name() == null : this.getShareholder_name().equals(other.getShareholder_name()))
            && (this.getLicense_image() == null ? other.getLicense_image() == null : this.getLicense_image().equals(other.getLicense_image()))
            && (this.getDocking_id() == null ? other.getDocking_id() == null : this.getDocking_id().equals(other.getDocking_id()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getContact_number() == null ? other.getContact_number() == null : this.getContact_number().equals(other.getContact_number()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getAddress_id() == null ? other.getAddress_id() == null : this.getAddress_id().equals(other.getAddress_id()))
            && (this.getCreation_time() == null ? other.getCreation_time() == null : this.getCreation_time().equals(other.getCreation_time()))
            && (this.getLast_time() == null ? other.getLast_time() == null : this.getLast_time().equals(other.getLast_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompany_name() == null) ? 0 : getCompany_name().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCompany_type() == null) ? 0 : getCompany_type().hashCode());
        result = prime * result + ((getLicense_number() == null) ? 0 : getLicense_number().hashCode());
        result = prime * result + ((getOrganization_code() == null) ? 0 : getOrganization_code().hashCode());
        result = prime * result + ((getShareholder_name() == null) ? 0 : getShareholder_name().hashCode());
        result = prime * result + ((getLicense_image() == null) ? 0 : getLicense_image().hashCode());
        result = prime * result + ((getDocking_id() == null) ? 0 : getDocking_id().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getContact_number() == null) ? 0 : getContact_number().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAddress_id() == null) ? 0 : getAddress_id().hashCode());
        result = prime * result + ((getCreation_time() == null) ? 0 : getCreation_time().hashCode());
        result = prime * result + ((getLast_time() == null) ? 0 : getLast_time().hashCode());
        return result;
    }
}