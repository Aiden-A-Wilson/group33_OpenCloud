package com.example.opencloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class WeatherController implements WeatherObserver {
    private String locationName = "Waterloo, Ontario";
    private Weather currentWeather;

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("locationName", locationName);
        return "index";
    }

    @Override
    public void update(Weather info) {
        currentWeather = info;
    }
}
