
package Views;

import Controllers.IStudentsImplements;
import Models.Students;
import java.awt.Insets;
import javax.swing.*;

public class User extends javax.swing.JFrame {

    public User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pcNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        monitor = new javax.swing.JCheckBox();
        keyboard = new javax.swing.JCheckBox();
        systemUnit = new javax.swing.JCheckBox();
        mouse = new javax.swing.JCheckBox();
        internet = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarks = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        _lastname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        _firstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        _middlename = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        _section = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pcNumber1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        monitor1 = new javax.swing.JCheckBox();
        keyboard1 = new javax.swing.JCheckBox();
        systemUnit1 = new javax.swing.JCheckBox();
        mouse1 = new javax.swing.JCheckBox();
        internet1 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarks1 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        _room = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        pcNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pcNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pcNumber.setSelectionColor(new java.awt.Color(0, 51, 51));
        pcNumber.setMargin(new Insets(0,5,0,0));
        pcNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcNumberActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PC NO.");

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText(" *");

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("COMPONENTS");

        monitor.setBackground(new java.awt.Color(255, 255, 255));
        monitor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        monitor.setForeground(new java.awt.Color(0, 0, 0));
        monitor.setText("    MONITOR");
        monitor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        monitor.setFocusable(false);
        monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorActionPerformed(evt);
            }
        });

        keyboard.setBackground(new java.awt.Color(255, 255, 255));
        keyboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keyboard.setForeground(new java.awt.Color(0, 0, 0));
        keyboard.setText("    KEYBOARD");
        keyboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        keyboard.setFocusable(false);
        keyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyboardActionPerformed(evt);
            }
        });

        systemUnit.setBackground(new java.awt.Color(255, 255, 255));
        systemUnit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        systemUnit.setForeground(new java.awt.Color(0, 0, 0));
        systemUnit.setText("   SYSTEM UNIT");
        systemUnit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        systemUnit.setFocusable(false);
        systemUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemUnitActionPerformed(evt);
            }
        });

        mouse.setBackground(new java.awt.Color(255, 255, 255));
        mouse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mouse.setForeground(new java.awt.Color(0, 0, 0));
        mouse.setText("    MOUSE");
        mouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mouse.setFocusable(false);
        mouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouseActionPerformed(evt);
            }
        });

        internet.setBackground(new java.awt.Color(255, 255, 255));
        internet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        internet.setForeground(new java.awt.Color(0, 0, 0));
        internet.setText("   INTERNET");
        internet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        internet.setFocusable(false);
        internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("REMARKS");

        remarks.setColumns(20);
        remarks.setRows(5);
        remarks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        remarks.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(remarks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Form");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 30, 400));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("STUDENT NO.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        id1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id1.setInheritsPopupMenu(true);
        id1.setSelectionColor(new java.awt.Color(0, 51, 51));
        _firstname.setMargin(new Insets(0,5,0,0));
        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText(" *");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 20));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id2.setSelectionColor(new java.awt.Color(0, 51, 51));
        _firstname.setMargin(new Insets(0,5,0,0));
        id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id2ActionPerformed(evt);
            }
        });
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 70, 30));

        find.setBackground(new java.awt.Color(51, 51, 51));
        find.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        find.setForeground(new java.awt.Color(255, 255, 255));
        find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_search_24px.png"))); // NOI18N
        find.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        find.setFocusable(false);
        find.setIconTextGap(15);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        jPanel1.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 50, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText(" *");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 30, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("SURNAME ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

        _lastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _lastname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _lastname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _lastname.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _lastname.setSelectionColor(new java.awt.Color(102, 102, 255));
        _lastname.setMargin(new Insets(0,5,0,0));
        _lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 270, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("FIRST NAME");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText(" *");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 30, 20));

        _firstname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _firstname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _firstname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _firstname.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _firstname.setSelectionColor(new java.awt.Color(102, 102, 255));
        _firstname.setMargin(new Insets(0,5,0,0));
        _firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 270, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("MIDDLE NAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 20));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("  *");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 20, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ROOM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, 20));

        _middlename.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _middlename.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _middlename.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _middlename.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _middlename.setSelectionColor(new java.awt.Color(102, 102, 255));
        _middlename.setMargin(new Insets(0,5,0,0));
        _middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _middlenameActionPerformed(evt);
            }
        });
        jPanel1.add(_middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 270, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText(" *");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 20, 20));

        _section.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _section.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _section.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _section.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _section.setSelectionColor(new java.awt.Color(102, 102, 255));
        _section.setMargin(new Insets(0,5,0,0));
        _section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _sectionActionPerformed(evt);
            }
        });
        jPanel1.add(_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SECTION ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 20));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText(" *");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 20, 20));

        pcNumber1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pcNumber1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pcNumber1.setSelectionColor(new java.awt.Color(0, 51, 51));
        pcNumber.setMargin(new Insets(0,5,0,0));
        pcNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcNumber1ActionPerformed(evt);
            }
        });
        jPanel1.add(pcNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 70, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("PC NO.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 20));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText(" *");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 20, 20));

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("COMPONENTS");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        monitor1.setBackground(new java.awt.Color(255, 255, 255));
        monitor1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        monitor1.setForeground(new java.awt.Color(0, 0, 0));
        monitor1.setText("    MONITOR");
        monitor1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        monitor1.setFocusable(false);
        monitor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitor1ActionPerformed(evt);
            }
        });
        jPanel1.add(monitor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        keyboard1.setBackground(new java.awt.Color(255, 255, 255));
        keyboard1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keyboard1.setForeground(new java.awt.Color(0, 0, 0));
        keyboard1.setText("    KEYBOARD");
        keyboard1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        keyboard1.setFocusable(false);
        keyboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyboard1ActionPerformed(evt);
            }
        });
        jPanel1.add(keyboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        systemUnit1.setBackground(new java.awt.Color(255, 255, 255));
        systemUnit1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        systemUnit1.setForeground(new java.awt.Color(0, 0, 0));
        systemUnit1.setText("   SYSTEM UNIT");
        systemUnit1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        systemUnit1.setFocusable(false);
        systemUnit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemUnit1ActionPerformed(evt);
            }
        });
        jPanel1.add(systemUnit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        mouse1.setBackground(new java.awt.Color(255, 255, 255));
        mouse1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mouse1.setForeground(new java.awt.Color(0, 0, 0));
        mouse1.setText("    MOUSE");
        mouse1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mouse1.setFocusable(false);
        mouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouse1ActionPerformed(evt);
            }
        });
        jPanel1.add(mouse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        internet1.setBackground(new java.awt.Color(255, 255, 255));
        internet1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        internet1.setForeground(new java.awt.Color(0, 0, 0));
        internet1.setText("   INTERNET");
        internet1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        internet1.setFocusable(false);
        internet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internet1ActionPerformed(evt);
            }
        });
        jPanel1.add(internet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("(OPTIONAL)");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, 20));

        remarks1.setColumns(20);
        remarks1.setRows(5);
        remarks1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        remarks1.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(remarks1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 270, 110));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("REMARKS");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, 20));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("STUDENT INFORMATION");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("COMPUTER INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 80));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 90, 30));

        _room.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _room.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _room.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _room.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _room.setSelectionColor(new java.awt.Color(102, 102, 255));
        _room.setMargin(new Insets(0,5,0,0));
        _room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _roomActionPerformed(evt);
            }
        });
        jPanel1.add(_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 190, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CHECK ALL");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 320, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id2ActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        
        String id1Value = id1.getText();
        String id2Value = id2.getText();
        String studentID = id1Value + "-" + id2Value;

    if (studentID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a student ID", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    IStudentsImplements studentsImpl = new IStudentsImplements();
    Students foundStudent = studentsImpl.findStudents(studentID);

    if (foundStudent != null) {
        _lastname.setText(foundStudent.getSurName());
        _firstname.setText(foundStudent.getFirstName());
        _middlename.setText(foundStudent.getMiddleName());
        _section.setText(foundStudent.getSection());
    }else {
        JOptionPane.showMessageDialog(null, "No student found with ID: " + studentID, "Not Found", JOptionPane.WARNING_MESSAGE);
    }
        
    }//GEN-LAST:event_findActionPerformed

    private void _lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__lastnameActionPerformed

    private void _firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__firstnameActionPerformed

    private void _middlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__middlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__middlenameActionPerformed

    private void _sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__sectionActionPerformed

    private void pcNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcNumberActionPerformed

    private void monitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorActionPerformed
    }//GEN-LAST:event_monitorActionPerformed

    private void keyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyboardActionPerformed
    }//GEN-LAST:event_keyboardActionPerformed

    private void systemUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemUnitActionPerformed
    }//GEN-LAST:event_systemUnitActionPerformed

    private void mouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mouseActionPerformed

    private void internetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetActionPerformed
    }//GEN-LAST:event_internetActionPerformed

    private void pcNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcNumber1ActionPerformed

    private void monitor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitor1ActionPerformed
    }//GEN-LAST:event_monitor1ActionPerformed

    private void keyboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyboard1ActionPerformed
    }//GEN-LAST:event_keyboard1ActionPerformed

    private void systemUnit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemUnit1ActionPerformed
    }//GEN-LAST:event_systemUnit1ActionPerformed

    private void mouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mouse1ActionPerformed

    private void internet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internet1ActionPerformed
    }//GEN-LAST:event_internet1ActionPerformed

    private void _roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__roomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__roomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
    String studentId = id1.getText() + "-" + id2.getText();
    String surname = _lastname.getText();
    String firstname = _firstname.getText();
    String middlename = _middlename.getText();
    String section = _section.getText();
    String room = _room.getText(); // Assuming _room is a text field
    int pcNumber = Integer.parseInt(pcNumber1.getText());
    String remarksValue = remarks1.getText();

    // Determine checkbox statuses
    String systemUnitStatus = systemUnit1.isSelected() ? "W" : "NW";
    String internetStatus = internet1.isSelected() ? "W" : "NW";
    String mouseStatus = mouse1.isSelected() ? "W" : "NW";
    String keyboardStatus = keyboard1.isSelected() ? "W" : "NW";
    String monitorStatus = monitor1.isSelected() ? "W" : "NW";

    if (studentId.isEmpty() || surname.isEmpty() || firstname.isEmpty() || middlename.isEmpty() ||
        section.isEmpty() || room.isEmpty() || pcNumber <= 0) {
        JOptionPane.showMessageDialog(null, "Please fill out all required fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    IStudentsImplements csi = new IStudentsImplements();
    csi.submitStudentInfo(studentId, room, pcNumber, monitorStatus, keyboardStatus,
                          mouseStatus, internetStatus, systemUnitStatus, remarksValue);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        monitor1.setSelected(true);
        keyboard1.setSelected(true);
        systemUnit1.setSelected(true);
        mouse1.setSelected(true);
        internet1.setSelected(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _firstname;
    private javax.swing.JTextField _lastname;
    private javax.swing.JTextField _middlename;
    private javax.swing.JTextField _room;
    private javax.swing.JTextField _section;
    private javax.swing.JButton find;
    private javax.swing.JTextField id1;
    private javax.swing.JTextField id2;
    private javax.swing.JCheckBox internet;
    private javax.swing.JCheckBox internet1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox keyboard;
    private javax.swing.JCheckBox keyboard1;
    private javax.swing.JCheckBox monitor;
    private javax.swing.JCheckBox monitor1;
    private javax.swing.JCheckBox mouse;
    private javax.swing.JCheckBox mouse1;
    private javax.swing.JTextField pcNumber;
    private javax.swing.JTextField pcNumber1;
    private javax.swing.JTextArea remarks;
    private javax.swing.JTextArea remarks1;
    private javax.swing.JCheckBox systemUnit;
    private javax.swing.JCheckBox systemUnit1;
    // End of variables declaration//GEN-END:variables
}
