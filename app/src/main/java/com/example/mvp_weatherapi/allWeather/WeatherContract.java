package com.example.mvp_weatherapi.allWeather;

import com.example.mvp_weatherapi.rest.entities.Icon;
import com.example.mvp_weatherapi.rest.entities.IconMain;
import com.example.mvp_weatherapi.rest.entities.Weather;
import com.example.mvp_weatherapi.rest.entities.WeatherMain;

import java.util.List;

public interface WeatherContract {

    interface View{
        void showLoading();
        void hideLoading();
        void addNewIcon(List<Icon> newIcon);
        void addNewWeather(List<Weather> newWeather);
        void showError(Throwable throwable);
    }

    interface Presenter{
        void load(String cityName);
        void loadingFinished(Weather weatherMain);
        void loadingFinishedIcon(IconMain iconMain);
        void loadingFailed(Throwable throwable);
    }

    interface Model{
        void getWeather(String cityName);
        void getIcon(String iconCode);
        void getCityName(String cityName);
    }
}
