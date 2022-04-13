/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boot;

import com.handle.ConnectionHandle;

/**
 *
 * @author kunbo
 */
public class RunApp {

    public static void main(String[] args) {
        ConnectionHandle.getInstance().getConnection();
    }
}
