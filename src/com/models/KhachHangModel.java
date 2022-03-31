/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.util.Date;

/**
 *
 * @author kunbo
 */
public class KhachHangModel {
    private String MaNV;
    private Date NgayVaoLam;
    private String CCD;
    
    public KhachHangModel(){
        
    }

    public KhachHangModel(String MaNV, Date NgayVaoLam, String CCD) {
        this.MaNV = MaNV;
        this.NgayVaoLam = NgayVaoLam;
        this.CCD = CCD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getCCD() {
        return CCD;
    }

    public void setCCD(String CCD) {
        this.CCD = CCD;
    }
    
    
}
