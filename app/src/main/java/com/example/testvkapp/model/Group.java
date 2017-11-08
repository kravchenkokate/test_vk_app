package com.example.testvkapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Group {

    @SerializedName("gid")
    @Expose
    private Integer gid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("is_closed")
    @Expose
    private Integer isClosed;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("photo_medium")
    @Expose
    private String photoMedium;
    @SerializedName("photo_big")
    @Expose
    private String photoBig;

    public Integer getGid() { return gid; }
    public void setGid(Integer gid) { this.gid = gid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getScreenName() { return screenName; }
    public void setScreenName(String screenName) { this.screenName = screenName; }

    public Integer getIsClosed() { return isClosed; }
    public void setIsClosed(Integer isClosed) { this.isClosed = isClosed; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public String getPhotoMedium() { return photoMedium; }
    public void setPhotoMedium(String photoMedium) { this.photoMedium = photoMedium; }

    public String getPhotoBig() { return photoBig; }
    public void setPhotoBig(String photoBig) { this.photoBig = photoBig; }

}
