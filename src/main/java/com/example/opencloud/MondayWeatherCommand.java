package com.example.opencloud;

public class MondayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public MondayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "monday");
    }
}
