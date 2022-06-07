/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.frame;

import com.handle.ImageHandle;
import com.utilities.RoundedToggleButton;
import com.view.panel.BillPanel;
import com.view.panel.ChatPanel;
import com.view.panel.DinksPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author hoangdp
 */
public class MenuFrame extends JFrame {

    private void initChatArea() {
        leftCon = new Container();
        leftCon.setLayout(new BorderLayout(5, 5));
        leftCon.add(new ChatPanel());
        add(leftCon, BorderLayout.LINE_START);
    }

    private void initDrinkArea() {
        midCon = new Container();
        midCon.setLayout(new GridLayout());
        pMain = new JPanel(new GridLayout(0, 3, 30, 30));

        scMain = new JScrollPane(
                pMain,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        scMain.setPreferredSize(new Dimension(300, 300));
        addDrinks();

        midCon.add(scMain);
        add(midCon, BorderLayout.CENTER);
    }

    private void initBillArea() {
        rightCon = new Container();
        rightCon.setLayout(new GridLayout());
        pBill = new BillPanel();
        rightCon.add(pBill);
        add(rightCon, BorderLayout.LINE_END);
    }

    private void initTableArea() {
        botCon = new Container();
        botCon.setPreferredSize(new Dimension(100, 100));
        botCon.setLayout(new BorderLayout(10, 10));
        pTable = new JPanel(new FlowLayout(
                FlowLayout.LEFT,
                10,
                10
        ));
        addTable();
        scTable = new JScrollPane(
                pTable,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        botCon.add(scTable);
        add(botCon, BorderLayout.PAGE_END);
    }

    private void initComponents() {
        setTitle("Do uong");
        setLayout(new BorderLayout(10, 10));
        setMinimumSize(new Dimension(1500, 700));
        initChatArea();
        initDrinkArea();
        initBillArea();
        initTableArea();

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void addTable() {
        var group = new ButtonGroup();
        var x = new RoundedToggleButton("Ban 1");
        group.add(x);
        pTable.add(x);
        x = new RoundedToggleButton("Ban 2");
        group.add(x);
        pTable.add(x);

    }

    public void addDrinks() {
        try {
            var bi = ImageIO.read(getClass().getResourceAsStream("/com/resource/logo.png"));
            var imageLogo = ImageHandle.getInstance().resize(
                    bi,
                    (int) (bi.getWidth() * 0.4),
                    (int) (bi.getHeight() * 0.4)
            );
            var icon = new ImageIcon(imageLogo);
            pMain.add(new DinksPanel("Mon 0", icon));
            pMain.add(new DinksPanel("Mon 1", icon));
            pMain.add(new DinksPanel("Mon 2", icon));
            pMain.add(new DinksPanel("Mon 3", icon));
            pMain.add(new DinksPanel("Mon 4", icon));
            pMain.add(new DinksPanel("Mon 5", icon));

        } catch (IOException ex) {
            Logger.getLogger(MenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadText() {

    }

    public MenuFrame() {
        loadText();
        initComponents();
    }

    public void addNewTable() {
        String name = "aaa";
        ChatPanel cp = new ChatPanel();
        BillPanel bp = new BillPanel();
        if (list == null) {
            list = new Hashtable<>();
        }
        list.put(name, new Object[]{cp, bp});
    }

    // GUI Components
    private Container leftCon;
    private Container midCon;
    private Container rightCon;
    private Container botCon;
    private JScrollPane scTable;
    private JScrollPane scMain;
    private JScrollPane scChat;
    private JPanel pTable;
    private JPanel pMain;
    private JPanel pBill;
    private JEditorPane txtChat;

    // Variable
    Hashtable<String, Object[]> list;
}
