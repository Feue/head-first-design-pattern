package com.feue.DesignPattern.FacadePattern;

/**
 * @author Feue
 * @create 2021-10-27 14:13
 * 投影仪
 */
public class Projector {
    private DvdPlayer dvd;

    public Projector(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void on() {
        System.out.println("Top-O-Line Projector on");
    }

    public void off() {
        System.out.println("Top-O-Line Projector off");
    }

    public void tvMode() {

    }

    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16*9 aspect ratio)");
    }
}
