/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.view.frame;

import com.handle.ImageHandle;
import com.handle.LanguageHandle;
import com.models.DataContext;
import com.models.DoUongModel;
import com.utilities.RoundedToggleButton;
import com.view.panel.BillPanel;
import com.view.panel.ChatPanel;
import com.view.panel.DinksPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;
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
        leftCon.setPreferredSize(new Dimension(400, 0));
        add(leftCon, BorderLayout.LINE_START);
    }

    private void initDrinkArea() {
        midCon = new Container();
        midCon.setLayout(new GridLayout());
        pMain = new JPanel(new GridLayout(0, 3, 30, 30));
        loadDrinks();
        scMain = new JScrollPane(
                pMain,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        scMain.getVerticalScrollBar().setUnitIncrement(50);
        scMain.setPreferredSize(new Dimension(300, 300));
        midCon.add(scMain);
        add(midCon, BorderLayout.CENTER);
    }

    private void initBillArea() {
        rightCon = new Container();
        rightCon.setLayout(new GridLayout());
        rightCon.setPreferredSize(new Dimension(400, 0));
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
        scTable = new JScrollPane(
                pTable,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        botCon.add(scTable);
        add(botCon, BorderLayout.PAGE_END);
    }

    private void initComponents() {
        setTitle(TITLE);
        setLayout(new BorderLayout(10, 10));
        setMinimumSize(new Dimension(1500, 700));
        initChatArea();
        initDrinkArea();
        initBillArea();
        initTableArea();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addTable(String name) {
        if (group == null) {
            group = new ButtonGroup();
        }

        ChatPanel cp = new ChatPanel(name);
        BillPanel bp = new BillPanel(name);
        if (list == null) {
            list = new Hashtable<>();
        }
        list.put(TABLE + name, new Object[]{cp, bp});

        RoundedToggleButton x = new RoundedToggleButton(name);
        x.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                changTable(TABLE + name);
            }
        });
        group.add(x);
        pTable.add(x);
        revalidate();
        repaint();
    }

    private void changTable(String name) {
        currentTable = name;
        leftCon.removeAll();
        leftCon.add((ChatPanel) list.get(name)[0]);

        rightCon.removeAll();
        rightCon.add((BillPanel) list.get(name)[1]);
        revalidate();
        repaint();
    }

    public void addDrinks(DoUongModel du) {
        pMain.add(new DinksPanel(
                du.getMaDU(),
                du.getTenDU(),
                du.getHinhAnh()
        ));        
    }

    private void loadText() {
        TITLE = LanguageHandle.getInstance().getValue("Menu", "TITLE");
        TABLE = LanguageHandle.getInstance().getValue("Menu", "TABLE");
    }

    private void sub(int id) {
        BillPanel bp = (BillPanel) list.get(currentTable)[1];
        bp.addDrinks(DataContext.getInstance()
                .getDoUongs()
                .stream()
                .filter(du -> du.getMaDU() == id)
                .findFirst()
                .get()
        );
    }

    private void plus(int id) {

    }

    private void loadDrinks() {
        for (int i = 0; i < DataContext.getInstance().getDoUongs().size(); i++) {
            addDrinks(DataContext.getInstance().getDoUongs().get(i));
        }
    }

    private MenuFrame() {
        loadText();
        initComponents();
        addTable("6");        
    }

    public static synchronized MenuFrame getInstance() {
        if (_instance == null) {
            _instance = new MenuFrame();
        }
        return _instance;
    }

    private static MenuFrame _instance;
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
    private Hashtable<String, Object[]> list;
    private ButtonGroup group;
    private String currentTable;

    //Text 
    private String TITLE;
    private String TABLE;
}
