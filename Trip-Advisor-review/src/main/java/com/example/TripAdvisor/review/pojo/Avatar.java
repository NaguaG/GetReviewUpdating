package com.example.TripAdvisor.review.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Avatar {
    private String thumbnail;
    private String small;
    private String medium;
    private String large;
    private String original;

}
