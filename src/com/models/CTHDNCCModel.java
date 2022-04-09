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
    private int MANL;
    private int MaHDNCC;
    private double Tong;

    public CTHDNCCModel() {
    }

    public CTHDNCCModel(int MANL, int MaHDNCC, double Tong) {
        this.MANL = MANL;
        this.MaHDNCC = MaHDNCC;
        this.Tong = Tong;
    }

    public int getMANL() {
        return MANL;
    }

    public void setMANL(int MANL) {
        this.MANL = MANL;
    }

    public int getMaHDNCC() {
        return MaHDNCC;
    }

    public void setMaHDNCC(int MaHDNCC) {
        this.MaHDNCC = MaHDNCC;
    }

    public double getTong() {
        return Tong;
    }

    public void setTong(double Tong) {
        this.Tong = Tong;
    }
    
}
