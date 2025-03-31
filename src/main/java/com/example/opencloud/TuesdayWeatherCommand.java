package com.example.opencloud;

/**
 * Command that obtains weather information for Waterloo on Tuesday.
 * @author Group 33
 */
public class TuesdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public TuesdayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    /**
     * Calls the weather api to obtain the latest weather information.
     */
    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "tuesday");
    }
}
