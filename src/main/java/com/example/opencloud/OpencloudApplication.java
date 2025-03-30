package com.example.opencloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class OpencloudApplication {
	public static void main(String[] args) {
		WeatherController weatherController = new WeatherController();
		WeatherCore.getInstance().register(weatherController);

		SpringApplication.run(OpencloudApplication.class, args);
	}
}
