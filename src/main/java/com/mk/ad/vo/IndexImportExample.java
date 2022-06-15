package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexImportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexImportExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andPublish_idIsNull() {
            addCriterion("publish_id is null");
            return (Criteria) this;
        }

        public Criteria andPublish_idIsNotNull() {
            addCriterion("publish_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublish_idEqualTo(String value) {
            addCriterion("publish_id =", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idNotEqualTo(String value) {
            addCriterion("publish_id <>", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idGreaterThan(String value) {
            addCriterion("publish_id >", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idGreaterThanOrEqualTo(String value) {
            addCriterion("publish_id >=", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idLessThan(String value) {
            addCriterion("publish_id <", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idLessThanOrEqualTo(String value) {
            addCriterion("publish_id <=", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idLike(String value) {
            addCriterion("publish_id like", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idNotLike(String value) {
            addCriterion("publish_id not like", value, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idIn(List<String> values) {
            addCriterion("publish_id in", values, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idNotIn(List<String> values) {
            addCriterion("publish_id not in", values, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idBetween(String value1, String value2) {
            addCriterion("publish_id between", value1, value2, "publish_id");
            return (Criteria) this;
        }

        public Criteria andPublish_idNotBetween(String value1, String value2) {
            addCriterion("publish_id not between", value1, value2, "publish_id");
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

        public Criteria andSlot_typeIsNull() {
            addCriterion("slot_type is null");
            return (Criteria) this;
        }

        public Criteria andSlot_typeIsNotNull() {
            addCriterion("slot_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlot_typeEqualTo(String value) {
            addCriterion("slot_type =", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeNotEqualTo(String value) {
            addCriterion("slot_type <>", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeGreaterThan(String value) {
            addCriterion("slot_type >", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeGreaterThanOrEqualTo(String value) {
            addCriterion("slot_type >=", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeLessThan(String value) {
            addCriterion("slot_type <", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeLessThanOrEqualTo(String value) {
            addCriterion("slot_type <=", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeLike(String value) {
            addCriterion("slot_type like", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeNotLike(String value) {
            addCriterion("slot_type not like", value, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeIn(List<String> values) {
            addCriterion("slot_type in", values, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeNotIn(List<String> values) {
            addCriterion("slot_type not in", values, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeBetween(String value1, String value2) {
            addCriterion("slot_type between", value1, value2, "slot_type");
            return (Criteria) this;
        }

        public Criteria andSlot_typeNotBetween(String value1, String value2) {
            addCriterion("slot_type not between", value1, value2, "slot_type");
            return (Criteria) this;
        }

        public Criteria andPos_idIsNull() {
            addCriterion("pos_id is null");
            return (Criteria) this;
        }

        public Criteria andPos_idIsNotNull() {
            addCriterion("pos_id is not null");
            return (Criteria) this;
        }

        public Criteria andPos_idEqualTo(String value) {
            addCriterion("pos_id =", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idNotEqualTo(String value) {
            addCriterion("pos_id <>", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idGreaterThan(String value) {
            addCriterion("pos_id >", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idGreaterThanOrEqualTo(String value) {
            addCriterion("pos_id >=", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idLessThan(String value) {
            addCriterion("pos_id <", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idLessThanOrEqualTo(String value) {
            addCriterion("pos_id <=", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idLike(String value) {
            addCriterion("pos_id like", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idNotLike(String value) {
            addCriterion("pos_id not like", value, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idIn(List<String> values) {
            addCriterion("pos_id in", values, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idNotIn(List<String> values) {
            addCriterion("pos_id not in", values, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idBetween(String value1, String value2) {
            addCriterion("pos_id between", value1, value2, "pos_id");
            return (Criteria) this;
        }

        public Criteria andPos_idNotBetween(String value1, String value2) {
            addCriterion("pos_id not between", value1, value2, "pos_id");
            return (Criteria) this;
        }

        public Criteria andIf_updateIsNull() {
            addCriterion("if_update is null");
            return (Criteria) this;
        }

        public Criteria andIf_updateIsNotNull() {
            addCriterion("if_update is not null");
            return (Criteria) this;
        }

        public Criteria andIf_updateEqualTo(Integer value) {
            addCriterion("if_update =", value, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateNotEqualTo(Integer value) {
            addCriterion("if_update <>", value, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateGreaterThan(Integer value) {
            addCriterion("if_update >", value, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_update >=", value, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateLessThan(Integer value) {
            addCriterion("if_update <", value, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateLessThanOrEqualTo(Integer value) {
            addCriterion("if_update <=", value, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateIn(List<Integer> values) {
            addCriterion("if_update in", values, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateNotIn(List<Integer> values) {
            addCriterion("if_update not in", values, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateBetween(Integer value1, Integer value2) {
            addCriterion("if_update between", value1, value2, "if_update");
            return (Criteria) this;
        }

        public Criteria andIf_updateNotBetween(Integer value1, Integer value2) {
            addCriterion("if_update not between", value1, value2, "if_update");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Float value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Float value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Float value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Float value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Float value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Float value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Float> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Float> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Float value1, Float value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Float value1, Float value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Integer value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Integer value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Integer value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Integer value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Integer value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Integer> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Integer> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Integer value1, Integer value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Integer value1, Integer value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClick_rateIsNull() {
            addCriterion("click_rate is null");
            return (Criteria) this;
        }

        public Criteria andClick_rateIsNotNull() {
            addCriterion("click_rate is not null");
            return (Criteria) this;
        }

        public Criteria andClick_rateEqualTo(Float value) {
            addCriterion("click_rate =", value, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateNotEqualTo(Float value) {
            addCriterion("click_rate <>", value, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateGreaterThan(Float value) {
            addCriterion("click_rate >", value, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateGreaterThanOrEqualTo(Float value) {
            addCriterion("click_rate >=", value, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateLessThan(Float value) {
            addCriterion("click_rate <", value, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateLessThanOrEqualTo(Float value) {
            addCriterion("click_rate <=", value, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateIn(List<Float> values) {
            addCriterion("click_rate in", values, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateNotIn(List<Float> values) {
            addCriterion("click_rate not in", values, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateBetween(Float value1, Float value2) {
            addCriterion("click_rate between", value1, value2, "click_rate");
            return (Criteria) this;
        }

        public Criteria andClick_rateNotBetween(Float value1, Float value2) {
            addCriterion("click_rate not between", value1, value2, "click_rate");
            return (Criteria) this;
        }

        public Criteria andEcpmIsNull() {
            addCriterion("ecpm is null");
            return (Criteria) this;
        }

        public Criteria andEcpmIsNotNull() {
            addCriterion("ecpm is not null");
            return (Criteria) this;
        }

        public Criteria andEcpmEqualTo(Float value) {
            addCriterion("ecpm =", value, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmNotEqualTo(Float value) {
            addCriterion("ecpm <>", value, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmGreaterThan(Float value) {
            addCriterion("ecpm >", value, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmGreaterThanOrEqualTo(Float value) {
            addCriterion("ecpm >=", value, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmLessThan(Float value) {
            addCriterion("ecpm <", value, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmLessThanOrEqualTo(Float value) {
            addCriterion("ecpm <=", value, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmIn(List<Float> values) {
            addCriterion("ecpm in", values, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmNotIn(List<Float> values) {
            addCriterion("ecpm not in", values, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmBetween(Float value1, Float value2) {
            addCriterion("ecpm between", value1, value2, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpmNotBetween(Float value1, Float value2) {
            addCriterion("ecpm not between", value1, value2, "ecpm");
            return (Criteria) this;
        }

        public Criteria andEcpcIsNull() {
            addCriterion("ecpc is null");
            return (Criteria) this;
        }

        public Criteria andEcpcIsNotNull() {
            addCriterion("ecpc is not null");
            return (Criteria) this;
        }

        public Criteria andEcpcEqualTo(Float value) {
            addCriterion("ecpc =", value, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcNotEqualTo(Float value) {
            addCriterion("ecpc <>", value, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcGreaterThan(Float value) {
            addCriterion("ecpc >", value, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcGreaterThanOrEqualTo(Float value) {
            addCriterion("ecpc >=", value, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcLessThan(Float value) {
            addCriterion("ecpc <", value, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcLessThanOrEqualTo(Float value) {
            addCriterion("ecpc <=", value, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcIn(List<Float> values) {
            addCriterion("ecpc in", values, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcNotIn(List<Float> values) {
            addCriterion("ecpc not in", values, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcBetween(Float value1, Float value2) {
            addCriterion("ecpc between", value1, value2, "ecpc");
            return (Criteria) this;
        }

        public Criteria andEcpcNotBetween(Float value1, Float value2) {
            addCriterion("ecpc not between", value1, value2, "ecpc");
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