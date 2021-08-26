package com.feue.DesignPattern.ObserverPattern.WeatherORama.v2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Feue
 * @create 2021-08-23 16:10
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();
            this.display();
        }
    }
}
