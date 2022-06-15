package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminSspAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminSspAccountExample() {
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

        public Criteria andDue_dateIsNull() {
            addCriterion("due_date is null");
            return (Criteria) this;
        }

        public Criteria andDue_dateIsNotNull() {
            addCriterion("due_date is not null");
            return (Criteria) this;
        }

        public Criteria andDue_dateEqualTo(Date value) {
            addCriterion("due_date =", value, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateNotEqualTo(Date value) {
            addCriterion("due_date <>", value, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateGreaterThan(Date value) {
            addCriterion("due_date >", value, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("due_date >=", value, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateLessThan(Date value) {
            addCriterion("due_date <", value, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateLessThanOrEqualTo(Date value) {
            addCriterion("due_date <=", value, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateIn(List<Date> values) {
            addCriterion("due_date in", values, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateNotIn(List<Date> values) {
            addCriterion("due_date not in", values, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateBetween(Date value1, Date value2) {
            addCriterion("due_date between", value1, value2, "due_date");
            return (Criteria) this;
        }

        public Criteria andDue_dateNotBetween(Date value1, Date value2) {
            addCriterion("due_date not between", value1, value2, "due_date");
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

        public Criteria andShareholderIsNull() {
            addCriterion("shareholder is null");
            return (Criteria) this;
        }

        public Criteria andShareholderIsNotNull() {
            addCriterion("shareholder is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderEqualTo(String value) {
            addCriterion("shareholder =", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotEqualTo(String value) {
            addCriterion("shareholder <>", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThan(String value) {
            addCriterion("shareholder >", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder >=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThan(String value) {
            addCriterion("shareholder <", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThanOrEqualTo(String value) {
            addCriterion("shareholder <=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLike(String value) {
            addCriterion("shareholder like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotLike(String value) {
            addCriterion("shareholder not like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderIn(List<String> values) {
            addCriterion("shareholder in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotIn(List<String> values) {
            addCriterion("shareholder not in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderBetween(String value1, String value2) {
            addCriterion("shareholder between", value1, value2, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotBetween(String value1, String value2) {
            addCriterion("shareholder not between", value1, value2, "shareholder");
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

        public Criteria andDocking_wayIsNull() {
            addCriterion("docking_way is null");
            return (Criteria) this;
        }

        public Criteria andDocking_wayIsNotNull() {
            addCriterion("docking_way is not null");
            return (Criteria) this;
        }

        public Criteria andDocking_wayEqualTo(Integer value) {
            addCriterion("docking_way =", value, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayNotEqualTo(Integer value) {
            addCriterion("docking_way <>", value, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayGreaterThan(Integer value) {
            addCriterion("docking_way >", value, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayGreaterThanOrEqualTo(Integer value) {
            addCriterion("docking_way >=", value, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayLessThan(Integer value) {
            addCriterion("docking_way <", value, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayLessThanOrEqualTo(Integer value) {
            addCriterion("docking_way <=", value, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayIn(List<Integer> values) {
            addCriterion("docking_way in", values, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayNotIn(List<Integer> values) {
            addCriterion("docking_way not in", values, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayBetween(Integer value1, Integer value2) {
            addCriterion("docking_way between", value1, value2, "docking_way");
            return (Criteria) this;
        }

        public Criteria andDocking_wayNotBetween(Integer value1, Integer value2) {
            addCriterion("docking_way not between", value1, value2, "docking_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayIsNull() {
            addCriterion("settlement_way is null");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayIsNotNull() {
            addCriterion("settlement_way is not null");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayEqualTo(Integer value) {
            addCriterion("settlement_way =", value, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayNotEqualTo(Integer value) {
            addCriterion("settlement_way <>", value, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayGreaterThan(Integer value) {
            addCriterion("settlement_way >", value, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlement_way >=", value, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayLessThan(Integer value) {
            addCriterion("settlement_way <", value, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayLessThanOrEqualTo(Integer value) {
            addCriterion("settlement_way <=", value, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayIn(List<Integer> values) {
            addCriterion("settlement_way in", values, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayNotIn(List<Integer> values) {
            addCriterion("settlement_way not in", values, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayBetween(Integer value1, Integer value2) {
            addCriterion("settlement_way between", value1, value2, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andSettlement_wayNotBetween(Integer value1, Integer value2) {
            addCriterion("settlement_way not between", value1, value2, "settlement_way");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(String value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(String value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(String value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(String value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(String value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(String value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLike(String value) {
            addCriterion("profit like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotLike(String value) {
            addCriterion("profit not like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<String> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<String> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(String value1, String value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(String value1, String value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("payee like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("payee not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("payee not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andBank_depositIsNull() {
            addCriterion("bank_deposit is null");
            return (Criteria) this;
        }

        public Criteria andBank_depositIsNotNull() {
            addCriterion("bank_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andBank_depositEqualTo(String value) {
            addCriterion("bank_deposit =", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotEqualTo(String value) {
            addCriterion("bank_deposit <>", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositGreaterThan(String value) {
            addCriterion("bank_deposit >", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositGreaterThanOrEqualTo(String value) {
            addCriterion("bank_deposit >=", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositLessThan(String value) {
            addCriterion("bank_deposit <", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositLessThanOrEqualTo(String value) {
            addCriterion("bank_deposit <=", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositLike(String value) {
            addCriterion("bank_deposit like", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotLike(String value) {
            addCriterion("bank_deposit not like", value, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositIn(List<String> values) {
            addCriterion("bank_deposit in", values, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotIn(List<String> values) {
            addCriterion("bank_deposit not in", values, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositBetween(String value1, String value2) {
            addCriterion("bank_deposit between", value1, value2, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_depositNotBetween(String value1, String value2) {
            addCriterion("bank_deposit not between", value1, value2, "bank_deposit");
            return (Criteria) this;
        }

        public Criteria andBank_accountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBank_accountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBank_accountEqualTo(String value) {
            addCriterion("bank_account =", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountLessThan(String value) {
            addCriterion("bank_account <", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountLike(String value) {
            addCriterion("bank_account like", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotLike(String value) {
            addCriterion("bank_account not like", value, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountIn(List<String> values) {
            addCriterion("bank_account in", values, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bank_account");
            return (Criteria) this;
        }

        public Criteria andBank_accountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bank_account");
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

        public Criteria andEnable_statusIsNull() {
            addCriterion("enable_status is null");
            return (Criteria) this;
        }

        public Criteria andEnable_statusIsNotNull() {
            addCriterion("enable_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnable_statusEqualTo(Integer value) {
            addCriterion("enable_status =", value, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusNotEqualTo(Integer value) {
            addCriterion("enable_status <>", value, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusGreaterThan(Integer value) {
            addCriterion("enable_status >", value, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable_status >=", value, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusLessThan(Integer value) {
            addCriterion("enable_status <", value, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusLessThanOrEqualTo(Integer value) {
            addCriterion("enable_status <=", value, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusIn(List<Integer> values) {
            addCriterion("enable_status in", values, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusNotIn(List<Integer> values) {
            addCriterion("enable_status not in", values, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusBetween(Integer value1, Integer value2) {
            addCriterion("enable_status between", value1, value2, "enable_status");
            return (Criteria) this;
        }

        public Criteria andEnable_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("enable_status not between", value1, value2, "enable_status");
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