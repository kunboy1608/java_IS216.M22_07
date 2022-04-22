/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boot;

import com.view.frame.LoginFrame;

/**
 *
 * @author kunbo
 */
public class RunApp extends Thread {

    private static final RunApp _instance = new RunApp();
    private LoginFrame mainFrame;

    private RunApp() {
        configSystem();
    }

    @Override
    public void run() {
        mainFrame = new LoginFrame();
        mainFrame.setVisible(true);
    }

    private void configSystem() {
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("sun.java2d.uiScale", "1.0");
            System.setProperty("-Dprism.allowhidpi", "false");
            System.out.println("Configure Succefully");
        }
    }

    public static void main(String[] args) {
        RunApp.getInstance().start();
    }
    public void disposeLoginFrame(){
        mainFrame.dispose();
    }

    public static RunApp getInstance() {
        return _instance;
    }
}
