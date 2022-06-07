/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.panel;

import com.handle.ImageHandle;
import com.utilities.CommonFont;
import com.utilities.RoundedButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hoangdp
 */
public class DinksPanel extends JPanel {

    private DinksPanel() {
    }

    public DinksPanel(String name, ImageIcon img) {
        this.imageIcon = img;
        setLayout(new BorderLayout(3, 3));

        lbImage = new JLabel(img);
        add(lbImage);

        Container c = new Container();
        c.setLayout(new GridLayout(2, 1, 3, 3));
        lbName = new JLabel(name);
        lbName.setFont(new CommonFont(14));
        lbName.setHorizontalAlignment(JLabel.CENTER);
        c.add(lbName);
        Container conBtn = new Container();

        conBtn.setLayout(new GridLayout(1, 2, 3, 3));

        btnSub = new RoundedButton("-", 30, 30, 10);
        conBtn.add(btnSub);

        btnPlus = new RoundedButton("+", 30, 30, 10);
        conBtn.add(btnPlus);
        c.add(conBtn);
        add(c, BorderLayout.PAGE_END);
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        lbImage.setIcon(ImageHandle.getInstance().resize(
                imageIcon,
                lbImage.getWidth(),
                lbImage.getHeight())
        );
        setPreferredSize(new Dimension(200, 250));
        super.paintComponent(g);
    }

    //Components
    private ImageIcon imageIcon;
    private JLabel lbImage;
    private JLabel lbName;
    private JTextField txtName;
    private RoundedButton btnPlus;
    private RoundedButton btnSub;
}
