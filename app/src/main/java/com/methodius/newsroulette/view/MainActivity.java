package com.methodius.newsroulette.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.methodius.newsroulette.util.FeedAdapter;
import com.methodius.newsroulette.R;
import com.methodius.newsroulette.model.News;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startInit();
    }

    public void startInit(){
        recyclerView = findViewById(R.id.news_feed);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<News> newsList = new ArrayList<News>();

        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child("0").child("News");

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot data: snapshot.getChildren()){
                    News news = data.getValue(News.class);
                    newsList.add(news);
                }

                adapter = new FeedAdapter(getApplicationContext(), newsList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}