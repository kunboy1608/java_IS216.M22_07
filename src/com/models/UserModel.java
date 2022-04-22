/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author kunbo
 */
public class UserModel extends AccountModel {

    private String fullName;

    public UserModel() {
        super();
        this.fullName = "";
    }

    public UserModel(String fullName, String UserName, String Password, Boolean IsLocked, Byte Type) {
        super(UserName, Password, IsLocked, Type);
        this.fullName = fullName;
    }
}
