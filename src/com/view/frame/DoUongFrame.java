/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.frame;

import com.controller.DoUongController;
import com.handle.ImageHandle;
import com.models.DataContext;
import com.models.DoUongModel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DO THAO QUYEN
 */
public class DoUongFrame extends javax.swing.JFrame {

    DefaultTableModel modelttKH;

    /**
     * Creates new form KhachHangFrame
     */
    public DoUongFrame() {
        initComponents();
        loadTable();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinDU = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        labelMaDU = new javax.swing.JLabel();
        labelTenDU = new javax.swing.JLabel();
        labelGia = new javax.swing.JLabel();
        labelHinhAnh = new javax.swing.JLabel();
        txtMaDU = new javax.swing.JTextField();
        txtTenDU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelGhiChu = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabelHA = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btCapNhap = new javax.swing.JButton();
        btReset = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbThongTinDU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Đồ Uống ", "Tên Đồ Uống ", "Giá ", "Ghi Chú"
            }
        ));
        tbThongTinDU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinDUMouseClicked(evt);
            }
        });
        tbThongTinDU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbThongTinDUKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTinDU);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        labelMaDU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMaDU.setText("Mã Đồ Uống ");

        labelTenDU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTenDU.setText("Tên Đồ Uống ");

        labelGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelGia.setText("Giá");

        labelHinhAnh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelHinhAnh.setText("Hình Ảnh ");

        txtMaDU.setEditable(false);
        txtMaDU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDUActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("THÔNG TIN ĐỒ UỐNG");

        labelGhiChu.setText("Ghi Chú");

        txtGhiChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhiChuActionPerformed(evt);
            }
        });

        jLabelHA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/logo.png"))); // NOI18N

        btThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/add (1).png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/exit (2).png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/delete (1).png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btCapNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCapNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/edit (2).png"))); // NOI18N
        btCapNhap.setText("Cập Nhập");
        btCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhapActionPerformed(evt);
            }
        });

        btReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/refresh-arrow.png"))); // NOI18N
        btReset.setText("Refresh");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMaDU)
                            .addComponent(labelTenDU)
                            .addComponent(labelGia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGhiChu)
                            .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenDU, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaDU, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelHA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btXoa)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btCapNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(248, 248, 248)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btThoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaDU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMaDU))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenDU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTenDU)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGia))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGhiChu)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelHinhAnh))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelHA, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btThoat)
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btXoa)
                                    .addComponent(btCapNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btReset)
                                .addContainerGap(31, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadTable() {
       
        DefaultTableModel modelThongTinDU = new DefaultTableModel();

        String tieuDe[] = {"Mã Đồ Uống", "Tên Đồ Uống", "Giá", "Hình Ảnh", "Ghi Chú"};
        modelThongTinDU.setColumnIdentifiers(tieuDe);
        Object row[] = new Object[5];
        DoUongController.getInstance().LayDuLieu();
        int i = 0;
        while (i < DataContext.getInstance().getDoUongs().size()) {
            try {
                row[0] = DataContext.getInstance().getDoUongs().get(i).getMaDU();
                row[1] = DataContext.getInstance().getDoUongs().get(i).getTenDU();
                row[2] = DataContext.getInstance().getDoUongs().get(i).getGia();
                row[3] = DataContext.getInstance().getDoUongs().get(i).getHinhAnh();
                row[4] = DataContext.getInstance().getDoUongs().get(i).getGhiChu();
                i++;
                modelThongTinDU.addRow(row);
            } catch (Exception e) {
            }
        }

        tbThongTinDU.setModel(modelThongTinDU);
        setVisible(true);
    }


    private void tbThongTinDUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbThongTinDUKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbThongTinDUKeyPressed

    private void tbThongTinDUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinDUMouseClicked
        try {
            int row = this.tbThongTinDU.getSelectedRow();
            if (row >= 0 && row <= tbThongTinDU.getRowCount()) {
                txtMaDU.setText(tbThongTinDU.getValueAt(row, 0).toString());
                txtTenDU.setText(tbThongTinDU.getValueAt(row, 1).toString());
                txtGia.setText(tbThongTinDU.getValueAt(row, 2).toString());
                txtGhiChu.setText(tbThongTinDU.getValueAt(row, 4).toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbThongTinDUMouseClicked

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        txtMaDU.setText("");
        txtTenDU.setText("");
        txtGia.setText("");
        txtGhiChu.setText("");
    }//GEN-LAST:event_btResetActionPerformed

    private void btCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhapActionPerformed
        String tenDU = txtTenDU.getText();
        String gia = txtGia.getText();
        if (tenDU.length() == 0 || gia.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập đủ thông tin");
        } else {
            try {
                DoUongModel doUongModel = new DoUongModel();
                doUongModel.setTenDU(tenDU);
                doUongModel.setGia(Double.parseDouble(gia));
                if (txtGhiChu.getText() == "") {
                    return;
                } else {
                    doUongModel.setGhiChu(txtGhiChu.getText());
                }

                if (DoUongController.getInstance().SuaDoUong(Integer.parseInt(txtMaDU.getText()), doUongModel) == true) {
                    JOptionPane.showMessageDialog(this, "Cập nhập đồ uống thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhập đồ uống không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Cập nhập thất bại");
            }
        }
    }//GEN-LAST:event_btCapNhapActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if (this.txtMaDU.getText().length() == 0)
        JOptionPane.showMessageDialog(null, "Bạn cần chọn mã đồ uống để xóa", "Thông báo", 1);
        else {
            try {
                int result = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa đồ uống này", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    if (DoUongController.getInstance().XoaDoUong(Integer.parseInt(txtMaDU.getText())) == true) {
                        JOptionPane.showMessageDialog(this, "Xóa đồ uống thành công", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa đồ uống không thành công!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    }
                }
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát", "Thoát", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_btThoatActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        if (txtTenDU.getText().equals("") || txtGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Thông tin còn trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                DoUongModel doUongModel = new DoUongModel();
                doUongModel.setTenDU(txtTenDU.getText());
                doUongModel.setGia(Double.parseDouble(txtGia.getText()));
                if (txtGhiChu.getText()==" ") {
                    return;
                } else {
                    doUongModel.setGhiChu(txtGhiChu.getText());
                }
                if (DoUongController.getInstance().ThemDoUong(doUongModel) == true) {
                    JOptionPane.showMessageDialog(this, "Thêm đồ uống thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm đồ uống không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void txtGhiChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhiChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhiChuActionPerformed

    private void txtMaDUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDUActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCapNhap;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelHA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelGhiChu;
    private javax.swing.JLabel labelGia;
    private javax.swing.JLabel labelHinhAnh;
    private javax.swing.JLabel labelMaDU;
    private javax.swing.JLabel labelTenDU;
    private javax.swing.JTable tbThongTinDU;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaDU;
    private javax.swing.JTextField txtTenDU;
    // End of variables declaration//GEN-END:variables
}
