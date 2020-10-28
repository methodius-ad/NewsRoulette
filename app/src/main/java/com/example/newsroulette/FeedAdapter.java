package com.example.newsroulette;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<News> mList;
    private Context mContext;

    FeedAdapter(Context context, List<News>list){
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.name.setText(mList.get(position).getTitle());
        holder.description.setText(mList.get(position).getDescription());
        Picasso.get().load(mList.get(position).getImage()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
