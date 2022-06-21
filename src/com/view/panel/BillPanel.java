/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.controller.CTHDController;
import com.controller.HoaDonKhachHangController;
import com.handle.ConnectionHandle;
import com.handle.LanguageHandle;
import com.handle.Utilities;
import com.models.CTHDModel;
import com.models.DoUongModel;
import com.models.HoaDonKhachHangModel;
import com.utilities.CommonFont;
import com.utilities.NonBorder;
import com.utilities.RoundedButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import javax.swing.JLabel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoangdp
 */
public class BillPanel extends Container {

    private void initComponents() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 0));

        lbtitle = new JLabel(TITLE + id, JLabel.CENTER);
        lbtitle.setFont(new CommonFont(Font.BOLD, 30));
        lbtitle.setForeground(Color.WHITE);
        add(lbtitle, BorderLayout.NORTH);

        tbBill = new JTable();
        tbBill.setOpaque(false);
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{
            NUMBER_ORDER,
            NAME_DRINK,
            PRICE,
            QUANLITY
        });

        tbBill.setModel(dtm);
        tbBill.getTableHeader().setFont(new CommonFont(20));
        tbBill.setRowHeight(30);
        tbBill.setFont(new CommonFont(20));

        JViewport viewport = new JViewport();
        viewport.setOpaque(false);
        viewport.setView(tbBill);
        scTb = new JScrollPane();
        scTb.setViewport(viewport);
        scTb.setOpaque(false);
        scTb.setBorder(new NonBorder());
        scTb.getViewport().setOpaque(false);
        add(scTb, BorderLayout.CENTER);

        botCon = new Container();
        botCon.setLayout(new GridLayout(1, 2, 10, 10));

        btnPrint = new RoundedButton(PRINT, 100, 50, 10);
        btnPrint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (dtm.getRowCount() == 0) {
                    JOptionPane.showConfirmDialog(
                            null,
                            NOTHING,
                            PRINT_TITLE,
                            JOptionPane.DEFAULT_OPTION
                    );
                    return;
                }
                printBill();
            }
        });
        botCon.add(btnPrint);

        btnPay = new RoundedButton(PAY, 100, 50, 10);
        btnPay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (dtm.getRowCount() == 0) {
                        JOptionPane.showConfirmDialog(
                                null,
                                NOTHING,
                                PRINT_TITLE,
                                JOptionPane.DEFAULT_OPTION
                        );
                        return;
                    }
                    if (JOptionPane.showConfirmDialog(
                            null,
                            PRINT_MESSAGE,
                            PRINT_MESSAGE,
                            JOptionPane.YES_NO_OPTION
                    ) == 0) {
                        printBill();
                    }
                    pay();
                    JOptionPane.showConfirmDialog(
                            null,
                            PAY_SUCCESS,
                            PAY_TITLE,
                            JOptionPane.DEFAULT_OPTION
                    );
                } catch (SQLException ex) {
                    JOptionPane.showConfirmDialog(
                            null,
                            PAY_FAILED,
                            PAY_TITLE,
                            JOptionPane.DEFAULT_OPTION
                    );
                }
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
        PRINT_MESSAGE = LanguageHandle.getInstance().getValue("Bill", "PRINT_MESSAGE");
        PRINT_TITLE = LanguageHandle.getInstance().getValue("Bill", "PRINT_TITLE");
        PAY_TITLE = LanguageHandle.getInstance().getValue("Bill", "PAY_TITLE");
        PAY_SUCCESS = LanguageHandle.getInstance().getValue("Bill", "PAY_SUCCESS");
        PAY_FAILED = LanguageHandle.getInstance().getValue("Bill", "PAY_FAILED");
        NOTHING = LanguageHandle.getInstance().getValue("Bill", "NOTHING");

    }

    public void addDrinks(DoUongModel du) {
        for (int i = 0; i < dtm.getRowCount(); i++) {
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
        for (int i = 0; i < dtm.getRowCount(); i++) {
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

    public void pay() throws SQLException {
        try {
            // Tinh tong hoa don
            ConnectionHandle.getInstance().getConnection().setAutoCommit(false);
            var x = ConnectionHandle.getInstance().getConnection().setSavepoint();
            double tongTien = 0;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                double sum = Float.parseFloat(dtm.getValueAt(i, 2).toString())
                        * Integer.parseInt(dtm.getValueAt(i, 3).toString());
                tongTien += sum;
            }
            // Them hoa don
            int maHD = HoaDonKhachHangController.getInstance().ThemHoaDonKhachHang(
                    new HoaDonKhachHangModel(
                            0,
                            "SDT",
                            1,
                            null,
                            tongTien,
                            1
                    )
            );
            // Kiem tra them hoa do nco thanh cong hay khong
            if (maHD == -1) {
                ConnectionHandle.getInstance().getConnection().rollback(x);
            }

            // Them CTHD
            for (int i = 0; i < dtm.getRowCount(); i++) {
                CTHDController.getInstance().ThemCTHD(new CTHDModel(
                        Integer.parseInt(dtm.getValueAt(i, 0).toString()),
                        maHD,
                        Integer.parseInt(dtm.getValueAt(i, 3).toString()),
                        Double.parseDouble(dtm.getValueAt(i, 2).toString())
                ));
            }

            // Commit
            ConnectionHandle.getInstance().getConnection().commit();
        } catch (com.microsoft.sqlserver.jdbc.SQLServerException ex) {
            ConnectionHandle.getInstance().getConnection().rollback();
            Logger.getLogger(BillPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            ConnectionHandle.getInstance().getConnection().rollback();
            Logger.getLogger(BillPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionHandle.getInstance().getConnection().setAutoCommit(true);
        }
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
            <h4>Pass WIFI: COFEEXPESS</h4>
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
        float tongTien = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            content += "<tr>";
            content += "<td>" + (i + 1) + "</td>";
            content += "<td>" + dtm.getValueAt(i, 1).toString() + "</td>";
            content += "<td>" + dtm.getValueAt(i, 2).toString() + "</td>";
            content += "<td>" + dtm.getValueAt(i, 3).toString() + "</td>";
            float sum = Float.parseFloat(dtm.getValueAt(i, 2).toString())
                    * Integer.parseInt(dtm.getValueAt(i, 3).toString());
            content += "<td>" + sum + "</td>";
            content += "</tr>";
            tongTien += sum;
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
    private DefaultTableModel dtm;
    private String content;

    // Text
    private String TITLE;
    private String NUMBER_ORDER;
    private String NAME_DRINK;
    private String PRICE;
    private String QUANLITY;
    private String PRINT;
    private String PAY;
    private String PRINT_MESSAGE;
    private String PRINT_TITLE;
    private String PAY_TITLE;
    private String PAY_SUCCESS;
    private String PAY_FAILED;
    private String NOTHING;
}
