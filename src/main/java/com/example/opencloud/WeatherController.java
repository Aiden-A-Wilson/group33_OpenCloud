package com.example.opencloud;

public class WeatherController implements WeatherObserver {
    @Override
    public void update(Weather info) {
        OpenCloudController.currentWeather = info;
        System.out.println("Weather Updated");
    }
}
