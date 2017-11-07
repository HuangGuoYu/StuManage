package com.stu.entity;

import java.util.Date;

public class Announcement {
    private Integer acId;

    private Integer nsId;

    private String acMoment;

    private Date acTime;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getNsId() {
        return nsId;
    }

    public void setNsId(Integer nsId) {
        this.nsId = nsId;
    }

    public String getAcMoment() {
        return acMoment;
    }

    public void setAcMoment(String acMoment) {
        this.acMoment = acMoment == null ? null : acMoment.trim();
    }

    public Date getAcTime() {
        return acTime;
    }

    public void setAcTime(Date acTime) {
        this.acTime = acTime;
    }
}