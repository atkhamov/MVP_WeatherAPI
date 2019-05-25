package com.example.mvp_weatherapi.rest;

import com.example.mvp_weatherapi.rest.entities.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    //https://api.openweathermap.org/data/2.5/weather?q=London&units=metric&appid=67fe202f7cbb874d1e21df3db14aea20

    @GET(Config.PATH_FOR_DATA + "weather")
    Call<Weather> getWeather(
            @Query("q") String cityName,
            @Query("units") String unitsMeasure,
            @Query("appid") String appID
    );
}
