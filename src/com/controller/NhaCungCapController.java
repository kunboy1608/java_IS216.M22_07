/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.handle.ConnectionHandle;
import com.models.DataContext;
import com.models.KhachHangModel;
import com.models.NhaCungCapModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author DO THAO QUYEN
 */
public class NhaCungCapController {

    private static NhaCungCapController _instance;

    public static synchronized NhaCungCapController getInstance() {
        if (_instance == null) {
            _instance = new NhaCungCapController();
        }
        return _instance;
    }

    private NhaCungCapController() {

    }

    public boolean ThemNhaCungCap(NhaCungCapModel ncc) {
        try {
            // Cau truy van SQL
            String sql = "Insert into NhaCungCap values(?,?,?)";

            // Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            // Gan gia tri
            ps.setString(1, ncc.getTenNCC());
            ps.setString(2, ncc.getDiaChi());
            ps.setString(2, ncc.getSDTNCC());

            // Kiem tra xem thuc hien co thanh cong hay khong
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Logger.getLogger(NhaCungCapController.class.getName()).log(Level.SEVERE, null, e);
        }
        return true;
    }

    public boolean SuaNhaCungCap(int id, NhaCungCapModel ncc) {
        try {
            // Cau truy van SQL
            String sql = "update NhaCungCap set TenNCC=?, DiaChi=?,STDNCC=?";

            //Lay ket noi
            PreparedStatement ps = ConnectionHandle.getInstance().getConnection().prepareStatement(sql);

            //Gan gia tri
            ps.setString(1, ncc.getTenNCC());
            ps.setString(2, ncc.getDiaChi());
            ps.setString(2, ncc.getSDTNCC());

            //Kiem tra trang thai cau lenh 
            if (ps.executeUpdate() != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Logger.getLogger(NhaCungCapController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public boolean XoaNhaCungCap(int id) {
        try {
            String sql = "DELETE FROM NhaCungCap WHERE MaNCC = ";

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
            String sql = "Select *  FROM NHACUNGCAP";

            Statement ps = ConnectionHandle.getInstance().getConnection().createStatement();
            ResultSet rs = ps.executeQuery(sql);
            LinkedList<NhaCungCapModel> list = new LinkedList<>();
            NhaCungCapModel kh;
            while (rs.next()) {
                kh = new NhaCungCapModel();
                kh.setMaNCC(rs.getInt(1));
                kh.setTenNCC(rs.getString(2));
                kh.setDiaChi(rs.getString(3));
                kh.setSDTNCC(rs.getString(4));
                list.add(kh);
            }
            DataContext.getInstance().setNhaCungCaps(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
