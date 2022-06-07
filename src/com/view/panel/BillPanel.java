/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.utilities.CommonFont;
import com.utilities.RoundedButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoangdp
 */
public class BillPanel extends JPanel {

    private void initComponents() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 0));

        lbtitle = new JLabel("Hoa Don Ban 1", JLabel.CENTER);
        lbtitle.setFont(new CommonFont(Font.BOLD, 30));
        add(lbtitle, BorderLayout.NORTH);

        tbBill = new JTable();
        
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.setColumnIdentifiers(new String[]{"ID", "Ten", "SL"});          
        dtm.addRow(new String[]{"1","1"}); 
        
        
        tbBill.setModel(dtm);
        
        tbBill.getTableHeader().setFont(new CommonFont(14));
        tbBill.setRowHeight(30);
        tbBill.setFont(new CommonFont(14));        
        scTb = new JScrollPane(tbBill);
        add(scTb, BorderLayout.CENTER);

        botCon = new Container();
        botCon.setLayout(new GridLayout(1, 2, 10, 10));

        btnPrint = new RoundedButton("In", 100, 50, 10);
        botCon.add(btnPrint);
        btnPay = new RoundedButton("thanh toan", 100, 50, 10);
        botCon.add(btnPay);

        add(botCon, BorderLayout.SOUTH);

    }

    private void loadText() {

    }

    public BillPanel() {
        this.beginTime = LocalDateTime.now();
        loadText();
        initComponents();

    }

    // Components
    private String title;
    private JLabel lbIDEmployee;
    private JLabel lbPhone;
    private JLabel lbtitle;
    private Container botCon;
    private RoundedButton btnPay;
    private RoundedButton btnPrint;
    private JTable tbBill;
    private JScrollPane scTb;

    // Varible
    private LocalDateTime beginTime;

    // Text
}
