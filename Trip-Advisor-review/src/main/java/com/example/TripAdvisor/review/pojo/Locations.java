package com.example.TripAdvisor.review.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Locations {
    private List<Location> data;

    public List<Location> getLocations() {
        return data;
    }
}
