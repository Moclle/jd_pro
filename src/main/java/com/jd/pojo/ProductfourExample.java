package com.jd.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductfourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductfourExample() {
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

        public Criteria andProductfouridIsNull() {
            addCriterion("productFourId is null");
            return (Criteria) this;
        }

        public Criteria andProductfouridIsNotNull() {
            addCriterion("productFourId is not null");
            return (Criteria) this;
        }

        public Criteria andProductfouridEqualTo(Integer value) {
            addCriterion("productFourId =", value, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridNotEqualTo(Integer value) {
            addCriterion("productFourId <>", value, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridGreaterThan(Integer value) {
            addCriterion("productFourId >", value, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridGreaterThanOrEqualTo(Integer value) {
            addCriterion("productFourId >=", value, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridLessThan(Integer value) {
            addCriterion("productFourId <", value, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridLessThanOrEqualTo(Integer value) {
            addCriterion("productFourId <=", value, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridIn(List<Integer> values) {
            addCriterion("productFourId in", values, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridNotIn(List<Integer> values) {
            addCriterion("productFourId not in", values, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridBetween(Integer value1, Integer value2) {
            addCriterion("productFourId between", value1, value2, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfouridNotBetween(Integer value1, Integer value2) {
            addCriterion("productFourId not between", value1, value2, "productfourid");
            return (Criteria) this;
        }

        public Criteria andProductfournameIsNull() {
            addCriterion("productFourName is null");
            return (Criteria) this;
        }

        public Criteria andProductfournameIsNotNull() {
            addCriterion("productFourName is not null");
            return (Criteria) this;
        }

        public Criteria andProductfournameEqualTo(String value) {
            addCriterion("productFourName =", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameNotEqualTo(String value) {
            addCriterion("productFourName <>", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameGreaterThan(String value) {
            addCriterion("productFourName >", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameGreaterThanOrEqualTo(String value) {
            addCriterion("productFourName >=", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameLessThan(String value) {
            addCriterion("productFourName <", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameLessThanOrEqualTo(String value) {
            addCriterion("productFourName <=", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameLike(String value) {
            addCriterion("productFourName like", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameNotLike(String value) {
            addCriterion("productFourName not like", value, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameIn(List<String> values) {
            addCriterion("productFourName in", values, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameNotIn(List<String> values) {
            addCriterion("productFourName not in", values, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameBetween(String value1, String value2) {
            addCriterion("productFourName between", value1, value2, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfournameNotBetween(String value1, String value2) {
            addCriterion("productFourName not between", value1, value2, "productfourname");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionIsNull() {
            addCriterion("productFourDescription is null");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionIsNotNull() {
            addCriterion("productFourDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionEqualTo(String value) {
            addCriterion("productFourDescription =", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionNotEqualTo(String value) {
            addCriterion("productFourDescription <>", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionGreaterThan(String value) {
            addCriterion("productFourDescription >", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("productFourDescription >=", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionLessThan(String value) {
            addCriterion("productFourDescription <", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionLessThanOrEqualTo(String value) {
            addCriterion("productFourDescription <=", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionLike(String value) {
            addCriterion("productFourDescription like", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionNotLike(String value) {
            addCriterion("productFourDescription not like", value, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionIn(List<String> values) {
            addCriterion("productFourDescription in", values, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionNotIn(List<String> values) {
            addCriterion("productFourDescription not in", values, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionBetween(String value1, String value2) {
            addCriterion("productFourDescription between", value1, value2, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfourdescriptionNotBetween(String value1, String value2) {
            addCriterion("productFourDescription not between", value1, value2, "productfourdescription");
            return (Criteria) this;
        }

        public Criteria andProductfoururlIsNull() {
            addCriterion("productFourUrl is null");
            return (Criteria) this;
        }

        public Criteria andProductfoururlIsNotNull() {
            addCriterion("productFourUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProductfoururlEqualTo(String value) {
            addCriterion("productFourUrl =", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlNotEqualTo(String value) {
            addCriterion("productFourUrl <>", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlGreaterThan(String value) {
            addCriterion("productFourUrl >", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlGreaterThanOrEqualTo(String value) {
            addCriterion("productFourUrl >=", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlLessThan(String value) {
            addCriterion("productFourUrl <", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlLessThanOrEqualTo(String value) {
            addCriterion("productFourUrl <=", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlLike(String value) {
            addCriterion("productFourUrl like", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlNotLike(String value) {
            addCriterion("productFourUrl not like", value, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlIn(List<String> values) {
            addCriterion("productFourUrl in", values, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlNotIn(List<String> values) {
            addCriterion("productFourUrl not in", values, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlBetween(String value1, String value2) {
            addCriterion("productFourUrl between", value1, value2, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andProductfoururlNotBetween(String value1, String value2) {
            addCriterion("productFourUrl not between", value1, value2, "productfoururl");
            return (Criteria) this;
        }

        public Criteria andThreeidIsNull() {
            addCriterion("threeId is null");
            return (Criteria) this;
        }

        public Criteria andThreeidIsNotNull() {
            addCriterion("threeId is not null");
            return (Criteria) this;
        }

        public Criteria andThreeidEqualTo(Integer value) {
            addCriterion("threeId =", value, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidNotEqualTo(Integer value) {
            addCriterion("threeId <>", value, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidGreaterThan(Integer value) {
            addCriterion("threeId >", value, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("threeId >=", value, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidLessThan(Integer value) {
            addCriterion("threeId <", value, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidLessThanOrEqualTo(Integer value) {
            addCriterion("threeId <=", value, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidIn(List<Integer> values) {
            addCriterion("threeId in", values, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidNotIn(List<Integer> values) {
            addCriterion("threeId not in", values, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidBetween(Integer value1, Integer value2) {
            addCriterion("threeId between", value1, value2, "threeid");
            return (Criteria) this;
        }

        public Criteria andThreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("threeId not between", value1, value2, "threeid");
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