package com.just.bean;

import java.util.Date;

public class Reply {
    private Integer id;

    private Integer repId;

    private Integer stuId;

    private Integer parentId;

    private String createTime;

    private String updateTime;

    private Integer type;

    private Integer looked;

    private String content;

    private Integer repStuId;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Reply(Integer id, Integer repId, Integer stuId, Integer parentId, String createTime, String updateTime, Integer type, Integer looked, String content, Integer repStuId) {
        this.id = id;
        this.repId = repId;
        this.stuId = stuId;
        this.parentId = parentId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.type = type;
        this.looked = looked;
        this.content = content;
        this.repStuId = repStuId;
    }

    public Integer getRepStuId() {
        return repStuId;
    }

    public void setRepStuId(Integer repStuId) {
        this.repStuId = repStuId;
    }

    public Reply() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLooked() {
        return looked;
    }

    public void setLooked(Integer looked) {
        this.looked = looked;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}