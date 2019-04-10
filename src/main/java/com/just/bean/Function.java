package com.just.bean;

public class Function {
    private Integer id;

    private String name;

    private Integer parentId;

    private String html;

    public Function(Integer id, String name, Integer parentId, String html) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.html = html;
    }

    public Function() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html == null ? null : html.trim();
    }
}