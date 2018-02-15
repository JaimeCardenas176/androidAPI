package com.example.jaime.androidapi;

import com.example.jaime.androidapi.model.Weather.WeatherInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jaime on 13/02/18.
 */

public interface OpenWeatherApi {
    @GET("/date/2.5/weather")
    Call<WeatherInfo> getTiempo(@Query("Q") String ciudad);
}
