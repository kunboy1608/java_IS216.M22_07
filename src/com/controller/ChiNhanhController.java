/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.ChiNhanhModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THAO QUYEN
 */
public class ChiNhanhController {
    public boolean ThemChiNhanh(ChiNhanhModel cn) {
        try {

            // Cau truy van SQL
            String sql = "Insert into ChiNhanh values(?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien 
            ps.setString(1, cn.getTenCN());
            ps.setString(2, cn.getDiaChi());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(ChiNhanhController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean SuaChiNhanh(int id, ChiNhanhModel cn) {
        try {

            // Cau truy van SQL
            String sql = "update ChiNhanh set TenCN=?, DiaChi=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien 
            ps.setString(1, cn.getTenCN());
            ps.setString(2, cn.getDiaChi());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(ChiNhanhController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean XoaChiNhanh(int id) {
        try {
            String sql = "DELETE FROM ChiNhanh WHERE MaCN = ";

            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareCall(sql);

            ps.setString(id, sql);

            if (ps.executeUpdate() != 1) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }
}
