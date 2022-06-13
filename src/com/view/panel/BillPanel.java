/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.models.CTHDModel;
import com.models.DoUongModel;
import com.utilities.CommonFont;
import com.utilities.RoundedButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
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

        lbtitle = new JLabel("Hoa Don Ban " + id, JLabel.CENTER);
        lbtitle.setFont(new CommonFont(Font.BOLD, 30));
        add(lbtitle, BorderLayout.NORTH);

        tbBill = new JTable();

        dtm = new DefaultTableModel();

        dtm.setColumnIdentifiers(new String[]{"ID", "Ten", "Giá", "SL"});            
        tbBill.setModel(dtm);        
        tbBill.getTableHeader().setFont(new CommonFont(14));
        tbBill.setRowHeight(30);
        tbBill.setFont(new CommonFont(14));
        scTb = new JScrollPane(tbBill);
        add(scTb, BorderLayout.CENTER);

        botCon = new Container();
        botCon.setLayout(new GridLayout(1, 2, 10, 10));

        btnPrint = new RoundedButton("In", 100, 50, 10);
        btnPrint.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                printBill();
            }
        });
        botCon.add(btnPrint);
        btnPay = new RoundedButton("thanh toan", 100, 50, 10);
        btnPay.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pay();
            }
        });
        botCon.add(btnPay);

        add(botCon, BorderLayout.SOUTH);

    }

    private void loadText() {

    }

    public void addDrinks(DoUongModel du) {
        for (int i = 1; i < dtm.getRowCount(); i++) {
            if (Integer.parseInt(dtm.getValueAt(i, 0).toString())
                    == du.getMaDU()) {
                int value = Integer.parseInt(dtm.getValueAt(i, 3).toString());
                dtm.setValueAt(
                        ++value,
                        i,
                        3
                );
                return;
            }
        }
        dtm.addRow(new Object[]{
            du.getMaDU(),
            du.getTenDU(),
            du.getGia(),
            1
        });
    }

    public void removeDrinks(DoUongModel du) {
        for (int i = 1; i < dtm.getRowCount(); i++) {
            if (Integer.parseInt(dtm.getValueAt(i, 0).toString())
                    == du.getMaDU()) {
                int value = Integer.parseInt(dtm.getValueAt(i, 3).toString());
                if (value == 1) {
                    dtm.removeRow(i);
                } else {
                    dtm.setValueAt(
                            --value,
                            i,
                            3
                    );
                }
                return;
            }
        }
    }

    public void pay() {
        // Them HoaDonKhachHang
        // Them CTHD
        // Kiem tra ma giam gia
    }

    public void printBill() {
        JEditorPane bill = new JEditorPane();
        bill.setFont(new CommonFont(14));
        bill.setContentType("text/html");
        String content = """
                     <style>
                         table {
                             font-family: arial, sans-serif;
                             border-collapse: collapse;
                             width: 100%;
                         }
                     
                         td,
                         th {
                             border: 1px solid #dddddd;
                             text-align: left;
                             padding: 8px;
                         }
                     
                         tr:nth-child(even) {
                             background-color: #dddddd;
                         }
                     </style>
                     
                     <body>
                         <table>
                             <tr>
                                 <th>STT</th>
                                 <th>Tên đồ uống</th>
                                 <th>Giá</th>
                                 <th>Số lượng</th>
                                 <th>Thành tiền</th>
                             </tr>  
                          <tr>
                                                               <th>1</th>
                                                               <th>Capuchino</th>
                                                               <th>35000</th>
                                                               <th>3</th>
                                                               <th>105000</th>
                                                           </tr>
                          <tr>
                                                          <th>2</th>
                                                          <th>Capuchino</th>
                                                          <th>35000</th>
                                                          <th>3</th>
                                                          <th>105000</th>
                                                      </tr>
                        """;
        content += """                 
                         </table>
                     </body>
                     
                     </html>
                     """;
        bill.setText(content);
        try {
            bill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BillPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BillPanel(String id) {
        this.beginTime = LocalDateTime.now();
        loadText();
        initComponents();
        this.id = id;
    }

    // Components
    private String id;
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
    DefaultTableModel dtm;
    // Text
}
