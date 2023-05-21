package com.gec.pojo;

public class VNum {
    private String daystr;

    private String depUser;

    private Integer newUsersNum;

    public String getDaystr() {
        return daystr;
    }

    public void setDaystr(String daystr) {
        this.daystr = daystr == null ? null : daystr.trim();
    }

    public String getDepUser() {
        return depUser;
    }

    public void setDepUser(String depUser) {
        this.depUser = depUser == null ? null : depUser.trim();
    }

    public Integer getNewUsersNum() {
        return newUsersNum;
    }

    public void setNewUsersNum(Integer newUsersNum) {
        this.newUsersNum = newUsersNum;
    }
}