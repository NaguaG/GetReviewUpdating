package com.example.TripAdvisor.review.pojo;

public class SubratingValue {
    private String name;
    private String rating_image_url;
    private int value;
    private String localized_name;

    public String getName() {
        return name;
    }

    public String getRating_image_url() {
        return rating_image_url;
    }

    public int getValue() {
        return value;
    }

    public String getLocalized_name() {
        return localized_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating_image_url(String rating_image_url) {
        this.rating_image_url = rating_image_url;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLocalized_name(String localized_name) {
        this.localized_name = localized_name;
    }
}
