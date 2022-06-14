/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.handle.LanguageHandle;
import com.handle.Utilities;
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

        lbtitle = new JLabel(TITLE + id, JLabel.CENTER);
        lbtitle.setFont(new CommonFont(Font.BOLD, 30));
        add(lbtitle, BorderLayout.NORTH);

        tbBill = new JTable();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{
            NUMBER_ORDER,
            NAME_DRINK,
            PRICE,
            QUANLITY
        });

        tbBill.setModel(dtm);
        tbBill.getTableHeader().setFont(new CommonFont(14));
        tbBill.setRowHeight(30);
        tbBill.setFont(new CommonFont(14));
        scTb = new JScrollPane(tbBill);
        add(scTb, BorderLayout.CENTER);

        botCon = new Container();
        botCon.setLayout(new GridLayout(1, 2, 10, 10));

        btnPrint = new RoundedButton(PRINT, 100, 50, 10);
        btnPrint.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                printBill();
            }
        });
        botCon.add(btnPrint);

        btnPay = new RoundedButton(PAY, 100, 50, 10);
        btnPay.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pay();
            }
        });
        botCon.add(btnPay);

        add(botCon, BorderLayout.SOUTH);
    }

    private void loadText() {
        TITLE = LanguageHandle.getInstance().getValue("Bill", "TITLE");
        NUMBER_ORDER = LanguageHandle.getInstance().getValue("Bill", "NUMBER_ORDER");
        NAME_DRINK = LanguageHandle.getInstance().getValue("Bill", "NAME_DRINK");
        PRICE = LanguageHandle.getInstance().getValue("Bill", "PRICE");
        QUANLITY = LanguageHandle.getInstance().getValue("Bill", "QUANLITY");
        PRINT = LanguageHandle.getInstance().getValue("Bill", "PRINT");
        PAY = LanguageHandle.getInstance().getValue("Bill", "PAY");
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

    private void addHeader() {
        content = """
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
            h1, h2, h3, h4, h6{
              text-align: center;
            }
            div{
              text-align: right;
            }                            
        """;
        // Body
        content += "body{background-image: url(\"" + urlBackground + "\");}</style>";
        content += """                 
        <body>
            <h6>Địa chỉ: KP6, Linh Trung, Thủ Đức, TP. Hồ Chí Minh</h6>
            <h1>COFFE EXPRESS</h1>
            <h2>Hóa đơn</h2>
        """;
        content += "<div> Xuất hóa đơn lúc:" + Utilities.getInstance().getTime() + "</div>";
        content += """ 
            <table>
                <tr>
                    <th>STT</th>
                    <th>Tên đồ uống</th>
                    <th>Giá</th>
                    <th>Số lượng</th>
                    <th>Thành tiền</th>
                </tr>                                                                   
        """;
    }

    private void addFooter() {
        content += """                               
            <h4>Pass WIFI: Ai em gà vler</h4>
            <h3>Vui lòng khách đến vừa lòng khách đi</h3>
            <h6>Designer: HoangDP</h6>
            <h6>Email: 19520838@gm.uit.edu.vn</h6>
            <h6>SDT: 0968910755</h6>
        </body></html>
        """;
    }

    public void printBill() {
        JEditorPane bill = new JEditorPane();
        bill.setFont(new CommonFont(14));
        bill.setContentType("text/html");
        addHeader();

        // Them danh sach mon da goi
        long tongTien = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            content += "<tr>";
            content += "<td>" + i + "</td>";
            content += "<td>" + dtm.getValueAt(i, 0).toString() + "</td>";
            content += "<td>" + dtm.getValueAt(i, 1).toString() + "</td>";
            content += "<td>" + dtm.getValueAt(i, 2).toString() + "</td>";
            long sum = Long.parseLong(dtm.getValueAt(i, 2).toString())
                    * Integer.parseInt(dtm.getValueAt(i, 3).toString());
            content += "<td>" + sum + "</td>";
            content += "</tr>";
        }
        content += "</table><div>Tổng tiền: " + tongTien + " đ</div>";

        addFooter();
        bill.setText(content);
        try {
            bill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BillPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BillPanel(String id) {
        this.id = id;
        this.urlBackground = ClassLoader.getSystemResource("com/resource/logo-20.png").toString();
        loadText();
        initComponents();
    }

    // Components
    private final String id;
    private JLabel lbtitle;
    private Container botCon;
    private RoundedButton btnPay;
    private RoundedButton btnPrint;
    private JTable tbBill;
    private JScrollPane scTb;

    // Varible
    private final String urlBackground;
    DefaultTableModel dtm;
    private String content;

    // Text
    private String TITLE;
    private String NUMBER_ORDER;
    private String NAME_DRINK;
    private String PRICE;
    private String QUANLITY;
    private String PRINT;
    private String PAY;
}
