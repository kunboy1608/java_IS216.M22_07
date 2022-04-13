/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author DO THAO QUYEN
 */
public class CTHDNCCModel {
    private int MaHDNCC;
    private int MANL;
    private int SoLuong;
    private double Gia;

    public CTHDNCCModel() {
    }

    public CTHDNCCModel(int MaHDNCC, int MANL, int SoLuong, double Gia) {
        this.MaHDNCC = MaHDNCC;
        this.MANL = MANL;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public int getMaHDNCC() {
        return MaHDNCC;
    }

    public void setMaHDNCC(int MaHDNCC) {
        this.MaHDNCC = MaHDNCC;
    }

    public int getMANL() {
        return MANL;
    }

    public void setMANL(int MANL) {
        this.MANL = MANL;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    
}
