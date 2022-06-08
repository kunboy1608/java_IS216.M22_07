/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.DataContext;
import com.models.HoaDonNCCModel;
import com.models.KhachHangModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THAO QUYEN
 */
public class HoaDonNCCController {

    private static HoaDonNCCController _instance;

    public static synchronized HoaDonNCCController getInstance() {
        if (_instance == null) {
            _instance = new HoaDonNCCController();
        }
        return _instance;
    }

    private HoaDonNCCController() {

    }

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
            String sql = "update HoaDonNCC set NgayLap =?, NgayThanhToan =?, TongTien =?, No =?, GhiChu =?";
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
    
    public void LayDuLieu() {
        try {
            String sql = "Select *  FROM HOADONNCC";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<HoaDonNCCModel> list = new LinkedList<>();
            HoaDonNCCModel kh;
            while (rs.next()) {
                kh = new HoaDonNCCModel();
                kh.setMaHDNCC(rs.getInt(1));
                kh.setMaNV(rs.getInt(2));
                kh.setMaNCC(rs.getInt(3));
                kh.setNgayLap(rs.getDate(4));
                kh.setNgayThanhToan(rs.getDate(5));
                kh.setTongTien(rs.getInt(6));
                kh.setNo(rs.getInt(7));
                kh.setGhiChu(rs.getString(8));
                list.add(kh);
            }
            DataContext.getInstance().setHoaDonNCCs(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
