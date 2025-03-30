package com.example.opencloud;

public class SundayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public SundayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "saturday");
    }
}
