/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.frame;

import com.controller.ChiNhanhController;
import com.controller.NhanVienController;
import com.handle.ImageHandle;
import com.handle.LanguageHandle;
import com.models.ChiNhanhModel;
import com.models.DataContext;
import com.models.NhanVienModel;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DO THAO QUYEN
 */
public class NhanVienFrame extends javax.swing.JFrame {

    /**
     * Creates new form KhachHangFrame01
     */
    public NhanVienFrame() {
        initComponents();
        LoadTable();
        loadMaCN();
        loadText();
        configComponents();
    }

    private void loadText() {
        TITLE = LanguageHandle.getInstance().getValue("Employee", "TITLE");
        UPDATE = LanguageHandle.getInstance().getValue("Employee", "UPDATE");
        RESET = LanguageHandle.getInstance().getValue("Employee", "RESET");
        EXIT = LanguageHandle.getInstance().getValue("Employee", "EXIT");
        REFRESH = LanguageHandle.getInstance().getValue("Employee", "REFRESH");
        DELETE = LanguageHandle.getInstance().getValue("Employee", "DELETE");
        CCCD = LanguageHandle.getInstance().getValue("Employee", "CCCD");
        LIST_EMPLOYEE = LanguageHandle.getInstance().getValue("Employee", "LIST_EMPLOYEE");
        SEX = LanguageHandle.getInstance().getValue("Employee", "SEX");
        ID_BRANCH = LanguageHandle.getInstance().getValue("Employee", "ID_BRANCH");
        ID_EMPLOYEE = LanguageHandle.getInstance().getValue("Employee", "ID_EMPLOYEE");
        DATE_WORK = LanguageHandle.getInstance().getValue("Employee", "DATE_WORK");
        INFO_EMPLOYEE = LanguageHandle.getInstance().getValue("Employee", "INFO_EMPLOYEE");
        NAME_BRANCH = LanguageHandle.getInstance().getValue("Employee", "NAME_BRANCH");
        NAME_EMPLOYEE = LanguageHandle.getInstance().getValue("Employee", "NAME_EMPLOYEE");
        NOTIFICATION_TITLE = LanguageHandle.getInstance().getValue("Employee", "NOTIFICATION_TITLE");
        NOTI_SUCCESS = LanguageHandle.getInstance().getValue("Employee", "NOTI_SUCCESS");
        NOTI_FAILED = LanguageHandle.getInstance().getValue("Employee", "NOTI_FAILED");
        CHOSSE_DELETE = LanguageHandle.getInstance().getValue("Employee", "CHOSSE_DELETE");
        REQUEST_DELETE = LanguageHandle.getInstance().getValue("Employee", "REQUEST_DELETE");
        MALE = LanguageHandle.getInstance().getValue("Employee", "MALE");
        FEMALE = LanguageHandle.getInstance().getValue("Employee", "FEMALE");
        ERR_NAME_EMPLOYEE_EMPTY = LanguageHandle.getInstance().getValue("Employee", "ERR_NAME_EMPLOYEE_EMPTY");
        ERR_DATE_WRONG = LanguageHandle.getInstance().getValue("Employee", "ERR_DATE_WRONG");
        ERR_CCCD = LanguageHandle.getInstance().getValue("Employee", "ERR_CCCD");
    }

    private void configComponents() {
        setIconImage(ImageHandle.getInstance().getIconLogo());
        setTitle(TITLE);

        cbGioiTinh.removeAllItems();
        cbGioiTinh.addItem(MALE);
        cbGioiTinh.addItem(FEMALE);
        
        btnCapNhap.setText(UPDATE);
        btnRefreshNV.setText(REFRESH);
        btnThem.setText(ADD);
        btnXoa.setText(DELETE);
        lbCCCD.setText(CCCD);
        lbDSNhanVien.setText(LIST_EMPLOYEE);
        lbGioiTinh.setText(SEX);
        lbMaCN.setText(ID_BRANCH);
        lbMaNV.setText(ID_EMPLOYEE);
        lbNgayVL.setText(DATE_WORK);
        lbTTNhanVien.setText(INFO_EMPLOYEE);
        lbTenCN.setText(NAME_BRANCH);
        lbTenNV.setText(NAME_EMPLOYEE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbMaCN = new javax.swing.JLabel();
        lbMaNV = new javax.swing.JLabel();
        lbTenNV = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        lbNgayVL = new javax.swing.JLabel();
        lbCCCD = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();
        lbTenCN = new javax.swing.JLabel();
        txtTenCN = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhap = new javax.swing.JButton();
        btnRefreshNV = new javax.swing.JButton();
        lbTTNhanVien = new javax.swing.JLabel();
        cbMaCN = new javax.swing.JComboBox<>();
        NgayVL = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNV = new javax.swing.JTable();
        lbDSNhanVien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMaCN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMaCN.setText("Mã Chi Nhánh");
        jPanel2.add(lbMaCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 157, 85, -1));

        lbMaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMaNV.setText("Mã Nhân Viên");
        jPanel2.add(lbMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 101, 85, -1));

        lbTenNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenNV.setText("Tên Nhân Viên");
        jPanel2.add(lbTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 253, 85, -1));

        lbGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbGioiTinh.setText("Giới Tính");
        jPanel2.add(lbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 303, 82, -1));

        lbNgayVL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNgayVL.setText("Ngày Vào Làm");
        jPanel2.add(lbNgayVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 355, -1, -1));

        lbCCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCCCD.setText("CCCD");
        jPanel2.add(lbCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 400, 82, -1));

        txtMaNV.setEnabled(false);
        jPanel2.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 98, 146, -1));

        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });
        jPanel2.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 146, -1));

        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDActionPerformed(evt);
            }
        });
        jPanel2.add(txtCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 397, 143, -1));

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel2.add(cbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 300, -1, -1));

        lbTenCN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenCN.setText("Tên Chi Nhánh");
        jPanel2.add(lbTenCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 205, 85, -1));

        txtTenCN.setText("UIT");
        txtTenCN.setEnabled(false);
        jPanel2.add(txtTenCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 202, 146, -1));

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/add (1).png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 30));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/delete (1).png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        btnCapNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/edit (2).png"))); // NOI18N
        btnCapNhap.setText("Cập Nhập");
        btnCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapActionPerformed(evt);
            }
        });
        jPanel2.add(btnCapNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 110, 30));

        btnRefreshNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefreshNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/refresh-arrow.png"))); // NOI18N
        btnRefreshNV.setText("Refresh ");
        btnRefreshNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshNVActionPerformed(evt);
            }
        });
        jPanel2.add(btnRefreshNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, 30));

        lbTTNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTTNhanVien.setText("Thông tin Nhân Viên");
        jPanel2.add(lbTTNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 41, -1, -1));

        cbMaCN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cbMaCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaCNActionPerformed(evt);
            }
        });
        jPanel2.add(cbMaCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 154, -1, -1));
        jPanel2.add(NgayVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 349, 143, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/background2.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 560));

        tbNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Chi Nhánh", "Mã Nhân Viên", "Tên Nhân Viên", "Giới Tính", "Ngày Vào Làm", "CCCD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNV);

        lbDSNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDSNhanVien.setText("Danh sách Nhân Viên");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbDSNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lbDSNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel listNV;

    public void LoadTable() {
        listNV = new DefaultTableModel();
        String tieuDe[] = {ID_BRANCH, ID_EMPLOYEE, NAME_EMPLOYEE, SEX, DATE_WORK, CCCD};
        listNV.setColumnIdentifiers(tieuDe);
        Object row[] = new Object[6];
        NhanVienController.getInstance().LayDuLieu();
        int i = 0;
        while (i < DataContext.getInstance().getNhanViens().size()) {
            try {
                row[0] = DataContext.getInstance().getNhanViens().get(i).getMaCN();
                row[1] = DataContext.getInstance().getNhanViens().get(i).getMaNV();
                row[2] = DataContext.getInstance().getNhanViens().get(i).getTenNV();
                int gt = DataContext.getInstance().getNhanViens().get(i).getGioiTinh();
                if (gt == 0) {
                    row[3] = MALE;
                } else {
                    row[3] = FEMALE;
                }
                row[4] = DataContext.getInstance().getNhanViens().get(i).getNgayVL();
                row[5] = DataContext.getInstance().getNhanViens().get(i).getCCCD();
                i++;
                listNV.addRow(row);
            } catch (Exception e) {
            }
        }
        tbNV.setModel(listNV);
        setVisible(true);
    }

    public void loadMaCN() {
        try {
            ChiNhanhController.getInstance().LayDuLieu();
            for (ChiNhanhModel i : DataContext.getInstance().getChiNhanhs()) {
                int maCN = i.getMaCN();
                cbMaCN.addItem(String.valueOf(maCN));
            }
        } catch (Exception e) {
        }

    }

    public String checkError() {
        if (txtTenNV.getText().equals("")) {
            return ERR_NAME_EMPLOYEE_EMPTY;
        }
        if (NgayVL.getDate() == null) {
            if (NgayVL.isValid() == false) {
                return ERR_DATE_WRONG;
            }
        }
        if (txtCCCD.getText().equals("") || txtCCCD.getText().length() != 13) {
            return ERR_CCCD;
        }
        return "";
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String tenNV = txtTenNV.getText();
        String cccd = txtCCCD.getText();
        StringBuilder sb = new StringBuilder();
        var x = checkError();
        if (!x.equals("")) {
            JOptionPane.showConfirmDialog(null, x, NOTIFICATION_TITLE, JOptionPane.DEFAULT_OPTION);
            return;
        }
        try {
            NhanVienModel nv = new NhanVienModel();
            nv.setTenNV(tenNV);
            //1. UIT 2. Trung tâm 3. Miền Bắc
            if (cbMaCN.getSelectedItem().equals("1")) {
                nv.setMaCN(1);
            } else if (cbMaCN.getSelectedItem().equals("2")) {
                nv.setMaCN(2);
            } else {
                nv.setMaCN(3);
            }
            //Nam: 0, Nữ: 1
            if (cbGioiTinh.getSelectedIndex() == 0) {
                nv.setGioiTinh(0);
            } else {
                nv.setGioiTinh(1);
            }
            nv.setNgayVL(new java.sql.Date(NgayVL.getDate().getTime()));
            nv.setCCCD(txtCCCD.getText());
            if (NhanVienController.getInstance().ThemNhanVien(nv) == true) {
                JOptionPane.showMessageDialog(null, NOTI_SUCCESS);
            } else {
                JOptionPane.showMessageDialog(this, NOTI_FAILED);
                return;
            }
            LoadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, NOTI_FAILED);
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void cbMaCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaCNActionPerformed
        try {
            txtTenCN.setText(NhanVienController.getInstance().hienthiTenCN((Integer.parseInt(cbMaCN.getSelectedItem().toString()))));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbMaCNActionPerformed

    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed
        String tenNV = txtTenNV.getText();
        String cccd = txtCCCD.getText();
        var x = checkError();
        if (!x.equals("")) {
            JOptionPane.showConfirmDialog(null, x, NOTIFICATION_TITLE, JOptionPane.DEFAULT_OPTION);
            return;
        }
        try {
            NhanVienModel nv = new NhanVienModel();
            String maCN = cbMaCN.getSelectedItem().toString();
            nv.setTenNV(tenNV);
            nv.setMaCN(Integer.parseInt(maCN));
            nv.setCCCD(cccd);
            //Nam: 0, Nữ: 1
            if (cbGioiTinh.getSelectedIndex() == 0) {
                nv.setGioiTinh(0);
            } else {
                nv.setGioiTinh(1);
            }
            nv.setNgayVL(new java.sql.Date(NgayVL.getDate().getTime()));
            int maNV = Integer.parseInt(txtMaNV.getText());
            if (NhanVienController.getInstance().SuaNhanVien(maNV, nv) == true) {
                JOptionPane.showMessageDialog(null, NOTI_SUCCESS);
            } else {
                JOptionPane.showMessageDialog(null, NOTI_FAILED);
            }
            LoadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, NOTI_FAILED);
        }
    }//GEN-LAST:event_btnCapNhapActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        if (txtMaNV.getText().equals("")) {
            JOptionPane.showMessageDialog(null, CHOSSE_DELETE, NOTIFICATION_TITLE, 1);
        } else {
            try {
                NhanVienController.getInstance().LayDuLieu();
                int result = JOptionPane.showConfirmDialog(this, REQUEST_DELETE, NOTIFICATION_TITLE, JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    if (NhanVienController.getInstance().XoaNhanVien(Integer.parseInt(txtMaNV.getText())) == true) {
                        JOptionPane.showMessageDialog(this, NOTI_SUCCESS);
                    } else {
                        JOptionPane.showMessageDialog(null, NOTI_FAILED);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, NOTI_FAILED);
            }
        }

        LoadTable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnRefreshNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshNVActionPerformed
        cbMaCN.setSelectedIndex(0);
        txtTenNV.setText("");
        txtCCCD.setText("");
        cbGioiTinh.setSelectedIndex(0);
        txtMaNV.setText("");
        NgayVL.setDate(null);
    }//GEN-LAST:event_btnRefreshNVActionPerformed

    private void tbNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNVMouseClicked
        try {
            int row = this.tbNV.getSelectedRow();
            if (row >= 0 && row <= tbNV.getRowCount()) {
                String maCN = tbNV.getValueAt(row, 0).toString();
                cbMaCN.addItem(maCN);
                String tencn = NhanVienController.getInstance().hienthiTenCN(Integer.parseInt(maCN));
                txtTenCN.setText(tencn);
                txtMaNV.setText(tbNV.getValueAt(row, 1).toString());
                txtTenNV.setText(tbNV.getValueAt(row, 2).toString());
                //0: Nam 1: Nữ
                if (tbNV.getValueAt(row, 3).toString().trim().equals("0")) {
                    cbGioiTinh.setSelectedItem(MALE);
                } else {
                    cbGioiTinh.setSelectedItem(FEMALE);
                }
                NgayVL.setDate((Date) tbNV.getModel().getValueAt(row, 4));
                txtCCCD.setText(tbNV.getValueAt(row, 5).toString());
                LoadTable();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbNVMouseClicked

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed

    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDActionPerformed
    private String TITLE;
    private String UPDATE;
    private String RESET;
    private String EXIT;
    private String REFRESH;
    private String DELETE;
    private String ADD;
    private String CCCD;
    private String LIST_EMPLOYEE;
    private String SEX;
    private String ID_BRANCH;
    private String ID_EMPLOYEE;
    private String DATE_WORK;
    private String INFO_EMPLOYEE;
    private String NAME_BRANCH;
    private String NAME_EMPLOYEE;
    private String NOTIFICATION_TITLE;
    private String NOTI_SUCCESS;
    private String NOTI_FAILED;
    private String CHOSSE_DELETE;
    private String REQUEST_DELETE;
    private String MALE;
    private String FEMALE;
    private String ERR_NAME_EMPLOYEE_EMPTY;
    private String ERR_DATE_WRONG;
    private String ERR_CCCD;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser NgayVL;
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnRefreshNV;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbMaCN;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbDSNhanVien;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbMaCN;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbNgayVL;
    private javax.swing.JLabel lbTTNhanVien;
    private javax.swing.JLabel lbTenCN;
    private javax.swing.JLabel lbTenNV;
    private javax.swing.JTable tbNV;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTenCN;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
