/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.handle;

import com.models.DataContext;
import com.models.UserModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kunbo
 */
public class ConnectionHandle {
    
    private static final ConnectionHandle _instance = new ConnectionHandle();
    private Connection con;
    private String[] sInfo;
    private String[] user;
    
    private ConnectionHandle() {
        sInfo = ConfigurationLoader.getInstance().getServerInfo();
    }
    
    private void Connect() {
        try {
            String connectionUrl
                    = "jdbc:sqlserver://" + sInfo[0] + ":" + sInfo[2] + ";"
                    + "database=" + sInfo[1] + ";"
                    + "user=" + user[0] + ";"
                    + "password=" + user[1] + ";"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;"
                    + "loginTimeout=5;";
            con = DriverManager.getConnection(connectionUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void ConnectManager() {
        loadManagerUser();
        Connect();
    }
    
    public boolean Login(String Username, char[] Password) {
        try {
            String sql = "SELECT [dbo].[DangNhap](?,?)";
            ConnectManager();
            CallableStatement cs = getConnection().prepareCall(sql);
            cs.setString(1, Username);
            cs.setString(2, CryptoHandle.EncodeMD5(String.valueOf(Password)));
            ResultSet rs = cs.executeQuery();
            if (rs.next()
                    && rs.getInt(1) != 0) {
                user = ConfigurationLoader.getInstance().getUserInfo(rs.getInt(1));
                return true;
            }
        } catch (Exception ex) {
            return false;
        } finally {
            con = null;
        }
        return false;
    }

    private void loadInforUser(int index) {
        if (index == 1) {            
            UserModel user = new UserModel("Khách", "", "", Boolean.FALSE, Byte.valueOf("1"));
            DataContext.getInstance().setUser(user);
        }
    }

    public void loadGuestUser() {
        user = ConfigurationLoader.getInstance().getUserInfo(1);
    }
    
    public void loadEmployeeUser() {
        user = ConfigurationLoader.getInstance().getUserInfo(2);
    }
    
    public void loadManagerUser() {
        user = ConfigurationLoader.getInstance().getUserInfo(3);
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
