package com.feue.DesignPattern.ProxyPattern.VirtualProxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Feue
 * @create 2021-12-22 10:24
 */
public class ImageProxyTestDrive {
    private ImageComponent imageComponent;
    private JFrame frame = new JFrame("CD Cover Viewer");
    private JMenuBar menuBar;
    private JMenu menu;
    private final HashMap<String, String> cds = new HashMap<>();

    public ImageProxyTestDrive() throws MalformedURLException {
        this.initializeMap();
        URL initialURL = new URL(this.cds.get("Ambient: Music for Airports"));
        this.menuBar = new JMenuBar();
        this.menu = new JMenu("Favorite CDs");
        this.menuBar.add(this.menu);
        this.frame.setJMenuBar(this.menuBar);
        for (Map.Entry<String, String> entry : this.cds.entrySet()) {
            JMenuItem item = new JMenuItem(entry.getKey());
            this.menu.add(item);
            item.addActionListener(event -> {
                this.imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                this.frame.repaint();
            });
        }
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        this.frame.getContentPane().add(imageComponent);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(800, 600);
        this.frame.setVisible(true);
    }

    private void initializeMap() {
        this.cds.put("Ambient: Music for Airports", "http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        this.cds.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        this.cds.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        this.cds.put("Karma", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.jpg");
        this.cds.put("MCMXC A.D.", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
    }

    private URL getCDUrl(String name) {
        try {
            return new URL(this.cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }
}
