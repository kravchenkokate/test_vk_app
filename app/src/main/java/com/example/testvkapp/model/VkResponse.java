package com.example.testvkapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VkResponse {

    @SerializedName("response")
    @Expose
    private ResponseItems responseItems;

    public ResponseItems getResponseItems() {
        return responseItems;
    }

    public void setResponseItems(ResponseItems responseItems) {
        this.responseItems = responseItems;
    }
}



