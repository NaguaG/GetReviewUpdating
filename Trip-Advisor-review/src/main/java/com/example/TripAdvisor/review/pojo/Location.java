package com.example.TripAdvisor.review.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private String location_id;
    private String name;
    private AddressObj address_obj;

    @Override
    public String toString() {
        return "Location{" +
                "location_id='" + location_id + '\'' +
                ", name='" + name + '\'' +
                ", address_obj=" + address_obj +
                '}';
    }

}
