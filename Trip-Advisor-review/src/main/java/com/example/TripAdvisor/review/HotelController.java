package com.example.TripAdvisor.review;

import com.example.TripAdvisor.review.pojo.ReviewData;
import com.example.TripAdvisor.review.pojo.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService service;
    @GetMapping("/get-hotel-reviews")
    public List<ReviewData> getHotelReviews(@RequestParam("hotelName") String hotelName, @RequestParam("city") String city){
        try {
            return service.getHotelReviews(hotelName, city);
        }catch (Exception e){
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
