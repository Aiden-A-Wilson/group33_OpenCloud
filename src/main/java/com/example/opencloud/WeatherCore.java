package com.example.opencloud;

import java.util.List;
import java.util.ArrayList;

public class WeatherCore implements WeatherSubject {
    List<WeatherObserver> observers;

    public WeatherCore() {
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
    public void invoke() {
        for (WeatherObserver observer : observers) {
            observer.update(null);
        }
    }
}
