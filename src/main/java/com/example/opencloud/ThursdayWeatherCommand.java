package com.example.opencloud;

/**
 * Command that obtains weather information for Waterloo on Thursday.
 * @author Group 33
 */
public class ThursdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public ThursdayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    /**
     * Calls the weather api to obtain the latest weather information.
     */
    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "thursday");
    }
}
