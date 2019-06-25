package com.jd.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductoneExample() {
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

        public Criteria andProductoneidIsNull() {
            addCriterion("productOneId is null");
            return (Criteria) this;
        }

        public Criteria andProductoneidIsNotNull() {
            addCriterion("productOneId is not null");
            return (Criteria) this;
        }

        public Criteria andProductoneidEqualTo(Integer value) {
            addCriterion("productOneId =", value, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidNotEqualTo(Integer value) {
            addCriterion("productOneId <>", value, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidGreaterThan(Integer value) {
            addCriterion("productOneId >", value, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productOneId >=", value, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidLessThan(Integer value) {
            addCriterion("productOneId <", value, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidLessThanOrEqualTo(Integer value) {
            addCriterion("productOneId <=", value, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidIn(List<Integer> values) {
            addCriterion("productOneId in", values, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidNotIn(List<Integer> values) {
            addCriterion("productOneId not in", values, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidBetween(Integer value1, Integer value2) {
            addCriterion("productOneId between", value1, value2, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("productOneId not between", value1, value2, "productoneid");
            return (Criteria) this;
        }

        public Criteria andProductonenameIsNull() {
            addCriterion("productOneName is null");
            return (Criteria) this;
        }

        public Criteria andProductonenameIsNotNull() {
            addCriterion("productOneName is not null");
            return (Criteria) this;
        }

        public Criteria andProductonenameEqualTo(String value) {
            addCriterion("productOneName =", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameNotEqualTo(String value) {
            addCriterion("productOneName <>", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameGreaterThan(String value) {
            addCriterion("productOneName >", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameGreaterThanOrEqualTo(String value) {
            addCriterion("productOneName >=", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameLessThan(String value) {
            addCriterion("productOneName <", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameLessThanOrEqualTo(String value) {
            addCriterion("productOneName <=", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameLike(String value) {
            addCriterion("productOneName like", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameNotLike(String value) {
            addCriterion("productOneName not like", value, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameIn(List<String> values) {
            addCriterion("productOneName in", values, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameNotIn(List<String> values) {
            addCriterion("productOneName not in", values, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameBetween(String value1, String value2) {
            addCriterion("productOneName between", value1, value2, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonenameNotBetween(String value1, String value2) {
            addCriterion("productOneName not between", value1, value2, "productonename");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionIsNull() {
            addCriterion("productOneDescirption is null");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionIsNotNull() {
            addCriterion("productOneDescirption is not null");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionEqualTo(String value) {
            addCriterion("productOneDescirption =", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionNotEqualTo(String value) {
            addCriterion("productOneDescirption <>", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionGreaterThan(String value) {
            addCriterion("productOneDescirption >", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionGreaterThanOrEqualTo(String value) {
            addCriterion("productOneDescirption >=", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionLessThan(String value) {
            addCriterion("productOneDescirption <", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionLessThanOrEqualTo(String value) {
            addCriterion("productOneDescirption <=", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionLike(String value) {
            addCriterion("productOneDescirption like", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionNotLike(String value) {
            addCriterion("productOneDescirption not like", value, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionIn(List<String> values) {
            addCriterion("productOneDescirption in", values, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionNotIn(List<String> values) {
            addCriterion("productOneDescirption not in", values, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionBetween(String value1, String value2) {
            addCriterion("productOneDescirption between", value1, value2, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductonedescirptionNotBetween(String value1, String value2) {
            addCriterion("productOneDescirption not between", value1, value2, "productonedescirption");
            return (Criteria) this;
        }

        public Criteria andProductoneurlIsNull() {
            addCriterion("productOneUrl is null");
            return (Criteria) this;
        }

        public Criteria andProductoneurlIsNotNull() {
            addCriterion("productOneUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProductoneurlEqualTo(String value) {
            addCriterion("productOneUrl =", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlNotEqualTo(String value) {
            addCriterion("productOneUrl <>", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlGreaterThan(String value) {
            addCriterion("productOneUrl >", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlGreaterThanOrEqualTo(String value) {
            addCriterion("productOneUrl >=", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlLessThan(String value) {
            addCriterion("productOneUrl <", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlLessThanOrEqualTo(String value) {
            addCriterion("productOneUrl <=", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlLike(String value) {
            addCriterion("productOneUrl like", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlNotLike(String value) {
            addCriterion("productOneUrl not like", value, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlIn(List<String> values) {
            addCriterion("productOneUrl in", values, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlNotIn(List<String> values) {
            addCriterion("productOneUrl not in", values, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlBetween(String value1, String value2) {
            addCriterion("productOneUrl between", value1, value2, "productoneurl");
            return (Criteria) this;
        }

        public Criteria andProductoneurlNotBetween(String value1, String value2) {
            addCriterion("productOneUrl not between", value1, value2, "productoneurl");
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