package com.gec.pojo;

public class AvgPvs {
    private String daystr;

    private String avgpvs;

    public String getDaystr() {
        return daystr;
    }

    public void setDaystr(String daystr) {
        this.daystr = daystr == null ? null : daystr.trim();
    }

    public String getAvgpvs() {
        return avgpvs;
    }

    public void setAvgpvs(String avgpvs) {
        this.avgpvs = avgpvs == null ? null : avgpvs.trim();
    }
}