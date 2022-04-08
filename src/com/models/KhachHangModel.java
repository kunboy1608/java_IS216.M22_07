/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author kunbo
 */
public class KhachHangModel {

    private int MaKH;
    private String TenKH;
    private String SDT;
    private int TongDiem;

    public KhachHangModel() {
        
    }

    public KhachHangModel(int MaKH, String TenKH, String SDT, int TongDiem) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.TongDiem = TongDiem;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
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

    public int getTongDiem() {
        return TongDiem;
    }

    public void setTongDiem(int TongDiem) {
        this.TongDiem = TongDiem;
    }

    
    
}
