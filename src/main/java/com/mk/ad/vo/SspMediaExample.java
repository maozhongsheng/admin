package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SspMediaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SspMediaExample() {
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

        public Criteria andPlatform_typeIsNull() {
            addCriterion("platform_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIsNotNull() {
            addCriterion("platform_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeEqualTo(Integer value) {
            addCriterion("platform_type =", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotEqualTo(Integer value) {
            addCriterion("platform_type <>", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeGreaterThan(Integer value) {
            addCriterion("platform_type >", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_type >=", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeLessThan(Integer value) {
            addCriterion("platform_type <", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeLessThanOrEqualTo(Integer value) {
            addCriterion("platform_type <=", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIn(List<Integer> values) {
            addCriterion("platform_type in", values, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotIn(List<Integer> values) {
            addCriterion("platform_type not in", values, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeBetween(Integer value1, Integer value2) {
            addCriterion("platform_type between", value1, value2, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_type not between", value1, value2, "platform_type");
            return (Criteria) this;
        }

        public Criteria andStore_idIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStore_idIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStore_idEqualTo(Integer value) {
            addCriterion("store_id =", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThan(Integer value) {
            addCriterion("store_id >", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idLessThan(Integer value) {
            addCriterion("store_id <", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idIn(List<Integer> values) {
            addCriterion("store_id in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andDetail_urlIsNull() {
            addCriterion("detail_url is null");
            return (Criteria) this;
        }

        public Criteria andDetail_urlIsNotNull() {
            addCriterion("detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andDetail_urlEqualTo(String value) {
            addCriterion("detail_url =", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlNotEqualTo(String value) {
            addCriterion("detail_url <>", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlGreaterThan(String value) {
            addCriterion("detail_url >", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlGreaterThanOrEqualTo(String value) {
            addCriterion("detail_url >=", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlLessThan(String value) {
            addCriterion("detail_url <", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlLessThanOrEqualTo(String value) {
            addCriterion("detail_url <=", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlLike(String value) {
            addCriterion("detail_url like", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlNotLike(String value) {
            addCriterion("detail_url not like", value, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlIn(List<String> values) {
            addCriterion("detail_url in", values, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlNotIn(List<String> values) {
            addCriterion("detail_url not in", values, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlBetween(String value1, String value2) {
            addCriterion("detail_url between", value1, value2, "detail_url");
            return (Criteria) this;
        }

        public Criteria andDetail_urlNotBetween(String value1, String value2) {
            addCriterion("detail_url not between", value1, value2, "detail_url");
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

        public Criteria andMedia_type_idIsNull() {
            addCriterion("media_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idIsNotNull() {
            addCriterion("media_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idEqualTo(Integer value) {
            addCriterion("media_type_id =", value, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idNotEqualTo(Integer value) {
            addCriterion("media_type_id <>", value, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idGreaterThan(Integer value) {
            addCriterion("media_type_id >", value, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_type_id >=", value, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idLessThan(Integer value) {
            addCriterion("media_type_id <", value, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("media_type_id <=", value, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idIn(List<Integer> values) {
            addCriterion("media_type_id in", values, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idNotIn(List<Integer> values) {
            addCriterion("media_type_id not in", values, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idBetween(Integer value1, Integer value2) {
            addCriterion("media_type_id between", value1, value2, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("media_type_id not between", value1, value2, "media_type_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idIsNull() {
            addCriterion("media_category_id is null");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idIsNotNull() {
            addCriterion("media_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idEqualTo(Integer value) {
            addCriterion("media_category_id =", value, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idNotEqualTo(Integer value) {
            addCriterion("media_category_id <>", value, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idGreaterThan(Integer value) {
            addCriterion("media_category_id >", value, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_category_id >=", value, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idLessThan(Integer value) {
            addCriterion("media_category_id <", value, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idLessThanOrEqualTo(Integer value) {
            addCriterion("media_category_id <=", value, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idIn(List<Integer> values) {
            addCriterion("media_category_id in", values, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idNotIn(List<Integer> values) {
            addCriterion("media_category_id not in", values, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idBetween(Integer value1, Integer value2) {
            addCriterion("media_category_id between", value1, value2, "media_category_id");
            return (Criteria) this;
        }

        public Criteria andMedia_category_idNotBetween(Integer value1, Integer value2) {
            addCriterion("media_category_id not between", value1, value2, "media_category_id");
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

        public Criteria andMedia_descIsNull() {
            addCriterion("media_desc is null");
            return (Criteria) this;
        }

        public Criteria andMedia_descIsNotNull() {
            addCriterion("media_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_descEqualTo(String value) {
            addCriterion("media_desc =", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descNotEqualTo(String value) {
            addCriterion("media_desc <>", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descGreaterThan(String value) {
            addCriterion("media_desc >", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descGreaterThanOrEqualTo(String value) {
            addCriterion("media_desc >=", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descLessThan(String value) {
            addCriterion("media_desc <", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descLessThanOrEqualTo(String value) {
            addCriterion("media_desc <=", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descLike(String value) {
            addCriterion("media_desc like", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descNotLike(String value) {
            addCriterion("media_desc not like", value, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descIn(List<String> values) {
            addCriterion("media_desc in", values, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descNotIn(List<String> values) {
            addCriterion("media_desc not in", values, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descBetween(String value1, String value2) {
            addCriterion("media_desc between", value1, value2, "media_desc");
            return (Criteria) this;
        }

        public Criteria andMedia_descNotBetween(String value1, String value2) {
            addCriterion("media_desc not between", value1, value2, "media_desc");
            return (Criteria) this;
        }

        public Criteria andPackage_nameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackage_nameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackage_nameEqualTo(String value) {
            addCriterion("package_name =", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameGreaterThan(String value) {
            addCriterion("package_name >", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameLessThan(String value) {
            addCriterion("package_name <", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameLike(String value) {
            addCriterion("package_name like", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotLike(String value) {
            addCriterion("package_name not like", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameIn(List<String> values) {
            addCriterion("package_name in", values, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "package_name");
            return (Criteria) this;
        }

        public Criteria andRelation_typeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelation_typeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelation_typeEqualTo(Integer value) {
            addCriterion("relation_type =", value, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeNotEqualTo(Integer value) {
            addCriterion("relation_type <>", value, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeGreaterThan(Integer value) {
            addCriterion("relation_type >", value, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_type >=", value, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeLessThan(Integer value) {
            addCriterion("relation_type <", value, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeLessThanOrEqualTo(Integer value) {
            addCriterion("relation_type <=", value, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeIn(List<Integer> values) {
            addCriterion("relation_type in", values, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeNotIn(List<Integer> values) {
            addCriterion("relation_type not in", values, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeBetween(Integer value1, Integer value2) {
            addCriterion("relation_type between", value1, value2, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRelation_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_type not between", value1, value2, "relation_type");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateIsNull() {
            addCriterion("register_certificate is null");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateIsNotNull() {
            addCriterion("register_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateEqualTo(String value) {
            addCriterion("register_certificate =", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateNotEqualTo(String value) {
            addCriterion("register_certificate <>", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateGreaterThan(String value) {
            addCriterion("register_certificate >", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateGreaterThanOrEqualTo(String value) {
            addCriterion("register_certificate >=", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateLessThan(String value) {
            addCriterion("register_certificate <", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateLessThanOrEqualTo(String value) {
            addCriterion("register_certificate <=", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateLike(String value) {
            addCriterion("register_certificate like", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateNotLike(String value) {
            addCriterion("register_certificate not like", value, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateIn(List<String> values) {
            addCriterion("register_certificate in", values, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateNotIn(List<String> values) {
            addCriterion("register_certificate not in", values, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateBetween(String value1, String value2) {
            addCriterion("register_certificate between", value1, value2, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andRegister_certificateNotBetween(String value1, String value2) {
            addCriterion("register_certificate not between", value1, value2, "register_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateIsNull() {
            addCriterion("mandate_certificate is null");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateIsNotNull() {
            addCriterion("mandate_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateEqualTo(String value) {
            addCriterion("mandate_certificate =", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateNotEqualTo(String value) {
            addCriterion("mandate_certificate <>", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateGreaterThan(String value) {
            addCriterion("mandate_certificate >", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateGreaterThanOrEqualTo(String value) {
            addCriterion("mandate_certificate >=", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateLessThan(String value) {
            addCriterion("mandate_certificate <", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateLessThanOrEqualTo(String value) {
            addCriterion("mandate_certificate <=", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateLike(String value) {
            addCriterion("mandate_certificate like", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateNotLike(String value) {
            addCriterion("mandate_certificate not like", value, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateIn(List<String> values) {
            addCriterion("mandate_certificate in", values, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateNotIn(List<String> values) {
            addCriterion("mandate_certificate not in", values, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateBetween(String value1, String value2) {
            addCriterion("mandate_certificate between", value1, value2, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andMandate_certificateNotBetween(String value1, String value2) {
            addCriterion("mandate_certificate not between", value1, value2, "mandate_certificate");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusIsNull() {
            addCriterion("cooperation_status is null");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusIsNotNull() {
            addCriterion("cooperation_status is not null");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusEqualTo(Integer value) {
            addCriterion("cooperation_status =", value, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusNotEqualTo(Integer value) {
            addCriterion("cooperation_status <>", value, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusGreaterThan(Integer value) {
            addCriterion("cooperation_status >", value, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cooperation_status >=", value, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusLessThan(Integer value) {
            addCriterion("cooperation_status <", value, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusLessThanOrEqualTo(Integer value) {
            addCriterion("cooperation_status <=", value, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusIn(List<Integer> values) {
            addCriterion("cooperation_status in", values, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusNotIn(List<Integer> values) {
            addCriterion("cooperation_status not in", values, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_status between", value1, value2, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andCooperation_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("cooperation_status not between", value1, value2, "cooperation_status");
            return (Criteria) this;
        }

        public Criteria andWeb_domainIsNull() {
            addCriterion("web_domain is null");
            return (Criteria) this;
        }

        public Criteria andWeb_domainIsNotNull() {
            addCriterion("web_domain is not null");
            return (Criteria) this;
        }

        public Criteria andWeb_domainEqualTo(String value) {
            addCriterion("web_domain =", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainNotEqualTo(String value) {
            addCriterion("web_domain <>", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainGreaterThan(String value) {
            addCriterion("web_domain >", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainGreaterThanOrEqualTo(String value) {
            addCriterion("web_domain >=", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainLessThan(String value) {
            addCriterion("web_domain <", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainLessThanOrEqualTo(String value) {
            addCriterion("web_domain <=", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainLike(String value) {
            addCriterion("web_domain like", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainNotLike(String value) {
            addCriterion("web_domain not like", value, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainIn(List<String> values) {
            addCriterion("web_domain in", values, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainNotIn(List<String> values) {
            addCriterion("web_domain not in", values, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainBetween(String value1, String value2) {
            addCriterion("web_domain between", value1, value2, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_domainNotBetween(String value1, String value2) {
            addCriterion("web_domain not between", value1, value2, "web_domain");
            return (Criteria) this;
        }

        public Criteria andWeb_recordIsNull() {
            addCriterion("web_record is null");
            return (Criteria) this;
        }

        public Criteria andWeb_recordIsNotNull() {
            addCriterion("web_record is not null");
            return (Criteria) this;
        }

        public Criteria andWeb_recordEqualTo(String value) {
            addCriterion("web_record =", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordNotEqualTo(String value) {
            addCriterion("web_record <>", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordGreaterThan(String value) {
            addCriterion("web_record >", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordGreaterThanOrEqualTo(String value) {
            addCriterion("web_record >=", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordLessThan(String value) {
            addCriterion("web_record <", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordLessThanOrEqualTo(String value) {
            addCriterion("web_record <=", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordLike(String value) {
            addCriterion("web_record like", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordNotLike(String value) {
            addCriterion("web_record not like", value, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordIn(List<String> values) {
            addCriterion("web_record in", values, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordNotIn(List<String> values) {
            addCriterion("web_record not in", values, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordBetween(String value1, String value2) {
            addCriterion("web_record between", value1, value2, "web_record");
            return (Criteria) this;
        }

        public Criteria andWeb_recordNotBetween(String value1, String value2) {
            addCriterion("web_record not between", value1, value2, "web_record");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusIsNull() {
            addCriterion("media_examine_status is null");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusIsNotNull() {
            addCriterion("media_examine_status is not null");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusEqualTo(Integer value) {
            addCriterion("media_examine_status =", value, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusNotEqualTo(Integer value) {
            addCriterion("media_examine_status <>", value, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusGreaterThan(Integer value) {
            addCriterion("media_examine_status >", value, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_examine_status >=", value, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusLessThan(Integer value) {
            addCriterion("media_examine_status <", value, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusLessThanOrEqualTo(Integer value) {
            addCriterion("media_examine_status <=", value, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusIn(List<Integer> values) {
            addCriterion("media_examine_status in", values, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusNotIn(List<Integer> values) {
            addCriterion("media_examine_status not in", values, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusBetween(Integer value1, Integer value2) {
            addCriterion("media_examine_status between", value1, value2, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andMedia_examine_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("media_examine_status not between", value1, value2, "media_examine_status");
            return (Criteria) this;
        }

        public Criteria andRecord_urlIsNull() {
            addCriterion("record_url is null");
            return (Criteria) this;
        }

        public Criteria andRecord_urlIsNotNull() {
            addCriterion("record_url is not null");
            return (Criteria) this;
        }

        public Criteria andRecord_urlEqualTo(String value) {
            addCriterion("record_url =", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlNotEqualTo(String value) {
            addCriterion("record_url <>", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlGreaterThan(String value) {
            addCriterion("record_url >", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlGreaterThanOrEqualTo(String value) {
            addCriterion("record_url >=", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlLessThan(String value) {
            addCriterion("record_url <", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlLessThanOrEqualTo(String value) {
            addCriterion("record_url <=", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlLike(String value) {
            addCriterion("record_url like", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlNotLike(String value) {
            addCriterion("record_url not like", value, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlIn(List<String> values) {
            addCriterion("record_url in", values, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlNotIn(List<String> values) {
            addCriterion("record_url not in", values, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlBetween(String value1, String value2) {
            addCriterion("record_url between", value1, value2, "record_url");
            return (Criteria) this;
        }

        public Criteria andRecord_urlNotBetween(String value1, String value2) {
            addCriterion("record_url not between", value1, value2, "record_url");
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

        public Criteria andSsp_idIsNull() {
            addCriterion("ssp_id is null");
            return (Criteria) this;
        }

        public Criteria andSsp_idIsNotNull() {
            addCriterion("ssp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsp_idEqualTo(Long value) {
            addCriterion("ssp_id =", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idNotEqualTo(Long value) {
            addCriterion("ssp_id <>", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idGreaterThan(Long value) {
            addCriterion("ssp_id >", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ssp_id >=", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idLessThan(Long value) {
            addCriterion("ssp_id <", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idLessThanOrEqualTo(Long value) {
            addCriterion("ssp_id <=", value, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idIn(List<Long> values) {
            addCriterion("ssp_id in", values, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idNotIn(List<Long> values) {
            addCriterion("ssp_id not in", values, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idBetween(Long value1, Long value2) {
            addCriterion("ssp_id between", value1, value2, "ssp_id");
            return (Criteria) this;
        }

        public Criteria andSsp_idNotBetween(Long value1, Long value2) {
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

        public Criteria andSha_dataIsNull() {
            addCriterion("sha_data is null");
            return (Criteria) this;
        }

        public Criteria andSha_dataIsNotNull() {
            addCriterion("sha_data is not null");
            return (Criteria) this;
        }

        public Criteria andSha_dataEqualTo(String value) {
            addCriterion("sha_data =", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataNotEqualTo(String value) {
            addCriterion("sha_data <>", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataGreaterThan(String value) {
            addCriterion("sha_data >", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataGreaterThanOrEqualTo(String value) {
            addCriterion("sha_data >=", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataLessThan(String value) {
            addCriterion("sha_data <", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataLessThanOrEqualTo(String value) {
            addCriterion("sha_data <=", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataLike(String value) {
            addCriterion("sha_data like", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataNotLike(String value) {
            addCriterion("sha_data not like", value, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataIn(List<String> values) {
            addCriterion("sha_data in", values, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataNotIn(List<String> values) {
            addCriterion("sha_data not in", values, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataBetween(String value1, String value2) {
            addCriterion("sha_data between", value1, value2, "sha_data");
            return (Criteria) this;
        }

        public Criteria andSha_dataNotBetween(String value1, String value2) {
            addCriterion("sha_data not between", value1, value2, "sha_data");
            return (Criteria) this;
        }

        public Criteria andStart_dateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStart_dateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStart_dateEqualTo(Date value) {
            addCriterion("start_date =", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateGreaterThan(Date value) {
            addCriterion("start_date >", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateLessThan(Date value) {
            addCriterion("start_date <", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateIn(List<Date> values) {
            addCriterion("start_date in", values, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "start_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_dateEqualTo(Date value) {
            addCriterion("end_date =", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateGreaterThan(Date value) {
            addCriterion("end_date >", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateLessThan(Date value) {
            addCriterion("end_date <", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIn(List<Date> values) {
            addCriterion("end_date in", values, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "end_date");
            return (Criteria) this;
        }

        public Criteria andUa_examplesIsNull() {
            addCriterion("ua_examples is null");
            return (Criteria) this;
        }

        public Criteria andUa_examplesIsNotNull() {
            addCriterion("ua_examples is not null");
            return (Criteria) this;
        }

        public Criteria andUa_examplesEqualTo(String value) {
            addCriterion("ua_examples =", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesNotEqualTo(String value) {
            addCriterion("ua_examples <>", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesGreaterThan(String value) {
            addCriterion("ua_examples >", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesGreaterThanOrEqualTo(String value) {
            addCriterion("ua_examples >=", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesLessThan(String value) {
            addCriterion("ua_examples <", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesLessThanOrEqualTo(String value) {
            addCriterion("ua_examples <=", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesLike(String value) {
            addCriterion("ua_examples like", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesNotLike(String value) {
            addCriterion("ua_examples not like", value, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesIn(List<String> values) {
            addCriterion("ua_examples in", values, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesNotIn(List<String> values) {
            addCriterion("ua_examples not in", values, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesBetween(String value1, String value2) {
            addCriterion("ua_examples between", value1, value2, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andUa_examplesNotBetween(String value1, String value2) {
            addCriterion("ua_examples not between", value1, value2, "ua_examples");
            return (Criteria) this;
        }

        public Criteria andRefuseIsNull() {
            addCriterion("refuse is null");
            return (Criteria) this;
        }

        public Criteria andRefuseIsNotNull() {
            addCriterion("refuse is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseEqualTo(String value) {
            addCriterion("refuse =", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseNotEqualTo(String value) {
            addCriterion("refuse <>", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseGreaterThan(String value) {
            addCriterion("refuse >", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseGreaterThanOrEqualTo(String value) {
            addCriterion("refuse >=", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseLessThan(String value) {
            addCriterion("refuse <", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseLessThanOrEqualTo(String value) {
            addCriterion("refuse <=", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseLike(String value) {
            addCriterion("refuse like", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseNotLike(String value) {
            addCriterion("refuse not like", value, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseIn(List<String> values) {
            addCriterion("refuse in", values, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseNotIn(List<String> values) {
            addCriterion("refuse not in", values, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseBetween(String value1, String value2) {
            addCriterion("refuse between", value1, value2, "refuse");
            return (Criteria) this;
        }

        public Criteria andRefuseNotBetween(String value1, String value2) {
            addCriterion("refuse not between", value1, value2, "refuse");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(Integer value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(Integer value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(Integer value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(Integer value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(Integer value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<Integer> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<Integer> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(Integer value1, Integer value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeIsNull() {
            addCriterion("settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeIsNotNull() {
            addCriterion("settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeEqualTo(Integer value) {
            addCriterion("settlement_type =", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeNotEqualTo(Integer value) {
            addCriterion("settlement_type <>", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeGreaterThan(Integer value) {
            addCriterion("settlement_type >", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_type >=", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeLessThan(Integer value) {
            addCriterion("settlement_type <", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_type <=", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeIn(List<Integer> values) {
            addCriterion("settlement_type in", values, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeNotIn(List<Integer> values) {
            addCriterion("settlement_type not in", values, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeBetween(Integer value1, Integer value2) {
            addCriterion("settlement_type between", value1, value2, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_type not between", value1, value2, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andDivideIsNull() {
            addCriterion("divide is null");
            return (Criteria) this;
        }

        public Criteria andDivideIsNotNull() {
            addCriterion("divide is not null");
            return (Criteria) this;
        }

        public Criteria andDivideEqualTo(String value) {
            addCriterion("divide =", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideNotEqualTo(String value) {
            addCriterion("divide <>", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideGreaterThan(String value) {
            addCriterion("divide >", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideGreaterThanOrEqualTo(String value) {
            addCriterion("divide >=", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideLessThan(String value) {
            addCriterion("divide <", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideLessThanOrEqualTo(String value) {
            addCriterion("divide <=", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideLike(String value) {
            addCriterion("divide like", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideNotLike(String value) {
            addCriterion("divide not like", value, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideIn(List<String> values) {
            addCriterion("divide in", values, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideNotIn(List<String> values) {
            addCriterion("divide not in", values, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideBetween(String value1, String value2) {
            addCriterion("divide between", value1, value2, "divide");
            return (Criteria) this;
        }

        public Criteria andDivideNotBetween(String value1, String value2) {
            addCriterion("divide not between", value1, value2, "divide");
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