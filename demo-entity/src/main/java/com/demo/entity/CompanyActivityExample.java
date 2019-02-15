/* https://github.com/orange1438 */
package com.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 本文件由 https://github.com/orange1438/mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 * @author orange1438 code generator
 */
public class CompanyActivityExample {
    // 排序字段
    protected String orderByClause;

    // 过滤重复数据
    protected boolean distinct;

    // 查询条件
    protected List<Criteria> oredCriteria;

    /** 
     * 构造查询条件
     */
    public CompanyActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /** 
     * 设置排序字段
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /** 
     * 获取排序字段
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /** 
     * 设置过滤重复数据
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /** 
     * 是否过滤重复数据
     */
    public boolean isDistinct() {
        return distinct;
    }

    /** 
     * 获取当前的查询条件实例
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /** 
     * 增加或者的查询条件,用于构建或者查询
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /** 
     * 创建一个新的或者查询条件
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /** 
     * 创建一个查询条件
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /** 
     * 内部构建查询条件对象
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /** 
     * 清除查询条件
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 活动管理表company_activity的基本动态SQL对象.
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityCodeIsNull() {
            addCriterion("ACTIVITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andActivityCodeIsNotNull() {
            addCriterion("ACTIVITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCodeEqualTo(String value) {
            addCriterion("ACTIVITY_CODE =", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotEqualTo(String value) {
            addCriterion("ACTIVITY_CODE <>", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeGreaterThan(String value) {
            addCriterion("ACTIVITY_CODE >", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_CODE >=", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeLessThan(String value) {
            addCriterion("ACTIVITY_CODE <", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_CODE <=", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeLike(String value) {
            addCriterion("ACTIVITY_CODE like", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotLike(String value) {
            addCriterion("ACTIVITY_CODE not like", value, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeIn(List<String> values) {
            addCriterion("ACTIVITY_CODE in", values, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotIn(List<String> values) {
            addCriterion("ACTIVITY_CODE not in", values, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeBetween(String value1, String value2) {
            addCriterion("ACTIVITY_CODE between", value1, value2, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCodeNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_CODE not between", value1, value2, "activityCode");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("ACTIVITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("ACTIVITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("ACTIVITY_NAME =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("ACTIVITY_NAME >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("ACTIVITY_NAME <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("ACTIVITY_NAME like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("ACTIVITY_NAME not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("ACTIVITY_NAME in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("ACTIVITY_NAME not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("ACTIVITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("ACTIVITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(Byte value) {
            addCriterion("ACTIVITY_TYPE =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(Byte value) {
            addCriterion("ACTIVITY_TYPE <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(Byte value) {
            addCriterion("ACTIVITY_TYPE >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ACTIVITY_TYPE >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(Byte value) {
            addCriterion("ACTIVITY_TYPE <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ACTIVITY_TYPE <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<Byte> values) {
            addCriterion("ACTIVITY_TYPE in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<Byte> values) {
            addCriterion("ACTIVITY_TYPE not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(Byte value1, Byte value2) {
            addCriterion("ACTIVITY_TYPE between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ACTIVITY_TYPE not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateIsNull() {
            addCriterion("ACTIVITY_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateIsNotNull() {
            addCriterion("ACTIVITY_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE =", value, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE <>", value, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE >", value, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE >=", value, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateLessThan(Date value) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE <", value, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE <=", value, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE in", values, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE not in", values, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE between", value1, value2, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityBeginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTIVITY_BEGIN_DATE not between", value1, value2, "activityBeginDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIsNull() {
            addCriterion("ACTIVITY_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIsNotNull() {
            addCriterion("ACTIVITY_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE =", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE <>", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE >", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE >=", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateLessThan(Date value) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE <", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE <=", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE in", values, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE not in", values, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE between", value1, value2, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTIVITY_END_DATE not between", value1, value2, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateIsNull() {
            addCriterion("ENTERED_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateIsNotNull() {
            addCriterion("ENTERED_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateEqualTo(Date value) {
            addCriterion("ENTERED_BEGIN_DATE =", value, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateNotEqualTo(Date value) {
            addCriterion("ENTERED_BEGIN_DATE <>", value, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateGreaterThan(Date value) {
            addCriterion("ENTERED_BEGIN_DATE >", value, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERED_BEGIN_DATE >=", value, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateLessThan(Date value) {
            addCriterion("ENTERED_BEGIN_DATE <", value, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("ENTERED_BEGIN_DATE <=", value, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateIn(List<Date> values) {
            addCriterion("ENTERED_BEGIN_DATE in", values, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateNotIn(List<Date> values) {
            addCriterion("ENTERED_BEGIN_DATE not in", values, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateBetween(Date value1, Date value2) {
            addCriterion("ENTERED_BEGIN_DATE between", value1, value2, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("ENTERED_BEGIN_DATE not between", value1, value2, "enteredBeginDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateIsNull() {
            addCriterion("ENTERED_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateIsNotNull() {
            addCriterion("ENTERED_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateEqualTo(Date value) {
            addCriterion("ENTERED_END_DATE =", value, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateNotEqualTo(Date value) {
            addCriterion("ENTERED_END_DATE <>", value, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateGreaterThan(Date value) {
            addCriterion("ENTERED_END_DATE >", value, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTERED_END_DATE >=", value, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateLessThan(Date value) {
            addCriterion("ENTERED_END_DATE <", value, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateLessThanOrEqualTo(Date value) {
            addCriterion("ENTERED_END_DATE <=", value, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateIn(List<Date> values) {
            addCriterion("ENTERED_END_DATE in", values, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateNotIn(List<Date> values) {
            addCriterion("ENTERED_END_DATE not in", values, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateBetween(Date value1, Date value2) {
            addCriterion("ENTERED_END_DATE between", value1, value2, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andEnteredEndDateNotBetween(Date value1, Date value2) {
            addCriterion("ENTERED_END_DATE not between", value1, value2, "enteredEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceIsNull() {
            addCriterion("ACTIVITY_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceIsNotNull() {
            addCriterion("ACTIVITY_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceEqualTo(String value) {
            addCriterion("ACTIVITY_PLACE =", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceNotEqualTo(String value) {
            addCriterion("ACTIVITY_PLACE <>", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceGreaterThan(String value) {
            addCriterion("ACTIVITY_PLACE >", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_PLACE >=", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceLessThan(String value) {
            addCriterion("ACTIVITY_PLACE <", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_PLACE <=", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceLike(String value) {
            addCriterion("ACTIVITY_PLACE like", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceNotLike(String value) {
            addCriterion("ACTIVITY_PLACE not like", value, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceIn(List<String> values) {
            addCriterion("ACTIVITY_PLACE in", values, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceNotIn(List<String> values) {
            addCriterion("ACTIVITY_PLACE not in", values, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceBetween(String value1, String value2) {
            addCriterion("ACTIVITY_PLACE between", value1, value2, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andActivityPlaceNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_PLACE not between", value1, value2, "activityPlace");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIsNull() {
            addCriterion("DEPARTURE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIsNotNull() {
            addCriterion("DEPARTURE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureCityEqualTo(String value) {
            addCriterion("DEPARTURE_CITY =", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotEqualTo(String value) {
            addCriterion("DEPARTURE_CITY <>", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityGreaterThan(String value) {
            addCriterion("DEPARTURE_CITY >", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTURE_CITY >=", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLessThan(String value) {
            addCriterion("DEPARTURE_CITY <", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLessThanOrEqualTo(String value) {
            addCriterion("DEPARTURE_CITY <=", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityLike(String value) {
            addCriterion("DEPARTURE_CITY like", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotLike(String value) {
            addCriterion("DEPARTURE_CITY not like", value, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityIn(List<String> values) {
            addCriterion("DEPARTURE_CITY in", values, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotIn(List<String> values) {
            addCriterion("DEPARTURE_CITY not in", values, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityBetween(String value1, String value2) {
            addCriterion("DEPARTURE_CITY between", value1, value2, "departureCity");
            return (Criteria) this;
        }

        public Criteria andDepartureCityNotBetween(String value1, String value2) {
            addCriterion("DEPARTURE_CITY not between", value1, value2, "departureCity");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesIsNull() {
            addCriterion("ACTIVITY_ISSUES is null");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesIsNotNull() {
            addCriterion("ACTIVITY_ISSUES is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesEqualTo(String value) {
            addCriterion("ACTIVITY_ISSUES =", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesNotEqualTo(String value) {
            addCriterion("ACTIVITY_ISSUES <>", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesGreaterThan(String value) {
            addCriterion("ACTIVITY_ISSUES >", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ISSUES >=", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesLessThan(String value) {
            addCriterion("ACTIVITY_ISSUES <", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ISSUES <=", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesLike(String value) {
            addCriterion("ACTIVITY_ISSUES like", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesNotLike(String value) {
            addCriterion("ACTIVITY_ISSUES not like", value, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesIn(List<String> values) {
            addCriterion("ACTIVITY_ISSUES in", values, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesNotIn(List<String> values) {
            addCriterion("ACTIVITY_ISSUES not in", values, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ISSUES between", value1, value2, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andActivityIssuesNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ISSUES not between", value1, value2, "activityIssues");
            return (Criteria) this;
        }

        public Criteria andInvitationPathIsNull() {
            addCriterion("INVITATION_PATH is null");
            return (Criteria) this;
        }

        public Criteria andInvitationPathIsNotNull() {
            addCriterion("INVITATION_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationPathEqualTo(String value) {
            addCriterion("INVITATION_PATH =", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathNotEqualTo(String value) {
            addCriterion("INVITATION_PATH <>", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathGreaterThan(String value) {
            addCriterion("INVITATION_PATH >", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathGreaterThanOrEqualTo(String value) {
            addCriterion("INVITATION_PATH >=", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathLessThan(String value) {
            addCriterion("INVITATION_PATH <", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathLessThanOrEqualTo(String value) {
            addCriterion("INVITATION_PATH <=", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathLike(String value) {
            addCriterion("INVITATION_PATH like", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathNotLike(String value) {
            addCriterion("INVITATION_PATH not like", value, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathIn(List<String> values) {
            addCriterion("INVITATION_PATH in", values, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathNotIn(List<String> values) {
            addCriterion("INVITATION_PATH not in", values, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathBetween(String value1, String value2) {
            addCriterion("INVITATION_PATH between", value1, value2, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andInvitationPathNotBetween(String value1, String value2) {
            addCriterion("INVITATION_PATH not between", value1, value2, "invitationPath");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersIsNull() {
            addCriterion("ACTIVITY_PUBLISHERS is null");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersIsNotNull() {
            addCriterion("ACTIVITY_PUBLISHERS is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersEqualTo(String value) {
            addCriterion("ACTIVITY_PUBLISHERS =", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersNotEqualTo(String value) {
            addCriterion("ACTIVITY_PUBLISHERS <>", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersGreaterThan(String value) {
            addCriterion("ACTIVITY_PUBLISHERS >", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_PUBLISHERS >=", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersLessThan(String value) {
            addCriterion("ACTIVITY_PUBLISHERS <", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_PUBLISHERS <=", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersLike(String value) {
            addCriterion("ACTIVITY_PUBLISHERS like", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersNotLike(String value) {
            addCriterion("ACTIVITY_PUBLISHERS not like", value, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersIn(List<String> values) {
            addCriterion("ACTIVITY_PUBLISHERS in", values, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersNotIn(List<String> values) {
            addCriterion("ACTIVITY_PUBLISHERS not in", values, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersBetween(String value1, String value2) {
            addCriterion("ACTIVITY_PUBLISHERS between", value1, value2, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityPublishersNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_PUBLISHERS not between", value1, value2, "activityPublishers");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("ACTIVITY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("ACTIVITY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(Byte value) {
            addCriterion("ACTIVITY_STATUS =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(Byte value) {
            addCriterion("ACTIVITY_STATUS <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(Byte value) {
            addCriterion("ACTIVITY_STATUS >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ACTIVITY_STATUS >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(Byte value) {
            addCriterion("ACTIVITY_STATUS <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(Byte value) {
            addCriterion("ACTIVITY_STATUS <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<Byte> values) {
            addCriterion("ACTIVITY_STATUS in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<Byte> values) {
            addCriterion("ACTIVITY_STATUS not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(Byte value1, Byte value2) {
            addCriterion("ACTIVITY_STATUS between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ACTIVITY_STATUS not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("CREATE_AT is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("CREATE_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("CREATE_AT =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("CREATE_AT <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("CREATE_AT >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_AT >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("CREATE_AT <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_AT <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("CREATE_AT in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("CREATE_AT not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("CREATE_AT between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_AT not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("UPDATE_AT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("UPDATE_AT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("UPDATE_AT =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("UPDATE_AT <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("UPDATE_AT >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_AT >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("UPDATE_AT <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_AT <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("UPDATE_AT in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("UPDATE_AT not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("UPDATE_AT between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_AT not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteAtIsNull() {
            addCriterion("DELETE_AT is null");
            return (Criteria) this;
        }

        public Criteria andDeleteAtIsNotNull() {
            addCriterion("DELETE_AT is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteAtEqualTo(Date value) {
            addCriterion("DELETE_AT =", value, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtNotEqualTo(Date value) {
            addCriterion("DELETE_AT <>", value, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtGreaterThan(Date value) {
            addCriterion("DELETE_AT >", value, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtGreaterThanOrEqualTo(Date value) {
            addCriterion("DELETE_AT >=", value, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtLessThan(Date value) {
            addCriterion("DELETE_AT <", value, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtLessThanOrEqualTo(Date value) {
            addCriterion("DELETE_AT <=", value, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtIn(List<Date> values) {
            addCriterion("DELETE_AT in", values, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtNotIn(List<Date> values) {
            addCriterion("DELETE_AT not in", values, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtBetween(Date value1, Date value2) {
            addCriterion("DELETE_AT between", value1, value2, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteAtNotBetween(Date value1, Date value2) {
            addCriterion("DELETE_AT not between", value1, value2, "deleteAt");
            return (Criteria) this;
        }

        public Criteria andDeleteByIsNull() {
            addCriterion("DELETE_BY is null");
            return (Criteria) this;
        }

        public Criteria andDeleteByIsNotNull() {
            addCriterion("DELETE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteByEqualTo(String value) {
            addCriterion("DELETE_BY =", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByNotEqualTo(String value) {
            addCriterion("DELETE_BY <>", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByGreaterThan(String value) {
            addCriterion("DELETE_BY >", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_BY >=", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByLessThan(String value) {
            addCriterion("DELETE_BY <", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByLessThanOrEqualTo(String value) {
            addCriterion("DELETE_BY <=", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByLike(String value) {
            addCriterion("DELETE_BY like", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByNotLike(String value) {
            addCriterion("DELETE_BY not like", value, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByIn(List<String> values) {
            addCriterion("DELETE_BY in", values, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByNotIn(List<String> values) {
            addCriterion("DELETE_BY not in", values, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByBetween(String value1, String value2) {
            addCriterion("DELETE_BY between", value1, value2, "deleteBy");
            return (Criteria) this;
        }

        public Criteria andDeleteByNotBetween(String value1, String value2) {
            addCriterion("DELETE_BY not between", value1, value2, "deleteBy");
            return (Criteria) this;
        }
    }

    /**
     * 活动管理表company_activity的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 活动管理表company_activity的动态SQL对象.
     */
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