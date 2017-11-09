package com.example.testvkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.testvkapp.model.Video;
import com.example.testvkapp.model.VkResponse;
import com.example.testvkapp.rest.ApiUtils;
import com.example.testvkapp.rest.LoadManager;
import com.google.gson.internal.LinkedTreeMap;
import com.vk.sdk.VKSdk;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class VideoListActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LoadManager mLoadManager;
    private VideoAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);

        mLoadManager = ApiUtils.getLoadManager();
        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new VideoAdapter(new ArrayList<Video>(0), this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

        loadVideo();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.logout) {
            VKSdk.logout();
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void loadVideo() {

        String accessToken = getIntent().getStringExtra("access_token");
        mLoadManager.getFeeds("video", accessToken).enqueue(new Callback<VkResponse>() {

            @Override
            public void onResponse(Call<VkResponse> call, Response<VkResponse> response) {

                if (response.isSuccessful()) {
                    VkResponse body = response.body();
                    List<Object> videos = body.getResponseItems().getItems().get(0).getVideo();
                    showVideoList(videos);
                } else {
                    int statusCode = response.code();
                    // TODO handle request errors depending on status code
                }
            }

            @Override
            public void onFailure(Call<VkResponse> call, Throwable t) {
                //TODO handle failure
            }
        });
    }

    private void showVideoList(List<Object> response) {

        List<Video> videoList = new ArrayList<>();

        for (int i = 1; i < response.size(); i++) {
            LinkedTreeMap item = (LinkedTreeMap)response.get(i);
            Video video = new Video();
            video.setId(((Double)item.get("vid")).intValue());
            video.setTitle((String)item.get("title"));
            video.setDuration(((Double)item.get("duration")).intValue());
            video.setImage((String)item.get("image"));
            videoList.add(video);
        }

        mAdapter.updateList(videoList);
    }

}
