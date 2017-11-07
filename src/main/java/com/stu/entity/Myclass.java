package com.stu.entity;

public class Myclass {
    private Integer classId;

    private Integer nsId;

    private String className;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getNsId() {
        return nsId;
    }

    public void setNsId(Integer nsId) {
        this.nsId = nsId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}