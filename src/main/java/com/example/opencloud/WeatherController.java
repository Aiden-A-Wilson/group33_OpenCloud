package com.example.opencloud;

/**
 * Represents an observer of weather updates.
 * Sends the latest weather update to the web route.
 * @author Group 33
 */
public class WeatherController implements WeatherObserver {
    private String currentDay = "today";

    public void setDay(String day) {
        this.currentDay = day.toLowerCase();
    }

    /**
     * Sends the latest weather info to the web route so that the UI can be updated.
     * @param info The latest weather info.
     */
    @Override
    public void update(Weather info) {
        OpenCloudController.currentWeather = info;
        System.out.println("Weather Updated");

        System.out.println("Current Weather:");
        System.out.println(" - Temp Actual     : " + info.getTempActual() + "°C");
        System.out.println(" - Feels Like      : " + info.getTempFeelsLike() + "°C");
        System.out.println(" - Wind Speed      : " + info.getWind() + " kph");
        System.out.println(" - Humidity        : " + info.getHumidity() + "%");
        System.out.println(" - UV Index        : " + info.getUv());
    }
}
