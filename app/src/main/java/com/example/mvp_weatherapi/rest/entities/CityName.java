package com.example.mvp_weatherapi.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CityName {
    @Expose
    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }
}
