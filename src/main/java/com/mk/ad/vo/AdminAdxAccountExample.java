package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminAdxAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminAdxAccountExample() {
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

        public Criteria andCompany_nameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompany_nameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_nameEqualTo(String value) {
            addCriterion("company_name =", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameGreaterThan(String value) {
            addCriterion("company_name >", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameLessThan(String value) {
            addCriterion("company_name <", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameLike(String value) {
            addCriterion("company_name like", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotLike(String value) {
            addCriterion("company_name not like", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameIn(List<String> values) {
            addCriterion("company_name in", values, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "company_name");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCompany_typeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompany_typeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_typeEqualTo(Integer value) {
            addCriterion("company_type =", value, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeNotEqualTo(Integer value) {
            addCriterion("company_type <>", value, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeGreaterThan(Integer value) {
            addCriterion("company_type >", value, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_type >=", value, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeLessThan(Integer value) {
            addCriterion("company_type <", value, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeLessThanOrEqualTo(Integer value) {
            addCriterion("company_type <=", value, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeIn(List<Integer> values) {
            addCriterion("company_type in", values, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeNotIn(List<Integer> values) {
            addCriterion("company_type not in", values, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeBetween(Integer value1, Integer value2) {
            addCriterion("company_type between", value1, value2, "company_type");
            return (Criteria) this;
        }

        public Criteria andCompany_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_type not between", value1, value2, "company_type");
            return (Criteria) this;
        }

        public Criteria andLicense_numberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicense_numberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicense_numberEqualTo(String value) {
            addCriterion("license_number =", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberGreaterThan(String value) {
            addCriterion("license_number >", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberLessThan(String value) {
            addCriterion("license_number <", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberLike(String value) {
            addCriterion("license_number like", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotLike(String value) {
            addCriterion("license_number not like", value, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberIn(List<String> values) {
            addCriterion("license_number in", values, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "license_number");
            return (Criteria) this;
        }

        public Criteria andLicense_numberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "license_number");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeEqualTo(String value) {
            addCriterion("organization_code =", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeLessThan(String value) {
            addCriterion("organization_code <", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeLike(String value) {
            addCriterion("organization_code like", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeNotLike(String value) {
            addCriterion("organization_code not like", value, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeIn(List<String> values) {
            addCriterion("organization_code in", values, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organization_code");
            return (Criteria) this;
        }

        public Criteria andOrganization_codeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organization_code");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameIsNull() {
            addCriterion("shareholder_name is null");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameIsNotNull() {
            addCriterion("shareholder_name is not null");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameEqualTo(String value) {
            addCriterion("shareholder_name =", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameNotEqualTo(String value) {
            addCriterion("shareholder_name <>", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameGreaterThan(String value) {
            addCriterion("shareholder_name >", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder_name >=", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameLessThan(String value) {
            addCriterion("shareholder_name <", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameLessThanOrEqualTo(String value) {
            addCriterion("shareholder_name <=", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameLike(String value) {
            addCriterion("shareholder_name like", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameNotLike(String value) {
            addCriterion("shareholder_name not like", value, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameIn(List<String> values) {
            addCriterion("shareholder_name in", values, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameNotIn(List<String> values) {
            addCriterion("shareholder_name not in", values, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameBetween(String value1, String value2) {
            addCriterion("shareholder_name between", value1, value2, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andShareholder_nameNotBetween(String value1, String value2) {
            addCriterion("shareholder_name not between", value1, value2, "shareholder_name");
            return (Criteria) this;
        }

        public Criteria andLicense_imageIsNull() {
            addCriterion("license_image is null");
            return (Criteria) this;
        }

        public Criteria andLicense_imageIsNotNull() {
            addCriterion("license_image is not null");
            return (Criteria) this;
        }

        public Criteria andLicense_imageEqualTo(String value) {
            addCriterion("license_image =", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageNotEqualTo(String value) {
            addCriterion("license_image <>", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageGreaterThan(String value) {
            addCriterion("license_image >", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageGreaterThanOrEqualTo(String value) {
            addCriterion("license_image >=", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageLessThan(String value) {
            addCriterion("license_image <", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageLessThanOrEqualTo(String value) {
            addCriterion("license_image <=", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageLike(String value) {
            addCriterion("license_image like", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageNotLike(String value) {
            addCriterion("license_image not like", value, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageIn(List<String> values) {
            addCriterion("license_image in", values, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageNotIn(List<String> values) {
            addCriterion("license_image not in", values, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageBetween(String value1, String value2) {
            addCriterion("license_image between", value1, value2, "license_image");
            return (Criteria) this;
        }

        public Criteria andLicense_imageNotBetween(String value1, String value2) {
            addCriterion("license_image not between", value1, value2, "license_image");
            return (Criteria) this;
        }

        public Criteria andDocking_idIsNull() {
            addCriterion("docking_id is null");
            return (Criteria) this;
        }

        public Criteria andDocking_idIsNotNull() {
            addCriterion("docking_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocking_idEqualTo(Integer value) {
            addCriterion("docking_id =", value, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idNotEqualTo(Integer value) {
            addCriterion("docking_id <>", value, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idGreaterThan(Integer value) {
            addCriterion("docking_id >", value, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("docking_id >=", value, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idLessThan(Integer value) {
            addCriterion("docking_id <", value, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idLessThanOrEqualTo(Integer value) {
            addCriterion("docking_id <=", value, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idIn(List<Integer> values) {
            addCriterion("docking_id in", values, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idNotIn(List<Integer> values) {
            addCriterion("docking_id not in", values, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idBetween(Integer value1, Integer value2) {
            addCriterion("docking_id between", value1, value2, "docking_id");
            return (Criteria) this;
        }

        public Criteria andDocking_idNotBetween(Integer value1, Integer value2) {
            addCriterion("docking_id not between", value1, value2, "docking_id");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContact_numberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContact_numberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContact_numberEqualTo(String value) {
            addCriterion("contact_number =", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotEqualTo(String value) {
            addCriterion("contact_number <>", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberGreaterThan(String value) {
            addCriterion("contact_number >", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_number >=", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberLessThan(String value) {
            addCriterion("contact_number <", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberLessThanOrEqualTo(String value) {
            addCriterion("contact_number <=", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberLike(String value) {
            addCriterion("contact_number like", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotLike(String value) {
            addCriterion("contact_number not like", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberIn(List<String> values) {
            addCriterion("contact_number in", values, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotIn(List<String> values) {
            addCriterion("contact_number not in", values, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberBetween(String value1, String value2) {
            addCriterion("contact_number between", value1, value2, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotBetween(String value1, String value2) {
            addCriterion("contact_number not between", value1, value2, "contact_number");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAddress_idIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddress_idIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_idEqualTo(Integer value) {
            addCriterion("address_id =", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThan(Integer value) {
            addCriterion("address_id >", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThan(Integer value) {
            addCriterion("address_id <", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idIn(List<Integer> values) {
            addCriterion("address_id in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "address_id");
            return (Criteria) this;
        }

        public Criteria andCreation_timeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreation_timeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreation_timeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeLessThan(Date value) {
            addCriterion("creation_time <", value, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creation_time");
            return (Criteria) this;
        }

        public Criteria andCreation_timeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creation_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_timeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_timeEqualTo(Date value) {
            addCriterion("last_time =", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeGreaterThan(Date value) {
            addCriterion("last_time >", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeLessThan(Date value) {
            addCriterion("last_time <", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeIn(List<Date> values) {
            addCriterion("last_time in", values, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "last_time");
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