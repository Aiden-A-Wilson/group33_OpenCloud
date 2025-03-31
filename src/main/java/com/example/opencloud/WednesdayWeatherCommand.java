package com.example.opencloud;

/**
 * Command that obtains weather information for Waterloo on Wednesday.
 * @author Group 33
 */
public class WednesdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public WednesdayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    /**
     * Calls the weather api to obtain the latest weather information.
     */
    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "wednesday");
    }
}
