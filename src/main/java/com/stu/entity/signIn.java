package com.stu.entity;

import java.util.Date;

public class signIn {
    private String sgId;

    private Integer sId;

    private Integer courseId;

    private String sgCourseTime;

    private String sgState;

    private Date sgTime;

    public String getSgId() {
        return sgId;
    }

    public void setSgId(String sgId) {
        this.sgId = sgId == null ? null : sgId.trim();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSgCourseTime() {
        return sgCourseTime;
    }

    public void setSgCourseTime(String sgCourseTime) {
        this.sgCourseTime = sgCourseTime == null ? null : sgCourseTime.trim();
    }

    public String getSgState() {
        return sgState;
    }

    public void setSgState(String sgState) {
        this.sgState = sgState == null ? null : sgState.trim();
    }

    public Date getSgTime() {
        return sgTime;
    }

    public void setSgTime(Date sgTime) {
        this.sgTime = sgTime;
    }
}