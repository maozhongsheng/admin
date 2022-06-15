package com.mk.ad.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SspAdSlotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SspAdSlotExample() {
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

        public Criteria andMedia_idIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMedia_idIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_idEqualTo(Integer value) {
            addCriterion("media_id =", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idNotEqualTo(Integer value) {
            addCriterion("media_id <>", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idGreaterThan(Integer value) {
            addCriterion("media_id >", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_id >=", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idLessThan(Integer value) {
            addCriterion("media_id <", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idLessThanOrEqualTo(Integer value) {
            addCriterion("media_id <=", value, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idIn(List<Integer> values) {
            addCriterion("media_id in", values, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idNotIn(List<Integer> values) {
            addCriterion("media_id not in", values, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idBetween(Integer value1, Integer value2) {
            addCriterion("media_id between", value1, value2, "media_id");
            return (Criteria) this;
        }

        public Criteria andMedia_idNotBetween(Integer value1, Integer value2) {
            addCriterion("media_id not between", value1, value2, "media_id");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneIsNull() {
            addCriterion("bussiness_type_one is null");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneIsNotNull() {
            addCriterion("bussiness_type_one is not null");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneEqualTo(String value) {
            addCriterion("bussiness_type_one =", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneNotEqualTo(String value) {
            addCriterion("bussiness_type_one <>", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneGreaterThan(String value) {
            addCriterion("bussiness_type_one >", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneGreaterThanOrEqualTo(String value) {
            addCriterion("bussiness_type_one >=", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneLessThan(String value) {
            addCriterion("bussiness_type_one <", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneLessThanOrEqualTo(String value) {
            addCriterion("bussiness_type_one <=", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneLike(String value) {
            addCriterion("bussiness_type_one like", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneNotLike(String value) {
            addCriterion("bussiness_type_one not like", value, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneIn(List<String> values) {
            addCriterion("bussiness_type_one in", values, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneNotIn(List<String> values) {
            addCriterion("bussiness_type_one not in", values, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneBetween(String value1, String value2) {
            addCriterion("bussiness_type_one between", value1, value2, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andBussiness_type_oneNotBetween(String value1, String value2) {
            addCriterion("bussiness_type_one not between", value1, value2, "bussiness_type_one");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idIsNull() {
            addCriterion("slot_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idIsNotNull() {
            addCriterion("slot_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idEqualTo(Integer value) {
            addCriterion("slot_type_id =", value, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idNotEqualTo(Integer value) {
            addCriterion("slot_type_id <>", value, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idGreaterThan(Integer value) {
            addCriterion("slot_type_id >", value, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot_type_id >=", value, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idLessThan(Integer value) {
            addCriterion("slot_type_id <", value, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("slot_type_id <=", value, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idIn(List<Integer> values) {
            addCriterion("slot_type_id in", values, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idNotIn(List<Integer> values) {
            addCriterion("slot_type_id not in", values, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idBetween(Integer value1, Integer value2) {
            addCriterion("slot_type_id between", value1, value2, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andSlot_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("slot_type_id not between", value1, value2, "slot_type_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idIsNull() {
            addCriterion("ad_template_id is null");
            return (Criteria) this;
        }

        public Criteria andAd_template_idIsNotNull() {
            addCriterion("ad_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andAd_template_idEqualTo(Integer value) {
            addCriterion("ad_template_id =", value, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idNotEqualTo(Integer value) {
            addCriterion("ad_template_id <>", value, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idGreaterThan(Integer value) {
            addCriterion("ad_template_id >", value, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_template_id >=", value, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idLessThan(Integer value) {
            addCriterion("ad_template_id <", value, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idLessThanOrEqualTo(Integer value) {
            addCriterion("ad_template_id <=", value, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idIn(List<Integer> values) {
            addCriterion("ad_template_id in", values, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idNotIn(List<Integer> values) {
            addCriterion("ad_template_id not in", values, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idBetween(Integer value1, Integer value2) {
            addCriterion("ad_template_id between", value1, value2, "ad_template_id");
            return (Criteria) this;
        }

        public Criteria andAd_template_idNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_template_id not between", value1, value2, "ad_template_id");
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

        public Criteria andSlot_statusIsNull() {
            addCriterion("slot_status is null");
            return (Criteria) this;
        }

        public Criteria andSlot_statusIsNotNull() {
            addCriterion("slot_status is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_statusEqualTo(Integer value) {
            addCriterion("slot_status =", value, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusNotEqualTo(Integer value) {
            addCriterion("slot_status <>", value, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusGreaterThan(Integer value) {
            addCriterion("slot_status >", value, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot_status >=", value, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusLessThan(Integer value) {
            addCriterion("slot_status <", value, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusLessThanOrEqualTo(Integer value) {
            addCriterion("slot_status <=", value, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusIn(List<Integer> values) {
            addCriterion("slot_status in", values, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusNotIn(List<Integer> values) {
            addCriterion("slot_status not in", values, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusBetween(Integer value1, Integer value2) {
            addCriterion("slot_status between", value1, value2, "slot_status");
            return (Criteria) this;
        }

        public Criteria andSlot_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("slot_status not between", value1, value2, "slot_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusIsNull() {
            addCriterion("business_status is null");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusIsNotNull() {
            addCriterion("business_status is not null");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusEqualTo(Integer value) {
            addCriterion("business_status =", value, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusNotEqualTo(Integer value) {
            addCriterion("business_status <>", value, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusGreaterThan(Integer value) {
            addCriterion("business_status >", value, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_status >=", value, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusLessThan(Integer value) {
            addCriterion("business_status <", value, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusLessThanOrEqualTo(Integer value) {
            addCriterion("business_status <=", value, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusIn(List<Integer> values) {
            addCriterion("business_status in", values, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusNotIn(List<Integer> values) {
            addCriterion("business_status not in", values, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusBetween(Integer value1, Integer value2) {
            addCriterion("business_status between", value1, value2, "business_status");
            return (Criteria) this;
        }

        public Criteria andBusiness_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("business_status not between", value1, value2, "business_status");
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

        public Criteria andRender_typeIsNull() {
            addCriterion("render_type is null");
            return (Criteria) this;
        }

        public Criteria andRender_typeIsNotNull() {
            addCriterion("render_type is not null");
            return (Criteria) this;
        }

        public Criteria andRender_typeEqualTo(Integer value) {
            addCriterion("render_type =", value, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeNotEqualTo(Integer value) {
            addCriterion("render_type <>", value, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeGreaterThan(Integer value) {
            addCriterion("render_type >", value, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("render_type >=", value, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeLessThan(Integer value) {
            addCriterion("render_type <", value, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeLessThanOrEqualTo(Integer value) {
            addCriterion("render_type <=", value, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeIn(List<Integer> values) {
            addCriterion("render_type in", values, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeNotIn(List<Integer> values) {
            addCriterion("render_type not in", values, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeBetween(Integer value1, Integer value2) {
            addCriterion("render_type between", value1, value2, "render_type");
            return (Criteria) this;
        }

        public Criteria andRender_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("render_type not between", value1, value2, "render_type");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeIsNull() {
            addCriterion("ad_pull_mode is null");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeIsNotNull() {
            addCriterion("ad_pull_mode is not null");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeEqualTo(Integer value) {
            addCriterion("ad_pull_mode =", value, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeNotEqualTo(Integer value) {
            addCriterion("ad_pull_mode <>", value, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeGreaterThan(Integer value) {
            addCriterion("ad_pull_mode >", value, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_pull_mode >=", value, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeLessThan(Integer value) {
            addCriterion("ad_pull_mode <", value, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeLessThanOrEqualTo(Integer value) {
            addCriterion("ad_pull_mode <=", value, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeIn(List<Integer> values) {
            addCriterion("ad_pull_mode in", values, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeNotIn(List<Integer> values) {
            addCriterion("ad_pull_mode not in", values, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeBetween(Integer value1, Integer value2) {
            addCriterion("ad_pull_mode between", value1, value2, "ad_pull_mode");
            return (Criteria) this;
        }

        public Criteria andAd_pull_modeNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_pull_mode not between", value1, value2, "ad_pull_mode");
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

        public Criteria andCp_priceEqualTo(BigDecimal value) {
            addCriterion("cp_price =", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceNotEqualTo(BigDecimal value) {
            addCriterion("cp_price <>", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceGreaterThan(BigDecimal value) {
            addCriterion("cp_price >", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cp_price >=", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceLessThan(BigDecimal value) {
            addCriterion("cp_price <", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cp_price <=", value, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceIn(List<BigDecimal> values) {
            addCriterion("cp_price in", values, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceNotIn(List<BigDecimal> values) {
            addCriterion("cp_price not in", values, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cp_price between", value1, value2, "cp_price");
            return (Criteria) this;
        }

        public Criteria andCp_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cp_price not between", value1, value2, "cp_price");
            return (Criteria) this;
        }

        public Criteria andRequet_rateIsNull() {
            addCriterion("requet_rate is null");
            return (Criteria) this;
        }

        public Criteria andRequet_rateIsNotNull() {
            addCriterion("requet_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRequet_rateEqualTo(String value) {
            addCriterion("requet_rate =", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateNotEqualTo(String value) {
            addCriterion("requet_rate <>", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateGreaterThan(String value) {
            addCriterion("requet_rate >", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateGreaterThanOrEqualTo(String value) {
            addCriterion("requet_rate >=", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateLessThan(String value) {
            addCriterion("requet_rate <", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateLessThanOrEqualTo(String value) {
            addCriterion("requet_rate <=", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateLike(String value) {
            addCriterion("requet_rate like", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateNotLike(String value) {
            addCriterion("requet_rate not like", value, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateIn(List<String> values) {
            addCriterion("requet_rate in", values, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateNotIn(List<String> values) {
            addCriterion("requet_rate not in", values, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateBetween(String value1, String value2) {
            addCriterion("requet_rate between", value1, value2, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andRequet_rateNotBetween(String value1, String value2) {
            addCriterion("requet_rate not between", value1, value2, "requet_rate");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusIsNull() {
            addCriterion("slot_examine_status is null");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusIsNotNull() {
            addCriterion("slot_examine_status is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusEqualTo(Integer value) {
            addCriterion("slot_examine_status =", value, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusNotEqualTo(Integer value) {
            addCriterion("slot_examine_status <>", value, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusGreaterThan(Integer value) {
            addCriterion("slot_examine_status >", value, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("slot_examine_status >=", value, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusLessThan(Integer value) {
            addCriterion("slot_examine_status <", value, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusLessThanOrEqualTo(Integer value) {
            addCriterion("slot_examine_status <=", value, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusIn(List<Integer> values) {
            addCriterion("slot_examine_status in", values, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusNotIn(List<Integer> values) {
            addCriterion("slot_examine_status not in", values, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusBetween(Integer value1, Integer value2) {
            addCriterion("slot_examine_status between", value1, value2, "slot_examine_status");
            return (Criteria) this;
        }

        public Criteria andSlot_examine_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("slot_examine_status not between", value1, value2, "slot_examine_status");
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

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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

        public Criteria andAd_type_receivedIsNull() {
            addCriterion("ad_type_received is null");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedIsNotNull() {
            addCriterion("ad_type_received is not null");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedEqualTo(String value) {
            addCriterion("ad_type_received =", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedNotEqualTo(String value) {
            addCriterion("ad_type_received <>", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedGreaterThan(String value) {
            addCriterion("ad_type_received >", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedGreaterThanOrEqualTo(String value) {
            addCriterion("ad_type_received >=", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedLessThan(String value) {
            addCriterion("ad_type_received <", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedLessThanOrEqualTo(String value) {
            addCriterion("ad_type_received <=", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedLike(String value) {
            addCriterion("ad_type_received like", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedNotLike(String value) {
            addCriterion("ad_type_received not like", value, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedIn(List<String> values) {
            addCriterion("ad_type_received in", values, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedNotIn(List<String> values) {
            addCriterion("ad_type_received not in", values, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedBetween(String value1, String value2) {
            addCriterion("ad_type_received between", value1, value2, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andAd_type_receivedNotBetween(String value1, String value2) {
            addCriterion("ad_type_received not between", value1, value2, "ad_type_received");
            return (Criteria) this;
        }

        public Criteria andSsp_idIsNull() {
            addCriterion("ssp_id is null");
            return (Criteria) this;
        }

        public Criteria andSsp_idIsNotNull() {
            addCriterion("ssp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsp_idEqualTo(Integer value) {
            addCriterion("ssp_id =", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idNotEqualTo(Integer value) {
            addCriterion("ssp_id <>", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idGreaterThan(Integer value) {
            addCriterion("ssp_id >", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssp_id >=", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idLessThan(Integer value) {
            addCriterion("ssp_id <", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idLessThanOrEqualTo(Integer value) {
            addCriterion("ssp_id <=", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idIn(List<Integer> values) {
            addCriterion("ssp_id in", values, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idNotIn(List<Integer> values) {
            addCriterion("ssp_id not in", values, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idBetween(Integer value1, Integer value2) {
            addCriterion("ssp_id between", value1, value2, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idNotBetween(Integer value1, Integer value2) {
            addCriterion("ssp_id not between", value1, value2, "ssp_id");
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