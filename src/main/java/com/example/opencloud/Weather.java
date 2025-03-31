package com.example.opencloud;

/**
 * Class that contains weather information to be set and read.
 * author Group 33
 */
public class Weather {
    private float tempActual = 0f;
    private float tempFeelsLike = 0f;
    private float wind = 0f;
    private float humidity = 0f;
    private int uv = 0;

    /**
     * Creates a new structure containing weather information.
     * @param tempActual
     * @param tempFeelsLike
     * @param wind
     * @param humidity
     * @param uv
     */
    public Weather(float tempActual, float tempFeelsLike, float wind, float humidity, int uv) {
        this.tempActual = tempActual;
        this.tempFeelsLike = tempFeelsLike;
        this.wind = wind;
        this.humidity = humidity;
        this.uv = uv;
    }

    /**
     * Gets the actual temperature.
     * @return The actual temperature.
     */
    public float getTempActual() {
        return tempActual;
    }

    /**
     * Gets the feels like temperature.
     * @return The feels like temperature.
     */
    public float getTempFeelsLike() {
        return tempFeelsLike;
    }

    /**
     * Gets the wind.
     * @return The wind.
     */
    public float getWind() {
        return wind;
    }

    /**
     * Gets the humidity.
     * @return The humidity.
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * Gets the UV index.
     * @return The UV index.
     */
    public int getUv() {
        return uv;
    }
}
