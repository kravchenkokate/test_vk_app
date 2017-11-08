package com.example.testvkapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Item {

    @SerializedName("video")
    @Expose
    private List<Object> video = null;

    public List<Object> getVideo() {
        return video;
    }
}
