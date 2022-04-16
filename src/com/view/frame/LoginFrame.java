/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.frame;

import com.view.panel.LoginPanel;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author kunbo
 */
public class LoginFrame extends JFrame {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 848;

    BufferedImage bi;
    Graphics2D g2;

    public void initComponent() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//        setResizable(false);
        var lp = new LoginPanel();
        add(lp);
        setVisible(true);
        if (lp.getGraphics() == null) {
            System.out.println("ddrr");
        }
//        System.out.println("tao xong doi tuong");
    }

    public LoginFrame() {
        initComponent();
    }

}
