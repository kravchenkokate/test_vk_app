package com.example.testvkapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testvkapp.model.Item;
import com.example.testvkapp.model.Video;

import java.util.List;


public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {

    private List<Video> mVideoList;

    public VideoAdapter(List<Video> videos) {
        mVideoList = videos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImage;
        public TextView mTitle;
        public TextView mDuration;

        public ViewHolder(View itemView) {

            super(itemView);
            mImage = itemView.findViewById(R.id.image);
            mTitle = itemView.findViewById(R.id.title);
            mDuration = itemView.findViewById(R.id.duration);
        }
    }

    @Override
    public VideoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View videoView = inflater.inflate(R.layout.post_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(parent);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VideoAdapter.ViewHolder viewHolder, int i) {

        Video video = mVideoList.get(i);
        viewHolder.mTitle.setText(video.getTitle());
        viewHolder.mDuration.setText(video.getDuration());
        //viewHolder.mImage.setImageBitmap();
    }

    @Override
    public int getItemCount() {
        return mVideoList.size();
    }

    public void updateAnswers(List<Item> items) {
        //TODO show in activity
        /*mVideoList.clear();
        for(Item item : items) {
            mVideoList.addAll(item.getVideo());
        }
        notifyDataSetChanged();*/
    }
}
