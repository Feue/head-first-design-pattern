package com.feue.DesignPattern.FacadePattern;

/**
 * @author Feue
 * @create 2021-10-27 14:13
 * 剧场灯光
 */
public class TheaterLights {
    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }

    public void off() {

    }

    public void dim(int ratio) {
        System.out.println("Theater Ceiling Lights dimming to "+ratio+"%");
    }
}
