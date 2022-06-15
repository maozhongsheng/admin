package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DspFinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DspFinanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeIsNull() {
            addCriterion("total_recharge is null");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeIsNotNull() {
            addCriterion("total_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeEqualTo(Integer value) {
            addCriterion("total_recharge =", value, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeNotEqualTo(Integer value) {
            addCriterion("total_recharge <>", value, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeGreaterThan(Integer value) {
            addCriterion("total_recharge >", value, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_recharge >=", value, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeLessThan(Integer value) {
            addCriterion("total_recharge <", value, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeLessThanOrEqualTo(Integer value) {
            addCriterion("total_recharge <=", value, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeIn(List<Integer> values) {
            addCriterion("total_recharge in", values, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeNotIn(List<Integer> values) {
            addCriterion("total_recharge not in", values, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeBetween(Integer value1, Integer value2) {
            addCriterion("total_recharge between", value1, value2, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_rechargeNotBetween(Integer value1, Integer value2) {
            addCriterion("total_recharge not between", value1, value2, "total_recharge");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeIsNull() {
            addCriterion("total_consume is null");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeIsNotNull() {
            addCriterion("total_consume is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeEqualTo(Integer value) {
            addCriterion("total_consume =", value, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeNotEqualTo(Integer value) {
            addCriterion("total_consume <>", value, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeGreaterThan(Integer value) {
            addCriterion("total_consume >", value, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_consume >=", value, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeLessThan(Integer value) {
            addCriterion("total_consume <", value, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeLessThanOrEqualTo(Integer value) {
            addCriterion("total_consume <=", value, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeIn(List<Integer> values) {
            addCriterion("total_consume in", values, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeNotIn(List<Integer> values) {
            addCriterion("total_consume not in", values, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeBetween(Integer value1, Integer value2) {
            addCriterion("total_consume between", value1, value2, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_consumeNotBetween(Integer value1, Integer value2) {
            addCriterion("total_consume not between", value1, value2, "total_consume");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceIsNull() {
            addCriterion("total_balance is null");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceIsNotNull() {
            addCriterion("total_balance is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceEqualTo(Integer value) {
            addCriterion("total_balance =", value, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceNotEqualTo(Integer value) {
            addCriterion("total_balance <>", value, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceGreaterThan(Integer value) {
            addCriterion("total_balance >", value, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_balance >=", value, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceLessThan(Integer value) {
            addCriterion("total_balance <", value, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceLessThanOrEqualTo(Integer value) {
            addCriterion("total_balance <=", value, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceIn(List<Integer> values) {
            addCriterion("total_balance in", values, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceNotIn(List<Integer> values) {
            addCriterion("total_balance not in", values, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceBetween(Integer value1, Integer value2) {
            addCriterion("total_balance between", value1, value2, "total_balance");
            return (Criteria) this;
        }

        public Criteria andTotal_balanceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_balance not between", value1, value2, "total_balance");
            return (Criteria) this;
        }

        public Criteria andToday_outIsNull() {
            addCriterion("today_out is null");
            return (Criteria) this;
        }

        public Criteria andToday_outIsNotNull() {
            addCriterion("today_out is not null");
            return (Criteria) this;
        }

        public Criteria andToday_outEqualTo(Integer value) {
            addCriterion("today_out =", value, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outNotEqualTo(Integer value) {
            addCriterion("today_out <>", value, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outGreaterThan(Integer value) {
            addCriterion("today_out >", value, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_out >=", value, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outLessThan(Integer value) {
            addCriterion("today_out <", value, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outLessThanOrEqualTo(Integer value) {
            addCriterion("today_out <=", value, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outIn(List<Integer> values) {
            addCriterion("today_out in", values, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outNotIn(List<Integer> values) {
            addCriterion("today_out not in", values, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outBetween(Integer value1, Integer value2) {
            addCriterion("today_out between", value1, value2, "today_out");
            return (Criteria) this;
        }

        public Criteria andToday_outNotBetween(Integer value1, Integer value2) {
            addCriterion("today_out not between", value1, value2, "today_out");
            return (Criteria) this;
        }

        public Criteria andDeal_typeIsNull() {
            addCriterion("deal_type is null");
            return (Criteria) this;
        }

        public Criteria andDeal_typeIsNotNull() {
            addCriterion("deal_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeal_typeEqualTo(Integer value) {
            addCriterion("deal_type =", value, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeNotEqualTo(Integer value) {
            addCriterion("deal_type <>", value, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeGreaterThan(Integer value) {
            addCriterion("deal_type >", value, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_type >=", value, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeLessThan(Integer value) {
            addCriterion("deal_type <", value, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeLessThanOrEqualTo(Integer value) {
            addCriterion("deal_type <=", value, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeIn(List<Integer> values) {
            addCriterion("deal_type in", values, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeNotIn(List<Integer> values) {
            addCriterion("deal_type not in", values, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeBetween(Integer value1, Integer value2) {
            addCriterion("deal_type between", value1, value2, "deal_type");
            return (Criteria) this;
        }

        public Criteria andDeal_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_type not between", value1, value2, "deal_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeIsNull() {
            addCriterion("capital_type is null");
            return (Criteria) this;
        }

        public Criteria andCapital_typeIsNotNull() {
            addCriterion("capital_type is not null");
            return (Criteria) this;
        }

        public Criteria andCapital_typeEqualTo(Integer value) {
            addCriterion("capital_type =", value, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeNotEqualTo(Integer value) {
            addCriterion("capital_type <>", value, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeGreaterThan(Integer value) {
            addCriterion("capital_type >", value, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital_type >=", value, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeLessThan(Integer value) {
            addCriterion("capital_type <", value, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeLessThanOrEqualTo(Integer value) {
            addCriterion("capital_type <=", value, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeIn(List<Integer> values) {
            addCriterion("capital_type in", values, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeNotIn(List<Integer> values) {
            addCriterion("capital_type not in", values, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeBetween(Integer value1, Integer value2) {
            addCriterion("capital_type between", value1, value2, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCapital_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("capital_type not between", value1, value2, "capital_type");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andAccount_showIsNull() {
            addCriterion("account_show is null");
            return (Criteria) this;
        }

        public Criteria andAccount_showIsNotNull() {
            addCriterion("account_show is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_showEqualTo(String value) {
            addCriterion("account_show =", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showNotEqualTo(String value) {
            addCriterion("account_show <>", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showGreaterThan(String value) {
            addCriterion("account_show >", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showGreaterThanOrEqualTo(String value) {
            addCriterion("account_show >=", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showLessThan(String value) {
            addCriterion("account_show <", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showLessThanOrEqualTo(String value) {
            addCriterion("account_show <=", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showLike(String value) {
            addCriterion("account_show like", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showNotLike(String value) {
            addCriterion("account_show not like", value, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showIn(List<String> values) {
            addCriterion("account_show in", values, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showNotIn(List<String> values) {
            addCriterion("account_show not in", values, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showBetween(String value1, String value2) {
            addCriterion("account_show between", value1, value2, "account_show");
            return (Criteria) this;
        }

        public Criteria andAccount_showNotBetween(String value1, String value2) {
            addCriterion("account_show not between", value1, value2, "account_show");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIsNull() {
            addCriterion("account_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIsNotNull() {
            addCriterion("account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceEqualTo(Integer value) {
            addCriterion("account_balance =", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotEqualTo(Integer value) {
            addCriterion("account_balance <>", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceGreaterThan(Integer value) {
            addCriterion("account_balance >", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_balance >=", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceLessThan(Integer value) {
            addCriterion("account_balance <", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceLessThanOrEqualTo(Integer value) {
            addCriterion("account_balance <=", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIn(List<Integer> values) {
            addCriterion("account_balance in", values, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotIn(List<Integer> values) {
            addCriterion("account_balance not in", values, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceBetween(Integer value1, Integer value2) {
            addCriterion("account_balance between", value1, value2, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotBetween(Integer value1, Integer value2) {
            addCriterion("account_balance not between", value1, value2, "account_balance");
            return (Criteria) this;
        }

        public Criteria andDay_budgetIsNull() {
            addCriterion("day_budget is null");
            return (Criteria) this;
        }

        public Criteria andDay_budgetIsNotNull() {
            addCriterion("day_budget is not null");
            return (Criteria) this;
        }

        public Criteria andDay_budgetEqualTo(Integer value) {
            addCriterion("day_budget =", value, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetNotEqualTo(Integer value) {
            addCriterion("day_budget <>", value, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetGreaterThan(Integer value) {
            addCriterion("day_budget >", value, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_budget >=", value, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetLessThan(Integer value) {
            addCriterion("day_budget <", value, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetLessThanOrEqualTo(Integer value) {
            addCriterion("day_budget <=", value, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetIn(List<Integer> values) {
            addCriterion("day_budget in", values, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetNotIn(List<Integer> values) {
            addCriterion("day_budget not in", values, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetBetween(Integer value1, Integer value2) {
            addCriterion("day_budget between", value1, value2, "day_budget");
            return (Criteria) this;
        }

        public Criteria andDay_budgetNotBetween(Integer value1, Integer value2) {
            addCriterion("day_budget not between", value1, value2, "day_budget");
            return (Criteria) this;
        }

        public Criteria andSystem_typeIsNull() {
            addCriterion("system_type is null");
            return (Criteria) this;
        }

        public Criteria andSystem_typeIsNotNull() {
            addCriterion("system_type is not null");
            return (Criteria) this;
        }

        public Criteria andSystem_typeEqualTo(Integer value) {
            addCriterion("system_type =", value, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeNotEqualTo(Integer value) {
            addCriterion("system_type <>", value, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeGreaterThan(Integer value) {
            addCriterion("system_type >", value, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_type >=", value, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeLessThan(Integer value) {
            addCriterion("system_type <", value, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeLessThanOrEqualTo(Integer value) {
            addCriterion("system_type <=", value, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeIn(List<Integer> values) {
            addCriterion("system_type in", values, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeNotIn(List<Integer> values) {
            addCriterion("system_type not in", values, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeBetween(Integer value1, Integer value2) {
            addCriterion("system_type between", value1, value2, "system_type");
            return (Criteria) this;
        }

        public Criteria andSystem_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("system_type not between", value1, value2, "system_type");
            return (Criteria) this;
        }

        public Criteria andRefund_amountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefund_amountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefund_amountEqualTo(Integer value) {
            addCriterion("refund_amount =", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountNotEqualTo(Integer value) {
            addCriterion("refund_amount <>", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountGreaterThan(Integer value) {
            addCriterion("refund_amount >", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_amount >=", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountLessThan(Integer value) {
            addCriterion("refund_amount <", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountLessThanOrEqualTo(Integer value) {
            addCriterion("refund_amount <=", value, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountIn(List<Integer> values) {
            addCriterion("refund_amount in", values, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountNotIn(List<Integer> values) {
            addCriterion("refund_amount not in", values, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountBetween(Integer value1, Integer value2) {
            addCriterion("refund_amount between", value1, value2, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andRefund_amountNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_amount not between", value1, value2, "refund_amount");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceIsNull() {
            addCriterion("return_balance is null");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceIsNotNull() {
            addCriterion("return_balance is not null");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceEqualTo(Integer value) {
            addCriterion("return_balance =", value, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceNotEqualTo(Integer value) {
            addCriterion("return_balance <>", value, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceGreaterThan(Integer value) {
            addCriterion("return_balance >", value, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_balance >=", value, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceLessThan(Integer value) {
            addCriterion("return_balance <", value, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceLessThanOrEqualTo(Integer value) {
            addCriterion("return_balance <=", value, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceIn(List<Integer> values) {
            addCriterion("return_balance in", values, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceNotIn(List<Integer> values) {
            addCriterion("return_balance not in", values, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceBetween(Integer value1, Integer value2) {
            addCriterion("return_balance between", value1, value2, "return_balance");
            return (Criteria) this;
        }

        public Criteria andReturn_balanceNotBetween(Integer value1, Integer value2) {
            addCriterion("return_balance not between", value1, value2, "return_balance");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}