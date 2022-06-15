package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminAdxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminAdxExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdx_idIsNull() {
            addCriterion("adx_id is null");
            return (Criteria) this;
        }

        public Criteria andAdx_idIsNotNull() {
            addCriterion("adx_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_idEqualTo(Integer value) {
            addCriterion("adx_id =", value, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idNotEqualTo(Integer value) {
            addCriterion("adx_id <>", value, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idGreaterThan(Integer value) {
            addCriterion("adx_id >", value, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("adx_id >=", value, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idLessThan(Integer value) {
            addCriterion("adx_id <", value, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idLessThanOrEqualTo(Integer value) {
            addCriterion("adx_id <=", value, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idIn(List<Integer> values) {
            addCriterion("adx_id in", values, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idNotIn(List<Integer> values) {
            addCriterion("adx_id not in", values, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idBetween(Integer value1, Integer value2) {
            addCriterion("adx_id between", value1, value2, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_idNotBetween(Integer value1, Integer value2) {
            addCriterion("adx_id not between", value1, value2, "adx_id");
            return (Criteria) this;
        }

        public Criteria andAdx_nameIsNull() {
            addCriterion("adx_name is null");
            return (Criteria) this;
        }

        public Criteria andAdx_nameIsNotNull() {
            addCriterion("adx_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_nameEqualTo(String value) {
            addCriterion("adx_name =", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameNotEqualTo(String value) {
            addCriterion("adx_name <>", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameGreaterThan(String value) {
            addCriterion("adx_name >", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameGreaterThanOrEqualTo(String value) {
            addCriterion("adx_name >=", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameLessThan(String value) {
            addCriterion("adx_name <", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameLessThanOrEqualTo(String value) {
            addCriterion("adx_name <=", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameLike(String value) {
            addCriterion("adx_name like", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameNotLike(String value) {
            addCriterion("adx_name not like", value, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameIn(List<String> values) {
            addCriterion("adx_name in", values, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameNotIn(List<String> values) {
            addCriterion("adx_name not in", values, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameBetween(String value1, String value2) {
            addCriterion("adx_name between", value1, value2, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_nameNotBetween(String value1, String value2) {
            addCriterion("adx_name not between", value1, value2, "adx_name");
            return (Criteria) this;
        }

        public Criteria andAdx_typeIsNull() {
            addCriterion("adx_type is null");
            return (Criteria) this;
        }

        public Criteria andAdx_typeIsNotNull() {
            addCriterion("adx_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_typeEqualTo(Integer value) {
            addCriterion("adx_type =", value, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeNotEqualTo(Integer value) {
            addCriterion("adx_type <>", value, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeGreaterThan(Integer value) {
            addCriterion("adx_type >", value, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adx_type >=", value, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeLessThan(Integer value) {
            addCriterion("adx_type <", value, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeLessThanOrEqualTo(Integer value) {
            addCriterion("adx_type <=", value, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeIn(List<Integer> values) {
            addCriterion("adx_type in", values, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeNotIn(List<Integer> values) {
            addCriterion("adx_type not in", values, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeBetween(Integer value1, Integer value2) {
            addCriterion("adx_type between", value1, value2, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("adx_type not between", value1, value2, "adx_type");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyIsNull() {
            addCriterion("adx_name_company is null");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyIsNotNull() {
            addCriterion("adx_name_company is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyEqualTo(String value) {
            addCriterion("adx_name_company =", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyNotEqualTo(String value) {
            addCriterion("adx_name_company <>", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyGreaterThan(String value) {
            addCriterion("adx_name_company >", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyGreaterThanOrEqualTo(String value) {
            addCriterion("adx_name_company >=", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyLessThan(String value) {
            addCriterion("adx_name_company <", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyLessThanOrEqualTo(String value) {
            addCriterion("adx_name_company <=", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyLike(String value) {
            addCriterion("adx_name_company like", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyNotLike(String value) {
            addCriterion("adx_name_company not like", value, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyIn(List<String> values) {
            addCriterion("adx_name_company in", values, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyNotIn(List<String> values) {
            addCriterion("adx_name_company not in", values, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyBetween(String value1, String value2) {
            addCriterion("adx_name_company between", value1, value2, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_name_companyNotBetween(String value1, String value2) {
            addCriterion("adx_name_company not between", value1, value2, "adx_name_company");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenIsNull() {
            addCriterion("adx_token is null");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenIsNotNull() {
            addCriterion("adx_token is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenEqualTo(String value) {
            addCriterion("adx_token =", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenNotEqualTo(String value) {
            addCriterion("adx_token <>", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenGreaterThan(String value) {
            addCriterion("adx_token >", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenGreaterThanOrEqualTo(String value) {
            addCriterion("adx_token >=", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenLessThan(String value) {
            addCriterion("adx_token <", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenLessThanOrEqualTo(String value) {
            addCriterion("adx_token <=", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenLike(String value) {
            addCriterion("adx_token like", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenNotLike(String value) {
            addCriterion("adx_token not like", value, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenIn(List<String> values) {
            addCriterion("adx_token in", values, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenNotIn(List<String> values) {
            addCriterion("adx_token not in", values, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenBetween(String value1, String value2) {
            addCriterion("adx_token between", value1, value2, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_tokenNotBetween(String value1, String value2) {
            addCriterion("adx_token not between", value1, value2, "adx_token");
            return (Criteria) this;
        }

        public Criteria andAdx_keyIsNull() {
            addCriterion("adx_key is null");
            return (Criteria) this;
        }

        public Criteria andAdx_keyIsNotNull() {
            addCriterion("adx_key is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_keyEqualTo(String value) {
            addCriterion("adx_key =", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyNotEqualTo(String value) {
            addCriterion("adx_key <>", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyGreaterThan(String value) {
            addCriterion("adx_key >", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyGreaterThanOrEqualTo(String value) {
            addCriterion("adx_key >=", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyLessThan(String value) {
            addCriterion("adx_key <", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyLessThanOrEqualTo(String value) {
            addCriterion("adx_key <=", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyLike(String value) {
            addCriterion("adx_key like", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyNotLike(String value) {
            addCriterion("adx_key not like", value, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyIn(List<String> values) {
            addCriterion("adx_key in", values, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyNotIn(List<String> values) {
            addCriterion("adx_key not in", values, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyBetween(String value1, String value2) {
            addCriterion("adx_key between", value1, value2, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_keyNotBetween(String value1, String value2) {
            addCriterion("adx_key not between", value1, value2, "adx_key");
            return (Criteria) this;
        }

        public Criteria andAdx_valueIsNull() {
            addCriterion("adx_value is null");
            return (Criteria) this;
        }

        public Criteria andAdx_valueIsNotNull() {
            addCriterion("adx_value is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_valueEqualTo(String value) {
            addCriterion("adx_value =", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueNotEqualTo(String value) {
            addCriterion("adx_value <>", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueGreaterThan(String value) {
            addCriterion("adx_value >", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueGreaterThanOrEqualTo(String value) {
            addCriterion("adx_value >=", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueLessThan(String value) {
            addCriterion("adx_value <", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueLessThanOrEqualTo(String value) {
            addCriterion("adx_value <=", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueLike(String value) {
            addCriterion("adx_value like", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueNotLike(String value) {
            addCriterion("adx_value not like", value, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueIn(List<String> values) {
            addCriterion("adx_value in", values, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueNotIn(List<String> values) {
            addCriterion("adx_value not in", values, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueBetween(String value1, String value2) {
            addCriterion("adx_value between", value1, value2, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_valueNotBetween(String value1, String value2) {
            addCriterion("adx_value not between", value1, value2, "adx_value");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idIsNull() {
            addCriterion("adx_type_id is null");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idIsNotNull() {
            addCriterion("adx_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idEqualTo(String value) {
            addCriterion("adx_type_id =", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idNotEqualTo(String value) {
            addCriterion("adx_type_id <>", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idGreaterThan(String value) {
            addCriterion("adx_type_id >", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idGreaterThanOrEqualTo(String value) {
            addCriterion("adx_type_id >=", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idLessThan(String value) {
            addCriterion("adx_type_id <", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idLessThanOrEqualTo(String value) {
            addCriterion("adx_type_id <=", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idLike(String value) {
            addCriterion("adx_type_id like", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idNotLike(String value) {
            addCriterion("adx_type_id not like", value, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idIn(List<String> values) {
            addCriterion("adx_type_id in", values, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idNotIn(List<String> values) {
            addCriterion("adx_type_id not in", values, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idBetween(String value1, String value2) {
            addCriterion("adx_type_id between", value1, value2, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andAdx_type_idNotBetween(String value1, String value2) {
            addCriterion("adx_type_id not between", value1, value2, "adx_type_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idIsNull() {
            addCriterion("settlement_id is null");
            return (Criteria) this;
        }

        public Criteria andSettlement_idIsNotNull() {
            addCriterion("settlement_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettlement_idEqualTo(Integer value) {
            addCriterion("settlement_id =", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idNotEqualTo(Integer value) {
            addCriterion("settlement_id <>", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idGreaterThan(Integer value) {
            addCriterion("settlement_id >", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_id >=", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idLessThan(Integer value) {
            addCriterion("settlement_id <", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_id <=", value, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idIn(List<Integer> values) {
            addCriterion("settlement_id in", values, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idNotIn(List<Integer> values) {
            addCriterion("settlement_id not in", values, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idBetween(Integer value1, Integer value2) {
            addCriterion("settlement_id between", value1, value2, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_idNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_id not between", value1, value2, "settlement_id");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateIsNull() {
            addCriterion("policy_date is null");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateIsNotNull() {
            addCriterion("policy_date is not null");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateEqualTo(Date value) {
            addCriterionForJDBCDate("policy_date =", value, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("policy_date <>", value, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("policy_date >", value, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("policy_date >=", value, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateLessThan(Date value) {
            addCriterionForJDBCDate("policy_date <", value, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("policy_date <=", value, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateIn(List<Date> values) {
            addCriterionForJDBCDate("policy_date in", values, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("policy_date not in", values, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("policy_date between", value1, value2, "policy_date");
            return (Criteria) this;
        }

        public Criteria andPolicy_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("policy_date not between", value1, value2, "policy_date");
            return (Criteria) this;
        }

        public Criteria andRebate_idIsNull() {
            addCriterion("rebate_id is null");
            return (Criteria) this;
        }

        public Criteria andRebate_idIsNotNull() {
            addCriterion("rebate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRebate_idEqualTo(Integer value) {
            addCriterion("rebate_id =", value, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idNotEqualTo(Integer value) {
            addCriterion("rebate_id <>", value, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idGreaterThan(Integer value) {
            addCriterion("rebate_id >", value, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebate_id >=", value, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idLessThan(Integer value) {
            addCriterion("rebate_id <", value, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idLessThanOrEqualTo(Integer value) {
            addCriterion("rebate_id <=", value, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idIn(List<Integer> values) {
            addCriterion("rebate_id in", values, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idNotIn(List<Integer> values) {
            addCriterion("rebate_id not in", values, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idBetween(Integer value1, Integer value2) {
            addCriterion("rebate_id between", value1, value2, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebate_idNotBetween(Integer value1, Integer value2) {
            addCriterion("rebate_id not between", value1, value2, "rebate_id");
            return (Criteria) this;
        }

        public Criteria andRebateIsNull() {
            addCriterion("rebate is null");
            return (Criteria) this;
        }

        public Criteria andRebateIsNotNull() {
            addCriterion("rebate is not null");
            return (Criteria) this;
        }

        public Criteria andRebateEqualTo(String value) {
            addCriterion("rebate =", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotEqualTo(String value) {
            addCriterion("rebate <>", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThan(String value) {
            addCriterion("rebate >", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThanOrEqualTo(String value) {
            addCriterion("rebate >=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThan(String value) {
            addCriterion("rebate <", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThanOrEqualTo(String value) {
            addCriterion("rebate <=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLike(String value) {
            addCriterion("rebate like", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotLike(String value) {
            addCriterion("rebate not like", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateIn(List<String> values) {
            addCriterion("rebate in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotIn(List<String> values) {
            addCriterion("rebate not in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateBetween(String value1, String value2) {
            addCriterion("rebate between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotBetween(String value1, String value2) {
            addCriterion("rebate not between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(String value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(String value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(String value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(String value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(String value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(String value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLike(String value) {
            addCriterion("profit like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotLike(String value) {
            addCriterion("profit not like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<String> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<String> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(String value1, String value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(String value1, String value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idIsNull() {
            addCriterion("settlement_basis_id is null");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idIsNotNull() {
            addCriterion("settlement_basis_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idEqualTo(Integer value) {
            addCriterion("settlement_basis_id =", value, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idNotEqualTo(Integer value) {
            addCriterion("settlement_basis_id <>", value, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idGreaterThan(Integer value) {
            addCriterion("settlement_basis_id >", value, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_basis_id >=", value, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idLessThan(Integer value) {
            addCriterion("settlement_basis_id <", value, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_basis_id <=", value, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idIn(List<Integer> values) {
            addCriterion("settlement_basis_id in", values, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idNotIn(List<Integer> values) {
            addCriterion("settlement_basis_id not in", values, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idBetween(Integer value1, Integer value2) {
            addCriterion("settlement_basis_id between", value1, value2, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_basis_idNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_basis_id not between", value1, value2, "settlement_basis_id");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("payee like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("payee not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("payee not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andBank_depositIsNull() {
            addCriterion("bank_deposit is null");
            return (Criteria) this;
        }

        public Criteria andBank_depositIsNotNull() {
            addCriterion("bank_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andBank_depositEqualTo(String value) {
            addCriterion("bank_deposit =", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotEqualTo(String value) {
            addCriterion("bank_deposit <>", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositGreaterThan(String value) {
            addCriterion("bank_deposit >", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositGreaterThanOrEqualTo(String value) {
            addCriterion("bank_deposit >=", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositLessThan(String value) {
            addCriterion("bank_deposit <", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositLessThanOrEqualTo(String value) {
            addCriterion("bank_deposit <=", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositLike(String value) {
            addCriterion("bank_deposit like", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotLike(String value) {
            addCriterion("bank_deposit not like", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositIn(List<String> values) {
            addCriterion("bank_deposit in", values, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotIn(List<String> values) {
            addCriterion("bank_deposit not in", values, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositBetween(String value1, String value2) {
            addCriterion("bank_deposit between", value1, value2, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotBetween(String value1, String value2) {
            addCriterion("bank_deposit not between", value1, value2, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_accountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBank_accountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBank_accountEqualTo(String value) {
            addCriterion("bank_account =", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountLessThan(String value) {
            addCriterion("bank_account <", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountLike(String value) {
            addCriterion("bank_account like", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotLike(String value) {
            addCriterion("bank_account not like", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountIn(List<String> values) {
            addCriterion("bank_account in", values, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bank_account");
            return (Criteria) this;
        }

        public Criteria andCharge_idIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andCharge_idIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andCharge_idEqualTo(String value) {
            addCriterion("charge_id =", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idNotEqualTo(String value) {
            addCriterion("charge_id <>", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idGreaterThan(String value) {
            addCriterion("charge_id >", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idGreaterThanOrEqualTo(String value) {
            addCriterion("charge_id >=", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idLessThan(String value) {
            addCriterion("charge_id <", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idLessThanOrEqualTo(String value) {
            addCriterion("charge_id <=", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idLike(String value) {
            addCriterion("charge_id like", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idNotLike(String value) {
            addCriterion("charge_id not like", value, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idIn(List<String> values) {
            addCriterion("charge_id in", values, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idNotIn(List<String> values) {
            addCriterion("charge_id not in", values, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idBetween(String value1, String value2) {
            addCriterion("charge_id between", value1, value2, "charge_id");
            return (Criteria) this;
        }

        public Criteria andCharge_idNotBetween(String value1, String value2) {
            addCriterion("charge_id not between", value1, value2, "charge_id");
            return (Criteria) this;
        }

        public Criteria andApi_fileIsNull() {
            addCriterion("api_file is null");
            return (Criteria) this;
        }

        public Criteria andApi_fileIsNotNull() {
            addCriterion("api_file is not null");
            return (Criteria) this;
        }

        public Criteria andApi_fileEqualTo(String value) {
            addCriterion("api_file =", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileNotEqualTo(String value) {
            addCriterion("api_file <>", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileGreaterThan(String value) {
            addCriterion("api_file >", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileGreaterThanOrEqualTo(String value) {
            addCriterion("api_file >=", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileLessThan(String value) {
            addCriterion("api_file <", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileLessThanOrEqualTo(String value) {
            addCriterion("api_file <=", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileLike(String value) {
            addCriterion("api_file like", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileNotLike(String value) {
            addCriterion("api_file not like", value, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileIn(List<String> values) {
            addCriterion("api_file in", values, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileNotIn(List<String> values) {
            addCriterion("api_file not in", values, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileBetween(String value1, String value2) {
            addCriterion("api_file between", value1, value2, "api_file");
            return (Criteria) this;
        }

        public Criteria andApi_fileNotBetween(String value1, String value2) {
            addCriterion("api_file not between", value1, value2, "api_file");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
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
            addCriterionForJDBCDate("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "create_time");
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