package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertisingAllianceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisingAllianceExample() {
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

        public Criteria andAdvert_nameIsNull() {
            addCriterion("advert_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameIsNotNull() {
            addCriterion("advert_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameEqualTo(String value) {
            addCriterion("advert_name =", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameNotEqualTo(String value) {
            addCriterion("advert_name <>", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameGreaterThan(String value) {
            addCriterion("advert_name >", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameGreaterThanOrEqualTo(String value) {
            addCriterion("advert_name >=", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameLessThan(String value) {
            addCriterion("advert_name <", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameLessThanOrEqualTo(String value) {
            addCriterion("advert_name <=", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameLike(String value) {
            addCriterion("advert_name like", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameNotLike(String value) {
            addCriterion("advert_name not like", value, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameIn(List<String> values) {
            addCriterion("advert_name in", values, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameNotIn(List<String> values) {
            addCriterion("advert_name not in", values, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameBetween(String value1, String value2) {
            addCriterion("advert_name between", value1, value2, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_nameNotBetween(String value1, String value2) {
            addCriterion("advert_name not between", value1, value2, "advert_name");
            return (Criteria) this;
        }

        public Criteria andAdvert_idIsNull() {
            addCriterion("advert_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvert_idIsNotNull() {
            addCriterion("advert_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvert_idEqualTo(String value) {
            addCriterion("advert_id =", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idNotEqualTo(String value) {
            addCriterion("advert_id <>", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idGreaterThan(String value) {
            addCriterion("advert_id >", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idGreaterThanOrEqualTo(String value) {
            addCriterion("advert_id >=", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idLessThan(String value) {
            addCriterion("advert_id <", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idLessThanOrEqualTo(String value) {
            addCriterion("advert_id <=", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idLike(String value) {
            addCriterion("advert_id like", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idNotLike(String value) {
            addCriterion("advert_id not like", value, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idIn(List<String> values) {
            addCriterion("advert_id in", values, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idNotIn(List<String> values) {
            addCriterion("advert_id not in", values, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idBetween(String value1, String value2) {
            addCriterion("advert_id between", value1, value2, "advert_id");
            return (Criteria) this;
        }

        public Criteria andAdvert_idNotBetween(String value1, String value2) {
            addCriterion("advert_id not between", value1, value2, "advert_id");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("`size` is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("`size` is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("`size` =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("`size` <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("`size` >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("`size` >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("`size` <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("`size` <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("`size` like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("`size` not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("`size` in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("`size` not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("`size` between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("`size` not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andOs_typeIsNull() {
            addCriterion("os_type is null");
            return (Criteria) this;
        }

        public Criteria andOs_typeIsNotNull() {
            addCriterion("os_type is not null");
            return (Criteria) this;
        }

        public Criteria andOs_typeEqualTo(String value) {
            addCriterion("os_type =", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeNotEqualTo(String value) {
            addCriterion("os_type <>", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeGreaterThan(String value) {
            addCriterion("os_type >", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeGreaterThanOrEqualTo(String value) {
            addCriterion("os_type >=", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeLessThan(String value) {
            addCriterion("os_type <", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeLessThanOrEqualTo(String value) {
            addCriterion("os_type <=", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeLike(String value) {
            addCriterion("os_type like", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeNotLike(String value) {
            addCriterion("os_type not like", value, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeIn(List<String> values) {
            addCriterion("os_type in", values, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeNotIn(List<String> values) {
            addCriterion("os_type not in", values, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeBetween(String value1, String value2) {
            addCriterion("os_type between", value1, value2, "os_type");
            return (Criteria) this;
        }

        public Criteria andOs_typeNotBetween(String value1, String value2) {
            addCriterion("os_type not between", value1, value2, "os_type");
            return (Criteria) this;
        }

        public Criteria andApp_idIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andApp_idIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andApp_idEqualTo(String value) {
            addCriterion("app_id =", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotEqualTo(String value) {
            addCriterion("app_id <>", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idGreaterThan(String value) {
            addCriterion("app_id >", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idLessThan(String value) {
            addCriterion("app_id <", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idLike(String value) {
            addCriterion("app_id like", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotLike(String value) {
            addCriterion("app_id not like", value, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idIn(List<String> values) {
            addCriterion("app_id in", values, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotIn(List<String> values) {
            addCriterion("app_id not in", values, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_idNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "app_id");
            return (Criteria) this;
        }

        public Criteria andApp_nameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andApp_nameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andApp_nameEqualTo(String value) {
            addCriterion("app_name =", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameGreaterThan(String value) {
            addCriterion("app_name >", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameLessThan(String value) {
            addCriterion("app_name <", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameLike(String value) {
            addCriterion("app_name like", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameNotLike(String value) {
            addCriterion("app_name not like", value, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameIn(List<String> values) {
            addCriterion("app_name in", values, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "app_name");
            return (Criteria) this;
        }

        public Criteria andApp_nameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "app_name");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeIsNull() {
            addCriterion("ad_slot_type is null");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeIsNotNull() {
            addCriterion("ad_slot_type is not null");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeEqualTo(String value) {
            addCriterion("ad_slot_type =", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeNotEqualTo(String value) {
            addCriterion("ad_slot_type <>", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeGreaterThan(String value) {
            addCriterion("ad_slot_type >", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeGreaterThanOrEqualTo(String value) {
            addCriterion("ad_slot_type >=", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeLessThan(String value) {
            addCriterion("ad_slot_type <", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeLessThanOrEqualTo(String value) {
            addCriterion("ad_slot_type <=", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeLike(String value) {
            addCriterion("ad_slot_type like", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeNotLike(String value) {
            addCriterion("ad_slot_type not like", value, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeIn(List<String> values) {
            addCriterion("ad_slot_type in", values, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeNotIn(List<String> values) {
            addCriterion("ad_slot_type not in", values, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeBetween(String value1, String value2) {
            addCriterion("ad_slot_type between", value1, value2, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andAd_slot_typeNotBetween(String value1, String value2) {
            addCriterion("ad_slot_type not between", value1, value2, "ad_slot_type");
            return (Criteria) this;
        }

        public Criteria andApp_bundleIsNull() {
            addCriterion("app_bundle is null");
            return (Criteria) this;
        }

        public Criteria andApp_bundleIsNotNull() {
            addCriterion("app_bundle is not null");
            return (Criteria) this;
        }

        public Criteria andApp_bundleEqualTo(String value) {
            addCriterion("app_bundle =", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleNotEqualTo(String value) {
            addCriterion("app_bundle <>", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleGreaterThan(String value) {
            addCriterion("app_bundle >", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleGreaterThanOrEqualTo(String value) {
            addCriterion("app_bundle >=", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleLessThan(String value) {
            addCriterion("app_bundle <", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleLessThanOrEqualTo(String value) {
            addCriterion("app_bundle <=", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleLike(String value) {
            addCriterion("app_bundle like", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleNotLike(String value) {
            addCriterion("app_bundle not like", value, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleIn(List<String> values) {
            addCriterion("app_bundle in", values, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleNotIn(List<String> values) {
            addCriterion("app_bundle not in", values, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleBetween(String value1, String value2) {
            addCriterion("app_bundle between", value1, value2, "app_bundle");
            return (Criteria) this;
        }

        public Criteria andApp_bundleNotBetween(String value1, String value2) {
            addCriterion("app_bundle not between", value1, value2, "app_bundle");
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