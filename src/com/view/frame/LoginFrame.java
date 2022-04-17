/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.frame;

import com.view.panel.LoginPanel;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author kunbo
 */
public class LoginFrame extends JFrame {

    private static final int HEIGHT = 562;
    private static final int WIDTH = 1000;

    public void initComponent() {
        setSize(WIDTH, HEIGHT);
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new LoginPanel());        
    }

    public LoginFrame() {
        initComponent();
    }

}
