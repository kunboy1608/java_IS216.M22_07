/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.util.Date;

/**
 *
 * @author DO THAO QUYEN
 */
public class HoaDonNCCModel {
    private int MaHDNCC;
    private Date NgayLap;
    private Date NgayThanhToan;
    private double TongTien;
    private double No;
    private String GhiChu;

    public HoaDonNCCModel() {
    }

    public HoaDonNCCModel(int MaHDNCC, Date NgayLap, Date NgayThanhToan, double TongTien, double No, String GhiChu) {
        this.MaHDNCC = MaHDNCC;
        this.NgayLap = NgayLap;
        this.NgayThanhToan = NgayThanhToan;
        this.TongTien = TongTien;
        this.No = No;
        this.GhiChu = GhiChu;
    }

    public int getMaHDNCC() {
        return MaHDNCC;
    }

    public void setMaHDNCC(int MaHDNCC) {
        this.MaHDNCC = MaHDNCC;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public double getNo() {
        return No;
    }

    public void setNo(double No) {
        this.No = No;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}
