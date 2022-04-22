/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.frame;

import com.handle.LanguageHandle;
import com.view.panel.LoginPanel;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author kunbo
 */
public class LoginFrame extends JFrame {

    public void initComponent() {
        setTitle(TITLE);
        setSize(WIDTH, HEIGHT);
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new LoginPanel());
    }

    private void loadText() {
        TITLE = LanguageHandle.getInstance().getValue("Login", "TITLE");
    }

    public LoginFrame() {
        loadText();
        initComponent();
    }
    
    private static final int HEIGHT = 562;
    private static final int WIDTH = 1000;
    private String TITLE;

}
