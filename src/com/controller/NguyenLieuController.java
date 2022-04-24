/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.NguyenLieuModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THAO QUYEN
 */
public class NguyenLieuController {
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
}
