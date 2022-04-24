/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.HoaDonNCCModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THAO QUYEN
 */
public class HoaDonNCCController {
    public boolean ThemHoaDonNCC(HoaDonNCCModel hd) {
        try {

            // Cau truy van SQL
            String sql = "Insert into HoaDonNCC values(?,?,?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien 
            ps.setDate(1, (Date) hd.getNgayLap());
            ps.setDate(2, (Date) hd.getNgayThanhToan());
            ps.setDouble(3, hd.getTongTien());
            ps.setDouble(4, hd.getNo());
            ps.setString(5, hd.getGhiChu());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(HoaDonNCCController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean SuaHoaDonNCC(int id, HoaDonNCCModel hd) {
        try {

            // Cau truy van SQL
            String sql = "update HoaDonNCC set TenNL=?, Ghichu=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien 
            ps.setDate(1, (Date) hd.getNgayLap());
            ps.setDate(2, (Date) hd.getNgayThanhToan());
            ps.setDouble(3, hd.getTongTien());
            ps.setDouble(4, hd.getNo());
            ps.setString(5, hd.getGhiChu());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(HoaDonNCCController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean XoaHoaDonNCC(int id) {
        try {
            String sql = "DELETE FROM HoaDonNCC WHERE MaHDNCC = ";

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
