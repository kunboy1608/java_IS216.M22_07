/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kunbo
 */
public class LoginFrame extends JFrame {

    private static int FRAME_WIDTH = 1080;
    private static int FRAME_HEIGHT = 720;

    private JButton btnOk;
    private JButton btnCancel;

    public void initComponent() {
        setTitle("Login - Cafe");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(1, 2));
        btnOk = new JButton("Ok");
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.red);
        leftPanel.add(btnOk);
//        BufferedImage bi= new BufferedImage
        add(leftPanel);
        
        

        JPanel rightPanel = new JPanel();
        btnCancel = new JButton("Cancel");
        rightPanel.add(btnCancel);
        add(rightPanel);
        
//        add(new JPanel());

        setVisible(true);
    }

    public LoginFrame() {
        initComponent();
    }

}
