package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminAdxMouldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminAdxMouldExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_idIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_idEqualTo(String value) {
            addCriterion("template_id =", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idNotEqualTo(String value) {
            addCriterion("template_id <>", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idGreaterThan(String value) {
            addCriterion("template_id >", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idGreaterThanOrEqualTo(String value) {
            addCriterion("template_id >=", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idLessThan(String value) {
            addCriterion("template_id <", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idLessThanOrEqualTo(String value) {
            addCriterion("template_id <=", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idLike(String value) {
            addCriterion("template_id like", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idNotLike(String value) {
            addCriterion("template_id not like", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idIn(List<String> values) {
            addCriterion("template_id in", values, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idNotIn(List<String> values) {
            addCriterion("template_id not in", values, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idBetween(String value1, String value2) {
            addCriterion("template_id between", value1, value2, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idNotBetween(String value1, String value2) {
            addCriterion("template_id not between", value1, value2, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameIsNull() {
            addCriterion("template_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameIsNotNull() {
            addCriterion("template_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameEqualTo(String value) {
            addCriterion("template_name =", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameNotEqualTo(String value) {
            addCriterion("template_name <>", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameGreaterThan(String value) {
            addCriterion("template_name >", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameGreaterThanOrEqualTo(String value) {
            addCriterion("template_name >=", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameLessThan(String value) {
            addCriterion("template_name <", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameLessThanOrEqualTo(String value) {
            addCriterion("template_name <=", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameLike(String value) {
            addCriterion("template_name like", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameNotLike(String value) {
            addCriterion("template_name not like", value, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameIn(List<String> values) {
            addCriterion("template_name in", values, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameNotIn(List<String> values) {
            addCriterion("template_name not in", values, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameBetween(String value1, String value2) {
            addCriterion("template_name between", value1, value2, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_nameNotBetween(String value1, String value2) {
            addCriterion("template_name not between", value1, value2, "template_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameIsNull() {
            addCriterion("template_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameIsNotNull() {
            addCriterion("template_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameEqualTo(String value) {
            addCriterion("template_type_name =", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameNotEqualTo(String value) {
            addCriterion("template_type_name <>", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameGreaterThan(String value) {
            addCriterion("template_type_name >", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameGreaterThanOrEqualTo(String value) {
            addCriterion("template_type_name >=", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameLessThan(String value) {
            addCriterion("template_type_name <", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameLessThanOrEqualTo(String value) {
            addCriterion("template_type_name <=", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameLike(String value) {
            addCriterion("template_type_name like", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameNotLike(String value) {
            addCriterion("template_type_name not like", value, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameIn(List<String> values) {
            addCriterion("template_type_name in", values, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameNotIn(List<String> values) {
            addCriterion("template_type_name not in", values, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameBetween(String value1, String value2) {
            addCriterion("template_type_name between", value1, value2, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_type_nameNotBetween(String value1, String value2) {
            addCriterion("template_type_name not between", value1, value2, "template_type_name");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeIsNull() {
            addCriterion("template_type is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeIsNotNull() {
            addCriterion("template_type is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeEqualTo(String value) {
            addCriterion("template_type =", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeNotEqualTo(String value) {
            addCriterion("template_type <>", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeGreaterThan(String value) {
            addCriterion("template_type >", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeGreaterThanOrEqualTo(String value) {
            addCriterion("template_type >=", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeLessThan(String value) {
            addCriterion("template_type <", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeLessThanOrEqualTo(String value) {
            addCriterion("template_type <=", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeLike(String value) {
            addCriterion("template_type like", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeNotLike(String value) {
            addCriterion("template_type not like", value, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeIn(List<String> values) {
            addCriterion("template_type in", values, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeNotIn(List<String> values) {
            addCriterion("template_type not in", values, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeBetween(String value1, String value2) {
            addCriterion("template_type between", value1, value2, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_typeNotBetween(String value1, String value2) {
            addCriterion("template_type not between", value1, value2, "template_type");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionIsNull() {
            addCriterion("template_description is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionIsNotNull() {
            addCriterion("template_description is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionEqualTo(String value) {
            addCriterion("template_description =", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionNotEqualTo(String value) {
            addCriterion("template_description <>", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionGreaterThan(String value) {
            addCriterion("template_description >", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("template_description >=", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionLessThan(String value) {
            addCriterion("template_description <", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionLessThanOrEqualTo(String value) {
            addCriterion("template_description <=", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionLike(String value) {
            addCriterion("template_description like", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionNotLike(String value) {
            addCriterion("template_description not like", value, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionIn(List<String> values) {
            addCriterion("template_description in", values, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionNotIn(List<String> values) {
            addCriterion("template_description not in", values, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionBetween(String value1, String value2) {
            addCriterion("template_description between", value1, value2, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_descriptionNotBetween(String value1, String value2) {
            addCriterion("template_description not between", value1, value2, "template_description");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoIsNull() {
            addCriterion("template_photo is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoIsNotNull() {
            addCriterion("template_photo is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoEqualTo(String value) {
            addCriterion("template_photo =", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoNotEqualTo(String value) {
            addCriterion("template_photo <>", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoGreaterThan(String value) {
            addCriterion("template_photo >", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoGreaterThanOrEqualTo(String value) {
            addCriterion("template_photo >=", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoLessThan(String value) {
            addCriterion("template_photo <", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoLessThanOrEqualTo(String value) {
            addCriterion("template_photo <=", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoLike(String value) {
            addCriterion("template_photo like", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoNotLike(String value) {
            addCriterion("template_photo not like", value, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoIn(List<String> values) {
            addCriterion("template_photo in", values, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoNotIn(List<String> values) {
            addCriterion("template_photo not in", values, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoBetween(String value1, String value2) {
            addCriterion("template_photo between", value1, value2, "template_photo");
            return (Criteria) this;
        }

        public Criteria andTemplate_photoNotBetween(String value1, String value2) {
            addCriterion("template_photo not between", value1, value2, "template_photo");
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

        public Criteria andPromotion_typeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeEqualTo(String value) {
            addCriterion("promotion_type =", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeNotEqualTo(String value) {
            addCriterion("promotion_type <>", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeGreaterThan(String value) {
            addCriterion("promotion_type >", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_type >=", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeLessThan(String value) {
            addCriterion("promotion_type <", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeLessThanOrEqualTo(String value) {
            addCriterion("promotion_type <=", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeLike(String value) {
            addCriterion("promotion_type like", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeNotLike(String value) {
            addCriterion("promotion_type not like", value, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeIn(List<String> values) {
            addCriterion("promotion_type in", values, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeNotIn(List<String> values) {
            addCriterion("promotion_type not in", values, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeBetween(String value1, String value2) {
            addCriterion("promotion_type between", value1, value2, "promotion_type");
            return (Criteria) this;
        }

        public Criteria andPromotion_typeNotBetween(String value1, String value2) {
            addCriterion("promotion_type not between", value1, value2, "promotion_type");
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