/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.CTHDModel;
import com.models.DataContext;
import com.models.HoaDonKhachHangModel;
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
 * @author kunbo
 */
public class HoaDonKhachHangController {

    private static HoaDonKhachHangController _instance;

    public static synchronized HoaDonKhachHangController getInstance() {
        if (_instance == null) {
            _instance = new HoaDonKhachHangController();
        }
        return _instance;
    }

    private HoaDonKhachHangController() {

    }

    public boolean ThemHoaDonKhachHang(HoaDonKhachHangModel k) {
        try {

            // Cau truy van SQL
            String sql = "Insert into HoaDonKhachHang values(?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1, k.getMaNV());
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
            ps.setInt(1, k.getMaNV());
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

            ps.setString(id, sql);
            if (ps.executeUpdate() != 1) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
public void LayDuLieu() {
        try {
            String sql = "Select *  FROM HoaDonKhachHang";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<HoaDonKhachHangModel> list = new LinkedList<>();
            HoaDonKhachHangModel kh;
            while (rs.next()) {
                kh = new HoaDonKhachHangModel();
                kh.setMaGiamGia(rs.getInt(1));
                kh.setSDTKH(rs.getString(2));
                kh.setMaHD(rs.getInt(3));
                kh.setMaNV(rs.getInt(4));
                kh.setNgayLap(rs.getDate(5));
                kh.setTongTien(rs.getDouble(6));
                list.add(kh);
            }
            DataContext.getInstance().setHoaDonKhachHangs(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
 public void ThongKe(int month, int year){
     try {
            String sql = "Select MaHD, NgayLap, TongTien FROM HOADONNCC where month(NgayLap)="+month+"year(NgayLap)="+year;

            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<HoaDonKhachHangModel> list = new LinkedList<>();
            HoaDonKhachHangModel kh;
            while (rs.next()) {
                kh = new HoaDonKhachHangModel();
                kh.setMaHD(rs.getInt(1));
                kh.setNgayLap(rs.getDate(2));
                kh.setTongTien(rs.getInt(3));
                list.add(kh);
            }
            DataContext.getInstance().setHoaDonKhachHangs(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
     
    }
}
