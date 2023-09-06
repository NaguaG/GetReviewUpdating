package com.example.TripAdvisor.review.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressObj {
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String country;
    private String postalcode;
    private String address_string;

}
