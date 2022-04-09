/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author DO THAO QUYEN
 */
public class NguyenLieuModel {
    private int MANL;
    private String TenNL;
    private String GhiChu;

    public NguyenLieuModel() {
    }

    public NguyenLieuModel(int MANL, String TenNL, String GhiChu) {
        this.MANL = MANL;
        this.TenNL = TenNL;
        this.GhiChu = GhiChu;
    }

    public int getMANL() {
        return MANL;
    }

    public void setMANL(int MANL) {
        this.MANL = MANL;
    }

    public String getTenNL() {
        return TenNL;
    }

    public void setTenNL(String TenNL) {
        this.TenNL = TenNL;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
