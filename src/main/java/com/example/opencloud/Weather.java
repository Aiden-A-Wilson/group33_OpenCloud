package com.example.opencloud;

public class Weather {
    private float tempActual = 0f;
    private float tempFeelsLike = 0f;
    private float wind = 0f;
    private float humidity = 0f;
    private int uv = 0;

    public Weather(float tempActual, float tempFeelsLike, float wind, float humidity, int uv) {
        this.tempActual = tempActual;
        this.tempFeelsLike = tempFeelsLike;
        this.wind = wind;
        this.humidity = humidity;
        this.uv = uv;
    }

    public float getTempActual() {
        return tempActual;
    }

    public float getTempFeelsLike() {
        return tempFeelsLike;
    }

    public float getWind() {
        return wind;
    }

    public float getHumidity() {
        return humidity;
    }

    public int getUv() {
        return uv;
    }
}
