package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.List;

public class AdminSlotConfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminSlotConfigureExample() {
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

        public Criteria andBussiness_type_idIsNull() {
            addCriterion("bussiness_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idIsNotNull() {
            addCriterion("bussiness_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idEqualTo(Integer value) {
            addCriterion("bussiness_type_id =", value, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idNotEqualTo(Integer value) {
            addCriterion("bussiness_type_id <>", value, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idGreaterThan(Integer value) {
            addCriterion("bussiness_type_id >", value, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("bussiness_type_id >=", value, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idLessThan(Integer value) {
            addCriterion("bussiness_type_id <", value, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("bussiness_type_id <=", value, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idIn(List<Integer> values) {
            addCriterion("bussiness_type_id in", values, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idNotIn(List<Integer> values) {
            addCriterion("bussiness_type_id not in", values, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idBetween(Integer value1, Integer value2) {
            addCriterion("bussiness_type_id between", value1, value2, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("bussiness_type_id not between", value1, value2, "bussiness_type_id");
            return (Criteria) this;
        }

        public Criteria andCp_priceIsNull() {
            addCriterion("cp_price is null");
            return (Criteria) this;
        }

        public Criteria andCp_priceIsNotNull() {
            addCriterion("cp_price is not null");
            return (Criteria) this;
        }

        public Criteria andCp_priceEqualTo(Integer value) {
            addCriterion("cp_price =", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceNotEqualTo(Integer value) {
            addCriterion("cp_price <>", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceGreaterThan(Integer value) {
            addCriterion("cp_price >", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_price >=", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceLessThan(Integer value) {
            addCriterion("cp_price <", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceLessThanOrEqualTo(Integer value) {
            addCriterion("cp_price <=", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceIn(List<Integer> values) {
            addCriterion("cp_price in", values, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceNotIn(List<Integer> values) {
            addCriterion("cp_price not in", values, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceBetween(Integer value1, Integer value2) {
            addCriterion("cp_price between", value1, value2, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_price not between", value1, value2, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeIsNull() {
            addCriterion("cooperation_type is null");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeIsNotNull() {
            addCriterion("cooperation_type is not null");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeEqualTo(Integer value) {
            addCriterion("cooperation_type =", value, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeNotEqualTo(Integer value) {
            addCriterion("cooperation_type <>", value, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeGreaterThan(Integer value) {
            addCriterion("cooperation_type >", value, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cooperation_type >=", value, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeLessThan(Integer value) {
            addCriterion("cooperation_type <", value, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeLessThanOrEqualTo(Integer value) {
            addCriterion("cooperation_type <=", value, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeIn(List<Integer> values) {
            addCriterion("cooperation_type in", values, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeNotIn(List<Integer> values) {
            addCriterion("cooperation_type not in", values, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_type between", value1, value2, "cooperation_type");
            return (Criteria) this;
        }

        public Criteria andCooperation_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_type not between", value1, value2, "cooperation_type");
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