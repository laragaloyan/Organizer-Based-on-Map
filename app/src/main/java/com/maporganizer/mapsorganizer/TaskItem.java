package com.maporganizer.mapsorganizer;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

public class TaskItem {

    private LatLng mLocation;
    private String mTitle;
    private String mDescription;
    private Date mDate;

    public LatLng getLocation() {
        return mLocation;
    }

    public void setLocation(LatLng location) {
        mLocation = location;
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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}


