/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.AccountModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kunbo
 */
public class AccountController {

    public boolean ThemAccount(AccountModel k) {
        try {

            // Cau truy van SQL
            String sql = "Insert into Account values(?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, k.getUserName());
            
            ps.setString(3, k.getPassword());
       

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean SuaAccount(int id, AccountModel acc) {
        try {

            // Cau truy van SQL
            String sql = "update Account set username=?, password=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, acc.getUserName());
            ps.setString(2, acc.getPassword());
         

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean XoaAccount(String Username) {
        try {

            // Cau truy van SQL
            String sql = "delete from Account where username = "+ Username;

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            

            if (ps.executeUpdate() != 1) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    
}
