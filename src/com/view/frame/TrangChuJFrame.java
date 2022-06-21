/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.frame;

import com.handle.ImageHandle;
import com.handle.LanguageHandle;
import com.models.DataContext;
import com.models.UserModel;

/**
 *
 * @author ASUS
 */
public class TrangChuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuJFrame
     */
    public TrangChuJFrame() {
        initComponents();
        phanQuyen();
        loadText();
        configComponents();
    }

    private void phanQuyen() {
        UserModel um = DataContext.getInstance().getUser();
        btnChiNhanh.setEnabled(false);
        btnKhachHang.setEnabled(false);
        btnNhanVien.setEnabled(false);
        btnThongKe.setEnabled(false);
        btnMenu.setEnabled(false);
        btnTaiKhoan.setEnabled(false);
        btnDoUong.setEnabled(false);
        if (um.getPosition().contains("Khách")) {

        } else if (um.getPosition().contains("Nhân viên")) {
            btnMenu.setEnabled(true);
            btnKhachHang.setEnabled(true);
        } else if (um.getPosition().contains("Quản lí")) {
            btnChiNhanh.setEnabled(true);
            btnKhachHang.setEnabled(true);
            btnNhanVien.setEnabled(true);
            btnThongKe.setEnabled(true);
            btnMenu.setEnabled(true);
            btnTaiKhoan.setEnabled(true);
            btnDoUong.setEnabled(true);
        }
    }

    private void loadText() {
        TITLE = LanguageHandle.getInstance().getValue("Home", "TITLE");
        EMPLOYEE = LanguageHandle.getInstance().getValue("Home", "EMPLOYEE");
        ACCOUNT = LanguageHandle.getInstance().getValue("Home", "ACCOUNT");
        BRANCH = LanguageHandle.getInstance().getValue("Home", "BRANCH");
        SELL = LanguageHandle.getInstance().getValue("Home", "SELL");
        STAT = LanguageHandle.getInstance().getValue("Home", "STAT");
        CUSTOMER = LanguageHandle.getInstance().getValue("Home", "CUSTOMER");
        MANAGE_DRINKS = LanguageHandle.getInstance().getValue("Home", "MANAGE_DRINKS");
    }

    private void configComponents() {
        setIconImage(ImageHandle.getInstance().getIconLogo());
        setTitle(TITLE);
        // Doi ngon ngu
        btnNhanVien.setText(EMPLOYEE);
        btnTaiKhoan.setText(ACCOUNT);
        btnChiNhanh.setText(BRANCH);
        btnMenu.setText(SELL);
        btnThongKe.setText(STAT);
        btnKhachHang.setText(CUSTOMER);
        btnDoUong.setText(MANAGE_DRINKS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKhachHang = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        btnChiNhanh = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnDoUong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/rating.png"))); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/employees.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setToolTipText("");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/user.png"))); // NOI18N
        btnTaiKhoan.setText("Tài khoan");
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        btnChiNhanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/franchise.png"))); // NOI18N
        btnChiNhanh.setText("Chi nhánh");
        btnChiNhanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiNhanhActionPerformed(evt);
            }
        });

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/inferential-statistics.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/menu.png"))); // NOI18N
        btnMenu.setText("Đặt món");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnDoUong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/douonga.png"))); // NOI18N
        btnDoUong.setText("QUan li do uong");
        btnDoUong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoUongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongKe)
                .addGap(18, 18, 18)
                .addComponent(btnMenu)
                .addGap(32, 32, 32)
                .addComponent(btnDoUong)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnChiNhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTaiKhoan)
                .addGap(387, 387, 387))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnDoUong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhanVien)
                    .addComponent(btnChiNhanh)
                    .addComponent(btnTaiKhoan))
                .addGap(300, 300, 300))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChiNhanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiNhanhActionPerformed
        new ChiNhanhFrame().setVisible(true);
    }//GEN-LAST:event_btnChiNhanhActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        new NhanVienFrame().setVisible(true);
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        new ThongKeFrame().setVisible(true);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        new KhachHangFrame().setVisible(true);
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuFrame.getInstance().setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        new AccountFrame().setVisible(true);
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnDoUongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoUongActionPerformed
        new DoUongFrame().setVisible(true);
    }//GEN-LAST:event_btnDoUongActionPerformed

    //Text
    private String TITLE;
    private String EMPLOYEE;
    private String ACCOUNT;
    private String BRANCH;
    private String SELL;
    private String STAT;
    private String CUSTOMER;
    private String MANAGE_DRINKS;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiNhanh;
    private javax.swing.JButton btnDoUong;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThongKe;
    // End of variables declaration//GEN-END:variables
}
