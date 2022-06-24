/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.frame;

import com.handle.ImageHandle;
import com.handle.LanguageHandle;
import com.models.DataContext;
import com.models.UserModel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class HomePageFrame extends JFrame {

    public HomePageFrame() {
        loadText();
        initComponents();
        phanQuyen();
    }

    private void phanQuyen() {
        UserModel um = DataContext.getInstance().getUser();

        if (um.getPosition().contains("Khách")) {
            btnChiNhanh.setVisible(false);
            btnKhachHang.setVisible(false);
            btnNhanVien.setVisible(false);
            btnThongKe.setVisible(false);
            btnMenu.setVisible(false);
            btnTaiKhoan.setVisible(false);
            btnDoUong.setVisible(false);
        } else if (um.getPosition().contains("Nhân viên")) {
            btnChiNhanh.setVisible(false);
            btnNhanVien.setVisible(false);
            btnThongKe.setVisible(false);
            btnTaiKhoan.setVisible(false);
            btnDoUong.setVisible(false);
        } else if (um.getPosition().contains("Quản lí")) {
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
        MANAGER = LanguageHandle.getInstance().getValue("Home", "MANAGER");
        GUEST = LanguageHandle.getInstance().getValue("Home", "GUEST");
    }

    private void initComponents() {

        btnKhachHang = new JButton();
        btnNhanVien = new JButton();
        btnTaiKhoan = new JButton();
        btnChiNhanh = new JButton();
        btnThongKe = new JButton();
        btnMenu = new JButton();
        btnDoUong = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(ImageHandle.getInstance().getIconLogo());
        setTitle(TITLE);

        btnKhachHang.setIcon(new ImageIcon(ImageHandle.getInstance().readImage("/com/resource/rating.png")));
        btnKhachHang.setText(CUSTOMER);
        btnKhachHang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new KhachHangFrame().setVisible(true);
            }
        });

        btnNhanVien.setIcon(new ImageIcon(ImageHandle.getInstance().readImage("/com/resource/employees.png"))); // NOI18N
        btnNhanVien.setText(EMPLOYEE);
        btnNhanVien.setToolTipText("");
        btnNhanVien.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new NhanVienFrame().setVisible(true);
            }
        });

        btnTaiKhoan.setIcon(new ImageIcon(ImageHandle.getInstance().readImage("/com/resource/user.png"))); // NOI18N
        btnTaiKhoan.setText(ACCOUNT);
        btnTaiKhoan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new AccountFrame().setVisible(true);
            }
        });

        btnChiNhanh.setIcon(new ImageIcon(ImageHandle.getInstance().readImage("/com/resource/franchise.png"))); // NOI18N
        btnChiNhanh.setText(BRANCH);
        btnChiNhanh.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ChiNhanhFrame().setVisible(true);
            }
        });

        btnThongKe.setIcon(new ImageIcon(ImageHandle.getInstance().readImage("/com/resource/inferential-statistics.png"))); // NOI18N
        btnThongKe.setText(STAT);
        btnThongKe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ThongKeFrame().setVisible(true);
            }
        });

        btnMenu.setIcon(new ImageIcon(ImageHandle.getInstance().readImage("/com/resource/menu.png"))); // NOI18N
        btnMenu.setText(SELL);
        btnMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MenuFrame.getInstance().setVisible(true);
            }
        });

        btnDoUong.setIcon(new ImageIcon(ImageHandle.getInstance().readImage("/com/resource/douonga.png"))); // NOI18N
        btnDoUong.setText(MANAGE_DRINKS);
        btnDoUong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new DoUongFrame().setVisible(true);
            }
        });

        // Layout
        Container mainCon = new Container();
        mainCon.setLayout(new GridLayout(2, 0, 10, 10));
        mainCon.add(btnKhachHang);
        mainCon.add(btnMenu);
        mainCon.add(btnChiNhanh);
        mainCon.add(btnDoUong);
        mainCon.add(btnNhanVien);
        mainCon.add(btnTaiKhoan);
        mainCon.add(btnThongKe);

        Container topCon = new Container();
        topCon.setLayout(new BorderLayout());
        lbAccount = new JLabel();
        UserModel um = DataContext.getInstance().getUser();
        if (um.getPosition().contains("Khách")) {
            lbAccount.setText(GUEST);
        } else if (um.getPosition().contains("Nhân viên")) {
            lbAccount.setText(um.getTenNV() + " - " + EMPLOYEE);
            lbAccount.setIcon(ImageHandle.getInstance().readImageIcon("/com/resource/employees.png"));
        } else if (um.getPosition().contains("Quản lí")) {
            lbAccount.setText(um.getTenNV() + " - " + MANAGER);
            lbAccount.setIcon(ImageHandle.getInstance().readImageIcon("/com/resource/user.png"));
        }
        topCon.add(lbAccount, BorderLayout.LINE_END);

        setLayout(new BorderLayout());
        add(topCon, BorderLayout.PAGE_START);
        add(mainCon, BorderLayout.CENTER);
        pack();
    }

//Text
    private String TITLE;
    private String EMPLOYEE;
    private String ACCOUNT;
    private String BRANCH;
    private String SELL;
    private String STAT;
    private String CUSTOMER;
    private String MANAGE_DRINKS;
    private String MANAGER;
    private String GUEST;

    private JButton btnChiNhanh;
    private JButton btnDoUong;
    private JButton btnKhachHang;
    private JButton btnMenu;
    private JButton btnNhanVien;
    private JButton btnTaiKhoan;
    private JButton btnThongKe;
    private JLabel lbAccount;
    // End of variables declaration                   
}
