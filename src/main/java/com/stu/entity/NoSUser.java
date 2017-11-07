package com.stu.entity;

public class NoSUser {
    private Integer nsId;

    private String nsUsername;

    private String nsPassword;

    private String nsName;

    private String nsIdentity;

    private String nsSex;

    private String nsPhone;

    private String nsEmail;

    public Integer getNsId() {
        return nsId;
    }

    public void setNsId(Integer nsId) {
        this.nsId = nsId;
    }

    public String getNsUsername() {
        return nsUsername;
    }

    public void setNsUsername(String nsUsername) {
        this.nsUsername = nsUsername == null ? null : nsUsername.trim();
    }

    public String getNsPassword() {
        return nsPassword;
    }

    public void setNsPassword(String nsPassword) {
        this.nsPassword = nsPassword == null ? null : nsPassword.trim();
    }

    public String getNsName() {
        return nsName;
    }

    public void setNsName(String nsName) {
        this.nsName = nsName == null ? null : nsName.trim();
    }

    public String getNsIdentity() {
        return nsIdentity;
    }

    public void setNsIdentity(String nsIdentity) {
        this.nsIdentity = nsIdentity == null ? null : nsIdentity.trim();
    }

    public String getNsSex() {
        return nsSex;
    }

    public void setNsSex(String nsSex) {
        this.nsSex = nsSex == null ? null : nsSex.trim();
    }

    public String getNsPhone() {
        return nsPhone;
    }

    public void setNsPhone(String nsPhone) {
        this.nsPhone = nsPhone == null ? null : nsPhone.trim();
    }

    public String getNsEmail() {
        return nsEmail;
    }

    public void setNsEmail(String nsEmail) {
        this.nsEmail = nsEmail == null ? null : nsEmail.trim();
    }
}