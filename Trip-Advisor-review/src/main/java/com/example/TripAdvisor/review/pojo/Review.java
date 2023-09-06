package com.example.TripAdvisor.review.pojo;

public class Review {
    private long id;
    private String lang;
    private long location_id;
    private String published_date;
    private int rating;
    private int helpful_votes;
    private String rating_image_url;
    private String url;
    private String text;
    private String title;
    private String trip_type;
    private String travel_date;
    private User user;
    private Subratings subratings;
    private OwnerResponse owner_response;

    public void setId(long id) {
        this.id = id;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setHelpful_votes(int helpful_votes) {
        this.helpful_votes = helpful_votes;
    }

    public void setRating_image_url(String rating_image_url) {
        this.rating_image_url = rating_image_url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTrip_type(String trip_type) {
        this.trip_type = trip_type;
    }

    public void setTravel_date(String travel_date) {
        this.travel_date = travel_date;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSubratings(Subratings subratings) {
        this.subratings = subratings;
    }

    public void setOwner_response(OwnerResponse owner_response) {
        this.owner_response = owner_response;
    }

    public long getId() {
        return id;
    }

    public String getLang() {
        return lang;
    }

    public long getLocation_id() {
        return location_id;
    }

    public String getPublished_date() {
        return published_date;
    }

    public int getRating() {
        return rating;
    }

    public int getHelpful_votes() {
        return helpful_votes;
    }

    public String getRating_image_url() {
        return rating_image_url;
    }

    public String getUrl() {
        return url;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public String getTrip_type() {
        return trip_type;
    }

    public String getTravel_date() {
        return travel_date;
    }

    public User getUser() {
        return user;
    }

    public Subratings getSubratings() {
        return subratings;
    }

    public OwnerResponse getOwner_response() {
        return owner_response;
    }
}
