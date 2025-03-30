package com.example.opencloud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OpenCloudController {
    public static Weather currentWeather = new Weather(0f, 0f, 0f, 0f, 0);

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("tempActual", "Temperature: " + currentWeather.getTempActual() + "°C");
        model.addAttribute("tempFeelsLike", "Feels Like: " + currentWeather.getTempFeelsLike() + "°C");
        model.addAttribute("wind", "Wind: " + currentWeather.getWind() + " kph");
        model.addAttribute("humidity", "Humidity: " + currentWeather.getHumidity() + "%");
        model.addAttribute("uv", "UV Index: " + currentWeather.getUv());
        return "index";
    }
}
