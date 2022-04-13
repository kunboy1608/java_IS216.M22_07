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
    private int MaGiamGia;
    private Date NgayLap;
    private double TongTien;

    public HoaDonKhachHangModel() {
    }

    public HoaDonKhachHangModel(int MaGiamGia, Date NgayLap, double TongTien) {
        this.MaGiamGia = MaGiamGia;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
    }

    public int getMaGiamGia() {
        return MaGiamGia;
    }

    public void setMaGiamGia(int MaGiamGia) {
        this.MaGiamGia = MaGiamGia;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

   
}
