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
public class GiamGiaModel {
    private String MaGiamGia;
    private String GiaTri;
    private Double ToiDa;
    private Date NgayBatDau;
    private Date NgayKetThuc;

    public GiamGiaModel() {
    }

    public GiamGiaModel(String MaGiamGia, String GiaTri, Double ToiDa, Date NgayBatDau, Date NgayKetThuc) {
        this.MaGiamGia = MaGiamGia;
        this.GiaTri = GiaTri;
        this.ToiDa = ToiDa;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getMaGiamGia() {
        return MaGiamGia;
    }

    public void setMaGiamGia(String MaGiamGia) {
        this.MaGiamGia = MaGiamGia;
    }

    public String getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(String GiaTri) {
        this.GiaTri = GiaTri;
    }

    public Double getToiDa() {
        return ToiDa;
    }

    public void setToiDa(Double ToiDa) {
        this.ToiDa = ToiDa;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }
    
}
