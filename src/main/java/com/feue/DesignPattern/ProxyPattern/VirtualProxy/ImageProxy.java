package com.feue.DesignPattern.ProxyPattern.VirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author Feue
 * @create 2021-12-22 10:12
 */
public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private final URL imageURL;
    private Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            this.imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading cover, please wait...", x+300, y+200);
            if (!this.retrieving) {
                this.retrievalThread = new Thread(() -> {
                    try {
                        this.imageIcon = new ImageIcon(imageURL, "cover");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                this.retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        return this.imageIcon == null ? 800 : this.imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return this.imageIcon == null ? 600 : this.imageIcon.getIconHeight();
    }
}
