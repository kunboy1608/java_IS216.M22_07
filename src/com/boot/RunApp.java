/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boot;

import com.controller.KhachHangController;
import com.handle.ConnectionHandle;
import com.models.KhachHangModel;
import com.view.frame.LoginFrame;

/**
 *
 * @author kunbo
 */
public class RunApp {

    private static void configSystem() {
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("prism.allowhidpi", "false");
        }
    }

    public static void main(String[] args) {
//        configSystem();
//        new LoginFrame().setVisible(true);

        KhachHangModel kh = new KhachHangModel(0, "Quyen Dang", false, "0987654321", 100);

        new KhachHangController().SuaKhachHang(1, kh);

    }
}
