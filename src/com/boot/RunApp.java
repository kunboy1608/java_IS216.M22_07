/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boot;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kunbo
 */
public class RunApp {

    public static void main(String[] args) throws Exception {
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                        + "database=cafe_java;"
                        + "user=sa;"
                        + "password=Matkhau1;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=5;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.out.println(connection.toString());
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
