package com.example.opencloud;

public interface WeatherSubject {
    public void register(WeatherObserver observer);
    public void unregister(WeatherObserver observer);
    public void invoke(Weather info);
}
