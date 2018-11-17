package org.meet.pojo;

import java.util.Date;

public class Comment {
    private int id;
    private Detail detail = new Detail();
    private String context;
    private String author;
    private Date createDate;

    public Comment() {
    }

    public Comment(int id, Detail detail, String context, String author, Date createDate) {
        this.id = id;
        this.detail = detail;
        this.context = context;
        this.author = author;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
