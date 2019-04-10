package com.just.bean;

public class StuFunction {
    private Integer id;

    private Integer stuId;

    private Integer function;

    public StuFunction(Integer id, Integer stuId, Integer function) {
        this.id = id;
        this.stuId = stuId;
        this.function = function;
    }

    public StuFunction() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getFunction() {
        return function;
    }

    public void setFunction(Integer function) {
        this.function = function;
    }
}