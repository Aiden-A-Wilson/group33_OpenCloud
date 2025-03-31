package com.example.opencloud;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Object that directly accesses the weatherapi.com API to obtain weather information.
 * @author Group 33
 */
@Service
public class WeatherFetcher {
    private static final String API_KEY = "b6d63b33fddc4c53b5f170940252903";

    /**
     * Fetches weather information from the specified city for the specified day.
     * The weather subject is invoked when information is received from the API.
     * @param city The city to get the weather from.
     * @param targetDay The day to get the weather from.
     */
    public void fetchAndUpdateForecastForDay(String city, String targetDay) {
        String endpoint = String.format(
                "http://api.weatherapi.com/v1/forecast.json?key=%s&q=%s&days=7", API_KEY, city);

        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Failed to fetch forecast. HTTP code: " + responseCode);
                return;
            }

            StringBuilder jsonResponse = new StringBuilder();
            try (Scanner scanner = new Scanner(conn.getInputStream())) {
                while (scanner.hasNext()) {
                    jsonResponse.append(scanner.nextLine());
                }
            }

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(jsonResponse.toString());

            JsonNode forecastDays = root.path("forecast").path("forecastday");
            for (JsonNode dayNode : forecastDays) {
                String dateStr = dayNode.path("date").asText(); // e.g., 2025-04-03
                LocalDate date = LocalDate.parse(dateStr);
                String dayOfWeek = date.getDayOfWeek().toString().toLowerCase(); // e.g., "wednesday"

                if (dayOfWeek.equalsIgnoreCase(targetDay)) {
                    JsonNode day = dayNode.path("day");

                    float avgTemp = (float) day.path("avgtemp_c").asDouble();
                    float feelsLike = (float) day.path("feelslike_c").asDouble(); // No exact feels like in forecast, using avg
                    float windKph = (float) day.path("maxwind_kph").asDouble();
                    float humidity = (float) day.path("avghumidity").asDouble();
                    int uv = (int) day.path("uv").asDouble();

                    Weather forecast = new Weather(avgTemp, feelsLike, windKph, humidity, uv);
                    WeatherCore.getInstance().invoke(forecast);

                    System.out.println("Forecast for " + targetDay + " loaded.");
                    return;
                }
            }

            System.out.println("No forecast data found for day: " + targetDay);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}