package com.example.TripAdvisor.review.pojo;

import com.google.gson.JsonElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private long id;
    private String lang;
    private int location_id;
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
    private JsonElement subratings;
    private OwnerResponse owner_response;

}
