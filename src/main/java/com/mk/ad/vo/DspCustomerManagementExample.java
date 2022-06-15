package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DspCustomerManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DspCustomerManagementExample() {
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

        public Criteria andBusiness_type_idIsNull() {
            addCriterion("business_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idIsNotNull() {
            addCriterion("business_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idEqualTo(Integer value) {
            addCriterion("business_type_id =", value, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idNotEqualTo(Integer value) {
            addCriterion("business_type_id <>", value, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idGreaterThan(Integer value) {
            addCriterion("business_type_id >", value, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type_id >=", value, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idLessThan(Integer value) {
            addCriterion("business_type_id <", value, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("business_type_id <=", value, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idIn(List<Integer> values) {
            addCriterion("business_type_id in", values, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idNotIn(List<Integer> values) {
            addCriterion("business_type_id not in", values, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idBetween(Integer value1, Integer value2) {
            addCriterion("business_type_id between", value1, value2, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andBusiness_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type_id not between", value1, value2, "business_type_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeEqualTo(Integer value) {
            addCriterion("customer_type =", value, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeNotEqualTo(Integer value) {
            addCriterion("customer_type <>", value, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeGreaterThan(Integer value) {
            addCriterion("customer_type >", value, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_type >=", value, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeLessThan(Integer value) {
            addCriterion("customer_type <", value, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeLessThanOrEqualTo(Integer value) {
            addCriterion("customer_type <=", value, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeIn(List<Integer> values) {
            addCriterion("customer_type in", values, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeNotIn(List<Integer> values) {
            addCriterion("customer_type not in", values, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeBetween(Integer value1, Integer value2) {
            addCriterion("customer_type between", value1, value2, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCustomer_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_type not between", value1, value2, "customer_type");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameIsNull() {
            addCriterion("corporate_name is null");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameIsNotNull() {
            addCriterion("corporate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameEqualTo(String value) {
            addCriterion("corporate_name =", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameNotEqualTo(String value) {
            addCriterion("corporate_name <>", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameGreaterThan(String value) {
            addCriterion("corporate_name >", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_name >=", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameLessThan(String value) {
            addCriterion("corporate_name <", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameLessThanOrEqualTo(String value) {
            addCriterion("corporate_name <=", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameLike(String value) {
            addCriterion("corporate_name like", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameNotLike(String value) {
            addCriterion("corporate_name not like", value, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameIn(List<String> values) {
            addCriterion("corporate_name in", values, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameNotIn(List<String> values) {
            addCriterion("corporate_name not in", values, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameBetween(String value1, String value2) {
            addCriterion("corporate_name between", value1, value2, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCorporate_nameNotBetween(String value1, String value2) {
            addCriterion("corporate_name not between", value1, value2, "corporate_name");
            return (Criteria) this;
        }

        public Criteria andCompany_profileIsNull() {
            addCriterion("company_profile is null");
            return (Criteria) this;
        }

        public Criteria andCompany_profileIsNotNull() {
            addCriterion("company_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_profileEqualTo(String value) {
            addCriterion("company_profile =", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileNotEqualTo(String value) {
            addCriterion("company_profile <>", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileGreaterThan(String value) {
            addCriterion("company_profile >", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileGreaterThanOrEqualTo(String value) {
            addCriterion("company_profile >=", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileLessThan(String value) {
            addCriterion("company_profile <", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileLessThanOrEqualTo(String value) {
            addCriterion("company_profile <=", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileLike(String value) {
            addCriterion("company_profile like", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileNotLike(String value) {
            addCriterion("company_profile not like", value, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileIn(List<String> values) {
            addCriterion("company_profile in", values, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileNotIn(List<String> values) {
            addCriterion("company_profile not in", values, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileBetween(String value1, String value2) {
            addCriterion("company_profile between", value1, value2, "company_profile");
            return (Criteria) this;
        }

        public Criteria andCompany_profileNotBetween(String value1, String value2) {
            addCriterion("company_profile not between", value1, value2, "company_profile");
            return (Criteria) this;
        }

        public Criteria andSales_idIsNull() {
            addCriterion("sales_id is null");
            return (Criteria) this;
        }

        public Criteria andSales_idIsNotNull() {
            addCriterion("sales_id is not null");
            return (Criteria) this;
        }

        public Criteria andSales_idEqualTo(String value) {
            addCriterion("sales_id =", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idNotEqualTo(String value) {
            addCriterion("sales_id <>", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idGreaterThan(String value) {
            addCriterion("sales_id >", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idGreaterThanOrEqualTo(String value) {
            addCriterion("sales_id >=", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idLessThan(String value) {
            addCriterion("sales_id <", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idLessThanOrEqualTo(String value) {
            addCriterion("sales_id <=", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idLike(String value) {
            addCriterion("sales_id like", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idNotLike(String value) {
            addCriterion("sales_id not like", value, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idIn(List<String> values) {
            addCriterion("sales_id in", values, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idNotIn(List<String> values) {
            addCriterion("sales_id not in", values, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idBetween(String value1, String value2) {
            addCriterion("sales_id between", value1, value2, "sales_id");
            return (Criteria) this;
        }

        public Criteria andSales_idNotBetween(String value1, String value2) {
            addCriterion("sales_id not between", value1, value2, "sales_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idIsNull() {
            addCriterion("optimizer_id is null");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idIsNotNull() {
            addCriterion("optimizer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idEqualTo(String value) {
            addCriterion("optimizer_id =", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idNotEqualTo(String value) {
            addCriterion("optimizer_id <>", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idGreaterThan(String value) {
            addCriterion("optimizer_id >", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idGreaterThanOrEqualTo(String value) {
            addCriterion("optimizer_id >=", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idLessThan(String value) {
            addCriterion("optimizer_id <", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idLessThanOrEqualTo(String value) {
            addCriterion("optimizer_id <=", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idLike(String value) {
            addCriterion("optimizer_id like", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idNotLike(String value) {
            addCriterion("optimizer_id not like", value, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idIn(List<String> values) {
            addCriterion("optimizer_id in", values, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idNotIn(List<String> values) {
            addCriterion("optimizer_id not in", values, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idBetween(String value1, String value2) {
            addCriterion("optimizer_id between", value1, value2, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andOptimizer_idNotBetween(String value1, String value2) {
            addCriterion("optimizer_id not between", value1, value2, "optimizer_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idIsNull() {
            addCriterion("industry_classification_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idIsNotNull() {
            addCriterion("industry_classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idEqualTo(Integer value) {
            addCriterion("industry_classification_id =", value, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idNotEqualTo(Integer value) {
            addCriterion("industry_classification_id <>", value, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idGreaterThan(Integer value) {
            addCriterion("industry_classification_id >", value, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_classification_id >=", value, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idLessThan(Integer value) {
            addCriterion("industry_classification_id <", value, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idLessThanOrEqualTo(Integer value) {
            addCriterion("industry_classification_id <=", value, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idIn(List<Integer> values) {
            addCriterion("industry_classification_id in", values, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idNotIn(List<Integer> values) {
            addCriterion("industry_classification_id not in", values, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idBetween(Integer value1, Integer value2) {
            addCriterion("industry_classification_id between", value1, value2, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_classification_idNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_classification_id not between", value1, value2, "industry_classification_id");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseEqualTo(String value) {
            addCriterion("business_license =", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseGreaterThan(String value) {
            addCriterion("business_license >", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseLessThan(String value) {
            addCriterion("business_license <", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseLike(String value) {
            addCriterion("business_license like", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseNotLike(String value) {
            addCriterion("business_license not like", value, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseIn(List<String> values) {
            addCriterion("business_license in", values, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "business_license");
            return (Criteria) this;
        }

        public Criteria andBusiness_licenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "business_license");
            return (Criteria) this;
        }

        public Criteria andFilingIsNull() {
            addCriterion("filing is null");
            return (Criteria) this;
        }

        public Criteria andFilingIsNotNull() {
            addCriterion("filing is not null");
            return (Criteria) this;
        }

        public Criteria andFilingEqualTo(String value) {
            addCriterion("filing =", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingNotEqualTo(String value) {
            addCriterion("filing <>", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingGreaterThan(String value) {
            addCriterion("filing >", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingGreaterThanOrEqualTo(String value) {
            addCriterion("filing >=", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingLessThan(String value) {
            addCriterion("filing <", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingLessThanOrEqualTo(String value) {
            addCriterion("filing <=", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingLike(String value) {
            addCriterion("filing like", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingNotLike(String value) {
            addCriterion("filing not like", value, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingIn(List<String> values) {
            addCriterion("filing in", values, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingNotIn(List<String> values) {
            addCriterion("filing not in", values, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingBetween(String value1, String value2) {
            addCriterion("filing between", value1, value2, "filing");
            return (Criteria) this;
        }

        public Criteria andFilingNotBetween(String value1, String value2) {
            addCriterion("filing not between", value1, value2, "filing");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsIsNull() {
            addCriterion("identity_cards is null");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsIsNotNull() {
            addCriterion("identity_cards is not null");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsEqualTo(String value) {
            addCriterion("identity_cards =", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsNotEqualTo(String value) {
            addCriterion("identity_cards <>", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsGreaterThan(String value) {
            addCriterion("identity_cards >", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsGreaterThanOrEqualTo(String value) {
            addCriterion("identity_cards >=", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsLessThan(String value) {
            addCriterion("identity_cards <", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsLessThanOrEqualTo(String value) {
            addCriterion("identity_cards <=", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsLike(String value) {
            addCriterion("identity_cards like", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsNotLike(String value) {
            addCriterion("identity_cards not like", value, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsIn(List<String> values) {
            addCriterion("identity_cards in", values, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsNotIn(List<String> values) {
            addCriterion("identity_cards not in", values, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsBetween(String value1, String value2) {
            addCriterion("identity_cards between", value1, value2, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIdentity_cardsNotBetween(String value1, String value2) {
            addCriterion("identity_cards not between", value1, value2, "identity_cards");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idIsNull() {
            addCriterion("industry_qualification_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idIsNotNull() {
            addCriterion("industry_qualification_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idEqualTo(String value) {
            addCriterion("industry_qualification_id =", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idNotEqualTo(String value) {
            addCriterion("industry_qualification_id <>", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idGreaterThan(String value) {
            addCriterion("industry_qualification_id >", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idGreaterThanOrEqualTo(String value) {
            addCriterion("industry_qualification_id >=", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idLessThan(String value) {
            addCriterion("industry_qualification_id <", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idLessThanOrEqualTo(String value) {
            addCriterion("industry_qualification_id <=", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idLike(String value) {
            addCriterion("industry_qualification_id like", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idNotLike(String value) {
            addCriterion("industry_qualification_id not like", value, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idIn(List<String> values) {
            addCriterion("industry_qualification_id in", values, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idNotIn(List<String> values) {
            addCriterion("industry_qualification_id not in", values, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idBetween(String value1, String value2) {
            addCriterion("industry_qualification_id between", value1, value2, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_idNotBetween(String value1, String value2) {
            addCriterion("industry_qualification_id not between", value1, value2, "industry_qualification_id");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileIsNull() {
            addCriterion("industry_qualification_file is null");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileIsNotNull() {
            addCriterion("industry_qualification_file is not null");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileEqualTo(String value) {
            addCriterion("industry_qualification_file =", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileNotEqualTo(String value) {
            addCriterion("industry_qualification_file <>", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileGreaterThan(String value) {
            addCriterion("industry_qualification_file >", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileGreaterThanOrEqualTo(String value) {
            addCriterion("industry_qualification_file >=", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileLessThan(String value) {
            addCriterion("industry_qualification_file <", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileLessThanOrEqualTo(String value) {
            addCriterion("industry_qualification_file <=", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileLike(String value) {
            addCriterion("industry_qualification_file like", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileNotLike(String value) {
            addCriterion("industry_qualification_file not like", value, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileIn(List<String> values) {
            addCriterion("industry_qualification_file in", values, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileNotIn(List<String> values) {
            addCriterion("industry_qualification_file not in", values, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileBetween(String value1, String value2) {
            addCriterion("industry_qualification_file between", value1, value2, "industry_qualification_file");
            return (Criteria) this;
        }

        public Criteria andIndustry_qualification_fileNotBetween(String value1, String value2) {
            addCriterion("industry_qualification_file not between", value1, value2, "industry_qualification_file");
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

        public Criteria andAccount_balanceIsNull() {
            addCriterion("account_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIsNotNull() {
            addCriterion("account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceEqualTo(String value) {
            addCriterion("account_balance =", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotEqualTo(String value) {
            addCriterion("account_balance <>", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceGreaterThan(String value) {
            addCriterion("account_balance >", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceGreaterThanOrEqualTo(String value) {
            addCriterion("account_balance >=", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceLessThan(String value) {
            addCriterion("account_balance <", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceLessThanOrEqualTo(String value) {
            addCriterion("account_balance <=", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceLike(String value) {
            addCriterion("account_balance like", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotLike(String value) {
            addCriterion("account_balance not like", value, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceIn(List<String> values) {
            addCriterion("account_balance in", values, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotIn(List<String> values) {
            addCriterion("account_balance not in", values, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceBetween(String value1, String value2) {
            addCriterion("account_balance between", value1, value2, "account_balance");
            return (Criteria) this;
        }

        public Criteria andAccount_balanceNotBetween(String value1, String value2) {
            addCriterion("account_balance not between", value1, value2, "account_balance");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksIsNull() {
            addCriterion("rejection_remarks is null");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksIsNotNull() {
            addCriterion("rejection_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksEqualTo(String value) {
            addCriterion("rejection_remarks =", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksNotEqualTo(String value) {
            addCriterion("rejection_remarks <>", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksGreaterThan(String value) {
            addCriterion("rejection_remarks >", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksGreaterThanOrEqualTo(String value) {
            addCriterion("rejection_remarks >=", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksLessThan(String value) {
            addCriterion("rejection_remarks <", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksLessThanOrEqualTo(String value) {
            addCriterion("rejection_remarks <=", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksLike(String value) {
            addCriterion("rejection_remarks like", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksNotLike(String value) {
            addCriterion("rejection_remarks not like", value, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksIn(List<String> values) {
            addCriterion("rejection_remarks in", values, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksNotIn(List<String> values) {
            addCriterion("rejection_remarks not in", values, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksBetween(String value1, String value2) {
            addCriterion("rejection_remarks between", value1, value2, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andRejection_remarksNotBetween(String value1, String value2) {
            addCriterion("rejection_remarks not between", value1, value2, "rejection_remarks");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusIsNull() {
            addCriterion("examiner_status is null");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusIsNotNull() {
            addCriterion("examiner_status is not null");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusEqualTo(Integer value) {
            addCriterion("examiner_status =", value, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusNotEqualTo(Integer value) {
            addCriterion("examiner_status <>", value, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusGreaterThan(Integer value) {
            addCriterion("examiner_status >", value, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("examiner_status >=", value, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusLessThan(Integer value) {
            addCriterion("examiner_status <", value, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusLessThanOrEqualTo(Integer value) {
            addCriterion("examiner_status <=", value, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusIn(List<Integer> values) {
            addCriterion("examiner_status in", values, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusNotIn(List<Integer> values) {
            addCriterion("examiner_status not in", values, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusBetween(Integer value1, Integer value2) {
            addCriterion("examiner_status between", value1, value2, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andExaminer_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("examiner_status not between", value1, value2, "examiner_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusIsNull() {
            addCriterion("outside_status is null");
            return (Criteria) this;
        }

        public Criteria andOutside_statusIsNotNull() {
            addCriterion("outside_status is not null");
            return (Criteria) this;
        }

        public Criteria andOutside_statusEqualTo(Integer value) {
            addCriterion("outside_status =", value, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusNotEqualTo(Integer value) {
            addCriterion("outside_status <>", value, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusGreaterThan(Integer value) {
            addCriterion("outside_status >", value, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("outside_status >=", value, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusLessThan(Integer value) {
            addCriterion("outside_status <", value, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusLessThanOrEqualTo(Integer value) {
            addCriterion("outside_status <=", value, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusIn(List<Integer> values) {
            addCriterion("outside_status in", values, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusNotIn(List<Integer> values) {
            addCriterion("outside_status not in", values, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusBetween(Integer value1, Integer value2) {
            addCriterion("outside_status between", value1, value2, "outside_status");
            return (Criteria) this;
        }

        public Criteria andOutside_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("outside_status not between", value1, value2, "outside_status");
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

        public Criteria andSuperior_agency_idIsNull() {
            addCriterion("superior_agency_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idIsNotNull() {
            addCriterion("superior_agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idEqualTo(Integer value) {
            addCriterion("superior_agency_id =", value, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idNotEqualTo(Integer value) {
            addCriterion("superior_agency_id <>", value, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idGreaterThan(Integer value) {
            addCriterion("superior_agency_id >", value, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("superior_agency_id >=", value, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idLessThan(Integer value) {
            addCriterion("superior_agency_id <", value, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idLessThanOrEqualTo(Integer value) {
            addCriterion("superior_agency_id <=", value, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idIn(List<Integer> values) {
            addCriterion("superior_agency_id in", values, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idNotIn(List<Integer> values) {
            addCriterion("superior_agency_id not in", values, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idBetween(Integer value1, Integer value2) {
            addCriterion("superior_agency_id between", value1, value2, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andSuperior_agency_idNotBetween(Integer value1, Integer value2) {
            addCriterion("superior_agency_id not between", value1, value2, "superior_agency_id");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreat_timeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeLessThan(Date value) {
            addCriterion("creat_time <", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creat_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_idIsNull() {
            addCriterion("examiner_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminer_idIsNotNull() {
            addCriterion("examiner_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminer_idEqualTo(String value) {
            addCriterion("examiner_id =", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idNotEqualTo(String value) {
            addCriterion("examiner_id <>", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idGreaterThan(String value) {
            addCriterion("examiner_id >", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idGreaterThanOrEqualTo(String value) {
            addCriterion("examiner_id >=", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idLessThan(String value) {
            addCriterion("examiner_id <", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idLessThanOrEqualTo(String value) {
            addCriterion("examiner_id <=", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idLike(String value) {
            addCriterion("examiner_id like", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idNotLike(String value) {
            addCriterion("examiner_id not like", value, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idIn(List<String> values) {
            addCriterion("examiner_id in", values, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idNotIn(List<String> values) {
            addCriterion("examiner_id not in", values, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idBetween(String value1, String value2) {
            addCriterion("examiner_id between", value1, value2, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_idNotBetween(String value1, String value2) {
            addCriterion("examiner_id not between", value1, value2, "examiner_id");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeIsNull() {
            addCriterion("examiner_time is null");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeIsNotNull() {
            addCriterion("examiner_time is not null");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeEqualTo(Date value) {
            addCriterion("examiner_time =", value, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeNotEqualTo(Date value) {
            addCriterion("examiner_time <>", value, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeGreaterThan(Date value) {
            addCriterion("examiner_time >", value, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("examiner_time >=", value, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeLessThan(Date value) {
            addCriterion("examiner_time <", value, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeLessThanOrEqualTo(Date value) {
            addCriterion("examiner_time <=", value, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeIn(List<Date> values) {
            addCriterion("examiner_time in", values, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeNotIn(List<Date> values) {
            addCriterion("examiner_time not in", values, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeBetween(Date value1, Date value2) {
            addCriterion("examiner_time between", value1, value2, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andExaminer_timeNotBetween(Date value1, Date value2) {
            addCriterion("examiner_time not between", value1, value2, "examiner_time");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeIsNull() {
            addCriterion("qualifications_type is null");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeIsNotNull() {
            addCriterion("qualifications_type is not null");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeEqualTo(Integer value) {
            addCriterion("qualifications_type =", value, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeNotEqualTo(Integer value) {
            addCriterion("qualifications_type <>", value, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeGreaterThan(Integer value) {
            addCriterion("qualifications_type >", value, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualifications_type >=", value, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeLessThan(Integer value) {
            addCriterion("qualifications_type <", value, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeLessThanOrEqualTo(Integer value) {
            addCriterion("qualifications_type <=", value, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeIn(List<Integer> values) {
            addCriterion("qualifications_type in", values, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeNotIn(List<Integer> values) {
            addCriterion("qualifications_type not in", values, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeBetween(Integer value1, Integer value2) {
            addCriterion("qualifications_type between", value1, value2, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andQualifications_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("qualifications_type not between", value1, value2, "qualifications_type");
            return (Criteria) this;
        }

        public Criteria andAccount_nameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccount_nameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_nameEqualTo(String value) {
            addCriterion("account_name =", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameGreaterThan(String value) {
            addCriterion("account_name >", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameLessThan(String value) {
            addCriterion("account_name <", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameLike(String value) {
            addCriterion("account_name like", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameNotLike(String value) {
            addCriterion("account_name not like", value, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameIn(List<String> values) {
            addCriterion("account_name in", values, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "account_name");
            return (Criteria) this;
        }

        public Criteria andAccount_nameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "account_name");
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