package com.just.bean;

import java.util.Date;

public class Log {
    private Integer id;

    private String func;

    private Integer stuId;

    private Integer status;

    private Date createTime;

    public Log(Integer id, String func, Integer stuId, Integer status, Date createTime) {
        this.id = id;
        this.func = func;
        this.stuId = stuId;
        this.status = status;
        this.createTime = createTime;
    }

    public Log() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func == null ? null : func.trim();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}