package com.example.testvkapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Item {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("source_id")
    @Expose
    private Integer sourceId;
    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("video")
    @Expose
    private List<Video> video = null;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getSourceId() { return sourceId; }
    public void setSourceId(Integer sourceId) { this.sourceId = sourceId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public List<Video> getVideo() { return video; }
    public void setVideo(List<Video> video) { this.video = video; }

}
