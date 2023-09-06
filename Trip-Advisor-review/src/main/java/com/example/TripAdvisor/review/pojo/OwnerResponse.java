package com.example.TripAdvisor.review.pojo;

public class OwnerResponse {
    private long id;
    private String title;
    private String text;
    private String lang;
    private String author;
    private String published_date;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getLang() {
        return lang;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }
}
