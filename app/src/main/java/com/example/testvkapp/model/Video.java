package com.example.testvkapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;


public class Video {

    @SerializedName("vid")
    @Expose
    private Integer id;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("image_big")
    @Expose
    private String imageBig;
    @SerializedName("image_small")
    @Expose
    private String imageSmall;
    @SerializedName("access_key")
    @Expose
    private String accessKey;
    @SerializedName("first_frame_320")
    @Expose
    private String firstFrame320;
    @SerializedName("first_frame_160")
    @Expose
    private String firstFrame160;
    @SerializedName("first_frame_130")
    @Expose
    private String firstFrame130;
    @SerializedName("first_frame_800")
    @Expose
    private String firstFrame800;
    @SerializedName("can_comment")
    @Expose
    private Boolean canComment;
    @SerializedName("can_repost")
    @Expose
    private boolean canRepost;
    @SerializedName("likes")
    @Expose
    private Likes likes;


    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getOwnerId() { return ownerId; }
    public void setOwnerId(Integer ownerId) { this.ownerId = ownerId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Integer getViews() { return views; }
    public void setViews(Integer views) { this.views = views; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getImageBig() { return imageBig; }
    public void setImageBig(String imageBig) { this.imageBig = imageBig; }

    public String getImageSmall() { return imageSmall; }
    public void setImageSmall(String imageSmall) { this.imageSmall = imageSmall; }

    public String getAccessKey() { return accessKey; }
    public void setAccessKey(String accessKey) { this.accessKey = accessKey; }

    public String getFirstFrame320() { return firstFrame320; }
    public void setFirstFrame320(String firstFrame320) { this.firstFrame320 = firstFrame320; }

    public String getFirstFrame160() { return firstFrame160; }
    public void setFirstFrame160(String firstFrame160) { this.firstFrame160 = firstFrame160; }

    public String getFirstFrame130() { return firstFrame130; }
    public void setFirstFrame130(String firstFrame130) { this.firstFrame130 = firstFrame130; }

    public String getFirstFrame800() { return firstFrame800; }
    public void setFirstFrame800(String firstFrame800) { this.firstFrame800 = firstFrame800; }

    public Boolean getCanComment() { return canComment; }
    public void setCanComment(Boolean canComment) { this.canComment = canComment; }

    public boolean isCanRepost() { return canRepost; }
    public void setCanRepost(boolean canRepost) { this.canRepost = canRepost; }

    public Likes getLikes() { return likes; }
    public void setLikes(Likes likes) { this.likes = likes; }

}
