package com.methodius.newsroulette.util;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.methodius.newsroulette.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView description;
    ImageView image;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.news_title);
        description = itemView.findViewById(R.id.news_text);
        image = itemView.findViewById(R.id.news_image);
    }
}
