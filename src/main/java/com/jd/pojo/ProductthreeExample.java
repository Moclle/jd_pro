package com.jd.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductthreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductthreeExample() {
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

        public Criteria andProductthreeidIsNull() {
            addCriterion("productThreeId is null");
            return (Criteria) this;
        }

        public Criteria andProductthreeidIsNotNull() {
            addCriterion("productThreeId is not null");
            return (Criteria) this;
        }

        public Criteria andProductthreeidEqualTo(Integer value) {
            addCriterion("productThreeId =", value, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidNotEqualTo(Integer value) {
            addCriterion("productThreeId <>", value, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidGreaterThan(Integer value) {
            addCriterion("productThreeId >", value, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productThreeId >=", value, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidLessThan(Integer value) {
            addCriterion("productThreeId <", value, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidLessThanOrEqualTo(Integer value) {
            addCriterion("productThreeId <=", value, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidIn(List<Integer> values) {
            addCriterion("productThreeId in", values, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidNotIn(List<Integer> values) {
            addCriterion("productThreeId not in", values, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidBetween(Integer value1, Integer value2) {
            addCriterion("productThreeId between", value1, value2, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("productThreeId not between", value1, value2, "productthreeid");
            return (Criteria) this;
        }

        public Criteria andProductthreenameIsNull() {
            addCriterion("productThreeName is null");
            return (Criteria) this;
        }

        public Criteria andProductthreenameIsNotNull() {
            addCriterion("productThreeName is not null");
            return (Criteria) this;
        }

        public Criteria andProductthreenameEqualTo(String value) {
            addCriterion("productThreeName =", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameNotEqualTo(String value) {
            addCriterion("productThreeName <>", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameGreaterThan(String value) {
            addCriterion("productThreeName >", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameGreaterThanOrEqualTo(String value) {
            addCriterion("productThreeName >=", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameLessThan(String value) {
            addCriterion("productThreeName <", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameLessThanOrEqualTo(String value) {
            addCriterion("productThreeName <=", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameLike(String value) {
            addCriterion("productThreeName like", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameNotLike(String value) {
            addCriterion("productThreeName not like", value, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameIn(List<String> values) {
            addCriterion("productThreeName in", values, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameNotIn(List<String> values) {
            addCriterion("productThreeName not in", values, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameBetween(String value1, String value2) {
            addCriterion("productThreeName between", value1, value2, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreenameNotBetween(String value1, String value2) {
            addCriterion("productThreeName not between", value1, value2, "productthreename");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionIsNull() {
            addCriterion("productThreeDescription is null");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionIsNotNull() {
            addCriterion("productThreeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionEqualTo(String value) {
            addCriterion("productThreeDescription =", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionNotEqualTo(String value) {
            addCriterion("productThreeDescription <>", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionGreaterThan(String value) {
            addCriterion("productThreeDescription >", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("productThreeDescription >=", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionLessThan(String value) {
            addCriterion("productThreeDescription <", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionLessThanOrEqualTo(String value) {
            addCriterion("productThreeDescription <=", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionLike(String value) {
            addCriterion("productThreeDescription like", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionNotLike(String value) {
            addCriterion("productThreeDescription not like", value, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionIn(List<String> values) {
            addCriterion("productThreeDescription in", values, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionNotIn(List<String> values) {
            addCriterion("productThreeDescription not in", values, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionBetween(String value1, String value2) {
            addCriterion("productThreeDescription between", value1, value2, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreedescriptionNotBetween(String value1, String value2) {
            addCriterion("productThreeDescription not between", value1, value2, "productthreedescription");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlIsNull() {
            addCriterion("productThreeUrl is null");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlIsNotNull() {
            addCriterion("productThreeUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlEqualTo(String value) {
            addCriterion("productThreeUrl =", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlNotEqualTo(String value) {
            addCriterion("productThreeUrl <>", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlGreaterThan(String value) {
            addCriterion("productThreeUrl >", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlGreaterThanOrEqualTo(String value) {
            addCriterion("productThreeUrl >=", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlLessThan(String value) {
            addCriterion("productThreeUrl <", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlLessThanOrEqualTo(String value) {
            addCriterion("productThreeUrl <=", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlLike(String value) {
            addCriterion("productThreeUrl like", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlNotLike(String value) {
            addCriterion("productThreeUrl not like", value, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlIn(List<String> values) {
            addCriterion("productThreeUrl in", values, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlNotIn(List<String> values) {
            addCriterion("productThreeUrl not in", values, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlBetween(String value1, String value2) {
            addCriterion("productThreeUrl between", value1, value2, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andProductthreeurlNotBetween(String value1, String value2) {
            addCriterion("productThreeUrl not between", value1, value2, "productthreeurl");
            return (Criteria) this;
        }

        public Criteria andOneidIsNull() {
            addCriterion("oneId is null");
            return (Criteria) this;
        }

        public Criteria andOneidIsNotNull() {
            addCriterion("oneId is not null");
            return (Criteria) this;
        }

        public Criteria andOneidEqualTo(Integer value) {
            addCriterion("oneId =", value, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidNotEqualTo(Integer value) {
            addCriterion("oneId <>", value, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidGreaterThan(Integer value) {
            addCriterion("oneId >", value, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oneId >=", value, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidLessThan(Integer value) {
            addCriterion("oneId <", value, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidLessThanOrEqualTo(Integer value) {
            addCriterion("oneId <=", value, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidIn(List<Integer> values) {
            addCriterion("oneId in", values, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidNotIn(List<Integer> values) {
            addCriterion("oneId not in", values, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidBetween(Integer value1, Integer value2) {
            addCriterion("oneId between", value1, value2, "oneid");
            return (Criteria) this;
        }

        public Criteria andOneidNotBetween(Integer value1, Integer value2) {
            addCriterion("oneId not between", value1, value2, "oneid");
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