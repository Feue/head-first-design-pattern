package com.feue.DesignPattern.ProxyPattern.VirtualProxy;

import javax.swing.*;
import java.awt.*;

/**
 * @author Feue
 * @create 2021-12-22 10:53
 */
public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.icon.getIconWidth();
        int height = this.icon.getIconHeight();
        int x = (800 - width) / 2;
        int y = (600 - height) / 2;
        this.icon.paintIcon(this, g, x, y);
    }
}
