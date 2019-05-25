package com.example.mvp_weatherapi.allWeather;

import com.example.mvp_weatherapi.rest.NetworkService;
import com.example.mvp_weatherapi.rest.entities.IconMain;
import com.example.mvp_weatherapi.rest.entities.Weather;
import com.example.mvp_weatherapi.rest.entities.WeatherMain;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherModel implements WeatherContract.Model {

    WeatherContract.Presenter presenter;

    public WeatherModel(WeatherContract.Presenter presenter) {
        this.presenter = presenter;
    }



    @Override
    public void getWeather(String cityName) {
        Call<Weather> callWeather = NetworkService.getInstance().getWeatherApi().getWeather("London", "metric", "67fe202f7cbb874d1e21df3db14aea20");
        callWeather.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                presenter.loadingFinished(response.body());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                presenter.loadingFailed(t);
            }
        });

    }

    @Override
    public void getIcon(String iconCode) {
        Call<IconMain> getIcon = NetworkService.getInstance().getWeatherApi().getWeather("London", "metric", "67fe202f7cbb874d1e21df3db14aea20");

    }

    @Override
    public void getCityName(String cityName) {

    }
}
