/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.frame;

import com.controller.KhachHangController;
import com.handle.ImageHandle;
import com.models.DataContext;
import com.models.KhachHangModel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DO THAO QUYEN
 */
public class KhachHangFrame extends javax.swing.JFrame {

    DefaultTableModel modelttKH;

    /**
     * Creates new form KhachHangFrame
     */
    public KhachHangFrame() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinKH = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btTim = new javax.swing.JToggleButton();
        btRefreshTim = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();
        txtTongDiem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btCapNhap = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbThongTinKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Số Điện Thoại", "Tên Khách Hàng", "Giới Tính", "Tổng Điểm"
            }
        ));
        tbThongTinKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinKHMouseClicked(evt);
            }
        });
        tbThongTinKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbThongTinKHKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTinKH);

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        btTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btTim.setText("Tìm ");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        btRefreshTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRefreshTim.setText("Refresh");
        btRefreshTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btTim)
                .addGap(18, 18, 18)
                .addComponent(btRefreshTim)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTim)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRefreshTim))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Số Điện Thoại");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tên Khác Hàng");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Giới Tính");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tổng Điểm");

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Nam", "Nữ" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("THÔNG TIN KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        btThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btCapNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCapNhap.setText("Cập Nhập");
        btCapNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhapActionPerformed(evt);
            }
        });

        btReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btReset.setText("Refresh");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btThem)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btCapNhap)
                        .addGap(18, 18, 18)
                        .addComponent(btReset))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btThoat)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btCapNhap)
                    .addComponent(btReset))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThoat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadTable() {
        modelttKH = (DefaultTableModel) new DefaultTableModel();
        try {
            KhachHangModel kh = new KhachHangModel();
            modelttKH = new DefaultTableModel();
            String tieuDe[] = {"Số Điện Thoại", "Tên Khách Hàng", "Giới Tính", "Tổng Điểm"};
            modelttKH.setColumnIdentifiers(tieuDe);
            Object row[] = new Object[4];
            int i = 0;
            KhachHangController.getInstance().LayDuLieu();
            while (i < DataContext.getInstance().getKhachHangs().size()) {
                row[0] = DataContext.getInstance().getKhachHangs().get(i).getSDTKH();
                row[1] = DataContext.getInstance().getKhachHangs().get(i).getTenKH();
                row[2] = DataContext.getInstance().getKhachHangs().get(i).getGioiTinh();
                row[3] = DataContext.getInstance().getKhachHangs().get(i).getTongDiem();
                i++;
                modelttKH.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tbThongTinKH.setModel(modelttKH);
        setVisible(true);
    }


    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        String sdt = txtSDT.getText();
        String tenKH = txtTenKH.getText();
        String tongDiem = txtTongDiem.getText();

        if (sdt.length() == 0 || tenKH.length() == 0 || tongDiem.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập đủ thông tin");
        } else {
            try {
                KhachHangModel kh = new KhachHangModel();

                //Kiểm tra định dạng sđt
                try {
                    Double.parseDouble(txtSDT.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Số điện thoại nhập không đúng định dạng!", "", JOptionPane.WARNING_MESSAGE);
                    txtSDT.setText("");
                    return;
                }
                if (sdt.length() < 9) {
                    JOptionPane.showMessageDialog(null, "Số điện thoại quá ngắn!", "", JOptionPane.WARNING_MESSAGE);
                    return;
                } else {
                    kh.setSDTKH(sdt);
                }

                kh.setTenKH(tenKH);

                //0: Nam 1: Nữ
                if (cbGioiTinh.getSelectedItem().equals("Nam")) {
                    kh.setGioiTinh(0);
                } else {
                    kh.setGioiTinh(1);
                }
                kh.setTongDiem(Integer.parseInt(tongDiem));
                if (KhachHangController.getInstance().ThemKhachHang(kh) == true) {
                    JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm khách hàng không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát", "Thoát", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btThoatActionPerformed

    private void btCapNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhapActionPerformed
        String sdt = txtSDT.getText();
        String tenKH = txtTenKH.getText();
        String tongDiem = txtTongDiem.getText();

        if (sdt.length() == 0 || tenKH.length() == 0 || tongDiem.length() == 0) {
            JOptionPane.showMessageDialog(this, "Thông tin nhập còn trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                KhachHangModel kh = new KhachHangModel();

                kh.setTenKH(tenKH);

                //0: Nam 1: Nữ
                if (cbGioiTinh.getSelectedItem().equals("Nam")) {
                    kh.setGioiTinh(0);
                } else {
                    kh.setGioiTinh(1);
                }
                kh.setTongDiem(Integer.parseInt(tongDiem));

                if (KhachHangController.getInstance().SuaKhachHang(sdt, kh) == true) {
                    JOptionPane.showMessageDialog(this, "Cập nhập khách hàng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhập khách hàng không thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Cập nhập thất bại");
            }
        }
    }//GEN-LAST:event_btCapNhapActionPerformed

    /**
     * Tìm kiếm bằng sđt khách hàng
     *
     */
    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        modelttKH = (DefaultTableModel) tbThongTinKH.getModel();
        String sdt = txtTimKiem.getText();
        modelttKH.setRowCount(0);
        if (txtTimKiem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thông tin tìm kiếm", "Lỗi", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                KhachHangController.getInstance().TimKhachHang(sdt);
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Khách hàng không tồn tại!");
            }
        }
    }//GEN-LAST:event_btTimActionPerformed

    private void tbThongTinKHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbThongTinKHKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbThongTinKHKeyPressed

    private void tbThongTinKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinKHMouseClicked
        try {
            int row = this.tbThongTinKH.getSelectedRow();
            if (row >= 0 && row <= tbThongTinKH.getRowCount()) {
                txtSDT.setText(tbThongTinKH.getValueAt(row, 0).toString());
                txtTenKH.setText(tbThongTinKH.getValueAt(row, 1).toString());
                if (tbThongTinKH.getValueAt(row, 2).toString().trim().equals("0")) {
                    cbGioiTinh.setSelectedItem("Nam");
                } else {
                    cbGioiTinh.setSelectedItem("Nữ");
                }
                txtTongDiem.setText(tbThongTinKH.getValueAt(row, 3).toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbThongTinKHMouseClicked

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                KhachHangController.getInstance().TimKhachHang(txtSDT.getText());
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        txtSDT.setText("");
        txtTenKH.setText("");
        txtTongDiem.setText("");
        cbGioiTinh.setSelectedItem(null);
        txtTimKiem.setText("");
    }//GEN-LAST:event_btResetActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if (this.txtSDT.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Bạn cần chọn số điện thoại để xóa", "Thông báo", 1);
        else {
            try {
                int result = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa khách hàng này", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    if (KhachHangController.getInstance().XoaKhachHang(txtSDT.getText()) == true) {
                        JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa không thành công!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    }
                }
                loadTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btRefreshTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshTimActionPerformed
        txtTimKiem.setText("");
        modelttKH = (DefaultTableModel) tbThongTinKH.getModel();
        modelttKH.setRowCount(0);
        loadTable();
    }//GEN-LAST:event_btRefreshTimActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCapNhap;
    private javax.swing.JButton btRefreshTim;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JToggleButton btTim;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbThongTinKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongDiem;
    // End of variables declaration//GEN-END:variables
}
