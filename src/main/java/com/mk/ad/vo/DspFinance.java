package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class DspFinance implements Serializable {
    private Integer id;

    private Integer mid;

    private Integer fid;

    private Integer total_recharge;

    private Integer total_consume;

    private Integer total_balance;

    private Integer today_out;

    private Integer deal_type;

    private Integer capital_type;

    private Date create_time;

    private String user_id;

    private String account_show;

    private Integer money;

    private Integer account_balance;

    private Integer day_budget;

    private Integer system_type;

    private Integer refund_amount;

    private Integer return_balance;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getTotal_recharge() {
        return total_recharge;
    }

    public void setTotal_recharge(Integer total_recharge) {
        this.total_recharge = total_recharge;
    }

    public Integer getTotal_consume() {
        return total_consume;
    }

    public void setTotal_consume(Integer total_consume) {
        this.total_consume = total_consume;
    }

    public Integer getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(Integer total_balance) {
        this.total_balance = total_balance;
    }

    public Integer getToday_out() {
        return today_out;
    }

    public void setToday_out(Integer today_out) {
        this.today_out = today_out;
    }

    public Integer getDeal_type() {
        return deal_type;
    }

    public void setDeal_type(Integer deal_type) {
        this.deal_type = deal_type;
    }

    public Integer getCapital_type() {
        return capital_type;
    }

    public void setCapital_type(Integer capital_type) {
        this.capital_type = capital_type;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAccount_show() {
        return account_show;
    }

    public void setAccount_show(String account_show) {
        this.account_show = account_show;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(Integer account_balance) {
        this.account_balance = account_balance;
    }

    public Integer getDay_budget() {
        return day_budget;
    }

    public void setDay_budget(Integer day_budget) {
        this.day_budget = day_budget;
    }

    public Integer getSystem_type() {
        return system_type;
    }

    public void setSystem_type(Integer system_type) {
        this.system_type = system_type;
    }

    public Integer getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(Integer refund_amount) {
        this.refund_amount = refund_amount;
    }

    public Integer getReturn_balance() {
        return return_balance;
    }

    public void setReturn_balance(Integer return_balance) {
        this.return_balance = return_balance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mid=").append(mid);
        sb.append(", fid=").append(fid);
        sb.append(", total_recharge=").append(total_recharge);
        sb.append(", total_consume=").append(total_consume);
        sb.append(", total_balance=").append(total_balance);
        sb.append(", today_out=").append(today_out);
        sb.append(", deal_type=").append(deal_type);
        sb.append(", capital_type=").append(capital_type);
        sb.append(", create_time=").append(create_time);
        sb.append(", user_id=").append(user_id);
        sb.append(", account_show=").append(account_show);
        sb.append(", money=").append(money);
        sb.append(", account_balance=").append(account_balance);
        sb.append(", day_budget=").append(day_budget);
        sb.append(", system_type=").append(system_type);
        sb.append(", refund_amount=").append(refund_amount);
        sb.append(", return_balance=").append(return_balance);
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
        DspFinance other = (DspFinance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
            && (this.getTotal_recharge() == null ? other.getTotal_recharge() == null : this.getTotal_recharge().equals(other.getTotal_recharge()))
            && (this.getTotal_consume() == null ? other.getTotal_consume() == null : this.getTotal_consume().equals(other.getTotal_consume()))
            && (this.getTotal_balance() == null ? other.getTotal_balance() == null : this.getTotal_balance().equals(other.getTotal_balance()))
            && (this.getToday_out() == null ? other.getToday_out() == null : this.getToday_out().equals(other.getToday_out()))
            && (this.getDeal_type() == null ? other.getDeal_type() == null : this.getDeal_type().equals(other.getDeal_type()))
            && (this.getCapital_type() == null ? other.getCapital_type() == null : this.getCapital_type().equals(other.getCapital_type()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getAccount_show() == null ? other.getAccount_show() == null : this.getAccount_show().equals(other.getAccount_show()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getAccount_balance() == null ? other.getAccount_balance() == null : this.getAccount_balance().equals(other.getAccount_balance()))
            && (this.getDay_budget() == null ? other.getDay_budget() == null : this.getDay_budget().equals(other.getDay_budget()))
            && (this.getSystem_type() == null ? other.getSystem_type() == null : this.getSystem_type().equals(other.getSystem_type()))
            && (this.getRefund_amount() == null ? other.getRefund_amount() == null : this.getRefund_amount().equals(other.getRefund_amount()))
            && (this.getReturn_balance() == null ? other.getReturn_balance() == null : this.getReturn_balance().equals(other.getReturn_balance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getTotal_recharge() == null) ? 0 : getTotal_recharge().hashCode());
        result = prime * result + ((getTotal_consume() == null) ? 0 : getTotal_consume().hashCode());
        result = prime * result + ((getTotal_balance() == null) ? 0 : getTotal_balance().hashCode());
        result = prime * result + ((getToday_out() == null) ? 0 : getToday_out().hashCode());
        result = prime * result + ((getDeal_type() == null) ? 0 : getDeal_type().hashCode());
        result = prime * result + ((getCapital_type() == null) ? 0 : getCapital_type().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getAccount_show() == null) ? 0 : getAccount_show().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getAccount_balance() == null) ? 0 : getAccount_balance().hashCode());
        result = prime * result + ((getDay_budget() == null) ? 0 : getDay_budget().hashCode());
        result = prime * result + ((getSystem_type() == null) ? 0 : getSystem_type().hashCode());
        result = prime * result + ((getRefund_amount() == null) ? 0 : getRefund_amount().hashCode());
        result = prime * result + ((getReturn_balance() == null) ? 0 : getReturn_balance().hashCode());
        return result;
    }
}