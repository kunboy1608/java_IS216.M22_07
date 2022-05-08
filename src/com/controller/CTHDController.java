/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.CTHDModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kunbo
 */
public class CTHDController {

    private static CTHDController _instance;

    public static synchronized CTHDController getInstance() {
        if (_instance == null) {
            _instance = new CTHDController();
        }
        return _instance;
    }

    private CTHDController() {

    }

    public boolean ThemCTHD(CTHDModel k) {
        try {

            // Cau truy van SQL
            String sql = "Insert into CTHD values(?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1, k.getSoLuong());
            ps.setDouble(2, k.getGia());
            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CTHDController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean SuaCTHD(int id, CTHDModel k) {
        try {

            // Cau truy van SQL
            String sql = "update CTHD set SoLuong=?, Gia=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1, k.getSoLuong());
            ps.setDouble(2, k.getGia());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CTHDController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean XoaCTHD(int id) {
        try {

            // Cau truy van SQL
            String sql = "delete from KhachHang where MaHD = ";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            ps.setString(id, sql);
            if (ps.executeUpdate() != 1) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

}
