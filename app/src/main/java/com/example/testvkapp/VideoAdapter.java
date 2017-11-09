package com.example.testvkapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.testvkapp.model.Video;

import java.util.List;


public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {

    private Context mContext;
    private List<Video> mVideoList;

    public VideoAdapter(List<Video> videos, Context context) {

        mVideoList = videos;
        mContext = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView mCardView;
        ImageView mImage;
        TextView mTitle;
        TextView mDuration;

        public ViewHolder(View itemView) {

            super(itemView);
            mCardView = itemView.findViewById(R.id.cv);
            mImage = itemView.findViewById(R.id.image);
            mTitle = itemView.findViewById(R.id.title);
            mDuration = itemView.findViewById(R.id.duration);
        }
    }

    @Override
    public VideoAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(VideoAdapter.ViewHolder viewHolder, int i) {

        Video video = mVideoList.get(i);
        viewHolder.mTitle.setText(video.getTitle());
        viewHolder.mDuration.setText(video.getDuration().toString());
        Glide.with(mContext).load(video.getImage()).override(200, 200).into(viewHolder.mImage);
    }

    @Override
    public int getItemCount() {
        return mVideoList.size();
    }

    public void updateList(List<Video> videos) {
        mVideoList = videos;
        notifyDataSetChanged();
    }
}
