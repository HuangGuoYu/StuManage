package com.stu.entity;

public class Askleave {
    private Integer leaveId;

    private Integer sId;

    private Integer courseId;

    private String sgId;

    private String leaveReason;

    private String leaveCourseTime;

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
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

    public String getSgId() {
        return sgId;
    }

    public void setSgId(String sgId) {
        this.sgId = sgId == null ? null : sgId.trim();
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason == null ? null : leaveReason.trim();
    }

    public String getLeaveCourseTime() {
        return leaveCourseTime;
    }

    public void setLeaveCourseTime(String leaveCourseTime) {
        this.leaveCourseTime = leaveCourseTime == null ? null : leaveCourseTime.trim();
    }
}