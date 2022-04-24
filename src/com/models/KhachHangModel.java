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

    private String SDT;
    private String TenKH;
    private Boolean GioiTinh;
    private int TongDiem;

    public KhachHangModel() {
    }

    public KhachHangModel(String SDT, String TenKH, Boolean GioiTinh, int TongDiem) {
        this.SDT = SDT;
        this.TenKH = TenKH;
        this.GioiTinh = GioiTinh;
        this.TongDiem = TongDiem;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getTongDiem() {
        return TongDiem;
    }

    public void setTongDiem(int TongDiem) {
        this.TongDiem = TongDiem;
    }

}
