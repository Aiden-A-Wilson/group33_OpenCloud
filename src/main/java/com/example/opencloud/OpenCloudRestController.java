package com.example.opencloud;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class OpenCloudRestController {

    private WeatherCommandController weatherCommandController;
    private WeatherFetcher weatherFetcher;

    public OpenCloudRestController(
            WeatherFetcher weatherFetcher,
            WeatherCommandController weatherCommandController
    ) {
        this.weatherFetcher = weatherFetcher;
        this.weatherCommandController = weatherCommandController;
    }
    private HashMap<String, WeatherCommand> weatherCommands = new HashMap<>();

    @PostConstruct
    private void initCommands() {
        weatherCommands.put("monday", new MondayWeatherCommand(weatherFetcher));
        weatherCommands.put("tuesday", new TuesdayWeatherCommand(weatherFetcher));
        weatherCommands.put("wednesday", new WednesdayWeatherCommand(weatherFetcher));
        weatherCommands.put("thursday", new ThursdayWeatherCommand(weatherFetcher));
        weatherCommands.put("friday", new FridayWeatherCommand(weatherFetcher));
        weatherCommands.put("saturday", new SaturdayWeatherCommand(weatherFetcher));
        weatherCommands.put("sunday", new SundayWeatherCommand(weatherFetcher));
    }

    @GetMapping("/get_weather/{day}")
    public void getWeather(@PathVariable String day) {
        weatherCommandController.setCommand(weatherCommands.get(day));
        weatherCommandController.runCommand();
        //weatherFetcher.fetchAndUpdateForecastForDay("Waterloo", day.toLowerCase());
        System.out.println("Fetched forecast for: " + day);
    }
}