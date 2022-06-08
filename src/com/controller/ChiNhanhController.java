/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.ChiNhanhModel;
import com.models.DataContext;
import com.models.KhachHangModel;
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
public class ChiNhanhController {

    private static ChiNhanhController _instance;

    public static synchronized ChiNhanhController getInstance() {
        if (_instance == null) {
            _instance = new ChiNhanhController();
        }
        return _instance;
    }

    private ChiNhanhController() {

    }

    public boolean ThemChiNhanh(ChiNhanhModel cn) {
        try {

            // Cau truy van SQL
            String sql = "Insert into ChiNhanh values(?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien 
            ps.setString(1, cn.getTenCN());
            ps.setString(2, cn.getDiaChi());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(ChiNhanhController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean SuaChiNhanh(int id, ChiNhanhModel cn) {
        try {

            // Cau truy van SQL
            String sql = "update ChiNhanh set TenCN=?, DiaChi=?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien 
            ps.setString(1, cn.getTenCN());
            ps.setString(2, cn.getDiaChi());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            Logger.getLogger(ChiNhanhController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean XoaChiNhanh(int id) {
        try {
            String sql = "DELETE FROM ChiNhanh WHERE MaCN = ";

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
            String sql = "Select *  FROM CHINHANH";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<ChiNhanhModel> list = new LinkedList<>();
            ChiNhanhModel kh;
            while (rs.next()) {
                kh = new ChiNhanhModel();
                kh.setMaCN(rs.getInt(1));
                kh.setTenCN(rs.getString(2));
                kh.setDiaChi(rs.getString(3));
                list.add(kh);
            }
            DataContext.getInstance().setChiNhanhs(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
