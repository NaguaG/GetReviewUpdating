package com.example.TripAdvisor.review;

import com.example.TripAdvisor.review.pojo.*;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import kotlin.collections.ArrayDeque;
import org.springframework.stereotype.Service;


import java.io.IOException;


import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class HotelService {
    private final OkHttpClient client = new OkHttpClient();
    private final String apiKey = "EDA87A52AC2B4152A2B38D3FE8200897";

    public List<ReviewData> getHotelReviews(String hotelName, String city) throws IOException {

        List<ReviewData> reviewDataList = new ArrayDeque<>();

        //get locations
        Locations locations = getLocationIds(hotelName, city);
        List<Location> locationList = locations.getLocations();
        if (locationList != null && !locationList.isEmpty()) {
            for (Location location : locationList) {
                String location_id = location.getLocation_id();
//                System.out.println(location.getName());

                ReviewData reviewData = new ReviewData();
                reviewData.setHotelName(location.getName());

                //for each location, get reviews now:
                Reviews reviews = fetchHotelReviews(location_id);
                List<Review> reviewList = reviews.getReviews();
                for (Review review : reviewList) {
//                    System.out.println(review.getText());
                    reviewData.getReviewTexts().add(review.getText());
                }
                reviewDataList.add(reviewData);
            }
        } else {
            System.out.println("No locations found."); //huhuurei
        }

        return reviewDataList;
    }

    private Locations getLocationIds(String hotelName, String city) throws IOException {
        String encodedHotelName = URLEncoder.encode(hotelName, StandardCharsets.UTF_8.toString());
        String encodedCity = URLEncoder.encode(city, StandardCharsets.UTF_8.toString());

        String apiUrl = "https://api.content.tripadvisor.com/api/v1/location/search?" +
                "key=" + apiKey +
                "&searchQuery=" + encodedHotelName +
                "&address=" + encodedCity +
                "&language=en";

//        System.out.println(apiUrl);
        Request request = new Request.Builder()
                .url(apiUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = null;
        Locations locations = null;

        try {
            response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                Gson gson = new Gson();
                locations = gson.fromJson(response.body().charStream(), Locations.class);
                return locations;
            } else {
                throw new IOException("Failed to retrieve locations. HTTP response code: " + response.code());
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if (response != null) {
                response.body().close();
            }
        }

    }

    public Reviews fetchHotelReviews(String locationId) throws IOException {

        String apiUrl = "https://api.content.tripadvisor.com/api/v1/location/" + locationId + "/reviews?key=" + apiKey + "&language=en";
        Request request = new Request.Builder()
                .url(apiUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();
//        System.out.println(apiUrl);

        Response response = null;
        Reviews reviews = null;

        try {
            response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                Gson gson = new Gson();
                reviews = gson.fromJson(response.body().charStream(), Reviews.class);
                return reviews;
            } else {
                throw new IOException("Failed to retrieve locations. HTTP response code: " + response.code());
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if (response != null) {
                response.body().close();
            }
        }
    }
}
