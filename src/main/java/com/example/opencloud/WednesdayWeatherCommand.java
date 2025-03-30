package com.example.opencloud;

public class WednesdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public WednesdayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "wednesday");
    }
}
