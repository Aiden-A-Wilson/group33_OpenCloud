package com.example.opencloud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OpenCloudController {
    public static Weather currentWeather = new Weather(0f, 0f, 0f, 0f, 0);

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("tempActual", currentWeather.getTempActual());
        model.addAttribute("tempFeelsLike", currentWeather.getTempFeelsLike());
        model.addAttribute("wind", currentWeather.getWind());
        model.addAttribute("humidity", currentWeather.getHumidity());
        model.addAttribute("uv", currentWeather.getUv());
        return "index";
    }
}
