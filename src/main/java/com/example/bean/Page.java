package com.example.bean;

/**
 * Created by hucheng on 2017/4/8.
 */
public class Page {
    private Integer offset = 0;
    private Integer limit = 10;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
