/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.handle;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author kunbo
 */
public class ConfigurationLoader {

    private static ConfigurationLoader _instance = new ConfigurationLoader();
    private static final String configURL = "/com/config/config.xml";

    private Document doc;
    private DocumentBuilderFactory dbf;
    private DocumentBuilder docBuilder;

    private ConfigurationLoader() {
        this.dbf = DocumentBuilderFactory.newInstance();
        try {
            this.docBuilder = dbf.newDocumentBuilder();
            // Doc File
            InputStream inputFile = getClass().getResourceAsStream(configURL);
            doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(ConfigurationLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Document getLanguageConfiguration() {
        try {

            // Lay ngon ngu duoc chon hien tai
            String selection = doc.getElementsByTagName("language").item(1).getTextContent();

            // Tim link file ngon ngu
            for (int i = 2; i < doc.getElementsByTagName("language").getLength(); i++) {
                Element e = (Element) doc.getElementsByTagName("language").item(i);
                if (e.getAttribute("id").equals(selection)) {

                    // Kiem tra tham chieu hay tham tri
                    Document parse = docBuilder.parse(
                            getClass().getResourceAsStream(
                                    doc.getElementsByTagName("language").item(i).getTextContent()
                            ));
                    return parse;
                }
            }

        } catch (IOException | DOMException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String[] getServerInfo() {
        String[] info = new String[3];
        info[0] = doc.getElementsByTagName("connection").item(1).getTextContent();
        info[1] = doc.getElementsByTagName("connection").item(2).getTextContent();
        info[2] = doc.getElementsByTagName("connection").item(3).getTextContent();
        return info;
    }

    public String[] getUserInfo(int index) {
        String[] str = new String[2];

        Element nl = (Element) doc.getElementsByTagName("user").item(index);
        str[0] = nl.getElementsByTagName("username").item(0).getTextContent();
        str[1] = nl.getElementsByTagName("password").item(0).getTextContent();
                
        return str;
    }

    public static ConfigurationLoader getInstance() {
        return _instance;
    }

}
