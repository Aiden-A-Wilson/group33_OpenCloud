package com.example.opencloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class OpenCloudRestController {
    @GetMapping("/get_weather/{day}")
    public void getWeather(@PathVariable String day) {
        Random r = new Random();
        float tempActual = -10 + r.nextFloat() * (30 - (-10));
        float tempFeelsLike = -10 + r.nextFloat() * (30 - (-10));
        float wind = -10 + r.nextFloat() * (30 - (-10));
        float humidity = -10 + r.nextFloat() * (30 - (-10));
        int uv = r.nextInt() * 10;
        WeatherCore.getInstance().invoke(new Weather(tempActual, tempFeelsLike, wind, humidity, uv));
        System.out.println("Got weather for: " + day);
    }
}
