package com.gec.pojo;

import java.util.ArrayList;
import java.util.List;

public class VNumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VNumExample() {
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

        public Criteria andDaystrIsNull() {
            addCriterion("daystr is null");
            return (Criteria) this;
        }

        public Criteria andDaystrIsNotNull() {
            addCriterion("daystr is not null");
            return (Criteria) this;
        }

        public Criteria andDaystrEqualTo(String value) {
            addCriterion("daystr =", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrNotEqualTo(String value) {
            addCriterion("daystr <>", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrGreaterThan(String value) {
            addCriterion("daystr >", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrGreaterThanOrEqualTo(String value) {
            addCriterion("daystr >=", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrLessThan(String value) {
            addCriterion("daystr <", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrLessThanOrEqualTo(String value) {
            addCriterion("daystr <=", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrLike(String value) {
            addCriterion("daystr like", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrNotLike(String value) {
            addCriterion("daystr not like", value, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrIn(List<String> values) {
            addCriterion("daystr in", values, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrNotIn(List<String> values) {
            addCriterion("daystr not in", values, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrBetween(String value1, String value2) {
            addCriterion("daystr between", value1, value2, "daystr");
            return (Criteria) this;
        }

        public Criteria andDaystrNotBetween(String value1, String value2) {
            addCriterion("daystr not between", value1, value2, "daystr");
            return (Criteria) this;
        }

        public Criteria andDepUserIsNull() {
            addCriterion("dep_user is null");
            return (Criteria) this;
        }

        public Criteria andDepUserIsNotNull() {
            addCriterion("dep_user is not null");
            return (Criteria) this;
        }

        public Criteria andDepUserEqualTo(String value) {
            addCriterion("dep_user =", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserNotEqualTo(String value) {
            addCriterion("dep_user <>", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserGreaterThan(String value) {
            addCriterion("dep_user >", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserGreaterThanOrEqualTo(String value) {
            addCriterion("dep_user >=", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserLessThan(String value) {
            addCriterion("dep_user <", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserLessThanOrEqualTo(String value) {
            addCriterion("dep_user <=", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserLike(String value) {
            addCriterion("dep_user like", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserNotLike(String value) {
            addCriterion("dep_user not like", value, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserIn(List<String> values) {
            addCriterion("dep_user in", values, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserNotIn(List<String> values) {
            addCriterion("dep_user not in", values, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserBetween(String value1, String value2) {
            addCriterion("dep_user between", value1, value2, "depUser");
            return (Criteria) this;
        }

        public Criteria andDepUserNotBetween(String value1, String value2) {
            addCriterion("dep_user not between", value1, value2, "depUser");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumIsNull() {
            addCriterion("new_users_num is null");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumIsNotNull() {
            addCriterion("new_users_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumEqualTo(Integer value) {
            addCriterion("new_users_num =", value, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumNotEqualTo(Integer value) {
            addCriterion("new_users_num <>", value, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumGreaterThan(Integer value) {
            addCriterion("new_users_num >", value, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_users_num >=", value, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumLessThan(Integer value) {
            addCriterion("new_users_num <", value, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumLessThanOrEqualTo(Integer value) {
            addCriterion("new_users_num <=", value, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumIn(List<Integer> values) {
            addCriterion("new_users_num in", values, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumNotIn(List<Integer> values) {
            addCriterion("new_users_num not in", values, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumBetween(Integer value1, Integer value2) {
            addCriterion("new_users_num between", value1, value2, "newUsersNum");
            return (Criteria) this;
        }

        public Criteria andNewUsersNumNotBetween(Integer value1, Integer value2) {
            addCriterion("new_users_num not between", value1, value2, "newUsersNum");
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