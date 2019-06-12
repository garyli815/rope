package com.bmh.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class HistoryHolds implements Serializable {

    @Field("id")
    private Long id;

    @Field("hoid_box_num")
    private Long boxNum;

    @Field("hoid_num")
    private Long holdNum;

    private Date date;

    @Field("hold_strength")
    private Integer strength;

    private Double temperature;

    private Integer humidity;

    @Field("hold_rope_station")
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