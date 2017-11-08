package com.example.testvkapp.rest;

import com.example.testvkapp.model.VkResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface LoadManager {

    @GET("/method/newsfeed.get")
    Call<VkResponse> getFeeds(@Query("filters") String filters, @Query("access_token") String accessToken);
}
