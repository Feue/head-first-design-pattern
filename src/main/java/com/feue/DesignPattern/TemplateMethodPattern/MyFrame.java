package com.feue.DesignPattern.TemplateMethodPattern;

import javax.swing.*;
import java.awt.*;

/**
 * @author Feue
 * @create 2021-12-08 15:45
 * JFrame使用了模板方法模式
 */
public class MyFrame extends JFrame {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("I am Feue, haha.");
    }

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!!";
        g.drawString(msg, 100, 100);
    }
}
