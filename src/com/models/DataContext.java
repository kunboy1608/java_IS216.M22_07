/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.util.LinkedList;

/**
 *
 * @author kunbo
 */
public class DataContext {

    // Tuong tu voi cac model khac
    private AccountModel account;

    private LinkedList<CTHDModel> CTHDs;
    private LinkedList<CTHDNCCModel> CTHDNCCs;
    private LinkedList<ChiNhanhModel> ChiNhanhs;
    private LinkedList<DoUongModel> DoUongs;
    private LinkedList<GiamGiaModel> GiamGias;
    private LinkedList<HoaDonKhachHangModel> HoaDonKhachHangs;
    private LinkedList<HoaDonNCCModel> HoaDonNCCs;
    private LinkedList<KhachHangModel> KhachHangs;
    private LinkedList<NguyenLieuModel> NguyenLieus;
    private LinkedList<NhaCungCapModel> NhaCungCaps;
    private LinkedList<NhanVienModel> NhanViens;

    private final static DataContext _instance = new DataContext();

    private DataContext() {
    }

    public static DataContext getInstance() {
        return _instance;
    }

}
