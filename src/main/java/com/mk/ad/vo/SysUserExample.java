package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDept_idEqualTo(String value) {
            addCriterion("dept_id =", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThan(String value) {
            addCriterion("dept_id >", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThan(String value) {
            addCriterion("dept_id <", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLike(String value) {
            addCriterion("dept_id like", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotLike(String value) {
            addCriterion("dept_id not like", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idIn(List<String> values) {
            addCriterion("dept_id in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andReal_nameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andReal_nameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andReal_nameEqualTo(String value) {
            addCriterion("real_name =", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameGreaterThan(String value) {
            addCriterion("real_name >", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLessThan(String value) {
            addCriterion("real_name <", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLike(String value) {
            addCriterion("real_name like", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotLike(String value) {
            addCriterion("real_name not like", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameIn(List<String> values) {
            addCriterion("real_name in", values, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "real_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNick_nameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNick_nameEqualTo(String value) {
            addCriterion("nick_name =", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameLessThan(String value) {
            addCriterion("nick_name <", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameLike(String value) {
            addCriterion("nick_name like", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameNotLike(String value) {
            addCriterion("nick_name not like", value, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameIn(List<String> values) {
            addCriterion("nick_name in", values, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nick_name");
            return (Criteria) this;
        }

        public Criteria andNick_nameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nick_name");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreate_idIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreate_idIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_idEqualTo(String value) {
            addCriterion("create_id =", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotEqualTo(String value) {
            addCriterion("create_id <>", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idGreaterThan(String value) {
            addCriterion("create_id >", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLessThan(String value) {
            addCriterion("create_id <", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLike(String value) {
            addCriterion("create_id like", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotLike(String value) {
            addCriterion("create_id not like", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idIn(List<String> values) {
            addCriterion("create_id in", values, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotIn(List<String> values) {
            addCriterion("create_id not in", values, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "create_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_idIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_idEqualTo(String value) {
            addCriterion("update_id =", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idNotEqualTo(String value) {
            addCriterion("update_id <>", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idGreaterThan(String value) {
            addCriterion("update_id >", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idGreaterThanOrEqualTo(String value) {
            addCriterion("update_id >=", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idLessThan(String value) {
            addCriterion("update_id <", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idLessThanOrEqualTo(String value) {
            addCriterion("update_id <=", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idLike(String value) {
            addCriterion("update_id like", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idNotLike(String value) {
            addCriterion("update_id not like", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idIn(List<String> values) {
            addCriterion("update_id in", values, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idNotIn(List<String> values) {
            addCriterion("update_id not in", values, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idBetween(String value1, String value2) {
            addCriterion("update_id between", value1, value2, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idNotBetween(String value1, String value2) {
            addCriterion("update_id not between", value1, value2, "update_id");
            return (Criteria) this;
        }

        public Criteria andCreate_whereIsNull() {
            addCriterion("create_where is null");
            return (Criteria) this;
        }

        public Criteria andCreate_whereIsNotNull() {
            addCriterion("create_where is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_whereEqualTo(Integer value) {
            addCriterion("create_where =", value, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereNotEqualTo(Integer value) {
            addCriterion("create_where <>", value, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereGreaterThan(Integer value) {
            addCriterion("create_where >", value, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_where >=", value, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereLessThan(Integer value) {
            addCriterion("create_where <", value, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereLessThanOrEqualTo(Integer value) {
            addCriterion("create_where <=", value, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereIn(List<Integer> values) {
            addCriterion("create_where in", values, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereNotIn(List<Integer> values) {
            addCriterion("create_where not in", values, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereBetween(Integer value1, Integer value2) {
            addCriterion("create_where between", value1, value2, "create_where");
            return (Criteria) this;
        }

        public Criteria andCreate_whereNotBetween(Integer value1, Integer value2) {
            addCriterion("create_where not between", value1, value2, "create_where");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRole_idEqualTo(String value) {
            addCriterion("role_id =", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotEqualTo(String value) {
            addCriterion("role_id <>", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThan(String value) {
            addCriterion("role_id >", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThan(String value) {
            addCriterion("role_id <", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLike(String value) {
            addCriterion("role_id like", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotLike(String value) {
            addCriterion("role_id not like", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idIn(List<String> values) {
            addCriterion("role_id in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotIn(List<String> values) {
            addCriterion("role_id not in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionIsNull() {
            addCriterion("role_jurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionIsNotNull() {
            addCriterion("role_jurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionEqualTo(String value) {
            addCriterion("role_jurisdiction =", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionNotEqualTo(String value) {
            addCriterion("role_jurisdiction <>", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionGreaterThan(String value) {
            addCriterion("role_jurisdiction >", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("role_jurisdiction >=", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionLessThan(String value) {
            addCriterion("role_jurisdiction <", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionLessThanOrEqualTo(String value) {
            addCriterion("role_jurisdiction <=", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionLike(String value) {
            addCriterion("role_jurisdiction like", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionNotLike(String value) {
            addCriterion("role_jurisdiction not like", value, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionIn(List<String> values) {
            addCriterion("role_jurisdiction in", values, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionNotIn(List<String> values) {
            addCriterion("role_jurisdiction not in", values, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionBetween(String value1, String value2) {
            addCriterion("role_jurisdiction between", value1, value2, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andRole_jurisdictionNotBetween(String value1, String value2) {
            addCriterion("role_jurisdiction not between", value1, value2, "role_jurisdiction");
            return (Criteria) this;
        }

        public Criteria andSystem_idIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystem_idIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystem_idEqualTo(Integer value) {
            addCriterion("system_id =", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idNotEqualTo(Integer value) {
            addCriterion("system_id <>", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idGreaterThan(Integer value) {
            addCriterion("system_id >", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_id >=", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idLessThan(Integer value) {
            addCriterion("system_id <", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idLessThanOrEqualTo(Integer value) {
            addCriterion("system_id <=", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idIn(List<Integer> values) {
            addCriterion("system_id in", values, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idNotIn(List<Integer> values) {
            addCriterion("system_id not in", values, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idBetween(Integer value1, Integer value2) {
            addCriterion("system_id between", value1, value2, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idNotBetween(Integer value1, Integer value2) {
            addCriterion("system_id not between", value1, value2, "system_id");
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