package com.example.opencloud;

public class ThursdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public ThursdayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "thursday");
    }
}
