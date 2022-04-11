/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.handle;

/**
 *
 * @author kunbo
 */
public class ConnectionHandle {

    private static ConnectionHandle _instance = new ConnectionHandle();

    private ConnectionHandle() {

    }

    public static ConnectionHandle getInstance() {
        return _instance;
    }
}
