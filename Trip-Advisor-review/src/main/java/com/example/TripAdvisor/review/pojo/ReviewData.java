package com.example.TripAdvisor.review.pojo;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ReviewData {
    private String hotelName;
    private List<String> titles = new ArrayList<>();
    private List<String> reviewTexts = new ArrayList<>();



}