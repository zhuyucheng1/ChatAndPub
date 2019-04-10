package com.just.bean;

import java.util.Date;

public class Artical {
    private Integer id;

    private String title;

    private String cover;

    private String attach;

    private Integer read;

    private Integer reply;

    private Integer isReply;

    private Integer authorId;

    private String authorName;

    private String tags;

    private String createTime;

    private String updateTime;

    private Integer orderType;

    private Integer orderCo;

    private String content;

    private Integer like;

    private String abs;

    public Artical(Integer id, String title, String cover, String attach, Integer read, Integer reply, Integer isReply, Integer authorId, String authorName, String tags, String createTime, String updateTime, Integer orderType, Integer orderCo, String content,Integer like ,String abs) {
        this.id = id;
        this.title = title;
        this.cover = cover;
        this.attach = attach;
        this.read = read;
        this.reply = reply;
        this.isReply = isReply;
        this.authorId = authorId;
        this.authorName = authorName;
        this.tags = tags;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.orderType = orderType;
        this.orderCo = orderCo;
        this.content = content;
        this.like = like;
        this.abs = abs;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public Artical() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

    public Integer getReply() {
        return reply;
    }

    public void setReply(Integer reply) {
        this.reply = reply;
    }

    public Integer getIsReply() {
        return isReply;
    }

    public void setIsReply(Integer isReply) {
        this.isReply = isReply;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderCo() {
        return orderCo;
    }

    public void setOrderCo(Integer orderCo) {
        this.orderCo = orderCo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}