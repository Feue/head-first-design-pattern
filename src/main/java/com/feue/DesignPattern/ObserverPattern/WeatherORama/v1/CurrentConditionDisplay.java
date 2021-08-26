package com.feue.DesignPattern.ObserverPattern.WeatherORama.v1;

/**
 * @author Feue
 * @create 2021-08-23 15:15
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "
                + this.temperature + "F degrees and "
                + this.humidity + "% humidity");
    }
}
