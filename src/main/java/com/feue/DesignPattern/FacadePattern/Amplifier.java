package com.feue.DesignPattern.FacadePattern;

/**
 * @author Feue
 * @create 2021-10-27 14:12
 * 扬声器
 */
public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;

    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void setStereoSound() {

    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speaker, 1 subwoofer)");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to "+volume);
    }
}
