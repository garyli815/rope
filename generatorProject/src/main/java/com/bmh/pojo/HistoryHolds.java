package com.bmh.pojo;

import java.util.Date;

public class HistoryHolds {
    private Long id;

    private Long boxNum;

    private Long holdNum;

    private Date date;

    private Integer strength;

    private Double temperature;

    private Integer humidity;

    private String ropeStation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(Long boxNum) {
        this.boxNum = boxNum;
    }

    public Long getHoldNum() {
        return holdNum;
    }

    public void setHoldNum(Long holdNum) {
        this.holdNum = holdNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public String getRopeStation() {
        return ropeStation;
    }

    public void setRopeStation(String ropeStation) {
        this.ropeStation = ropeStation == null ? null : ropeStation.trim();
    }
}