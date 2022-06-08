/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.DataContext;
import com.models.KhachHangModel;
import com.models.NhanVienModel;
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
public class KhachHangController {

    private static KhachHangController _instance;

    public static synchronized KhachHangController getInstance() {
        if (_instance == null) {
            _instance = new KhachHangController();
        }
        return _instance;
    }

    private KhachHangController() {

    }

    public boolean ThemKhachHang(KhachHangModel k) {
        try {

            // Cau truy van SQL
            String sql = "Insert into KhachHang values(?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, k.getTenKH());
            ps.setInt(2, k.getGioiTinh());
            ps.setInt(3, k.getTongDiem());

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
            String sql = "update KhachHang set TenKH=?, GioiTinh=?, TongDiem=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, k.getTenKH());
            ps.setInt(2, k.getGioiTinh());
            ps.setInt(3, k.getTongDiem());

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

    public boolean XoaKhachHang(String SDTKH) {
        try {

            // Cau truy van SQL
            String sql = "delete from KhachHang where SDT = " + SDTKH;

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

    public void LayDuLieu() {
        try {
            String sql = "Select *  FROM KHACHHANG";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<KhachHangModel> list = new LinkedList<>();
            KhachHangModel kh;
            while (rs.next()) {
                kh = new KhachHangModel();
                kh.setSDTKH(rs.getString(1));
                kh.setTenKH(rs.getString(2));
                kh.setGioiTinh(rs.getInt(3));
                kh.setTongDiem(rs.getInt(4));
                list.add(kh);
            }
            DataContext.getInstance().setKhachHangs(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
