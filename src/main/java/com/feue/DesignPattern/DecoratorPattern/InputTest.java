package com.feue.DesignPattern.DecoratorPattern;

import java.io.*;

/**
 * @author Feue
 * @create 2021-08-26 17:34
 */
public class InputTest {
    public static void main(String[] args) {
        String path = "F:\\learn\\Java\\DesignPattern\\src\\main\\java" +
                "\\com\\feue\\DesignPattern\\DecoratorPattern\\test.txt";
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path)));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IndexOutOfBoundsException | IOException e) {
            e.printStackTrace();
        }
    }
}
