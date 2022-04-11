/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author dang
 */
public class DoUongModel {
  private String MaDU;
  private String TenDU;
  private double Tong;
  private String HinhAnh;
  private String GhiChu;

    public DoUongModel() {
    }

    public DoUongModel(String MaDU, String TenDU, double Tong, String HinhAnh, String GhiChu) {
        this.MaDU = MaDU;
        this.TenDU = TenDU;
        this.Tong = Tong;
        this.HinhAnh = HinhAnh;
        this.GhiChu = GhiChu;
    }

    public String getMaDU() {
        return MaDU;
    }

    public void setMaDU(String MaDU) {
        this.MaDU = MaDU;
    }

    public String getTenDU() {
        return TenDU;
    }

    public void setTenDU(String TenDU) {
        this.TenDU = TenDU;
    }

    public double getTong() {
        return Tong;
    }

    public void setTong(double Tong) {
        this.Tong = Tong;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
  
}
