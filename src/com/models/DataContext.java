/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import com.controller.DoUongController;
import java.util.LinkedList;

/**
 *
 * @author kunbo
 */
public class DataContext {

    private LinkedList<AccountModel> Accounts;
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
    private UserModel user;
    private final static DataContext _instance = new DataContext();

    private DataContext() {
    }

    public static DataContext getInstance() {
        return _instance;
    }

    public LinkedList<AccountModel> getAccounts() {
        return Accounts;
    }

    public void setAccounts(LinkedList<AccountModel> Accounts) {
        this.Accounts = Accounts;
    }

    public LinkedList<CTHDModel> getCTHDs() {
        return CTHDs;
    }

    public void setCTHDs(LinkedList<CTHDModel> CTHDs) {
        this.CTHDs = CTHDs;
    }

    public LinkedList<CTHDNCCModel> getCTHDNCCs() {
        return CTHDNCCs;
    }

    public void setCTHDNCCs(LinkedList<CTHDNCCModel> CTHDNCCs) {
        this.CTHDNCCs = CTHDNCCs;
    }

    public LinkedList<ChiNhanhModel> getChiNhanhs() {
        return ChiNhanhs;
    }

    public void setChiNhanhs(LinkedList<ChiNhanhModel> ChiNhanhs) {
        this.ChiNhanhs = ChiNhanhs;
    }

    public LinkedList<DoUongModel> getDoUongs() {
        return DoUongs;
    }

    public void setDoUongs(LinkedList<DoUongModel> DoUongs) {
        this.DoUongs = DoUongs;
    }

    public LinkedList<GiamGiaModel> getGiamGias() {
        return GiamGias;
    }

    public void setGiamGias(LinkedList<GiamGiaModel> GiamGias) {
        this.GiamGias = GiamGias;
    }

    public LinkedList<HoaDonKhachHangModel> getHoaDonKhachHangs() {
        return HoaDonKhachHangs;
    }

    public void setHoaDonKhachHangs(LinkedList<HoaDonKhachHangModel> HoaDonKhachHangs) {
        this.HoaDonKhachHangs = HoaDonKhachHangs;
    }

    public LinkedList<HoaDonNCCModel> getHoaDonNCCs() {
        return HoaDonNCCs;
    }

    public void setHoaDonNCCs(LinkedList<HoaDonNCCModel> HoaDonNCCs) {
        this.HoaDonNCCs = HoaDonNCCs;
    }

    public LinkedList<KhachHangModel> getKhachHangs() {
        return KhachHangs;
    }

    public void setKhachHangs(LinkedList<KhachHangModel> KhachHangs) {
        this.KhachHangs = KhachHangs;
    }

    public LinkedList<NguyenLieuModel> getNguyenLieus() {
        return NguyenLieus;
    }

    public void setNguyenLieus(LinkedList<NguyenLieuModel> NguyenLieus) {
        this.NguyenLieus = NguyenLieus;
    }

    public LinkedList<NhaCungCapModel> getNhaCungCaps() {
        return NhaCungCaps;
    }

    public void setNhaCungCaps(LinkedList<NhaCungCapModel> NhaCungCaps) {
        this.NhaCungCaps = NhaCungCaps;
    }

    public LinkedList<NhanVienModel> getNhanViens() {
        return NhanViens;
    }

    public void setNhanViens(LinkedList<NhanVienModel> NhanViens) {
        this.NhanViens = NhanViens;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

}
