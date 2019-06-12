package com.bmh.pojo;

import java.util.ArrayList;
import java.util.List;

public class BoxBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoxBasicExample() {
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

        public Criteria andEntryDateIsNull() {
            addCriterion("entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(String value) {
            addCriterion("entry_date =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(String value) {
            addCriterion("entry_date <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(String value) {
            addCriterion("entry_date >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(String value) {
            addCriterion("entry_date >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(String value) {
            addCriterion("entry_date <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(String value) {
            addCriterion("entry_date <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLike(String value) {
            addCriterion("entry_date like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotLike(String value) {
            addCriterion("entry_date not like", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<String> values) {
            addCriterion("entry_date in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<String> values) {
            addCriterion("entry_date not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(String value1, String value2) {
            addCriterion("entry_date between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(String value1, String value2) {
            addCriterion("entry_date not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andRopewayIsNull() {
            addCriterion("ropeway is null");
            return (Criteria) this;
        }

        public Criteria andRopewayIsNotNull() {
            addCriterion("ropeway is not null");
            return (Criteria) this;
        }

        public Criteria andRopewayEqualTo(String value) {
            addCriterion("ropeway =", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayNotEqualTo(String value) {
            addCriterion("ropeway <>", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayGreaterThan(String value) {
            addCriterion("ropeway >", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayGreaterThanOrEqualTo(String value) {
            addCriterion("ropeway >=", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayLessThan(String value) {
            addCriterion("ropeway <", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayLessThanOrEqualTo(String value) {
            addCriterion("ropeway <=", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayLike(String value) {
            addCriterion("ropeway like", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayNotLike(String value) {
            addCriterion("ropeway not like", value, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayIn(List<String> values) {
            addCriterion("ropeway in", values, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayNotIn(List<String> values) {
            addCriterion("ropeway not in", values, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayBetween(String value1, String value2) {
            addCriterion("ropeway between", value1, value2, "ropeway");
            return (Criteria) this;
        }

        public Criteria andRopewayNotBetween(String value1, String value2) {
            addCriterion("ropeway not between", value1, value2, "ropeway");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDrivTimeIsNull() {
            addCriterion("driv_time is null");
            return (Criteria) this;
        }

        public Criteria andDrivTimeIsNotNull() {
            addCriterion("driv_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrivTimeEqualTo(String value) {
            addCriterion("driv_time =", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeNotEqualTo(String value) {
            addCriterion("driv_time <>", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeGreaterThan(String value) {
            addCriterion("driv_time >", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeGreaterThanOrEqualTo(String value) {
            addCriterion("driv_time >=", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeLessThan(String value) {
            addCriterion("driv_time <", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeLessThanOrEqualTo(String value) {
            addCriterion("driv_time <=", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeLike(String value) {
            addCriterion("driv_time like", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeNotLike(String value) {
            addCriterion("driv_time not like", value, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeIn(List<String> values) {
            addCriterion("driv_time in", values, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeNotIn(List<String> values) {
            addCriterion("driv_time not in", values, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeBetween(String value1, String value2) {
            addCriterion("driv_time between", value1, value2, "drivTime");
            return (Criteria) this;
        }

        public Criteria andDrivTimeNotBetween(String value1, String value2) {
            addCriterion("driv_time not between", value1, value2, "drivTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(String value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(String value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(String value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(String value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(String value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(String value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLike(String value) {
            addCriterion("stop_time like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotLike(String value) {
            addCriterion("stop_time not like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<String> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<String> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(String value1, String value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(String value1, String value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andRunTodayIsNull() {
            addCriterion("run_today is null");
            return (Criteria) this;
        }

        public Criteria andRunTodayIsNotNull() {
            addCriterion("run_today is not null");
            return (Criteria) this;
        }

        public Criteria andRunTodayEqualTo(Long value) {
            addCriterion("run_today =", value, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayNotEqualTo(Long value) {
            addCriterion("run_today <>", value, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayGreaterThan(Long value) {
            addCriterion("run_today >", value, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayGreaterThanOrEqualTo(Long value) {
            addCriterion("run_today >=", value, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayLessThan(Long value) {
            addCriterion("run_today <", value, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayLessThanOrEqualTo(Long value) {
            addCriterion("run_today <=", value, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayIn(List<Long> values) {
            addCriterion("run_today in", values, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayNotIn(List<Long> values) {
            addCriterion("run_today not in", values, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayBetween(Long value1, Long value2) {
            addCriterion("run_today between", value1, value2, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTodayNotBetween(Long value1, Long value2) {
            addCriterion("run_today not between", value1, value2, "runToday");
            return (Criteria) this;
        }

        public Criteria andRunTotalIsNull() {
            addCriterion("run_total is null");
            return (Criteria) this;
        }

        public Criteria andRunTotalIsNotNull() {
            addCriterion("run_total is not null");
            return (Criteria) this;
        }

        public Criteria andRunTotalEqualTo(Long value) {
            addCriterion("run_total =", value, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalNotEqualTo(Long value) {
            addCriterion("run_total <>", value, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalGreaterThan(Long value) {
            addCriterion("run_total >", value, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("run_total >=", value, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalLessThan(Long value) {
            addCriterion("run_total <", value, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalLessThanOrEqualTo(Long value) {
            addCriterion("run_total <=", value, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalIn(List<Long> values) {
            addCriterion("run_total in", values, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalNotIn(List<Long> values) {
            addCriterion("run_total not in", values, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalBetween(Long value1, Long value2) {
            addCriterion("run_total between", value1, value2, "runTotal");
            return (Criteria) this;
        }

        public Criteria andRunTotalNotBetween(Long value1, Long value2) {
            addCriterion("run_total not between", value1, value2, "runTotal");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Long value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Long value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Long value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Long value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Long value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Long value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Long> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Long> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Long value1, Long value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Long value1, Long value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(Long value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(Long value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(Long value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(Long value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(Long value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(Long value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<Long> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<Long> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(Long value1, Long value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(Long value1, Long value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andTrainDayIsNull() {
            addCriterion("train_day is null");
            return (Criteria) this;
        }

        public Criteria andTrainDayIsNotNull() {
            addCriterion("train_day is not null");
            return (Criteria) this;
        }

        public Criteria andTrainDayEqualTo(Long value) {
            addCriterion("train_day =", value, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayNotEqualTo(Long value) {
            addCriterion("train_day <>", value, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayGreaterThan(Long value) {
            addCriterion("train_day >", value, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayGreaterThanOrEqualTo(Long value) {
            addCriterion("train_day >=", value, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayLessThan(Long value) {
            addCriterion("train_day <", value, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayLessThanOrEqualTo(Long value) {
            addCriterion("train_day <=", value, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayIn(List<Long> values) {
            addCriterion("train_day in", values, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayNotIn(List<Long> values) {
            addCriterion("train_day not in", values, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayBetween(Long value1, Long value2) {
            addCriterion("train_day between", value1, value2, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainDayNotBetween(Long value1, Long value2) {
            addCriterion("train_day not between", value1, value2, "trainDay");
            return (Criteria) this;
        }

        public Criteria andTrainTotalIsNull() {
            addCriterion("train_total is null");
            return (Criteria) this;
        }

        public Criteria andTrainTotalIsNotNull() {
            addCriterion("train_total is not null");
            return (Criteria) this;
        }

        public Criteria andTrainTotalEqualTo(Long value) {
            addCriterion("train_total =", value, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalNotEqualTo(Long value) {
            addCriterion("train_total <>", value, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalGreaterThan(Long value) {
            addCriterion("train_total >", value, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("train_total >=", value, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalLessThan(Long value) {
            addCriterion("train_total <", value, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalLessThanOrEqualTo(Long value) {
            addCriterion("train_total <=", value, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalIn(List<Long> values) {
            addCriterion("train_total in", values, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalNotIn(List<Long> values) {
            addCriterion("train_total not in", values, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalBetween(Long value1, Long value2) {
            addCriterion("train_total between", value1, value2, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andTrainTotalNotBetween(Long value1, Long value2) {
            addCriterion("train_total not between", value1, value2, "trainTotal");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleIsNull() {
            addCriterion("entry_people is null");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleIsNotNull() {
            addCriterion("entry_people is not null");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleEqualTo(String value) {
            addCriterion("entry_people =", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleNotEqualTo(String value) {
            addCriterion("entry_people <>", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleGreaterThan(String value) {
            addCriterion("entry_people >", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("entry_people >=", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleLessThan(String value) {
            addCriterion("entry_people <", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleLessThanOrEqualTo(String value) {
            addCriterion("entry_people <=", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleLike(String value) {
            addCriterion("entry_people like", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleNotLike(String value) {
            addCriterion("entry_people not like", value, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleIn(List<String> values) {
            addCriterion("entry_people in", values, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleNotIn(List<String> values) {
            addCriterion("entry_people not in", values, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleBetween(String value1, String value2) {
            addCriterion("entry_people between", value1, value2, "entryPeople");
            return (Criteria) this;
        }

        public Criteria andEntryPeopleNotBetween(String value1, String value2) {
            addCriterion("entry_people not between", value1, value2, "entryPeople");
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