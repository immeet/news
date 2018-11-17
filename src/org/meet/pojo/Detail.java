package org.meet.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Detail {
    private int id;
    private String title;
    private String summary;
    private String author;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    public Detail() {
    }

    public Detail(int id, String title, String summary, String author, Date createDate) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.author = author;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
