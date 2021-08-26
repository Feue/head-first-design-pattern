package com.feue.DesignPattern.ObserverPattern.WeatherORama.v1;

/**
 * @author Feue
 * @create 2021-08-23 15:04
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
