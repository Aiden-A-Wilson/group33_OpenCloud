package com.example.opencloud;

/**
 * Command that obtains weather information for Waterloo on Monday.
 * @author Group 33
 */
public class MondayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public MondayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    /**
     * Calls the weather api to obtain the latest weather information.
     */
    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "monday");
    }
}
