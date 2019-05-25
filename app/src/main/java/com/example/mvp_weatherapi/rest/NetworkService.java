package com.example.mvp_weatherapi.rest;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static NetworkService networkService = null;
    private Retrofit networkRetrofit;

    public static NetworkService getInstance(){
        if(networkService == null){
            networkService = new NetworkService();
        }
        return networkService;
    }

    private NetworkService(){
        OkHttpClient okHttp = new OkHttpClient.Builder()
                .build();

        networkRetrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttp)
                .build();
    }
    public WeatherApi getWeatherApi() {return networkRetrofit.create(WeatherApi.class);}
}
