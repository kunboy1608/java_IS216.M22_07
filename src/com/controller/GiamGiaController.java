/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.GiamGiaModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kunbo
 */
public class GiamGiaController {

    private static GiamGiaController _instance;

    public static synchronized GiamGiaController getInstance() {
        if (_instance == null) {
            _instance = new GiamGiaController();
        }
        return _instance;
    }

    private GiamGiaController() {

    }

    public boolean ThemGiamGia(GiamGiaModel k) {
        try {

            // Cau truy van SQL
            String sql = "Insert into GiamGia values(?,?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1, k.getGiaTri());
            ps.setDouble(2, k.getToiDa());
            ps.setDate(3, (Date) k.getNgayBatDau());
            ps.setDate(4, (Date) k.getNgayKetThuc());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GiamGiaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean SuaGiamGia(int id, GiamGiaModel k) {
        try {

            // Cau truy van SQL
            String sql = "update GiamGia set GiaTri=?, ToiDa=?, NgayBatDau=?, NgayKetThuc=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1, k.getGiaTri());
            ps.setDouble(2, k.getToiDa());
            ps.setDate(3, (Date) k.getNgayBatDau());
            ps.setDate(4, (Date) k.getNgayKetThuc());
            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(GiamGiaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean XoaGiamGia(int id) {
        try {

            // Cau truy van SQL
            String sql = "delete from GiamGia where MaGiamGia = ";

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

}
