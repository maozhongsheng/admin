package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private String id;

    private String username;

    private String salt;

    private String pwd;

    private String password;

    private String phone;

    private String dept_id;

    private String real_name;

    private String nick_name;

    private String email;

    private Integer status;

    private Integer sex;

    private Integer deleted;

    private String create_id;

    private String update_id;

    private Integer create_where;

    private Date create_time;

    private Date update_time;

    private String address;

    private String role_id;

    private String role_jurisdiction;

    private Integer system_id;

    private Date last_time;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPwd() { return pwd; }

    public void setPwd(String pwd) { this.pwd = pwd; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCreate_id() {
        return create_id;
    }

    public void setCreate_id(String create_id) {
        this.create_id = create_id;
    }

    public String getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(String update_id) {
        this.update_id = update_id;
    }

    public Integer getCreate_where() {
        return create_where;
    }

    public void setCreate_where(Integer create_where) {
        this.create_where = create_where;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_jurisdiction() {
        return role_jurisdiction;
    }

    public void setRole_jurisdiction(String role_jurisdiction) {
        this.role_jurisdiction = role_jurisdiction;
    }

    public Integer getSystem_id() {
        return system_id;
    }

    public void setSystem_id(Integer system_id) {
        this.system_id = system_id;
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
        sb.append(", username=").append(username);
        sb.append(", salt=").append(salt);
        sb.append(", pwd=").append(pwd);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", dept_id=").append(dept_id);
        sb.append(", real_name=").append(real_name);
        sb.append(", nick_name=").append(nick_name);
        sb.append(", email=").append(email);
        sb.append(", status=").append(status);
        sb.append(", sex=").append(sex);
        sb.append(", deleted=").append(deleted);
        sb.append(", create_id=").append(create_id);
        sb.append(", update_id=").append(update_id);
        sb.append(", create_where=").append(create_where);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", address=").append(address);
        sb.append(", role_id=").append(role_id);
        sb.append(", role_jurisdiction=").append(role_jurisdiction);
        sb.append(", system_id=").append(system_id);
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
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getDept_id() == null ? other.getDept_id() == null : this.getDept_id().equals(other.getDept_id()))
            && (this.getReal_name() == null ? other.getReal_name() == null : this.getReal_name().equals(other.getReal_name()))
            && (this.getNick_name() == null ? other.getNick_name() == null : this.getNick_name().equals(other.getNick_name()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCreate_id() == null ? other.getCreate_id() == null : this.getCreate_id().equals(other.getCreate_id()))
            && (this.getUpdate_id() == null ? other.getUpdate_id() == null : this.getUpdate_id().equals(other.getUpdate_id()))
            && (this.getCreate_where() == null ? other.getCreate_where() == null : this.getCreate_where().equals(other.getCreate_where()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()))
            && (this.getRole_jurisdiction() == null ? other.getRole_jurisdiction() == null : this.getRole_jurisdiction().equals(other.getRole_jurisdiction()))
            && (this.getSystem_id() == null ? other.getSystem_id() == null : this.getSystem_id().equals(other.getSystem_id()))
            && (this.getLast_time() == null ? other.getLast_time() == null : this.getLast_time().equals(other.getLast_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getDept_id() == null) ? 0 : getDept_id().hashCode());
        result = prime * result + ((getReal_name() == null) ? 0 : getReal_name().hashCode());
        result = prime * result + ((getNick_name() == null) ? 0 : getNick_name().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreate_id() == null) ? 0 : getCreate_id().hashCode());
        result = prime * result + ((getUpdate_id() == null) ? 0 : getUpdate_id().hashCode());
        result = prime * result + ((getCreate_where() == null) ? 0 : getCreate_where().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        result = prime * result + ((getRole_jurisdiction() == null) ? 0 : getRole_jurisdiction().hashCode());
        result = prime * result + ((getSystem_id() == null) ? 0 : getSystem_id().hashCode());
        result = prime * result + ((getLast_time() == null) ? 0 : getLast_time().hashCode());
        return result;
    }
}