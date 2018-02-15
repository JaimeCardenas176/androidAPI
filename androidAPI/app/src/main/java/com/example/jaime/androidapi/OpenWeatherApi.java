package com.example.jaime.androidapi;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jaime on 13/02/18.
 */

public interface OpenWeatherApi {
    @GET("weather")
    Call<?> primerRequest();;
}
