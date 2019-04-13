package com.just.bean;

public class DefaultConf {
    private Integer id;

    private String funs;

    public DefaultConf(Integer id, String funs) {
        this.id = id;
        this.funs = funs;
    }

    public DefaultConf() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuns() {
        return funs;
    }

    public void setFuns(String funs) {
        this.funs = funs == null ? null : funs.trim();
    }
}