/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.HoaDonKhachHangModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kunbo
 */
public class HoaDonKhachHangController {

    public boolean ThemHoaDonKhachHang(HoaDonKhachHangModel k) {
        try {

            // Cau truy van SQL
            String sql = "Insert into HoaDonKhachHang values(?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1,k.getMaNV());
            ps.setDate(2, (Date) k.getNgayLap());
            ps.setDouble(3, k.getTongTien());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonKhachHangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean SuaHoaDonKhachHang(int id, HoaDonKhachHangModel k) {
        try {

            // Cau truy van SQL
            String sql = "update KhachHang set MaNV=?, NgapLap=?, TongTien=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1,k.getMaNV());
            ps.setDate(2, (Date) k.getNgayLap());
            ps.setDouble(3, k.getTongTien());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonKhachHangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 public boolean XoaHoaDonKhachHang(int id) {
        try {

            // Cau truy van SQL
            String sql = "delete from HoaDonKhachHang where MaHD = ";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            
            ps.setString(id,sql);
            if (ps.executeUpdate() != 1) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

}

