package com.sy.watersupplysystem.entities;

public class Account {

    private Integer aid;
    private String userName;
    private String userPassword;
    private String userMobile;
    private String userMail;

    public Account() {
    }

    public Account(Integer aid, String userName, String userPassword, String userMobile, String userMail) {
        this.aid = aid;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userMobile = userMobile;
        this.userMail = userMail;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
}
