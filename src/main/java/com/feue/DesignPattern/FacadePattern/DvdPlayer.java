package com.feue.DesignPattern.FacadePattern;

/**
 * @author Feue
 * @create 2021-10-27 14:13
 * DVD播放器
 */
public class DvdPlayer {
    private Amplifier amp;

    public DvdPlayer(Amplifier amp) {
        this.amp = amp;
    }

    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void pause() {

    }

    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing \""+movie+"\"");
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player playing \"Raiders of the Lost Ark\"");
    }
}
