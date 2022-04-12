/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.handle;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kunbo
 */
public class ConnectionHandle {

    private static final ConnectionHandle _instance = new ConnectionHandle();
    private Connection con;
    private String[] sInfo;

    private ConnectionHandle() {
        sInfo = ConfigurationLoader.getInstance().getServerInfo();
    }

    public void Connect() {
        String connectionUrl
                = "jdbc:sqlserver://" + sInfo[0] + ":" + sInfo[2] + ";"
                + "database=" + sInfo[1] + ";"
                + "user=sa;"
                + "password=Matkhau1;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=5;";

        try {
            con = DriverManager.getConnection(connectionUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        if (con == null) {
            Connect();
        }
        return con;
    }

    public static ConnectionHandle getInstance() {
        return _instance;
    }
}
