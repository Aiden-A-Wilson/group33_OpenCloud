package com.example.opencloud;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton object that manages a list of observers and notifies them when new weather information is available.
 * @author Group 33
 */
public class WeatherCore implements WeatherSubject {
    private List<WeatherObserver> observers;
    private static WeatherCore instance;

    private WeatherCore() {
        observers = new ArrayList<WeatherObserver>();
    }

    /**
     * Registers a new observer to listen for weather updates.
     * @param observer The observer to register.
     */
    @Override
    public void register(WeatherObserver observer) {
        observers.add(observer);
    }

    /**
     * Unregister an observer from weather updates.
     * @param observer The observer to unregister.
     */
    @Override
    public void unregister(WeatherObserver observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observers of a new weather update.
     * @param info The new weather info.
     */
    @Override
    public void invoke(Weather info) {
        for (WeatherObserver observer : observers) {
            observer.update(info);
        }
    }

    /**
     * Gets the singleton instance of this object.
     * @return The static reference to this object. Will create a new instance if it does not exist.
     */
    public static WeatherCore getInstance() {
        if (instance == null) {
            instance = new WeatherCore();
        }

        return instance;
    }
}
