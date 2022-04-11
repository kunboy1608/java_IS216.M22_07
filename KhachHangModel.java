/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author dang
 */
public class KhachHangModel {
    private String MaKH;
    private String TenKH;
    private String SDT;
    private String TongDiem;

    public KhachHangModel() {
    }

    public KhachHangModel(String MaKH, String TenKH, String SDT, String TongDiem) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.TongDiem = TongDiem;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTongDiem() {
        return TongDiem;
    }

    public void setTongDiem(String TongDiem) {
        this.TongDiem = TongDiem;
    }
    
          }

