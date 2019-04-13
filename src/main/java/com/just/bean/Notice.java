package com.just.bean;

import java.util.Date;

public class Notice {
    private Integer id;

    private String content;

    private Date createTime;

    public Notice(Integer id, String content, Date createTime) {
        this.id = id;
        this.content = content;
        this.createTime = createTime;
    }

    public Notice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}