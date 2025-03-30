package com.example.opencloud;

import java.util.ArrayList;
import java.util.List;

public class WeatherCore implements WeatherSubject {
    List<WeatherObserver> observers;

    private static WeatherCore instance;

    private WeatherCore() {
        observers = new ArrayList<WeatherObserver>();
    }

    @Override
    public void register(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void invoke(Weather info) {
        for (WeatherObserver observer : observers) {
            observer.update(info);
        }
    }

    public static WeatherCore getInstance() {
        if (instance == null) {
            instance = new WeatherCore();
        }

        return instance;
    }
}
