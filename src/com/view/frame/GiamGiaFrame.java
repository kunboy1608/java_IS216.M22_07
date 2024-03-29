/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.frame;

import com.controller.GiamGiaController;
import com.handle.ImageHandle;
import com.handle.LanguageHandle;
import com.models.DataContext;
import com.models.GiamGiaModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dang
 */
public class GiamGiaFrame extends javax.swing.JFrame {

    DefaultTableModel modelttKH;

    /**
     * Creates new form KhachHangFrame
     */
    public GiamGiaFrame() {
        initComponents();
        loadText();
        configComponents();
        loadTable();
    }

    private void loadText() {
        TITLE = LanguageHandle.getInstance().getValue("Discount", "TITLE");
        UPDATE = LanguageHandle.getInstance().getValue("Discount", "UPDATE");
        RESET = LanguageHandle.getInstance().getValue("Discount", "RESET");
        EXIT = LanguageHandle.getInstance().getValue("Discount", "EXIT");
        REFRESH = LanguageHandle.getInstance().getValue("Discount", "REFRESH");
        START_DATE = LanguageHandle.getInstance().getValue("Discount", "START_DATE");
        END_DATE = LanguageHandle.getInstance().getValue("Discount", "END_DATE");
        VALUE = LanguageHandle.getInstance().getValue("Discount", "VALUE");
        ID = LanguageHandle.getInstance().getValue("Discount", "ID");
        INFO = LanguageHandle.getInstance().getValue("Discount", "INFO");
        MAX = LanguageHandle.getInstance().getValue("Discount", "MAX");
        ADD = LanguageHandle.getInstance().getValue("Discount", "ADD");
        NOTIFICATION_TITLE = LanguageHandle.getInstance().getValue("Discount", "NOTIFICATION_TITLE");
        NOTI_SUCCESS = LanguageHandle.getInstance().getValue("Discount", "NOTI_SUCCESS");
        NOTI_FAILED = LanguageHandle.getInstance().getValue("Discount", "NOTI_FAILED");
        CHOSSE_DELETE = LanguageHandle.getInstance().getValue("Discount", "CHOSSE_DELETE");
        REQUEST_DELETE = LanguageHandle.getInstance().getValue("Discount", "REQUEST_DELETE");
        ERR_PRICE_EMPTY = LanguageHandle.getInstance().getValue("Discount", "ERR_PRICE_EMPTY");
        ERR_MAX_EMPTY = LanguageHandle.getInstance().getValue("Discount", "ERR_MAX_EMPTY");
        ERR_START_DATE = LanguageHandle.getInstance().getValue("Discount", "ERR_START_DATE");
        ERR_ENMD_DATE = LanguageHandle.getInstance().getValue("Discount", "ERR_ENMD_DATE");
        ERR_DATE = LanguageHandle.getInstance().getValue("Discount", "ERR_DATE");
        DELETE = LanguageHandle.getInstance().getValue("Discount", "DELETE");
    }

    private void configComponents() {
        setIconImage(ImageHandle.getInstance().getIconLogo());
        setTitle(TITLE);
        btnCapNhap.setText(UPDATE);
        btnReset.setText(REFRESH);
        btnThem.setText(ADD);
        btnXoa.setText(DELETE);

        lbGiaTri.setText(VALUE);
        lbMaGiamGia.setText(ID);
        lbNgayBatDau.setText(START_DATE);
        lbNgayKetThuc.setText(END_DATE);
        lbThongTinGiamGia.setText(INFO);
        lbToiDa.setText(MAX);
        
        txtGiaTri.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9')
                        || (c == KeyEvent.VK_BACK_SPACE)
                        || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
        
        txtToiDa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9')
                        || (c == KeyEvent.VK_BACK_SPACE)
                        || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lbMaGiamGia = new javax.swing.JLabel();
        lbGiaTri = new javax.swing.JLabel();
        lbToiDa = new javax.swing.JLabel();
        lbNgayBatDau = new javax.swing.JLabel();
        txtMaGiamGia = new javax.swing.JTextField();
        txtGiaTri = new javax.swing.JTextField();
        lbThongTinGiamGia = new javax.swing.JLabel();
        lbNgayKetThuc = new javax.swing.JLabel();
        NgKetThuc = new com.toedter.calendar.JDateChooser();
        NgBatDau = new com.toedter.calendar.JDateChooser();
        txtToiDa = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhap = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinGG = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbMaGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMaGiamGia.setText("Mã giảm giá ");

        lbGiaTri.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbGiaTri.setText("Giá trị ");

        lbToiDa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbToiDa.setText("Tối đa ");

        lbNgayBatDau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNgayBatDau.setText("Ngày bắt đầu ");

        txtMaGiamGia.setEditable(false);

        lbThongTinGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThongTinGiamGia.setText("THÔNG TIN MÃ GIẢM GIÁ");

        lbNgayKetThuc.setText("Ngày kết thúc");

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/add (1).png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/delete (1).png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/edit (2).png"))); // NOI18N
        btnCapNhap.setText("Cập Nhập");
        btnCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/refresh-arrow.png"))); // NOI18N
        btnReset.setText("Refresh");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(lbThongTinGiamGia)
                .addGap(58, 58, 58))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbGiaTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbToiDa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(NgBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtToiDa)
                    .addComponent(NgKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbThongTinGiamGia)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbGiaTri)
                        .addGap(25, 25, 25)
                        .addComponent(lbToiDa)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMaGiamGia))
                        .addGap(18, 18, 18)
                        .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtToiDa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNgayBatDau)
                    .addComponent(NgBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNgayKetThuc)
                    .addComponent(NgKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        tbThongTinGG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Giảm giá ", "Giá trị ", "Tối đa ", "Ngày bắt đầu ", "Ngày kết thúc"
            }
        ));
        tbThongTinGG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinGGMouseClicked(evt);
            }
        });
        tbThongTinGG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbThongTinGGKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTinGG);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadTable() {
        modelttKH = new DefaultTableModel();

        String tieuDe[] = {ID, VALUE, MAX, START_DATE, END_DATE};
        modelttKH.setColumnIdentifiers(tieuDe);
        Object row[] = new Object[5];
        GiamGiaController.getInstance().LayDuLieu();
        int i = 0;
        while (i < DataContext.getInstance().getGiamGias().size()) {
            try {
                row[0] = DataContext.getInstance().getGiamGias().get(i).getMaGiamGia();
                row[1] = DataContext.getInstance().getGiamGias().get(i).getGiaTri();
                row[2] = DataContext.getInstance().getGiamGias().get(i).getToiDa();
                row[3] = DataContext.getInstance().getGiamGias().get(i).getNgayBatDau();
                row[4] = DataContext.getInstance().getGiamGias().get(i).getNgayKetThuc();
                i++;
                modelttKH.addRow(row);
            } catch (Exception e) {
            }
        }
        tbThongTinGG.setModel(modelttKH);
        setVisible(true);
    }

    public String checkError() {
        if (txtGiaTri.getText().equals("")) {
            return ERR_PRICE_EMPTY;
        }
        if (txtToiDa.getText().equals("")) {
            return ERR_MAX_EMPTY;
        }
        if (NgBatDau.getDate() == null) {
            if (NgBatDau.isValid() == false) {
                return ERR_START_DATE;
            }
        }
        if (NgKetThuc.getDate() == null) {
            if (NgKetThuc.isValid() == false) {
                return ERR_ENMD_DATE;
            }
        }
        if (NgBatDau.getDate().after(NgKetThuc.getDate())) {
            return ERR_DATE;
        }
        return "";
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        var x = checkError();
        if (!x.equals("")) {
            JOptionPane.showConfirmDialog(null, x, NOTIFICATION_TITLE, JOptionPane.DEFAULT_OPTION);
            return;
        }
        try {
            GiamGiaModel gg = new GiamGiaModel();
            gg.setGiaTri(Integer.parseInt(txtGiaTri.getText()));
            gg.setToiDa(Double.parseDouble(txtToiDa.getText()));
            gg.setNgayBatDau(new java.sql.Date(NgBatDau.getDate().getTime()));
            gg.setNgayKetThuc(new java.sql.Date(NgKetThuc.getDate().getTime()));
            if (GiamGiaController.getInstance().ThemGiamGia(gg) == true) {
                JOptionPane.showMessageDialog(this, NOTI_SUCCESS, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
            }
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed

        StringBuilder sb = new StringBuilder();
        var x = checkError();
        if (!x.equals("")) {
            JOptionPane.showConfirmDialog(null, x, NOTIFICATION_TITLE, JOptionPane.DEFAULT_OPTION);
            return;
        }
        try {
            GiamGiaModel gg = new GiamGiaModel();
            int gtr = Integer.parseInt(txtGiaTri.getText());
            gg.setGiaTri(Integer.parseInt(txtGiaTri.getText()));
            double td = Double.parseDouble(txtToiDa.getText());
            gg.setToiDa(Double.parseDouble(txtToiDa.getText()));
            gg.setNgayBatDau(new java.sql.Date(NgBatDau.getDate().getTime()));
            gg.setNgayKetThuc(new java.sql.Date(NgKetThuc.getDate().getTime()));
            if (GiamGiaController.getInstance().SuaGiamGia(Integer.parseInt(txtMaGiamGia.getText()), gg) == true) {
                JOptionPane.showMessageDialog(this, NOTI_SUCCESS, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
            }
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCapNhapActionPerformed

    private void tbThongTinGGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbThongTinGGKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbThongTinGGKeyPressed

    private void tbThongTinGGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinGGMouseClicked
        try {
            int row = this.tbThongTinGG.getSelectedRow();
            if (row >= 0 && row <= tbThongTinGG.getRowCount()) {
                txtMaGiamGia.setText(tbThongTinGG.getValueAt(row, 0).toString());
                txtGiaTri.setText(tbThongTinGG.getValueAt(row, 1).toString());
                txtToiDa.setText(tbThongTinGG.getValueAt(row, 2).toString());
                NgBatDau.setDate((Date) tbThongTinGG.getModel().getValueAt(row, 3));
                NgKetThuc.setDate((Date) tbThongTinGG.getModel().getValueAt(row, 4));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbThongTinGGMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMaGiamGia.setText("");
        txtGiaTri.setText("");
        NgBatDau.setDate(null);
        NgKetThuc.setDate(null);
        txtToiDa.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (txtMaGiamGia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, CHOSSE_DELETE, NOTIFICATION_TITLE, 1);
        } else {
            try {
                int result = JOptionPane.showConfirmDialog(this, REQUEST_DELETE, NOTIFICATION_TITLE, JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    if (GiamGiaController.getInstance().XoaGiamGia(Integer.parseInt(txtMaGiamGia.getText()))) {
                        JOptionPane.showMessageDialog(this, NOTI_SUCCESS, NOTIFICATION_TITLE, JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.WARNING_MESSAGE);
                    }
                }
                loadTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    //Text
    private String TITLE;
    private String UPDATE;
    private String RESET;
    private String EXIT;
    private String REFRESH;
    private String DELETE;
    private String START_DATE;
    private String END_DATE;
    private String VALUE;
    private String ID;
    private String INFO;
    private String MAX;
    private String ADD;
    private String NOTIFICATION_TITLE;
    private String NOTI_SUCCESS;
    private String NOTI_FAILED;
    private String CHOSSE_DELETE;
    private String REQUEST_DELETE;
    private String ERR_PRICE_EMPTY;
    private String ERR_MAX_EMPTY;
    private String ERR_START_DATE;
    private String ERR_ENMD_DATE;
    private String ERR_DATE;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser NgBatDau;
    private com.toedter.calendar.JDateChooser NgKetThuc;
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbGiaTri;
    private javax.swing.JLabel lbMaGiamGia;
    private javax.swing.JLabel lbNgayBatDau;
    private javax.swing.JLabel lbNgayKetThuc;
    private javax.swing.JLabel lbThongTinGiamGia;
    private javax.swing.JLabel lbToiDa;
    private javax.swing.JTable tbThongTinGG;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtToiDa;
    // End of variables declaration//GEN-END:variables
}
