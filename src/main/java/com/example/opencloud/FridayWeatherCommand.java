package com.example.opencloud;

public class FridayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public FridayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "friday");
    }
}
