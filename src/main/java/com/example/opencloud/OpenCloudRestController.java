package com.example.opencloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OpenCloudRestController {

    @Autowired
    private WeatherFetcher weatherFetcher;

    @GetMapping("/get_weather/{day}")
    public void getWeather(@PathVariable String day) {
        weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", day.toLowerCase());
        System.out.println("Fetched forecast for: " + day);
    }
}