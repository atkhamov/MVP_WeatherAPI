package com.example.mvp_weatherapi.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Weather {

    @Expose
    @SerializedName("temp")
    private String temp;

    @Expose
    @SerializedName("temp_min")
    private String temp_min;

    @Expose
    @SerializedName("temp_max")
    private String temp_max;

    public String getTemp() {
        return temp;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }
}
