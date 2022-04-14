/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.handle;

/**
 *
 * @author kunbo
 */
public class LanguageHandle {

    private final LanguageHandle _instance = new LanguageHandle();

    private LanguageHandle() {

    }

    public LanguageHandle getInstance() {
        return _instance;
    }
    
}
