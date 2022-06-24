/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.frame;

import com.controller.AccountController;
import com.handle.ImageHandle;
import com.handle.LanguageHandle;
import com.models.AccountModel;
import com.models.DataContext;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dang
 */
public class AccountFrame extends javax.swing.JFrame {

    DefaultTableModel modelttKH;

    /**
     * Creates new form KhachHangFrame
     */
    public AccountFrame() {
        initComponents();
        loadText();
        configComponents();
        loadTable();
    }

    private void loadText() {
        TITLE = LanguageHandle.getInstance().getValue("Account", "TITLE");
        UPDATE = LanguageHandle.getInstance().getValue("Account", "UPDATE");
        RESET = LanguageHandle.getInstance().getValue("Account", "RESET");
        REFRESH = LanguageHandle.getInstance().getValue("Account", "REFRESH");
        EXIT = LanguageHandle.getInstance().getValue("Account", "EXIT");
        KIND = LanguageHandle.getInstance().getValue("Account", "KIND");
        STATUS = LanguageHandle.getInstance().getValue("Account", "STATUS");
        USERNAME = LanguageHandle.getInstance().getValue("Account", "USERNAME");
        INFO = LanguageHandle.getInstance().getValue("Account", "INFO");
        LOCK = LanguageHandle.getInstance().getValue("Account", "LOCK");
        OPEN = LanguageHandle.getInstance().getValue("Account", "OPEN");
        GUEST = LanguageHandle.getInstance().getValue("Account", "GUEST");
        EMPLOYEE = LanguageHandle.getInstance().getValue("Account", "EMPLOYEE");
        MANAGER = LanguageHandle.getInstance().getValue("Account", "MANAGER");
        EXIT_MESSAGE = LanguageHandle.getInstance().getValue("Account", "EXIT_MESSAGE");
        NOTIFICATION_TITLE = LanguageHandle.getInstance().getValue("Account", "NOTIFICATION_TITLE");
        NOTI_SUCCESS = LanguageHandle.getInstance().getValue("Account", "NOTI_SUCCESS");
        NOTI_FAILED = LanguageHandle.getInstance().getValue("Account", "NOTI_FAILED");
    }

    private void configComponents() {
        setIconImage(ImageHandle.getInstance().getIconLogo());
        setTitle(TITLE);
        // Doi ngon ngu
        btnCapNhap.setText(UPDATE);
        btnReset.setText(REFRESH);
        lbLoai.setText(KIND);
        lbTinhTrang.setText(STATUS);
        lbTitle.setText(TITLE);
        lbUsername.setText(USERNAME);

        cbloai.removeAllItems();
        cbloai.addItem(GUEST);
        cbloai.addItem(EMPLOYEE);
        cbloai.addItem(MANAGER);

        cbtinhtrang.removeAllItems();
        cbtinhtrang.addItem(OPEN);
        cbtinhtrang.addItem(LOCK);
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
        lbUsername = new javax.swing.JLabel();
        lbTinhTrang = new javax.swing.JLabel();
        lbLoai = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        cbtinhtrang = new javax.swing.JComboBox<>();
        lbTitle = new javax.swing.JLabel();
        cbloai = new javax.swing.JComboBox<>();
        btnCapNhap = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinTK = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbUsername.setText("Tên Người Dùng ");

        lbTinhTrang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTinhTrang.setText("Tình Trạng");

        lbLoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLoai.setText("Loại");

        txtuser.setEditable(false);
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        cbtinhtrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mở", "Khóa" }));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setText("THÔNG TIN TÀI KHOẢN");

        cbloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khách", "Nhân viên", "Quản lý" }));

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
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(58, 58, 58))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCapNhap)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbTinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbtinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(cbloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitle)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbtinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTinhTrang))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoai)
                    .addComponent(cbloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbThongTinTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên Người Dùng  ", "Tình Trạng", "Loại"
            }
        ));
        tbThongTinTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinTKMouseClicked(evt);
            }
        });
        tbThongTinTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbThongTinTKKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTinTK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadTable() {
        modelttKH = new DefaultTableModel();
        String tieuDe[] = {USERNAME, STATUS, KIND};
        modelttKH.setColumnIdentifiers(tieuDe);
        Object row[] = new Object[3];
        AccountController.getInstance().LayDuLieu();
        int i = 0;
        while (i < DataContext.getInstance().getAccounts().size()) {
            try {
                row[0] = DataContext.getInstance().getAccounts().get(i).getUserName();
                Boolean tt = DataContext.getInstance().getAccounts().get(i).getIsLocked();
                if (tt == true) {
                    row[1] = LOCK;
                } else {
                    row[1] = OPEN;
                }
                int loai = DataContext.getInstance().getAccounts().get(i).getType();
                if (loai == 1) {
                    row[2] = GUEST;
                } else if (loai == 2) {
                    row[2] = EMPLOYEE;
                } else if (loai == 3) {
                    row[2] = MANAGER;
                }
                i++;
                modelttKH.addRow(row);
            } catch (Exception e) {
                e.printStackTrace();
            }
            tbThongTinTK.setModel(modelttKH);
            setVisible(true);
        }
    }


    private void btnCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapActionPerformed
        try {
            AccountModel accountModel = new AccountModel();
            if (cbtinhtrang.getSelectedItem().equals(LOCK)) {
                accountModel.setIsLocked(true);
            } else if (cbtinhtrang.getSelectedItem().equals(OPEN)) {
                accountModel.setIsLocked(false);
            }

            if (cbloai.getSelectedItem().toString().equals(GUEST)) {
                accountModel.setType(1);
            } else if (cbloai.getSelectedItem().toString().equals(EMPLOYEE)) {
                accountModel.setType(2);
            } else if (cbloai.getSelectedItem().toString().equals(MANAGER)) {
                accountModel.setType(3);
            }
            if (AccountController.getInstance().SuaAccount(txtuser.getText(), accountModel) == true) {
                JOptionPane.showMessageDialog(this, NOTI_SUCCESS, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
            }
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, NOTI_FAILED, NOTIFICATION_TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCapNhapActionPerformed

    private void tbThongTinTKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbThongTinTKKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbThongTinTKKeyPressed

    private void tbThongTinTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinTKMouseClicked
        try {
            int row = this.tbThongTinTK.getSelectedRow();
            if (row >= 0 && row <= tbThongTinTK.getRowCount()) {
                txtuser.setText(tbThongTinTK.getValueAt(row, 0).toString().trim());
                String tt = tbThongTinTK.getValueAt(row, 1).toString();
                cbtinhtrang.setSelectedItem(tt);
                if (tbThongTinTK.getValueAt(row, 2).toString().trim().equals(GUEST)) {
                    cbloai.setSelectedItem(GUEST);
                } else if (tbThongTinTK.getValueAt(row, 2).toString().trim().equals(EMPLOYEE)) {
                    cbloai.setSelectedItem(EMPLOYEE);
                } else if (tbThongTinTK.getValueAt(row, 2).toString().trim().equals(MANAGER)) {
                    cbloai.setSelectedItem(MANAGER);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbThongTinTKMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        loadTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    // Text
    private String TITLE;
    private String UPDATE;
    private String RESET;
    private String REFRESH;
    private String EXIT;
    private String KIND;
    private String STATUS;
    private String USERNAME;
    private String INFO;
    private String LOCK;
    private String OPEN;
    private String GUEST;
    private String EMPLOYEE;
    private String MANAGER;
    private String EXIT_MESSAGE;
    private String NOTIFICATION_TITLE;
    private String NOTI_SUCCESS;
    private String NOTI_FAILED;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhap;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbloai;
    private javax.swing.JComboBox<String> cbtinhtrang;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLoai;
    private javax.swing.JLabel lbTinhTrang;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JTable tbThongTinTK;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
