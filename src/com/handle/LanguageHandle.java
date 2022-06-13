/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.handle;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author kunbo
 */
public final class LanguageHandle {

    private static final LanguageHandle _instance = new LanguageHandle();
    private Document doc;

    private LanguageHandle() {
        LoadLangue();
    }

    public void LoadLangue() {
        doc = ConfigurationLoader.getInstance().getLanguageConfiguration();
    }

    public void ChangeLanguage() {
        ConfigurationLoader.getInstance().changLanguage();
    }

    public String getValue(String tag, String id) {
        for (int i = 0; i < doc.getElementsByTagName(tag).getLength(); i++) {
            Element e = (Element) doc.getElementsByTagName(tag).item(i);
            if (e.getAttribute("id").equals(id)) {
                return e.getTextContent();
            }
        }
        return "null";
    }

    public static LanguageHandle getInstance() {
        return _instance;
    }
}
