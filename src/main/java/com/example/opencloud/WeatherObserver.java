package com.example.opencloud;

import com.example.opencloud.Weather;

public interface WeatherObserver {
    public void update(Weather info);
}
