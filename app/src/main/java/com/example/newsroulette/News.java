package com.example.newsroulette;

import android.provider.ContactsContract;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class News {
    private String mTitle;
    private String mDescription;
    private String mImage;

    News(){

    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }


}
