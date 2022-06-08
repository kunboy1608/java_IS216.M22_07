/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.CTHDModel;
import com.models.CTHDNCCModel;
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
public class CTHDNCCController {

    private static CTHDNCCController _instance;

    public static synchronized CTHDNCCController getInstance() {
        if (_instance == null) {
            _instance = new CTHDNCCController();
        }
        return _instance;
    }

    private CTHDNCCController() {

    }

    public boolean ThemCTHDNCC(CTHDNCCModel cthd) {
        try {

            // Cau truy van SQL
            String sql = "Insert into CTHDNCC values(?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1, cthd.getSoLuong());
            ps.setDouble(2, cthd.getGia());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CTHDNCCController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean SuaNhanVien(int id, CTHDNCCModel cthd) {
        try {

            // Cau truy van SQL
            String sql = "update CTHDNCC set SoLuong =?, Gia =?";
            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan bien vao cac dau  ?
            ps.setInt(1, cthd.getSoLuong());
            ps.setDouble(2, cthd.getGia());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CTHDNCCController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean XoaCTHDNCC(int id) {
        try {
            String sql = "DELETE FROM CTHDNCC WHERE MaNCC = ";

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
            String sql = "Select *  FROM CTHDNCC";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<CTHDNCCModel> list = new LinkedList<>();
            CTHDNCCModel kh;
            while (rs.next()) {
                kh = new CTHDNCCModel();
                kh.setMANL(rs.getInt(1));
                kh.setMaHDNCC(rs.getInt(2));
                kh.setSoLuong(rs.getInt(3));
                kh.setGia(rs.getInt(4));
                list.add(kh);
            }
            DataContext.getInstance().setCTHDNCCs(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
