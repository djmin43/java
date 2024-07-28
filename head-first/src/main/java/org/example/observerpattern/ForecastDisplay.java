package org.example.observerpattern;

public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float currentPressure = 29.9f;
    private float lastPressure;


    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update() {
        this.lastPressure = this.currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("Current pressure: " + currentPressure + "\n lastPressure" + lastPressure);
    }
}

