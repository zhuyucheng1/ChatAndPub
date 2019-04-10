package com.just.bean;

import java.util.Date;

public class Student {
    private Long id;

    private String name;

    private Integer sex;

    private String head;

    private String account;

    private String password;

    private Integer admin;

    private Integer depid;

    private Integer isLeader;

    private Integer type;

    private Integer exec;

    private Integer pocket;

    private Integer status;

    private Date createTime;
    public Student(Long id, String name, Integer sex, String head, String account, String password, Integer admin, Integer depid, Integer isLeader, Integer type, Integer exec, Integer pocket,Integer status) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.head = head;
        this.account = account;
        this.password = password;
        this.admin = admin;
        this.depid = depid;
        this.isLeader = isLeader;
        this.type = type;
        this.exec = exec;
        this.pocket = pocket;
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Student() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getExec() {
        return exec;
    }

    public void setExec(Integer exec) {
        this.exec = exec;
    }

    public Integer getPocket() {
        return pocket;
    }

    public void setPocket(Integer pocket) {
        this.pocket = pocket;
    }
}