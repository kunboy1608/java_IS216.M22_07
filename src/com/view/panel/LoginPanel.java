/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.handle.ConnectionHandle;
import com.handle.ImageHandle;
import com.utilities.RoundedButton;
import com.utilities.PlaceHolder;
import com.utilities.RoundedJPasswordField;
import com.utilities.RoundedJTextFiled;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hoangdp
 */
public class LoginPanel extends JPanel {

    private void loadResource() {
        try {
            // Nap anh nen
            bi = ImageIO.read(getClass().getResourceAsStream("/com/resource/background_login.jpg"));
            imageBackground = ImageHandle.getInstance().resize(
                    bi,
                    bi.getWidth(),
                    bi.getHeight()
            );

            // Nap anh logo
            bi = ImageIO.read(getClass().getResourceAsStream("/com/resource/logo.png"));
            imageLogo = ImageHandle.getInstance().resize(
                    bi,
                    (int) (bi.getWidth() * 0.4),
                    (int) (bi.getHeight() * 0.4)
            );

        } catch (IOException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadText() {
        USERNAME = "User name";
        ERROR_MESSAGE = "Incorrect Information";
        LOGIN = "Login";
    }

    private void initComponents() {
        btnLogo = new JLabel(new ImageIcon(imageLogo));

        txtUsername = new RoundedJTextFiled(USERNAME, 300, 50, 10);
        txtUsername.addFocusListener(new PlaceHolder(USERNAME, txtUsername));

        txtPassword = new RoundedJPasswordField(300, 50, 10);
        txtPassword.addFocusListener(new PlaceHolder("********", txtPassword));

        lbNotification = new JLabel(" ", JLabel.LEFT);
        lbNotification.setPreferredSize(new Dimension(300, 20));
        lbNotification.setForeground(Color.red);

        btnLogin = new RoundedButton(LOGIN, 300, 50, 10);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Login();
            }
        });

    }

    private void arangeComponents() {
        setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        c.gridy = 0;
        add(btnLogo, c);
        c.gridy = 1;
        add(txtUsername, c);
        c.gridy = 2;
        add(txtPassword, c);
        c.gridy = 3;
        add(lbNotification, c);
        c.gridy = 4;
        add(btnLogin, c);
    }

    public LoginPanel() {
        loadResource();
        loadText();
        initComponents();
        arangeComponents();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(
                ImageHandle.getInstance().resize(imageBackground, getWidth(), getHeight()),
                0,
                0,
                null
        );
        g2d.setColor(new Color(0f, 0f, 0f, 0.6f));
        g2d.fillRect(0, 0, getWidth(), getHeight());

    }

    private void Login() {
        System.out.println(txtUsername.getText());
        System.out.println(txtPassword.getPassword());
//        if (ConnectionHandle.getInstance().getConnection() == null) {
//            lbNotification.setText(ERROR_MESSAGE);
//        }
    }

    // Components display
    private Image imageBackground;
    private Image imageLogo;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JLabel lbNotification;
    private RoundedButton btnLogin;
    private JLabel btnLogo;

    //Declare variable
    private BufferedImage bi;
    private GridBagConstraints c;

    // Text
    private String USERNAME;
    private String ERROR_MESSAGE;
    private String LOGIN;
}
