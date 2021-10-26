package com.feue.DesignPattern.CommandPattern;

/**
 * @author Feue
 * @create 2021-10-13 14:53
 * 实现遥控器
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new noCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        // setCommand() 方法必须有3个参数，分别是插槽位置、开命令、关命令
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // 当按下开或关的按钮，硬件就会负责调用对应的方法
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n----- Remote Control -----\n");
        for (int i = 0; i < 7; i++) {
            sb.append("[slot "+i+"] "+onCommands[i].getClass().getName()+"      "+
                offCommands[i].getClass().getName()+"\n");
        }
        return sb.toString();
    }
}
