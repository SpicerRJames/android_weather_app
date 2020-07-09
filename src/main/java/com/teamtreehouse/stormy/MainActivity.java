package com.teamtreehouse.stormy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    String apiKey = "aec58531fe9e053e65d6fed3cd8f04e4";

    double latitude = "37.8267";
    double longitude = "-122.4233";


    String forecastURL = 'https://api.darksky.net/forecast/' + apiKey + '/' + latitude + ',' + longitude;

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url(forecastURL)
            .build();

    Call call = client.newCall(request);

    Response response = call.execute();


  }
}
