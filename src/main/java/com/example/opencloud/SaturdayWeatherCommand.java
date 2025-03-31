package com.example.opencloud;

/**
 * Command that obtains weather information for Waterloo on Saturday.
 * @author Group 33
 */
public class SaturdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public SaturdayWeatherCommand(WeatherFetcher weatherFetcher) {
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
