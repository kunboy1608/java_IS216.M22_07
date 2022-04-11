/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.util.Date;


/**
 *
 * @author dang
 */
public class HoaDonKhachHangModel {
    private String MaHD;
    private Date NgayLap;
    private Double TongTien;

    public HoaDonKhachHangModel() {
    }

    public HoaDonKhachHangModel(String MaHD, Date NgayLap, Double TongTien) {
        this.MaHD = MaHD;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }
    
}
