/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.handle.NetHandle;
import com.utilities.CommonFont;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author hoangdp
 */
public class ChatPanel extends JPanel {

    private void initComponents() {
        this.setLayout(new BorderLayout(5, 5));
        Messages = new JEditorPane();
        Messages.setFont(new CommonFont(14));
        Messages.setContentType("text/html");
        Messages.setEditable(false);
        Contents = """
        <style>
            .me{
                background-color: #0084ff;
                margin: 5px;
                padding: 10px;
                text-align: right;
                color: #fff;
            }
            .employee{
                background-color: #eee;
                margin: 5px;
                padding: 10px;
            }
        </style>
        <body style = "font-family: Helvetica, Arial, sans-serif; font-size: 20;">                         
                        """;

        Messages.setText(Contents);
        scChat = new JScrollPane(
                Messages,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        this.add(scChat, BorderLayout.CENTER);

        var c = new Container();
        c.setLayout(new BorderLayout(5, 5));

        txtChat = new JTextField();
        txtChat.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });
        c.add(txtChat, BorderLayout.CENTER);

        btnSend = new JButton("Send");
        btnSend.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sendMessage();
            }
        });
        btnSend.setPreferredSize(new Dimension(30, 30));
        c.add(btnSend, BorderLayout.LINE_END);

        this.add(c, BorderLayout.PAGE_END);

        this.setPreferredSize(new Dimension(WIDTH_CHAT, HEIGHT_CHAT));
    }

    private void loadText() {

    }

    private void sendMessage() {
        if (txtChat.getText().trim().equals("")) {
            return;
        }
        Contents += "<div class=\"me\">" + txtChat.getText().trim() + "</div>";
        Messages.setText(Contents);
        NetHandle.getInstance().sendData(txtChat.getText().trim(), id);
        txtChat.setText("");
    }

    public ChatPanel(String name) {
        loadText();
        initComponents();
        this.id = name;
    }

    // Components
    private JEditorPane Messages;
    private JScrollPane scChat;
    private JButton btnSend;
    private JTextField txtChat;

    // Variables
    private String id;
    private String Contents;

    private final int WIDTH_CHAT = 500;
    private final int HEIGHT_CHAT = 300;
}
