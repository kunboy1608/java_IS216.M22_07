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
    private LinkedList<KhachHangModel> KhachHangs;

    private final static DataContext _instance = new DataContext();

    private DataContext() {
    }

    public static DataContext getInstance() {
        return _instance;
    }

    public void ass() {
        System.out.println("aaaa");
    }

}
