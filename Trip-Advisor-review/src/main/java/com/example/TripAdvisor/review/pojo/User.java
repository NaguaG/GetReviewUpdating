package com.example.TripAdvisor.review.pojo;

public class User {
    private String username;
    private UserLocation user_location;
    private Avatar avatar;

    public String getUsername() {
        return username;
    }

    public UserLocation getUser_location() {
        return user_location;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUser_location(UserLocation user_location) {
        this.user_location = user_location;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
