package com.example.TripAdvisor.review.pojo;

public class Avatar {
    private String thumbnail;
    private String small;
    private String medium;
    private String large;
    private String original;

    public String getThumbnail() {
        return thumbnail;
    }

    public String getSmall() {
        return small;
    }

    public String getMedium() {
        return medium;
    }

    public String getLarge() {
        return large;
    }

    public String getOriginal() {
        return original;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
