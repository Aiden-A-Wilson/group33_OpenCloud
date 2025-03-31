package com.example.opencloud;

/**
 * Command that obtains weather information for Waterloo on Friday.
 * @author Group 33
 */
public class FridayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public FridayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    /**
     * Calls the weather api to obtain the latest weather information.
     */
    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "friday");
    }
}
