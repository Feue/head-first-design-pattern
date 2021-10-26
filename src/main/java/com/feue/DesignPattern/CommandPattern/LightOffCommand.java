package com.feue.DesignPattern.CommandPattern;

/**
 * @author Feue
 * @create 2021-10-13 15:21
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
