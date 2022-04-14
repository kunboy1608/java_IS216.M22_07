/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.handle;

import org.w3c.dom.Document;

/**
 *
 * @author kunbo
 */
public class LanguageHandle {

    private static final LanguageHandle _instance = new LanguageHandle();
    private Document doc;

    private LanguageHandle() {
        LoadLangue();
    }

    public void LoadLangue() {
        doc = ConfigurationLoader.getInstance().getLanguageConfiguration();
    }

    public String getValue(String tag, int index) {
        return doc.getElementsByTagName(tag).item(index).getTextContent();
    }

    public static LanguageHandle getInstance() {
        return _instance;
    }

}
