/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.handle.ImageHandle;
import com.utilities.PlaceHolder;
import com.view.frame.LoginFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author hoangdp
 */
public class LoginPanel extends JPanel {

    private Image image;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JLabel lbUsername;
    private JLabel lbPassword;
    private JButton btnLogin;
    private Graphics2D g2d;

    private void loadResource() {
        try {
            BufferedImage bi = ImageIO.read(getClass().getResourceAsStream("/com/resource/background_login.jpg"));
            image = ImageHandle.getInstance().resize(
                    bi,
                    LoginFrame.WIDTH,
                    LoginFrame.HEIGHT
            );

        } catch (IOException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initComponent() {
//        setLayout( new BoxLayout)
        txtUsername = new JTextField("Username");
        txtUsername.setFocusable(true);
        txtUsername.setPreferredSize(new Dimension(300, 300));
        txtUsername.addFocusListener(new PlaceHolder("User name", txtUsername));
        txtUsername.setMinimumSize(new Dimension(300, 300));
//        txtUsername.setBorder();
        add(txtUsername);

        add(new TextField(""));

    }

    public LoginPanel() {
        loadResource();
        initComponent();
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (g2d == null) {
            g2d = (Graphics2D) g;          
        }
        g.drawImage(image, 0, 0, null);
    }
}
