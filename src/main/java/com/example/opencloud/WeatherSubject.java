package com.example.opencloud;

/**
 * Represents a subject object that can register, unregister, and send messages to observers.
 * @author Group 33
 */
public interface WeatherSubject {
    /**
     * Registers the observer as a listener.
     * @param observer The observer to register.
     */
    public void register(WeatherObserver observer);

    /**
     * Unregisters the observer from the subject.
     * @param observer Removes the observer as a listener.
     */
    public void unregister(WeatherObserver observer);

    /**
     * Notifies all observers of a new weather update.
     * @param info The new weather information.
     */
    public void invoke(Weather info);
}
