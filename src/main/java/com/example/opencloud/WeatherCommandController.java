package com.example.opencloud;

public class WeatherCommandController {
    private WeatherCommand command;

    public void setCommand(WeatherCommand command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
