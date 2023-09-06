package com.example.TripAdvisor.review.pojo;

public class LocationId {
    private String location_id;
    private String name;
    private AddressObj address_obj;

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressObj getAddress_obj() {
        return address_obj;
    }

    public void setAddress_obj(AddressObj address_obj) {
        this.address_obj = address_obj;
    }
}
