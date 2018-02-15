package com.example.jaime.androidapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jaime.androidapi.model.Weather.WeatherInfo;

import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView ciudad;
    private TextView fecha;
    private TextView estado;
    private ImageView img;
    private TextView temperatura;
    private TextView humedad;
    private TextView nubosidad;
    private TextView viento;
    private TextView presion;
    private TextView precipitaciones;
    //ae48797f317a02e51e943fa3961983c7
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            ciudad = findViewById(R.id.nombreCiudad);
            fecha = findViewById(R.id.fecha);
            estado = findViewById(R.id.estado);
            img = findViewById(R.id.foto);
            temperatura = findViewById(R.id.temperatura);
            humedad = findViewById(R.id.humedad);
            nubosidad = findViewById(R.id.nubosidad);
            viento = findViewById(R.id.viento);
            presion = findViewById(R.id.presion);
            precipitaciones = findViewById(R.id.precipitaciones);

        OpenWeatherApi weather = ServiceGenerator.createService(OpenWeatherApi.class);

        Call<WeatherInfo> consulta = weather.getTiempo("Sevilla");

        consulta.enqueue(new Callback<WeatherInfo>() {
            @Override
            public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                if (response.isSuccessful()){
                    ciudad.setText(response.body().getName().toString());
                    fecha.setText(new Date().toString());
                    //estado.setText(response.body().getWeather().getDescription());
                    temperatura.setText(response.body().getMain().getTemp().toString());
                    /*Picasso.with(this)
                            .load(response.body().getWeather().getIcon());
                            .resize(50, 50)
                            .centerCrop()
                            .into(img);*/
                    Log.i("WENT GOOD",  response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<WeatherInfo> call, Throwable t) {
                Toast.makeText(MainActivity.this, "RETROFIT REQUEST FAILED", Toast.LENGTH_SHORT).show();
                Log.i("WENT BAD", t.toString());
            }
        });
    }
}
