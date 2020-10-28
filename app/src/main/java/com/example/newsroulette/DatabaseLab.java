package com.example.newsroulette;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class DatabaseLab {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mRef;
    static News mNews;

    DatabaseLab(){
        mDatabase = FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference("message");
        mNews = new News();
    }

}
