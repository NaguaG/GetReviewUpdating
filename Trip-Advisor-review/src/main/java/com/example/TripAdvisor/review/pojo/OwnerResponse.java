package com.example.TripAdvisor.review.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerResponse {
    private long id;
    private String title;
    private String text;
    private String lang;
    private String author;
    private String published_date;

}
