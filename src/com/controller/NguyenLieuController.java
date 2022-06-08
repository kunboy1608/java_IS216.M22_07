/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.DataContext;
import com.models.KhachHangModel;
import com.models.NguyenLieuModel;
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
public class NguyenLieuController {

    private static NguyenLieuController _instance;

    public static synchronized NguyenLieuController getInstance() {
        if (_instance == null) {
            _instance = new NguyenLieuController();
        }
        return _instance;
    }

    private NguyenLieuController() {

    }

    public boolean ThemNguyenLieu(NguyenLieuModel nl) {
        try {

            // Cau truy van SQL
            String sql = "Insert into NGUYENLIEU values(?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien 
            ps.setString(1, nl.getTenNL());
            ps.setString(2, nl.getGhiChu());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(NguyenLieuController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean SuaNguyenLieu(int id, NguyenLieuModel nl) {
        try {

            // Cau truy van SQL
            String sql = "update NGUYENLIEU set TenNL=?, Ghichu=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setString(1, nl.getTenNL());
            ps.setString(2, nl.getGhiChu());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(NguyenLieuController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean XoaNguyenLieu(int id) {
        try {
            String sql = "DELETE FROM NGUYENLIEU WHERE MaNL = ";

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
            String sql = "Select *  FROM NGUYENLIEU";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<NguyenLieuModel> list = new LinkedList<>();
            NguyenLieuModel kh;
            while (rs.next()) {
                kh = new NguyenLieuModel();
                kh.setMANL(rs.getInt(1));
                kh.setTenNL(rs.getString(2));
                kh.setGhiChu(rs.getString(3));
                list.add(kh);
            }
            DataContext.getInstance().setNguyenLieus(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
