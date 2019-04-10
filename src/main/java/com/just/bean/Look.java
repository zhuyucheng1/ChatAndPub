package com.just.bean;

public class Look {
    private Integer id;

    private Integer stuId;

    private Integer lookId;

    public Look(Integer id, Integer stuId, Integer lookId) {
        this.id = id;
        this.stuId = stuId;
        this.lookId = lookId;
    }

    public Look() {
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

    public Integer getLookId() {
        return lookId;
    }

    public void setLookId(Integer lookId) {
        this.lookId = lookId;
    }
}