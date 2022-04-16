/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.NhanVienModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THAO QUYEN
 */
public class NhanVienController {

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
    public static void main(String[] args) {
        
    }
}
