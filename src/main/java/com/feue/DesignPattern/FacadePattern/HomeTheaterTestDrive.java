package com.feue.DesignPattern.FacadePattern;

/**
 * @author Feue
 * @create 2021-10-27 14:34
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner(amp);
        DvdPlayer dvd = new DvdPlayer(amp);
        CdPlayer cd = new CdPlayer(amp);
        Projector projector = new Projector(dvd);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
