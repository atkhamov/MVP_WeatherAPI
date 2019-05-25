package com.example.mvp_weatherapi.adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvp_weatherapi.R;


public class WeatherViewHolder extends RecyclerView.ViewHolder {

    private ImageView weatherIcon;
    private TextView weatherTemp;
    private TextView weatherCity;
    private TextView weatherTempMax;
    private TextView weatherTempMin;

    public WeatherViewHolder(@NonNull View itemView) {
        super(itemView);
        this.weatherIcon = itemView.findViewById(R.id.iconWeather);
        this.weatherTemp = itemView.findViewById(R.id.temperature);
        this.weatherCity = itemView.findViewById(R.id.city_name);
        this.weatherTempMax = itemView.findViewById(R.id.temp_max);
        this.weatherTempMin = itemView.findViewById(R.id.temp_min);
    }


}
