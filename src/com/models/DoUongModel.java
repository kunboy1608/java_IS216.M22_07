/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.awt.Image;

/**
 *
 * @author dang
 */
public class DoUongModel {
  private int MaDU;
  private String TenDU;
  private double Gia;
  private Image HinhAnh;
  private String GhiChu;

    public DoUongModel() {
    }

    public DoUongModel(int MaDU, String TenDU, double Gia, Image HinhAnh, String GhiChu) {
        this.MaDU = MaDU;
        this.TenDU = TenDU;
        this.Gia = Gia;
        this.HinhAnh = HinhAnh;
        this.GhiChu = GhiChu;
    }

    public int getMaDU() {
        return MaDU;
    }

    public void setMaDU(int MaDU) {
        this.MaDU = MaDU;
    }

    public String getTenDU() {
        return TenDU;
    }

    public void setTenDU(String TenDU) {
        this.TenDU = TenDU;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public Image getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(Image HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
  
}
