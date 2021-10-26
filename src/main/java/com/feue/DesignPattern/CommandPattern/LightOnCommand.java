package com.feue.DesignPattern.CommandPattern;

/**
 * @author Feue
 * @create 2021-10-13 15:22
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
