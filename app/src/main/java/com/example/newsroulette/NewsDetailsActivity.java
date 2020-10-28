package com.example.newsroulette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDetailsActivity extends AppCompatActivity {
    private TextView mDetailTitle;
    private ImageView mDetailImage;
    private TextView mDetailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        mDetailTitle = findViewById(R.id.news_detail_title);
        mDetailImage = findViewById(R.id.news_detail_image);
        mDetailText = findViewById(R.id.news_text);


    }
}