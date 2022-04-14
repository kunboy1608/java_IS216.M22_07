/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.frame;

import com.handle.ConnectionHandle;
import javax.swing.JFrame;

/**
 *
 * @author kunbo
 */
public class LoginFrame extends JFrame {

    public void initComponent() {
        setSize(1080, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ConnectionHandle.getInstance().getConnection();
    }

    public LoginFrame() {
        initComponent();
    }
}
