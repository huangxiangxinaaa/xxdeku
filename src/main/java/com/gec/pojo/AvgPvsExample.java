package com.gec.pojo;

import java.util.ArrayList;
import java.util.List;

public class AvgPvsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AvgPvsExample() {
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

        public Criteria andAvgpvsIsNull() {
            addCriterion("avgpvs is null");
            return (Criteria) this;
        }

        public Criteria andAvgpvsIsNotNull() {
            addCriterion("avgpvs is not null");
            return (Criteria) this;
        }

        public Criteria andAvgpvsEqualTo(String value) {
            addCriterion("avgpvs =", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsNotEqualTo(String value) {
            addCriterion("avgpvs <>", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsGreaterThan(String value) {
            addCriterion("avgpvs >", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsGreaterThanOrEqualTo(String value) {
            addCriterion("avgpvs >=", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsLessThan(String value) {
            addCriterion("avgpvs <", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsLessThanOrEqualTo(String value) {
            addCriterion("avgpvs <=", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsLike(String value) {
            addCriterion("avgpvs like", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsNotLike(String value) {
            addCriterion("avgpvs not like", value, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsIn(List<String> values) {
            addCriterion("avgpvs in", values, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsNotIn(List<String> values) {
            addCriterion("avgpvs not in", values, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsBetween(String value1, String value2) {
            addCriterion("avgpvs between", value1, value2, "avgpvs");
            return (Criteria) this;
        }

        public Criteria andAvgpvsNotBetween(String value1, String value2) {
            addCriterion("avgpvs not between", value1, value2, "avgpvs");
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