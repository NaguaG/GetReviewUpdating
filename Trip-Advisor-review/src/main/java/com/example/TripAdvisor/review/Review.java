package com.example.TripAdvisor.review;

public class Review {
    private long id;
    public String published_date;
    public String title;
    public String text;

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Review(long id, String published_date, String title, String text) {
        this.id = id;
        this.published_date = published_date;
        this.title = title;
        this.text = text;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
