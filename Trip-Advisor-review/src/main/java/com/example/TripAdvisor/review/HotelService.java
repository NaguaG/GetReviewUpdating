package com.example.TripAdvisor.review;

import com.google.gson.Gson;
import com.squareup.okhttp.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
@Service
public class HotelService {
    private final OkHttpClient client = new OkHttpClient();
    private final String apiKey = "EDA87A52AC2B4152A2B38D3FE8200897";
    public Reviews getHotelReviews(String hotelName, String city) throws IOException {
        String locationId = getLocationId(hotelName, city);
        return getReviewsByLocationId(locationId);
    }

    private String getLocationId(String hotelName, String city) throws IOException {

        String encodedHotelName = URLEncoder.encode(hotelName, StandardCharsets.UTF_8.toString());
        String encodedCity = URLEncoder.encode(city, StandardCharsets.UTF_8.toString());

        String apiUrl = "https://api.content.tripadvisor.com/api/v1/location/search?" +
                "key=" + apiKey +
                "&searchQuery=" + encodedHotelName +
                "&address=" + encodedCity +
                "&language=en";
        Request request = new Request.Builder()
                .url(apiUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        try  {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } finally {
                throw new IOException("Location not found !!!");
        }
    }

    private Reviews getReviewsByLocationId(String locationId) throws IOException{
        String apiUrl = "https://api.content.tripadvisor.com/api/v1/location/" + locationId + "/reviews?key=" + apiKey + "&language=en";
        Request request = new Request.Builder()
                .url(apiUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        try  {
            Response response = client.newCall(request).execute();
            String  responseBody = response.body().string();
            Reviews reviews = new Gson().fromJson(responseBody, Reviews.class);
            return reviews;
        }finally {
            throw new IOException("Review not found !!!");
        }
    }
}
