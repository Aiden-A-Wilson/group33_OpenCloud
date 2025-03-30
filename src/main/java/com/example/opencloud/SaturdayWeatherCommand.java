package com.example.opencloud;

public class SaturdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public SaturdayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "saturday");
    }
}
