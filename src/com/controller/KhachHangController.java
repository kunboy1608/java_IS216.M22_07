/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.KhachHangModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kunbo
 */
public class KhachHangController {

    public boolean ThemKhachHang(KhachHangModel k) {
        try {

            // Cau truy van SQL
            String sql = "Insert into KhachHang values(?,?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, k.getTenKH());
            ps.setBoolean(2, k.getGioiTinh());
            ps.setString(3, k.getSDT());
            ps.setInt(4, k.getTongDiem());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean SuaKhachHang(int id, KhachHangModel k) {
        try {

            // Cau truy van SQL
            String sql = "update KhachHang set TenKH=?, GioiTinh=?,SDT=?, TongDiem=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, k.getTenKH());
            ps.setBoolean(2, k.getGioiTinh());
            ps.setString(3, k.getSDT());
            ps.setInt(4, k.getTongDiem());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
