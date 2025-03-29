package com.example.opencloud;

import java.util.ArrayList;
import java.util.List;

public class WeatherCore implements WeatherSubject {
    List<WeatherObserver> observers;

    private static WeatherCore instance;

    public WeatherCore() {
        if (instance == null) {
            instance = this;
        } else {
            System.out.println("Singleton of this class already exists.");
            return;
        }

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
        return instance;
    }
}
