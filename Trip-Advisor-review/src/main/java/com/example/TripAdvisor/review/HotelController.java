package com.example.TripAdvisor.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService service;
    @GetMapping("/get-hotel-reviews")
    public Reviews getHotelReviews(@RequestParam("hotelName") String hotelName, @RequestParam("city") String city){
        try {
            return service.getHotelReviews(hotelName, city);
        }catch (Exception e){
            e.printStackTrace();
            return new Reviews();
        }
    }
}
