package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SspMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SspMaterialExample() {
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

        public Criteria andUpper_idIsNull() {
            addCriterion("upper_id is null");
            return (Criteria) this;
        }

        public Criteria andUpper_idIsNotNull() {
            addCriterion("upper_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpper_idEqualTo(Integer value) {
            addCriterion("upper_id =", value, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idNotEqualTo(Integer value) {
            addCriterion("upper_id <>", value, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idGreaterThan(Integer value) {
            addCriterion("upper_id >", value, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("upper_id >=", value, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idLessThan(Integer value) {
            addCriterion("upper_id <", value, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idLessThanOrEqualTo(Integer value) {
            addCriterion("upper_id <=", value, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idIn(List<Integer> values) {
            addCriterion("upper_id in", values, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idNotIn(List<Integer> values) {
            addCriterion("upper_id not in", values, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idBetween(Integer value1, Integer value2) {
            addCriterion("upper_id between", value1, value2, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_idNotBetween(Integer value1, Integer value2) {
            addCriterion("upper_id not between", value1, value2, "upper_id");
            return (Criteria) this;
        }

        public Criteria andUpper_nameIsNull() {
            addCriterion("upper_name is null");
            return (Criteria) this;
        }

        public Criteria andUpper_nameIsNotNull() {
            addCriterion("upper_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpper_nameEqualTo(String value) {
            addCriterion("upper_name =", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameNotEqualTo(String value) {
            addCriterion("upper_name <>", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameGreaterThan(String value) {
            addCriterion("upper_name >", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameGreaterThanOrEqualTo(String value) {
            addCriterion("upper_name >=", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameLessThan(String value) {
            addCriterion("upper_name <", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameLessThanOrEqualTo(String value) {
            addCriterion("upper_name <=", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameLike(String value) {
            addCriterion("upper_name like", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameNotLike(String value) {
            addCriterion("upper_name not like", value, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameIn(List<String> values) {
            addCriterion("upper_name in", values, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameNotIn(List<String> values) {
            addCriterion("upper_name not in", values, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameBetween(String value1, String value2) {
            addCriterion("upper_name between", value1, value2, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_nameNotBetween(String value1, String value2) {
            addCriterion("upper_name not between", value1, value2, "upper_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idIsNull() {
            addCriterion("upper_slot_id is null");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idIsNotNull() {
            addCriterion("upper_slot_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idEqualTo(Integer value) {
            addCriterion("upper_slot_id =", value, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idNotEqualTo(Integer value) {
            addCriterion("upper_slot_id <>", value, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idGreaterThan(Integer value) {
            addCriterion("upper_slot_id >", value, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("upper_slot_id >=", value, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idLessThan(Integer value) {
            addCriterion("upper_slot_id <", value, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idLessThanOrEqualTo(Integer value) {
            addCriterion("upper_slot_id <=", value, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idIn(List<Integer> values) {
            addCriterion("upper_slot_id in", values, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idNotIn(List<Integer> values) {
            addCriterion("upper_slot_id not in", values, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idBetween(Integer value1, Integer value2) {
            addCriterion("upper_slot_id between", value1, value2, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_idNotBetween(Integer value1, Integer value2) {
            addCriterion("upper_slot_id not between", value1, value2, "upper_slot_id");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameIsNull() {
            addCriterion("upper_slot_name is null");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameIsNotNull() {
            addCriterion("upper_slot_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameEqualTo(String value) {
            addCriterion("upper_slot_name =", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameNotEqualTo(String value) {
            addCriterion("upper_slot_name <>", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameGreaterThan(String value) {
            addCriterion("upper_slot_name >", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameGreaterThanOrEqualTo(String value) {
            addCriterion("upper_slot_name >=", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameLessThan(String value) {
            addCriterion("upper_slot_name <", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameLessThanOrEqualTo(String value) {
            addCriterion("upper_slot_name <=", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameLike(String value) {
            addCriterion("upper_slot_name like", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameNotLike(String value) {
            addCriterion("upper_slot_name not like", value, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameIn(List<String> values) {
            addCriterion("upper_slot_name in", values, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameNotIn(List<String> values) {
            addCriterion("upper_slot_name not in", values, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameBetween(String value1, String value2) {
            addCriterion("upper_slot_name between", value1, value2, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andUpper_slot_nameNotBetween(String value1, String value2) {
            addCriterion("upper_slot_name not between", value1, value2, "upper_slot_name");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
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

        public Criteria andMaterial_wIsNull() {
            addCriterion("material_w is null");
            return (Criteria) this;
        }

        public Criteria andMaterial_wIsNotNull() {
            addCriterion("material_w is not null");
            return (Criteria) this;
        }

        public Criteria andMaterial_wEqualTo(Integer value) {
            addCriterion("material_w =", value, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wNotEqualTo(Integer value) {
            addCriterion("material_w <>", value, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wGreaterThan(Integer value) {
            addCriterion("material_w >", value, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_w >=", value, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wLessThan(Integer value) {
            addCriterion("material_w <", value, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wLessThanOrEqualTo(Integer value) {
            addCriterion("material_w <=", value, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wIn(List<Integer> values) {
            addCriterion("material_w in", values, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wNotIn(List<Integer> values) {
            addCriterion("material_w not in", values, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wBetween(Integer value1, Integer value2) {
            addCriterion("material_w between", value1, value2, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_wNotBetween(Integer value1, Integer value2) {
            addCriterion("material_w not between", value1, value2, "material_w");
            return (Criteria) this;
        }

        public Criteria andMaterial_hIsNull() {
            addCriterion("material_h is null");
            return (Criteria) this;
        }

        public Criteria andMaterial_hIsNotNull() {
            addCriterion("material_h is not null");
            return (Criteria) this;
        }

        public Criteria andMaterial_hEqualTo(Integer value) {
            addCriterion("material_h =", value, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hNotEqualTo(Integer value) {
            addCriterion("material_h <>", value, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hGreaterThan(Integer value) {
            addCriterion("material_h >", value, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_h >=", value, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hLessThan(Integer value) {
            addCriterion("material_h <", value, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hLessThanOrEqualTo(Integer value) {
            addCriterion("material_h <=", value, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hIn(List<Integer> values) {
            addCriterion("material_h in", values, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hNotIn(List<Integer> values) {
            addCriterion("material_h not in", values, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hBetween(Integer value1, Integer value2) {
            addCriterion("material_h between", value1, value2, "material_h");
            return (Criteria) this;
        }

        public Criteria andMaterial_hNotBetween(Integer value1, Integer value2) {
            addCriterion("material_h not between", value1, value2, "material_h");
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