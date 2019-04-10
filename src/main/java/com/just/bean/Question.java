package com.just.bean;

import java.util.Date;

public class Question {
    private Integer id;

    private Integer autortId;

    private String content;

    private Date createTime;

    private Date updateTime;

    private Integer orderType;

    private Integer orderCount;

    private Integer isOrder;

    private Integer status;

    public Question(Integer id, Integer autortId, String content, Date createTime, Date updateTime, Integer orderType, Integer orderCount, Integer isOrder, Integer status) {
        this.id = id;
        this.autortId = autortId;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.orderType = orderType;
        this.orderCount = orderCount;
        this.isOrder = isOrder;
        this.status = status;
    }

    public Question() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAutortId() {
        return autortId;
    }

    public void setAutortId(Integer autortId) {
        this.autortId = autortId;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getIsOrder() {
        return isOrder;
    }

    public void setIsOrder(Integer isOrder) {
        this.isOrder = isOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}