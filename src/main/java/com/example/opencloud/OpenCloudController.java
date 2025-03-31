package com.example.opencloud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles basic web routes between the application and the website.
 * @author Group 33
 */
@Controller
public class OpenCloudController {
    public static Weather currentWeather = new Weather(0f, 0f, 0f, 0f, 0);

    /**
     * Default route that loads the index.html page.
     * @param model
     * @return The index.html webpage.
     */
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
