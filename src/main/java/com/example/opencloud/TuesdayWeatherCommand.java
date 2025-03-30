package com.example.opencloud;

public class TuesdayWeatherCommand implements WeatherCommand {
    private WeatherFetcher weatherFetcher;

    public TuesdayWeatherCommand(WeatherFetcher weatherFetcher) {
        this.weatherFetcher = weatherFetcher;
    }

    @Override
    public void execute() {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", "tuesday");
    }
}
