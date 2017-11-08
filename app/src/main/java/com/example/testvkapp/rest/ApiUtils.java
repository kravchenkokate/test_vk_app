package com.example.testvkapp.rest;


public class ApiUtils {

    public static final String BASE_URL = "https://api.vk.com";

    public static LoadManager getLoadManager() {
        return RetrofitClient.getClient(BASE_URL).create(LoadManager.class);
    }
}
