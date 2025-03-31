package com.example.opencloud;

/**
 * Command that obtains weather information for Waterloo on Sunday.
 * @author Group 33
 */
public class SundayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public SundayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    /**
     * Calls the weather api to obtain the latest weather information.
     */
    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "saturday");
    }
}
