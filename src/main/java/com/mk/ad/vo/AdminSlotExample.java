package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminSlotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminSlotExample() {
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

        public Criteria andMedia_nameIsNull() {
            addCriterion("media_name is null");
            return (Criteria) this;
        }

        public Criteria andMedia_nameIsNotNull() {
            addCriterion("media_name is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_nameEqualTo(String value) {
            addCriterion("media_name =", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameNotEqualTo(String value) {
            addCriterion("media_name <>", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameGreaterThan(String value) {
            addCriterion("media_name >", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameGreaterThanOrEqualTo(String value) {
            addCriterion("media_name >=", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameLessThan(String value) {
            addCriterion("media_name <", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameLessThanOrEqualTo(String value) {
            addCriterion("media_name <=", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameLike(String value) {
            addCriterion("media_name like", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameNotLike(String value) {
            addCriterion("media_name not like", value, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameIn(List<String> values) {
            addCriterion("media_name in", values, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameNotIn(List<String> values) {
            addCriterion("media_name not in", values, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameBetween(String value1, String value2) {
            addCriterion("media_name between", value1, value2, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_nameNotBetween(String value1, String value2) {
            addCriterion("media_name not between", value1, value2, "media_name");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneIsNull() {
            addCriterion("media_industry_one is null");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneIsNotNull() {
            addCriterion("media_industry_one is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneEqualTo(Integer value) {
            addCriterion("media_industry_one =", value, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneNotEqualTo(Integer value) {
            addCriterion("media_industry_one <>", value, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneGreaterThan(Integer value) {
            addCriterion("media_industry_one >", value, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_industry_one >=", value, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneLessThan(Integer value) {
            addCriterion("media_industry_one <", value, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneLessThanOrEqualTo(Integer value) {
            addCriterion("media_industry_one <=", value, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneIn(List<Integer> values) {
            addCriterion("media_industry_one in", values, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneNotIn(List<Integer> values) {
            addCriterion("media_industry_one not in", values, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneBetween(Integer value1, Integer value2) {
            addCriterion("media_industry_one between", value1, value2, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_oneNotBetween(Integer value1, Integer value2) {
            addCriterion("media_industry_one not between", value1, value2, "media_industry_one");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoIsNull() {
            addCriterion("media_industry_two is null");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoIsNotNull() {
            addCriterion("media_industry_two is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoEqualTo(Integer value) {
            addCriterion("media_industry_two =", value, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoNotEqualTo(Integer value) {
            addCriterion("media_industry_two <>", value, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoGreaterThan(Integer value) {
            addCriterion("media_industry_two >", value, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_industry_two >=", value, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoLessThan(Integer value) {
            addCriterion("media_industry_two <", value, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoLessThanOrEqualTo(Integer value) {
            addCriterion("media_industry_two <=", value, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoIn(List<Integer> values) {
            addCriterion("media_industry_two in", values, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoNotIn(List<Integer> values) {
            addCriterion("media_industry_two not in", values, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoBetween(Integer value1, Integer value2) {
            addCriterion("media_industry_two between", value1, value2, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_industry_twoNotBetween(Integer value1, Integer value2) {
            addCriterion("media_industry_two not between", value1, value2, "media_industry_two");
            return (Criteria) this;
        }

        public Criteria andMedia_idIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMedia_idIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_idEqualTo(String value) {
            addCriterion("media_id =", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idNotEqualTo(String value) {
            addCriterion("media_id <>", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idGreaterThan(String value) {
            addCriterion("media_id >", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idLessThan(String value) {
            addCriterion("media_id <", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idLike(String value) {
            addCriterion("media_id like", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idNotLike(String value) {
            addCriterion("media_id not like", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idIn(List<String> values) {
            addCriterion("media_id in", values, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idNotIn(List<String> values) {
            addCriterion("media_id not in", values, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "media_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatform_idIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatform_idEqualTo(Integer value) {
            addCriterion("platform_id =", value, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idNotEqualTo(Integer value) {
            addCriterion("platform_id <>", value, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idGreaterThan(Integer value) {
            addCriterion("platform_id >", value, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_id >=", value, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idLessThan(Integer value) {
            addCriterion("platform_id <", value, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idLessThanOrEqualTo(Integer value) {
            addCriterion("platform_id <=", value, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idIn(List<Integer> values) {
            addCriterion("platform_id in", values, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idNotIn(List<Integer> values) {
            addCriterion("platform_id not in", values, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idBetween(Integer value1, Integer value2) {
            addCriterion("platform_id between", value1, value2, "platform_id");
            return (Criteria) this;
        }

        public Criteria andPlatform_idNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_id not between", value1, value2, "platform_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idIsNull() {
            addCriterion("operation_id is null");
            return (Criteria) this;
        }

        public Criteria andOperation_idIsNotNull() {
            addCriterion("operation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperation_idEqualTo(Integer value) {
            addCriterion("operation_id =", value, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idNotEqualTo(Integer value) {
            addCriterion("operation_id <>", value, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idGreaterThan(Integer value) {
            addCriterion("operation_id >", value, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_id >=", value, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idLessThan(Integer value) {
            addCriterion("operation_id <", value, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idLessThanOrEqualTo(Integer value) {
            addCriterion("operation_id <=", value, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idIn(List<Integer> values) {
            addCriterion("operation_id in", values, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idNotIn(List<Integer> values) {
            addCriterion("operation_id not in", values, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idBetween(Integer value1, Integer value2) {
            addCriterion("operation_id between", value1, value2, "operation_id");
            return (Criteria) this;
        }

        public Criteria andOperation_idNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_id not between", value1, value2, "operation_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idIsNull() {
            addCriterion("slot_id is null");
            return (Criteria) this;
        }

        public Criteria andSlot_idIsNotNull() {
            addCriterion("slot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_idEqualTo(Integer value) {
            addCriterion("slot_id =", value, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idNotEqualTo(Integer value) {
            addCriterion("slot_id <>", value, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idGreaterThan(Integer value) {
            addCriterion("slot_id >", value, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot_id >=", value, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idLessThan(Integer value) {
            addCriterion("slot_id <", value, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idLessThanOrEqualTo(Integer value) {
            addCriterion("slot_id <=", value, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idIn(List<Integer> values) {
            addCriterion("slot_id in", values, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idNotIn(List<Integer> values) {
            addCriterion("slot_id not in", values, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idBetween(Integer value1, Integer value2) {
            addCriterion("slot_id between", value1, value2, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_idNotBetween(Integer value1, Integer value2) {
            addCriterion("slot_id not between", value1, value2, "slot_id");
            return (Criteria) this;
        }

        public Criteria andSlot_nameIsNull() {
            addCriterion("slot_name is null");
            return (Criteria) this;
        }

        public Criteria andSlot_nameIsNotNull() {
            addCriterion("slot_name is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_nameEqualTo(String value) {
            addCriterion("slot_name =", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameNotEqualTo(String value) {
            addCriterion("slot_name <>", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameGreaterThan(String value) {
            addCriterion("slot_name >", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameGreaterThanOrEqualTo(String value) {
            addCriterion("slot_name >=", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameLessThan(String value) {
            addCriterion("slot_name <", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameLessThanOrEqualTo(String value) {
            addCriterion("slot_name <=", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameLike(String value) {
            addCriterion("slot_name like", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameNotLike(String value) {
            addCriterion("slot_name not like", value, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameIn(List<String> values) {
            addCriterion("slot_name in", values, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameNotIn(List<String> values) {
            addCriterion("slot_name not in", values, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameBetween(String value1, String value2) {
            addCriterion("slot_name between", value1, value2, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_nameNotBetween(String value1, String value2) {
            addCriterion("slot_name not between", value1, value2, "slot_name");
            return (Criteria) this;
        }

        public Criteria andSlot_classIsNull() {
            addCriterion("slot_class is null");
            return (Criteria) this;
        }

        public Criteria andSlot_classIsNotNull() {
            addCriterion("slot_class is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_classEqualTo(String value) {
            addCriterion("slot_class =", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classNotEqualTo(String value) {
            addCriterion("slot_class <>", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classGreaterThan(String value) {
            addCriterion("slot_class >", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classGreaterThanOrEqualTo(String value) {
            addCriterion("slot_class >=", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classLessThan(String value) {
            addCriterion("slot_class <", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classLessThanOrEqualTo(String value) {
            addCriterion("slot_class <=", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classLike(String value) {
            addCriterion("slot_class like", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classNotLike(String value) {
            addCriterion("slot_class not like", value, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classIn(List<String> values) {
            addCriterion("slot_class in", values, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classNotIn(List<String> values) {
            addCriterion("slot_class not in", values, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classBetween(String value1, String value2) {
            addCriterion("slot_class between", value1, value2, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_classNotBetween(String value1, String value2) {
            addCriterion("slot_class not between", value1, value2, "slot_class");
            return (Criteria) this;
        }

        public Criteria andSlot_typeIsNull() {
            addCriterion("slot_type is null");
            return (Criteria) this;
        }

        public Criteria andSlot_typeIsNotNull() {
            addCriterion("slot_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_typeEqualTo(Integer value) {
            addCriterion("slot_type =", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeNotEqualTo(Integer value) {
            addCriterion("slot_type <>", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeGreaterThan(Integer value) {
            addCriterion("slot_type >", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot_type >=", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeLessThan(Integer value) {
            addCriterion("slot_type <", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeLessThanOrEqualTo(Integer value) {
            addCriterion("slot_type <=", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeIn(List<Integer> values) {
            addCriterion("slot_type in", values, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeNotIn(List<Integer> values) {
            addCriterion("slot_type not in", values, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeBetween(Integer value1, Integer value2) {
            addCriterion("slot_type between", value1, value2, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("slot_type not between", value1, value2, "slot_type");
            return (Criteria) this;
        }

        public Criteria andExtension_idIsNull() {
            addCriterion("extension_id is null");
            return (Criteria) this;
        }

        public Criteria andExtension_idIsNotNull() {
            addCriterion("extension_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtension_idEqualTo(Integer value) {
            addCriterion("extension_id =", value, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idNotEqualTo(Integer value) {
            addCriterion("extension_id <>", value, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idGreaterThan(Integer value) {
            addCriterion("extension_id >", value, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("extension_id >=", value, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idLessThan(Integer value) {
            addCriterion("extension_id <", value, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idLessThanOrEqualTo(Integer value) {
            addCriterion("extension_id <=", value, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idIn(List<Integer> values) {
            addCriterion("extension_id in", values, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idNotIn(List<Integer> values) {
            addCriterion("extension_id not in", values, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idBetween(Integer value1, Integer value2) {
            addCriterion("extension_id between", value1, value2, "extension_id");
            return (Criteria) this;
        }

        public Criteria andExtension_idNotBetween(Integer value1, Integer value2) {
            addCriterion("extension_id not between", value1, value2, "extension_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idIsNull() {
            addCriterion("creative_id is null");
            return (Criteria) this;
        }

        public Criteria andCreative_idIsNotNull() {
            addCriterion("creative_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreative_idEqualTo(String value) {
            addCriterion("creative_id =", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idNotEqualTo(String value) {
            addCriterion("creative_id <>", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idGreaterThan(String value) {
            addCriterion("creative_id >", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idGreaterThanOrEqualTo(String value) {
            addCriterion("creative_id >=", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idLessThan(String value) {
            addCriterion("creative_id <", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idLessThanOrEqualTo(String value) {
            addCriterion("creative_id <=", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idLike(String value) {
            addCriterion("creative_id like", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idNotLike(String value) {
            addCriterion("creative_id not like", value, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idIn(List<String> values) {
            addCriterion("creative_id in", values, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idNotIn(List<String> values) {
            addCriterion("creative_id not in", values, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idBetween(String value1, String value2) {
            addCriterion("creative_id between", value1, value2, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_idNotBetween(String value1, String value2) {
            addCriterion("creative_id not between", value1, value2, "creative_id");
            return (Criteria) this;
        }

        public Criteria andCreative_templateIsNull() {
            addCriterion("creative_template is null");
            return (Criteria) this;
        }

        public Criteria andCreative_templateIsNotNull() {
            addCriterion("creative_template is not null");
            return (Criteria) this;
        }

        public Criteria andCreative_templateEqualTo(String value) {
            addCriterion("creative_template =", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateNotEqualTo(String value) {
            addCriterion("creative_template <>", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateGreaterThan(String value) {
            addCriterion("creative_template >", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateGreaterThanOrEqualTo(String value) {
            addCriterion("creative_template >=", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateLessThan(String value) {
            addCriterion("creative_template <", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateLessThanOrEqualTo(String value) {
            addCriterion("creative_template <=", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateLike(String value) {
            addCriterion("creative_template like", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateNotLike(String value) {
            addCriterion("creative_template not like", value, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateIn(List<String> values) {
            addCriterion("creative_template in", values, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateNotIn(List<String> values) {
            addCriterion("creative_template not in", values, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateBetween(String value1, String value2) {
            addCriterion("creative_template between", value1, value2, "creative_template");
            return (Criteria) this;
        }

        public Criteria andCreative_templateNotBetween(String value1, String value2) {
            addCriterion("creative_template not between", value1, value2, "creative_template");
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

        public Criteria andSettlement_unit_priceIsNull() {
            addCriterion("settlement_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceIsNotNull() {
            addCriterion("settlement_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceEqualTo(Integer value) {
            addCriterion("settlement_unit_price =", value, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceNotEqualTo(Integer value) {
            addCriterion("settlement_unit_price <>", value, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceGreaterThan(Integer value) {
            addCriterion("settlement_unit_price >", value, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_unit_price >=", value, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceLessThan(Integer value) {
            addCriterion("settlement_unit_price <", value, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_unit_price <=", value, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceIn(List<Integer> values) {
            addCriterion("settlement_unit_price in", values, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceNotIn(List<Integer> values) {
            addCriterion("settlement_unit_price not in", values, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceBetween(Integer value1, Integer value2) {
            addCriterion("settlement_unit_price between", value1, value2, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andSettlement_unit_priceNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_unit_price not between", value1, value2, "settlement_unit_price");
            return (Criteria) this;
        }

        public Criteria andDate_startIsNull() {
            addCriterion("date_start is null");
            return (Criteria) this;
        }

        public Criteria andDate_startIsNotNull() {
            addCriterion("date_start is not null");
            return (Criteria) this;
        }

        public Criteria andDate_startEqualTo(Date value) {
            addCriterion("date_start =", value, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startNotEqualTo(Date value) {
            addCriterion("date_start <>", value, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startGreaterThan(Date value) {
            addCriterion("date_start >", value, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startGreaterThanOrEqualTo(Date value) {
            addCriterion("date_start >=", value, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startLessThan(Date value) {
            addCriterion("date_start <", value, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startLessThanOrEqualTo(Date value) {
            addCriterion("date_start <=", value, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startIn(List<Date> values) {
            addCriterion("date_start in", values, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startNotIn(List<Date> values) {
            addCriterion("date_start not in", values, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startBetween(Date value1, Date value2) {
            addCriterion("date_start between", value1, value2, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_startNotBetween(Date value1, Date value2) {
            addCriterion("date_start not between", value1, value2, "date_start");
            return (Criteria) this;
        }

        public Criteria andDate_endIsNull() {
            addCriterion("date_end is null");
            return (Criteria) this;
        }

        public Criteria andDate_endIsNotNull() {
            addCriterion("date_end is not null");
            return (Criteria) this;
        }

        public Criteria andDate_endEqualTo(Date value) {
            addCriterion("date_end =", value, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endNotEqualTo(Date value) {
            addCriterion("date_end <>", value, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endGreaterThan(Date value) {
            addCriterion("date_end >", value, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endGreaterThanOrEqualTo(Date value) {
            addCriterion("date_end >=", value, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endLessThan(Date value) {
            addCriterion("date_end <", value, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endLessThanOrEqualTo(Date value) {
            addCriterion("date_end <=", value, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endIn(List<Date> values) {
            addCriterion("date_end in", values, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endNotIn(List<Date> values) {
            addCriterion("date_end not in", values, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endBetween(Date value1, Date value2) {
            addCriterion("date_end between", value1, value2, "date_end");
            return (Criteria) this;
        }

        public Criteria andDate_endNotBetween(Date value1, Date value2) {
            addCriterion("date_end not between", value1, value2, "date_end");
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

        public Criteria andIs_deletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "is_deleted");
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