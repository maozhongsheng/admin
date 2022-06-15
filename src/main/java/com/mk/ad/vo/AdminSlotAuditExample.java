package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.List;

public class AdminSlotAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminSlotAuditExample() {
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

        public Criteria andSsp_nameIsNull() {
            addCriterion("ssp_name is null");
            return (Criteria) this;
        }

        public Criteria andSsp_nameIsNotNull() {
            addCriterion("ssp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSsp_nameEqualTo(String value) {
            addCriterion("ssp_name =", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameNotEqualTo(String value) {
            addCriterion("ssp_name <>", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameGreaterThan(String value) {
            addCriterion("ssp_name >", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameGreaterThanOrEqualTo(String value) {
            addCriterion("ssp_name >=", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameLessThan(String value) {
            addCriterion("ssp_name <", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameLessThanOrEqualTo(String value) {
            addCriterion("ssp_name <=", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameLike(String value) {
            addCriterion("ssp_name like", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameNotLike(String value) {
            addCriterion("ssp_name not like", value, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameIn(List<String> values) {
            addCriterion("ssp_name in", values, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameNotIn(List<String> values) {
            addCriterion("ssp_name not in", values, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameBetween(String value1, String value2) {
            addCriterion("ssp_name between", value1, value2, "ssp_name");
            return (Criteria) this;
        }

        public Criteria andSsp_nameNotBetween(String value1, String value2) {
            addCriterion("ssp_name not between", value1, value2, "ssp_name");
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