package com.example.mvp_weatherapi.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class WeatherMain implements Serializable {

    @Expose
    @SerializedName("main")
    private List<Weather> weatherList;

    public WeatherMain(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }
}
