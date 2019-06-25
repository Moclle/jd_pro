package com.jd.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProducttwoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProducttwoExample() {
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

        public Criteria andProducttwoidIsNull() {
            addCriterion("productTwoId is null");
            return (Criteria) this;
        }

        public Criteria andProducttwoidIsNotNull() {
            addCriterion("productTwoId is not null");
            return (Criteria) this;
        }

        public Criteria andProducttwoidEqualTo(Integer value) {
            addCriterion("productTwoId =", value, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidNotEqualTo(Integer value) {
            addCriterion("productTwoId <>", value, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidGreaterThan(Integer value) {
            addCriterion("productTwoId >", value, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productTwoId >=", value, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidLessThan(Integer value) {
            addCriterion("productTwoId <", value, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidLessThanOrEqualTo(Integer value) {
            addCriterion("productTwoId <=", value, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidIn(List<Integer> values) {
            addCriterion("productTwoId in", values, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidNotIn(List<Integer> values) {
            addCriterion("productTwoId not in", values, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidBetween(Integer value1, Integer value2) {
            addCriterion("productTwoId between", value1, value2, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwoidNotBetween(Integer value1, Integer value2) {
            addCriterion("productTwoId not between", value1, value2, "producttwoid");
            return (Criteria) this;
        }

        public Criteria andProducttwonameIsNull() {
            addCriterion("productTwoName is null");
            return (Criteria) this;
        }

        public Criteria andProducttwonameIsNotNull() {
            addCriterion("productTwoName is not null");
            return (Criteria) this;
        }

        public Criteria andProducttwonameEqualTo(String value) {
            addCriterion("productTwoName =", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameNotEqualTo(String value) {
            addCriterion("productTwoName <>", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameGreaterThan(String value) {
            addCriterion("productTwoName >", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameGreaterThanOrEqualTo(String value) {
            addCriterion("productTwoName >=", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameLessThan(String value) {
            addCriterion("productTwoName <", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameLessThanOrEqualTo(String value) {
            addCriterion("productTwoName <=", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameLike(String value) {
            addCriterion("productTwoName like", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameNotLike(String value) {
            addCriterion("productTwoName not like", value, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameIn(List<String> values) {
            addCriterion("productTwoName in", values, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameNotIn(List<String> values) {
            addCriterion("productTwoName not in", values, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameBetween(String value1, String value2) {
            addCriterion("productTwoName between", value1, value2, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwonameNotBetween(String value1, String value2) {
            addCriterion("productTwoName not between", value1, value2, "producttwoname");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionIsNull() {
            addCriterion("productTwoDescription is null");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionIsNotNull() {
            addCriterion("productTwoDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionEqualTo(String value) {
            addCriterion("productTwoDescription =", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionNotEqualTo(String value) {
            addCriterion("productTwoDescription <>", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionGreaterThan(String value) {
            addCriterion("productTwoDescription >", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("productTwoDescription >=", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionLessThan(String value) {
            addCriterion("productTwoDescription <", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionLessThanOrEqualTo(String value) {
            addCriterion("productTwoDescription <=", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionLike(String value) {
            addCriterion("productTwoDescription like", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionNotLike(String value) {
            addCriterion("productTwoDescription not like", value, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionIn(List<String> values) {
            addCriterion("productTwoDescription in", values, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionNotIn(List<String> values) {
            addCriterion("productTwoDescription not in", values, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionBetween(String value1, String value2) {
            addCriterion("productTwoDescription between", value1, value2, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwodescriptionNotBetween(String value1, String value2) {
            addCriterion("productTwoDescription not between", value1, value2, "producttwodescription");
            return (Criteria) this;
        }

        public Criteria andProducttwourlIsNull() {
            addCriterion("productTwoUrl is null");
            return (Criteria) this;
        }

        public Criteria andProducttwourlIsNotNull() {
            addCriterion("productTwoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProducttwourlEqualTo(String value) {
            addCriterion("productTwoUrl =", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlNotEqualTo(String value) {
            addCriterion("productTwoUrl <>", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlGreaterThan(String value) {
            addCriterion("productTwoUrl >", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlGreaterThanOrEqualTo(String value) {
            addCriterion("productTwoUrl >=", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlLessThan(String value) {
            addCriterion("productTwoUrl <", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlLessThanOrEqualTo(String value) {
            addCriterion("productTwoUrl <=", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlLike(String value) {
            addCriterion("productTwoUrl like", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlNotLike(String value) {
            addCriterion("productTwoUrl not like", value, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlIn(List<String> values) {
            addCriterion("productTwoUrl in", values, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlNotIn(List<String> values) {
            addCriterion("productTwoUrl not in", values, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlBetween(String value1, String value2) {
            addCriterion("productTwoUrl between", value1, value2, "producttwourl");
            return (Criteria) this;
        }

        public Criteria andProducttwourlNotBetween(String value1, String value2) {
            addCriterion("productTwoUrl not between", value1, value2, "producttwourl");
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