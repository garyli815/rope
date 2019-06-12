package com.bmh.pojo;

public class BoxBasic {
    private Long id;

    private String entryDate;

    private String ropeway;

    private String status;

    private String drivTime;

    private String stopTime;

    private Long runToday;

    private Long runTotal;

    private String weather;

    private Long temperature;

    private Long carNum;

    private Long trainDay;

    private Long trainTotal;

    private String entryPeople;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate == null ? null : entryDate.trim();
    }

    public String getRopeway() {
        return ropeway;
    }

    public void setRopeway(String ropeway) {
        this.ropeway = ropeway == null ? null : ropeway.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDrivTime() {
        return drivTime;
    }

    public void setDrivTime(String drivTime) {
        this.drivTime = drivTime == null ? null : drivTime.trim();
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime == null ? null : stopTime.trim();
    }

    public Long getRunToday() {
        return runToday;
    }

    public void setRunToday(Long runToday) {
        this.runToday = runToday;
    }

    public Long getRunTotal() {
        return runTotal;
    }

    public void setRunTotal(Long runTotal) {
        this.runTotal = runTotal;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }

    public Long getCarNum() {
        return carNum;
    }

    public void setCarNum(Long carNum) {
        this.carNum = carNum;
    }

    public Long getTrainDay() {
        return trainDay;
    }

    public void setTrainDay(Long trainDay) {
        this.trainDay = trainDay;
    }

    public Long getTrainTotal() {
        return trainTotal;
    }

    public void setTrainTotal(Long trainTotal) {
        this.trainTotal = trainTotal;
    }

    public String getEntryPeople() {
        return entryPeople;
    }

    public void setEntryPeople(String entryPeople) {
        this.entryPeople = entryPeople == null ? null : entryPeople.trim();
    }
}