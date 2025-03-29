package com.example.opencloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class OpencloudApplication {
	public static void main(String[] args) {
		WeatherCore weatherCore = new WeatherCore();
		WeatherController weatherController = new WeatherController();
		weatherCore.register(weatherController);

		SpringApplication.run(OpencloudApplication.class, args);
	}
}
