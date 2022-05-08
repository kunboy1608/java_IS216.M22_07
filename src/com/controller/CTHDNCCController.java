/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.CTHDNCCModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
