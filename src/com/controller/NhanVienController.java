/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.DataContext;
import com.models.NhanVienModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THAO QUYEN
 */
public class NhanVienController {

    private static NhanVienController _instance;

    public static synchronized NhanVienController getInstance() {
        if (_instance == null) {
            _instance = new NhanVienController();
        }
        return _instance;
    }

    private NhanVienController() {
        LayDuLieu();
    }

    public boolean ThemNhanVien(NhanVienModel nv) {
        try {

            // Cau truy van SQL
            String sql = "Insert into NHANVIEN values(?,?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, nv.getTenNV());
            ps.setBoolean(2, nv.isGioiTinh());
            ps.setDate(3, (Date) nv.getNgayVL());
            ps.setString(4, nv.getCCCD());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean SuaNhanVien(int id, NhanVienModel nv) {
        try {

            // Cau truy van SQL
            String sql = "update NHANVIEN set TenNV=?, GioiTinh=?,NgayVL=?, CMND=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, nv.getTenNV());
            ps.setBoolean(2, nv.isGioiTinh());
            ps.setDate(3, (Date) nv.getNgayVL());
            ps.setString(4, nv.getCCCD());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean XoaNhanVien(int id) {
        try {
            String sql = "DELETE FROM NHANVIEN WHERE MaNV = ";

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
            String sql = "Select *  FROM NHANVIEN";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<NhanVienModel> list = new LinkedList<>();
            NhanVienModel nv;
            while (rs.next()) {
                nv = new NhanVienModel();
                nv.setMaNV(rs.getInt(1));
                nv.setMaCN(rs.getInt(2));
                nv.setTenNV(rs.getString(3));
                nv.setGioiTinh(rs.getBoolean(4));
                nv.setNgayVL(rs.getDate(5));
                nv.setCCCD(rs.getString(6));
                list.add(nv);
            }
            DataContext.getInstance().setNhanViens(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
