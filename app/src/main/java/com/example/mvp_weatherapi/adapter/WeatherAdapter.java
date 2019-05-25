package com.example.mvp_weatherapi.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {

    private View view;
    private WeatherViewHolder weatherViewHolder;

    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder weatherViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
