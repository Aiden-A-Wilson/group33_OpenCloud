package com.example.opencloud;

import org.springframework.stereotype.Component;

@Component
public class WeatherCommandController {
    private WeatherCommand command;

    public void setCommand(WeatherCommand command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
