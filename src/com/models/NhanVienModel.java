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
public class NhanVienModel {
    private int MaNV;
    private int MaCN;
    private Date NgayVL;
    private String CCCD;

    public NhanVienModel() {
    }

    public NhanVienModel(int MaNV, int MaCN, Date NgayVL, String CCCD) {
        this.MaNV = MaNV;
        this.MaCN = MaCN;
        this.NgayVL = NgayVL;
        this.CCCD = CCCD;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaCN() {
        return MaCN;
    }

    public void setMaCN(int MaCN) {
        this.MaCN = MaCN;
    }

    public Date getNgayVL() {
        return NgayVL;
    }

    public void setNgayVL(Date NgayVL) {
        this.NgayVL = NgayVL;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
    
}
