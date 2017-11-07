package com.stu.entity;

import java.util.Date;

public class Positioning {
    private String positId;

    private Integer sId;

    private String positLatitude;

    private String positLongitude;

    private Date positTime;

    public String getPositId() {
        return positId;
    }

    public void setPositId(String positId) {
        this.positId = positId == null ? null : positId.trim();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getPositLatitude() {
        return positLatitude;
    }

    public void setPositLatitude(String positLatitude) {
        this.positLatitude = positLatitude == null ? null : positLatitude.trim();
    }

    public String getPositLongitude() {
        return positLongitude;
    }

    public void setPositLongitude(String positLongitude) {
        this.positLongitude = positLongitude == null ? null : positLongitude.trim();
    }

    public Date getPositTime() {
        return positTime;
    }

    public void setPositTime(Date positTime) {
        this.positTime = positTime;
    }
}