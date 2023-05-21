package com.gec.pojo;

import org.apache.ibatis.annotations.Lang;

public class ResultVo {
    private String[] dates;
    private Long[] data;

    public String[] getDates() {
        return dates;
    }

    public void setDates(String[] dates) {
        this.dates = dates;
    }

    public Long[] getData() {
        return data;
    }

    public void setData(Long[] data) {
        this.data = data;
    }
}
