package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.List;

public class AdminAdxTemplateMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminAdxTemplateMaterialExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionIsNull() {
            addCriterion("material_description is null");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionIsNotNull() {
            addCriterion("material_description is not null");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionEqualTo(String value) {
            addCriterion("material_description =", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionNotEqualTo(String value) {
            addCriterion("material_description <>", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionGreaterThan(String value) {
            addCriterion("material_description >", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("material_description >=", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionLessThan(String value) {
            addCriterion("material_description <", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionLessThanOrEqualTo(String value) {
            addCriterion("material_description <=", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionLike(String value) {
            addCriterion("material_description like", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionNotLike(String value) {
            addCriterion("material_description not like", value, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionIn(List<String> values) {
            addCriterion("material_description in", values, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionNotIn(List<String> values) {
            addCriterion("material_description not in", values, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionBetween(String value1, String value2) {
            addCriterion("material_description between", value1, value2, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_descriptionNotBetween(String value1, String value2) {
            addCriterion("material_description not between", value1, value2, "material_description");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeEqualTo(String value) {
            addCriterion("material_type =", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeGreaterThan(String value) {
            addCriterion("material_type >", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeLessThan(String value) {
            addCriterion("material_type <", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeLike(String value) {
            addCriterion("material_type like", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeNotLike(String value) {
            addCriterion("material_type not like", value, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeIn(List<String> values) {
            addCriterion("material_type in", values, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_typeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "material_type");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationIsNull() {
            addCriterion("material_specification is null");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationIsNotNull() {
            addCriterion("material_specification is not null");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationEqualTo(String value) {
            addCriterion("material_specification =", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationNotEqualTo(String value) {
            addCriterion("material_specification <>", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationGreaterThan(String value) {
            addCriterion("material_specification >", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationGreaterThanOrEqualTo(String value) {
            addCriterion("material_specification >=", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationLessThan(String value) {
            addCriterion("material_specification <", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationLessThanOrEqualTo(String value) {
            addCriterion("material_specification <=", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationLike(String value) {
            addCriterion("material_specification like", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationNotLike(String value) {
            addCriterion("material_specification not like", value, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationIn(List<String> values) {
            addCriterion("material_specification in", values, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationNotIn(List<String> values) {
            addCriterion("material_specification not in", values, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationBetween(String value1, String value2) {
            addCriterion("material_specification between", value1, value2, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_specificationNotBetween(String value1, String value2) {
            addCriterion("material_specification not between", value1, value2, "material_specification");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeIsNull() {
            addCriterion("material_size is null");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeIsNotNull() {
            addCriterion("material_size is not null");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeEqualTo(Integer value) {
            addCriterion("material_size =", value, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeNotEqualTo(Integer value) {
            addCriterion("material_size <>", value, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeGreaterThan(Integer value) {
            addCriterion("material_size >", value, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_size >=", value, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeLessThan(Integer value) {
            addCriterion("material_size <", value, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeLessThanOrEqualTo(Integer value) {
            addCriterion("material_size <=", value, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeIn(List<Integer> values) {
            addCriterion("material_size in", values, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeNotIn(List<Integer> values) {
            addCriterion("material_size not in", values, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeBetween(Integer value1, Integer value2) {
            addCriterion("material_size between", value1, value2, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_sizeNotBetween(Integer value1, Integer value2) {
            addCriterion("material_size not between", value1, value2, "material_size");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeIsNull() {
            addCriterion("material_time is null");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeIsNotNull() {
            addCriterion("material_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeEqualTo(Integer value) {
            addCriterion("material_time =", value, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeNotEqualTo(Integer value) {
            addCriterion("material_time <>", value, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeGreaterThan(Integer value) {
            addCriterion("material_time >", value, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_time >=", value, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeLessThan(Integer value) {
            addCriterion("material_time <", value, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeLessThanOrEqualTo(Integer value) {
            addCriterion("material_time <=", value, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeIn(List<Integer> values) {
            addCriterion("material_time in", values, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeNotIn(List<Integer> values) {
            addCriterion("material_time not in", values, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeBetween(Integer value1, Integer value2) {
            addCriterion("material_time between", value1, value2, "material_time");
            return (Criteria) this;
        }

        public Criteria andMaterial_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("material_time not between", value1, value2, "material_time");
            return (Criteria) this;
        }

        public Criteria andPhoto_countIsNull() {
            addCriterion("photo_count is null");
            return (Criteria) this;
        }

        public Criteria andPhoto_countIsNotNull() {
            addCriterion("photo_count is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto_countEqualTo(Integer value) {
            addCriterion("photo_count =", value, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countNotEqualTo(Integer value) {
            addCriterion("photo_count <>", value, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countGreaterThan(Integer value) {
            addCriterion("photo_count >", value, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_count >=", value, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countLessThan(Integer value) {
            addCriterion("photo_count <", value, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countLessThanOrEqualTo(Integer value) {
            addCriterion("photo_count <=", value, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countIn(List<Integer> values) {
            addCriterion("photo_count in", values, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countNotIn(List<Integer> values) {
            addCriterion("photo_count not in", values, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countBetween(Integer value1, Integer value2) {
            addCriterion("photo_count between", value1, value2, "photo_count");
            return (Criteria) this;
        }

        public Criteria andPhoto_countNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_count not between", value1, value2, "photo_count");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Integer value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Integer value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Integer value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Integer> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andMust_passIsNull() {
            addCriterion("must_pass is null");
            return (Criteria) this;
        }

        public Criteria andMust_passIsNotNull() {
            addCriterion("must_pass is not null");
            return (Criteria) this;
        }

        public Criteria andMust_passEqualTo(Integer value) {
            addCriterion("must_pass =", value, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passNotEqualTo(Integer value) {
            addCriterion("must_pass <>", value, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passGreaterThan(Integer value) {
            addCriterion("must_pass >", value, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passGreaterThanOrEqualTo(Integer value) {
            addCriterion("must_pass >=", value, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passLessThan(Integer value) {
            addCriterion("must_pass <", value, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passLessThanOrEqualTo(Integer value) {
            addCriterion("must_pass <=", value, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passIn(List<Integer> values) {
            addCriterion("must_pass in", values, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passNotIn(List<Integer> values) {
            addCriterion("must_pass not in", values, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passBetween(Integer value1, Integer value2) {
            addCriterion("must_pass between", value1, value2, "must_pass");
            return (Criteria) this;
        }

        public Criteria andMust_passNotBetween(Integer value1, Integer value2) {
            addCriterion("must_pass not between", value1, value2, "must_pass");
            return (Criteria) this;
        }

        public Criteria andDelete_statusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDelete_statusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelete_statusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusLessThan(Integer value) {
            addCriterion("delete_status <", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "delete_status");
            return (Criteria) this;
        }

        public Criteria andDelete_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "delete_status");
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