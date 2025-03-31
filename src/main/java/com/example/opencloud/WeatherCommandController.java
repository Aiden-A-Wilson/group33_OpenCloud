package com.example.opencloud;

import org.springframework.stereotype.Component;

/**
 * Handles the weather commands and executes them.
 * @author Group 33
 */
@Component
public class WeatherCommandController {
    private WeatherCommand command;

    /**
     * Set the current command of the controller.
     * @param command The command to set.
     */
    public void setCommand(WeatherCommand command) {
        this.command = command;
    }

    /**
     * Runs the current command.
     */
    public void runCommand() {
        command.execute();
    }
}
