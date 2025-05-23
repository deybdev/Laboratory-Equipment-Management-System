package Views;

import Controllers.IComputersImplement;
import Controllers.IStudentsImplements;
import Models.ComputerCount;
import Models.Students;
import java.awt.*;
import java.util.EventObject;
import javax.swing.table.*;
import javax.swing.*;
import java.util.*;
import javax.swing.event.CellEditorListener;


public class Dashboard extends javax.swing.JFrame {

    TableRowSorter<TableModel> rowSorter;

    public Dashboard() {
        initComponents();
        refreshStudTable();
        refreshDashboardTable();
        manageCount();
        refreshComputerTable();
    }
    public void manageCount(){
    
        IComputersImplement ic = new IComputersImplement();
        
        ic.increaseWorkingCount();
        ic.decreaseWorkingCount();
        ic.updateWorkingCountWhenDamagedEmpty();
    }
    
    public void refreshStudTable() {

    IStudentsImplements studImp = new IStudentsImplements();
    DefaultTableModel studentTableModel = (DefaultTableModel) studTable.getModel();
    
    // Refresh student data in the table model
    studImp.refreshStudentsTable(studentTableModel);

    // Update the student count label based on the table model row count
    studentCount.setText(Integer.toString(studentTableModel.getRowCount()));
    }
    
    public void refreshDashboardTable(){
    
        IComputersImplement ic = new IComputersImplement();
        DefaultTableModel dashboardTable = (DefaultTableModel) dashTable.getModel();
        
        ic.refreshDashboardTable(dashboardTable);
    }
    
    public void refreshComputerTable(){
    
        DefaultTableModel damageModel = (DefaultTableModel) damagedComputers.getModel();
        DefaultTableModel totalTable = (DefaultTableModel) computerTable.getModel();
        
        IComputersImplement ic = new IComputersImplement();
        ic.refreshAndComputeCounts(totalTable, damageModel, damageCount, workingCount);
    }
    
    public void refreshWorkingColumn(){
    
        IComputersImplement computersImplement = new IComputersImplement();

            // Get the table model associated with the JTable
           DefaultTableModel tableModel = (DefaultTableModel) computerTable.getModel();

            // Call the method from IComputersImplement to refresh the computer table
            computersImplement.refreshComputerTable(tableModel);
    }
    
    private void configureTable() {
        IComputersImplement ic = new IComputersImplement();
        DefaultTableModel model = ic.getDashboardData();
        dashTable.setModel(model);

        // Set up the row sorter for filtering
        rowSorter = new TableRowSorter<>(dashTable.getModel());
        dashTable.setRowSorter(rowSorter);

        dashTable.getTableHeader().setReorderingAllowed(false);
        dashTable.setRowHeight(25);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dpb1 = new javax.swing.JPanel();
        dashButton = new javax.swing.JButton();
        dpb4 = new javax.swing.JPanel();
        manageStudentButton = new javax.swing.JButton();
        dbp6 = new javax.swing.JPanel();
        managePCButton = new javax.swing.JButton();
        dbp8 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        studentCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        workingCount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        damageCount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tabPane = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashTable = new javax.swing.JTable();
        searchDashboard = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        showRemark = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        findField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        id2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        _lastname = new javax.swing.JTextField();
        _firstname = new javax.swing.JTextField();
        _middlename = new javax.swing.JTextField();
        _section = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        damagedComputers = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();
        removeAll = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        computerTable = new javax.swing.JTable();
        updateCount = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        deleteRoom = new javax.swing.JButton();
        addRoom = new javax.swing.JButton();
        clearField = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 35, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dpb1.setBackground(new java.awt.Color(60, 63, 69));

        dashButton.setBackground(new java.awt.Color(1, 36, 36));
        dashButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        dashButton.setForeground(new java.awt.Color(255, 255, 255));
        dashButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_dashboard_layout_24px_2.png"))); // NOI18N
        dashButton.setText("DASHBOARD");
        dashButton.setBorder(null);
        dashButton.setContentAreaFilled(false);
        dashButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashButton.setDefaultCapable(false);
        dashButton.setFocusPainted(false);
        dashButton.setFocusable(false);
        dashButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        dashButton.setIconTextGap(20);
        dashButton.setMargin(new java.awt.Insets(2, 19, 3, 14));
        dashButton.setPreferredSize(new java.awt.Dimension(153, 25));
        dashButton.setRequestFocusEnabled(false);
        dashButton.setRolloverEnabled(false);
        dashButton.setVerifyInputWhenFocusTarget(false);
        dashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dpb1Layout = new javax.swing.GroupLayout(dpb1);
        dpb1.setLayout(dpb1Layout);
        dpb1Layout.setHorizontalGroup(
            dpb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpb1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(dashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        dpb1Layout.setVerticalGroup(
            dpb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpb1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(dpb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 50));

        dpb4.setBackground(new java.awt.Color(33, 35, 38));

        manageStudentButton.setBackground(new java.awt.Color(1, 36, 36));
        manageStudentButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        manageStudentButton.setForeground(new java.awt.Color(255, 255, 255));
        manageStudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_user_24px_2.png"))); // NOI18N
        manageStudentButton.setText("MANAGE STUDENTS");
        manageStudentButton.setBorder(null);
        manageStudentButton.setContentAreaFilled(false);
        manageStudentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageStudentButton.setFocusPainted(false);
        manageStudentButton.setFocusable(false);
        manageStudentButton.setIconTextGap(22);
        manageStudentButton.setPreferredSize(new java.awt.Dimension(150, 50));
        manageStudentButton.setRequestFocusEnabled(false);
        manageStudentButton.setRolloverEnabled(false);
        manageStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dpb4Layout = new javax.swing.GroupLayout(dpb4);
        dpb4.setLayout(dpb4Layout);
        dpb4Layout.setHorizontalGroup(
            dpb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpb4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(manageStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        dpb4Layout.setVerticalGroup(
            dpb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpb4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(manageStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(dpb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, 50));

        dbp6.setBackground(new java.awt.Color(33, 35, 38));
        dbp6.setForeground(new java.awt.Color(0, 51, 51));

        managePCButton.setBackground(new java.awt.Color(1, 36, 36));
        managePCButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        managePCButton.setForeground(new java.awt.Color(255, 255, 255));
        managePCButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_workstation_32px.png"))); // NOI18N
        managePCButton.setText("MANAGE COMPUTERS");
        managePCButton.setBorder(null);
        managePCButton.setContentAreaFilled(false);
        managePCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managePCButton.setFocusable(false);
        managePCButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        managePCButton.setIconTextGap(11);
        managePCButton.setMargin(new java.awt.Insets(2, 19, 3, 14));
        managePCButton.setRequestFocusEnabled(false);
        managePCButton.setRolloverEnabled(false);
        managePCButton.setVerifyInputWhenFocusTarget(false);
        managePCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePCButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dbp6Layout = new javax.swing.GroupLayout(dbp6);
        dbp6.setLayout(dbp6Layout);
        dbp6Layout.setHorizontalGroup(
            dbp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbp6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(managePCButton)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        dbp6Layout.setVerticalGroup(
            dbp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbp6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(managePCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(dbp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

        dbp8.setBackground(new java.awt.Color(33, 35, 38));

        logout.setBackground(new java.awt.Color(1, 36, 36));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_exit_24px.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.setBorder(null);
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setFocusable(false);
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logout.setIconTextGap(20);
        logout.setMargin(new java.awt.Insets(2, 19, 3, 14));
        logout.setRequestFocusEnabled(false);
        logout.setRolloverEnabled(false);
        logout.setVerifyInputWhenFocusTarget(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dbp8Layout = new javax.swing.GroupLayout(dbp8);
        dbp8.setLayout(dbp8Layout);
        dbp8Layout.setHorizontalGroup(
            dbp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbp8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        dbp8Layout.setVerticalGroup(
            dbp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbp8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(dbp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 210, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LEMS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/qcu-logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 140));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Welcome, Admin");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 700));

        jPanel2.setBackground(new java.awt.Color(224, 224, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(179, 140, 36));

        studentCount.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 0, 20)); // NOI18N
        studentCount.setForeground(new java.awt.Color(255, 255, 255));
        studentCount.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enrolled Students");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_group_32px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(studentCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(17, 17, 17))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 86));

        jPanel8.setBackground(new java.awt.Color(71, 166, 179));

        workingCount.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 0, 20)); // NOI18N
        workingCount.setForeground(new java.awt.Color(255, 255, 255));
        workingCount.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Working Computers");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_computer_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(workingCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(workingCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 86));

        jPanel9.setBackground(new java.awt.Color(23, 176, 79));

        damageCount.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 0, 20)); // NOI18N
        damageCount.setForeground(new java.awt.Color(255, 255, 255));
        damageCount.setText("0");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Damaged Computers");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_broken_computer_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(damageCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(16, 16, 16))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(damageCount)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 260, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1080, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Student No.", "Room", "Pc no.", "Monitor", "Keyboard", "Mouse", "Internet", "System Unit", "Date&Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dashTable.getTableHeader().setOpaque(false);
        dashTable.getTableHeader().setBackground(new Color(94,94,94));
        dashTable.getTableHeader().setFont(new Font("Segoe UI Emoji", Font.PLAIN,14));
        dashTable.getTableHeader().setForeground(Color.WHITE);
        dashTable.getTableHeader().setPreferredSize(new Dimension(100, 35));
        dashTable.setGridColor(new java.awt.Color(102, 102, 102));
        dashTable.setRowHeight(25);
        dashTable.setShowGrid(false);
        dashTable.getTableHeader().setOpaque(false);
        dashTable.getTableHeader().setBackground(Color.WHITE);
        dashTable.getTableHeader().setFont(new Font("Segoe UI Emoji", Font.PLAIN,14));
        dashTable.getTableHeader().setForeground(Color.BLACK);
        dashTable.getTableHeader().setPreferredSize(new Dimension(100, 25));
        dashTable.setShowHorizontalLines(true);
        configureTable();
        dashTable.setShowVerticalLines(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < dashTable.getColumnCount(); i++) {
            dashTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        jScrollPane1.setViewportView(dashTable);
        if (dashTable.getColumnModel().getColumnCount() > 0) {
            dashTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            dashTable.getColumnModel().getColumn(1).setPreferredWidth(40);
            dashTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            dashTable.getColumnModel().getColumn(3).setPreferredWidth(13);
            dashTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            dashTable.getColumnModel().getColumn(5).setPreferredWidth(30);
            dashTable.getColumnModel().getColumn(6).setPreferredWidth(30);
            dashTable.getColumnModel().getColumn(7).setPreferredWidth(30);
            dashTable.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 1080, 502));

        searchDashboard.setBackground(new java.awt.Color(51, 51, 51));
        searchDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_search_24px.png"))); // NOI18N
        searchDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchDashboard.setFocusable(false);
        searchDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDashboardActionPerformed(evt);
            }
        });
        jPanel4.add(searchDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REFRESH");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, 31));

        idField.setMargin(new Insets(0,5,0,0));
        jPanel4.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 70, 30));

        showRemark.setBackground(new java.awt.Color(51, 51, 51));
        showRemark.setForeground(new java.awt.Color(255, 255, 255));
        showRemark.setText("REMARKS");
        showRemark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showRemark.setFocusable(false);
        showRemark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRemarkActionPerformed(evt);
            }
        });
        jPanel4.add(showRemark, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 100, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 20, 30));

        findField.setMargin(new Insets(0,5,0,0));
        jPanel4.add(findField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 260, 30));

        tabPane.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studTable.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        studTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "StudentID", "Surname", "Firstname", "Middlename", "Section"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studTable.setGridColor(new java.awt.Color(102, 102, 102));
        studTable.setRowHeight(23);
        studTable.getTableHeader().setOpaque(false);
        studTable.getTableHeader().setBackground(Color.WHITE);
        studTable.getTableHeader().setFont(new Font("Segoe UI Emoji", Font.PLAIN,14));
        studTable.getTableHeader().setForeground(Color.BLACK);
        studTable.getTableHeader().setPreferredSize(new Dimension(100, 25));
        studTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studTable);
        if (studTable.getColumnModel().getColumnCount() > 0) {
            studTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            studTable.getColumnModel().getColumn(5).setPreferredWidth(7);
        }

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 264, 1080, 310));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("STUDENT MANAGEMENT");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        id1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        id1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 55, 60, 30));

        id2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel5.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 55, 60, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("-");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 59, 10, -1));

        jLabel12.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("STUDENT ID : ");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 61, -1, -1));

        jLabel13.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("LASTNAME : ");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 97, -1, -1));

        jLabel14.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("FIRSTNAME : ");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 135, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 1080, -1));

        jLabel15.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("MIDDLENAME : ");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 173, -1, -1));

        jLabel16.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("SECTION : ");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 211, -1, -1));

        _lastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _lastname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _lastname.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _lastname.setSelectionColor(new java.awt.Color(0, 51, 51));
        _lastname.setMargin(new Insets(0,5,0,0));
        _lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _lastnameActionPerformed(evt);
            }
        });
        jPanel5.add(_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 92, 250, 30));

        _firstname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _firstname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _firstname.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _firstname.setSelectionColor(new java.awt.Color(0, 51, 51));
        _firstname.setMargin(new Insets(0,5,0,0));
        _firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _firstnameActionPerformed(evt);
            }
        });
        jPanel5.add(_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 130, 250, 30));

        _middlename.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _middlename.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _middlename.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _middlename.setSelectionColor(new java.awt.Color(0, 51, 51));
        _middlename.setMargin(new Insets(0,5,0,0));
        _middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _middlenameActionPerformed(evt);
            }
        });
        jPanel5.add(_middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 168, 250, 30));

        _section.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        _section.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        _section.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        _section.setSelectionColor(new java.awt.Color(0, 51, 51));
        _section.setMargin(new Insets(0,5,0,0));
        _section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _sectionActionPerformed(evt);
            }
        });
        jPanel5.add(_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 206, 250, 30));

        addBtn.setBackground(new java.awt.Color(102, 102, 0));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_add_16px.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setFocusable(false);
        addBtn.setIconTextGap(10);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel5.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 91, 109, 32));

        findBtn.setBackground(new java.awt.Color(51, 51, 51));
        findBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_search_24px.png"))); // NOI18N
        findBtn.setBorderPainted(false);
        findBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findBtn.setFocusable(false);
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });
        jPanel5.add(findBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 55, 40, 30));

        updateBtn.setBackground(new java.awt.Color(0, 51, 51));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_update_16px.png"))); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.setFocusable(false);
        updateBtn.setIconTextGap(10);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel5.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 167, 109, 32));

        deleteBtn.setBackground(new java.awt.Color(51, 0, 51));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_16px.png"))); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.setFocusable(false);
        deleteBtn.setIconTextGap(10);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel5.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 205, 109, 32));

        clearBtn.setBackground(new java.awt.Color(51, 0, 0));
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_clear_symbol_16px.png"))); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.setFocusable(false);
        clearBtn.setIconTextGap(10);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel5.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 129, 109, 32));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_management_250px.png"))); // NOI18N
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 274, 229));

        tabPane.addTab("tab2", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        damagedComputers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Room", "PC no.", "Monitor", "Keyboard", "Mouse", "Internet", "System Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        damagedComputers.setRowHeight(25);
        damagedComputers.getTableHeader().setOpaque(false);
        damagedComputers.getTableHeader().setBackground(Color.WHITE);
        damagedComputers.getTableHeader().setFont(new Font("Segoe UI Emoji", Font.PLAIN,14));
        damagedComputers.getTableHeader().setForeground(Color.BLACK);
        damagedComputers.getTableHeader().setPreferredSize(new Dimension(100, 25));
        jScrollPane3.setViewportView(damagedComputers);
        centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < damagedComputers.getColumnCount(); i++) {
            damagedComputers.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        if (damagedComputers.getColumnModel().getColumnCount() > 0) {
            damagedComputers.getColumnModel().getColumn(0).setPreferredWidth(23);
            damagedComputers.getColumnModel().getColumn(1).setPreferredWidth(15);
        }

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 290, 730, 240));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 740, 10));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 110, -1, -1));

        removeBtn.setBackground(new java.awt.Color(0, 51, 51));
        removeBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_clear_symbol_16px.png"))); // NOI18N
        removeBtn.setText("REMOVE");
        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBtn.setFocusable(false);
        removeBtn.setIconTextGap(10);
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        jPanel6.add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 150, 35));

        removeAll.setBackground(new java.awt.Color(51, 0, 51));
        removeAll.setForeground(new java.awt.Color(255, 255, 255));
        removeAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_16px.png"))); // NOI18N
        removeAll.setText("REMOVE ALL");
        removeAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeAll.setFocusable(false);
        removeAll.setIconTextGap(10);
        removeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllActionPerformed(evt);
            }
        });
        jPanel6.add(removeAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 150, 35));

        computerTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        computerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room", "Total", "Working"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        computerTable.getTableHeader().setOpaque(false);
        computerTable.getTableHeader().setBackground(Color.WHITE);
        computerTable.getTableHeader().setFont(new Font("Segoe UI Emoji", Font.PLAIN,14));
        computerTable.getTableHeader().setForeground(Color.BLACK);
        computerTable.getTableHeader().setPreferredSize(new Dimension(100, 25));
        computerTable.setRowHeight(28);
        computerTable.setShowGrid(true);
        centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < computerTable.getColumnCount(); i++) {
            computerTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        computerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                computerTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(computerTable);
        if (computerTable.getColumnModel().getColumnCount() > 0) {
            computerTable.getColumnModel().getColumn(0).setResizable(false);
            computerTable.getColumnModel().getColumn(1).setResizable(false);
            computerTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            computerTable.getColumnModel().getColumn(2).setResizable(false);
            computerTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 411, 200));

        updateCount.setBackground(new java.awt.Color(0, 0, 51));
        updateCount.setForeground(new java.awt.Color(255, 255, 255));
        updateCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_update_16px.png"))); // NOI18N
        updateCount.setText("UPDATE");
        updateCount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateCount.setFocusable(false);
        updateCount.setIconTextGap(10);
        updateCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCountActionPerformed(evt);
            }
        });
        jPanel6.add(updateCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 110, 33));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("ROOM : ");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("TOTAL : ");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        totalTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel6.add(totalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 83, 31));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_computer_support_170px.png"))); // NOI18N
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, -1, -1));

        roomField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel6.add(roomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 83, 31));

        deleteRoom.setBackground(new java.awt.Color(153, 0, 0));
        deleteRoom.setForeground(new java.awt.Color(255, 255, 255));
        deleteRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_16px.png"))); // NOI18N
        deleteRoom.setText("DELETE");
        deleteRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteRoom.setFocusable(false);
        deleteRoom.setIconTextGap(10);
        deleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomActionPerformed(evt);
            }
        });
        jPanel6.add(deleteRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 110, 33));

        addRoom.setBackground(new java.awt.Color(102, 153, 0));
        addRoom.setForeground(new java.awt.Color(255, 255, 255));
        addRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_add_16px.png"))); // NOI18N
        addRoom.setText("ADD");
        addRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRoom.setFocusable(false);
        addRoom.setIconTextGap(10);
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });
        jPanel6.add(addRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 33));

        clearField.setBackground(new java.awt.Color(0, 102, 102));
        clearField.setForeground(new java.awt.Color(255, 255, 255));
        clearField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_update_16px.png"))); // NOI18N
        clearField.setText("CLEAR");
        clearField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearField.setFocusable(false);
        clearField.setIconTextGap(10);
        clearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldActionPerformed(evt);
            }
        });
        jPanel6.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 110, 33));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("MANAGE COMPUTERS");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_broken_computer_170px_2.png"))); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        tabPane.addTab("tab3", jPanel6);

        jPanel2.add(tabPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1080, 610));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1090, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashButtonActionPerformed
        tabPane.setSelectedIndex(0);

        dpb1.setBackground(new Color(60,63,69));
        dashButton.setBackground(new Color(60,63,69));

        dbp6.setBackground(new Color(33,35,38));
        managePCButton.setBackground(new Color(33,35,38));

        dpb4.setBackground(new Color(33,35,38));
        manageStudentButton.setBackground(new Color(33,35,38));
    }//GEN-LAST:event_dashButtonActionPerformed

    private void manageStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStudentButtonActionPerformed

        tabPane.setSelectedIndex(1);

        dpb4.setBackground(new Color(60,63,69));
        manageStudentButton.setBackground(new Color(60,63,69));

        dbp6.setBackground(new Color(33,35,38));
        managePCButton.setBackground(new Color(33,35,38));

        dpb1.setBackground(new Color(33,35,38));
        manageStudentButton.setBackground(new Color(33,35,38));
    }//GEN-LAST:event_manageStudentButtonActionPerformed

    private void managePCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePCButtonActionPerformed
        tabPane.setSelectedIndex(2);

        dbp6.setBackground(new Color(60,63,69));
        managePCButton.setBackground(new Color(60,63,69));

        dpb4.setBackground(new Color(33,35,38));
        manageStudentButton.setBackground(new Color(33,35,38));

        dpb1.setBackground(new Color(33,35,38));
        dashButton.setBackground(new Color(33,35,38));
    }//GEN-LAST:event_managePCButtonActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new LoginAdmin().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_logoutActionPerformed

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

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
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

        DefaultTableModel model = (DefaultTableModel) studTable.getModel();
        for (int row = 0; row < model.getRowCount(); row++) {
            if (model.getValueAt(row, 1).equals(studentID)) {
                studTable.setRowSelectionInterval(row, row);
                break;
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "No student found with ID: " + studentID, "Not Found", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_findBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        _lastname.setText("");
        _firstname.setText("");
        _middlename.setText("");
        _section.setText("");
        id1.setText("");
        id2.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String studID = id1.getText() + "-" + id2.getText();
        String lastname = _lastname.getText();
        String firstname = _firstname.getText();
        String middlename = _middlename.getText();
        String section = _section.getText();
        
        if(studID.isEmpty() || lastname.isEmpty() || firstname.isEmpty() || middlename.isEmpty() || section.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter All Fields");
        }else{
        Students s1 = new Students();
        
        s1.setStudentID(studID);
        s1.setSurName(lastname);
        s1.setFirstName(firstname);
        s1.setMiddleName(middlename);
        s1.setSection(section);
        
        IStudentsImplements is = new IStudentsImplements();
        
        is.insertStudents(s1);
        refreshStudTable();
        
        } 
    }//GEN-LAST:event_addBtnActionPerformed

    private void studTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studTableMouseClicked
        int selectedRow = studTable.getSelectedRow();

        if (selectedRow != -1) {
            String studentId = studTable.getValueAt(selectedRow, 1).toString();
            String surname = studTable.getValueAt(selectedRow, 2).toString();
            String firstname = studTable.getValueAt(selectedRow, 3).toString();
            String middlename = studTable.getValueAt(selectedRow, 4).toString();
            String section = studTable.getValueAt(selectedRow, 5).toString();

            String[] idParts = studentId.split("-");

            if (idParts.length == 2) {
                String id1Value = idParts[0];
                String id2Value = idParts[1];

                id1.setText(id1Value);
                id2.setText(id2Value);
            }

            _lastname.setText(surname);
            _firstname.setText(firstname);
            _middlename.setText(middlename);
            _section.setText(section);
        }
    }//GEN-LAST:event_studTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String studID = id1.getText() + "-" + id2.getText();
        String lastname = _lastname.getText();
        String firstname = _firstname.getText();
        String middlename = _middlename.getText();
        String section = _section.getText();
        
        if(studID.isEmpty() || lastname.isEmpty() || firstname.isEmpty() || middlename.isEmpty() || section.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Select Row to Update Student!");
            }else{
            Students s1 = new Students();

            s1.setStudentID(studID);
            s1.setSurName(lastname);
            s1.setFirstName(firstname);
            s1.setMiddleName(middlename);
            s1.setSection(section);

            IStudentsImplements is = new IStudentsImplements();

            is.updateStudents(studTable,s1);
            refreshStudTable();

            }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        IStudentsImplements istud = new IStudentsImplements();
        
        istud.deleteStudents(studTable);
        _lastname.setText("");
        _firstname.setText("");
        _middlename.setText("");
        _section.setText("");
        id1.setText("");
        id2.setText("");
        refreshStudTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void computerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computerTableMouseClicked
       int selectedRow = computerTable.getSelectedRow();

        if (selectedRow != -1) {
            String roomValue = computerTable.getValueAt(selectedRow, 0).toString();
            int total = (int) computerTable.getValueAt(selectedRow, 1);

            roomField.setText(roomValue);
            totalTxt.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_computerTableMouseClicked

    private void updateCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCountActionPerformed
        String room = roomField.getText();
        int comCount = Integer.parseInt(totalTxt.getText());
        
        ComputerCount com = new ComputerCount();
        
        com.setRoom(room);
        com.setCount(comCount);
        
        IComputersImplement ic = new IComputersImplement();
        ic.updateComputerCount(com);
        
        manageCount();
        refreshComputerTable();
                
    }//GEN-LAST:event_updateCountActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
     int selectedRow = damagedComputers.getSelectedRow();
    IComputersImplement ic = new IComputersImplement();

    if (selectedRow != -1) {
        String roomToDelete = damagedComputers.getValueAt(selectedRow, 0).toString();
        String pcNumberToDelete = damagedComputers.getValueAt(selectedRow, 1).toString();

        // Attempt to delete the damaged computer
        boolean deletedSuccessfully = ic.deleteDamagedComputer(pcNumberToDelete, roomToDelete);

        if (deletedSuccessfully) {
            // Update working computers count
            int workingComputersCount = ic.getTotalComputersCount();
            workingCount.setText(Integer.toString(workingComputersCount));

            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        // Refresh UI components
        manageCount();
        refreshWorkingColumn();
        refreshComputerTable();
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        refreshDashboardTable();
        manageCount();
        refreshComputerTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDashboardActionPerformed

        String searchTerm = findField.getText().trim();
        if (searchTerm.isEmpty()) {
            rowSorter.setRowFilter(null); // Show all rows if search term is empty
        } else {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchTerm));
        }
    }//GEN-LAST:event_searchDashboardActionPerformed

    private void removeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllActionPerformed
        IComputersImplement ic = new IComputersImplement();
        boolean deletionSuccessful = ic.deleteAllDamagedComputers();
        
        int choice = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to delete all damaged computers?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION
        );
       
       if (choice == JOptionPane.YES_OPTION) {
            // User confirmed to delete all damaged computers
           

            if (deletionSuccessful) {
                JOptionPane.showMessageDialog(
                    null,
                    "All damaged computers have been successfully deleted.",
                    "Deletion Successful",
                    JOptionPane.INFORMATION_MESSAGE
                );
                
            manageCount();
            refreshWorkingColumn();
            refreshComputerTable();
            } else {
            // User chose not to delete all damaged computers
            JOptionPane.showMessageDialog(
                null,
                "Deletion cancelled. No computers were deleted.",
                "Deletion Cancelled",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    } else {
            // User chose not to delete all damaged computers
            JOptionPane.showMessageDialog(
                null,
                "Deletion cancelled. No computers were deleted.",
                "Deletion Cancelled",
                JOptionPane.INFORMATION_MESSAGE
            );
        }     
    }//GEN-LAST:event_removeAllActionPerformed

    private void deleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomActionPerformed
        int selectedRow = computerTable.getSelectedRow();
        IComputersImplement ic = new IComputersImplement();

        if (selectedRow != -1) {
            String roomToDelete = computerTable.getValueAt(selectedRow, 0).toString();

            // Call the database method to delete the room
            boolean deletionSuccessful = ic.deleteRoom(roomToDelete);

            if (deletionSuccessful) {
                JOptionPane.showMessageDialog(null, "Room " + roomToDelete + " deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                refreshComputerTable();
                roomField.setText("");
                totalTxt.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Room " + roomToDelete + " not found or deletion failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteRoomActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        String room = roomField.getText();
        int total = Integer.parseInt(totalTxt.getText());
        
        
        IComputersImplement ic = new IComputersImplement();
        boolean roomInserted = ic.insertRoom(room, total);

        if (roomInserted) {
            JOptionPane.showMessageDialog(null, "Room Added Successfully");
            manageCount();
            refreshWorkingColumn();
            refreshComputerTable();
        } else {
            System.out.println("Failed to insert room.");
        }
        
        
    }//GEN-LAST:event_addRoomActionPerformed

    private void clearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldActionPerformed
        roomField.setText("");
        totalTxt.setText("");
    }//GEN-LAST:event_clearFieldActionPerformed

    private void showRemarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRemarkActionPerformed
        String idText = idField.getText();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a No.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID format. Please enter a numeric No.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        IStudentsImplements istud = new IStudentsImplements();
        String remarks = istud.getRemarksByID(id);
        JOptionPane.showMessageDialog(this, remarks, "Student Remarks", JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_showRemarkActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _firstname;
    private javax.swing.JTextField _lastname;
    private javax.swing.JTextField _middlename;
    private javax.swing.JTextField _section;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addRoom;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton clearField;
    private javax.swing.JTable computerTable;
    private javax.swing.JLabel damageCount;
    private javax.swing.JTable damagedComputers;
    private javax.swing.JButton dashButton;
    private javax.swing.JTable dashTable;
    private javax.swing.JPanel dbp6;
    private javax.swing.JPanel dbp8;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteRoom;
    private javax.swing.JPanel dpb1;
    private javax.swing.JPanel dpb4;
    private javax.swing.JButton findBtn;
    private javax.swing.JTextField findField;
    private javax.swing.JTextField id1;
    private javax.swing.JTextField id2;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton logout;
    private javax.swing.JButton managePCButton;
    private javax.swing.JButton manageStudentButton;
    private javax.swing.JButton removeAll;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField roomField;
    private javax.swing.JButton searchDashboard;
    private javax.swing.JButton showRemark;
    private javax.swing.JTable studTable;
    private javax.swing.JLabel studentCount;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateCount;
    private javax.swing.JLabel workingCount;
    // End of variables declaration//GEN-END:variables
}
