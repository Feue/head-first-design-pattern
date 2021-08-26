package com.feue.DesignPattern.ObserverPattern.WeatherORama.v1;

/**
 * @author Feue
 * @create 2021-08-23 15:03
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
