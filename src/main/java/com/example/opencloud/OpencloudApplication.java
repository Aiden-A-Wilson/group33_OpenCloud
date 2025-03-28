package com.example.opencloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpencloudApplication {

	public static void main(String[] args) {
		WeatherController weatherController = new WeatherController();
		WeatherCore weatherCore = new WeatherCore();
		weatherCore.register(weatherController);

		SpringApplication.run(OpencloudApplication.class, args);
	}

}
