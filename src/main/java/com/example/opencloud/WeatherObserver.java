package com.example.opencloud;

import com.example.opencloud.Weather;

/**
 * Represents an observer that can be registered to a subject.
 * @author Group 33
 */
public interface WeatherObserver {
    /**
     * Receives the new weather info. This method is called by the subject.
     * @param info The new weather info.
     */
    public void update(Weather info);
}
