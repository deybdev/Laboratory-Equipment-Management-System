package Controllers;

import Models.ComputerCount;
import dbConnection.dbContext;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IComputersImplement implements IComputers {

    Connection con;
    
    @Override
    public void refreshDashboardTable(DefaultTableModel dashboardTable) {
    
        try {
            con = dbContext.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM dashboard");
            dashboardTable.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("No."),
                    rs.getString("student_number"),
                    rs.getString("room"),
                    rs.getInt("pc_number"),
                    rs.getString("monitor"),
                    rs.getString("keyboard"),
                    rs.getString("mouse"),
                    rs.getString("internet"),
                    rs.getString("system_unit"),
                    rs.getString("date&time") 
                };
                dashboardTable.addRow(row);
            }

            // Close resources
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void refreshAndComputeCounts(DefaultTableModel computerTable, DefaultTableModel damageTable, JLabel damageLabel, JLabel workingCount) {
        int totalWorkingCount = 0;
        int totalDamagedCount = 0;

        try {
            // Refresh computer table and compute total working and damaged counts
            con = dbContext.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM computer_table ORDER BY room ASC");
            computerTable.setRowCount(0);
            damageTable.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getString("room"),
                    rs.getInt("total"),
                    rs.getInt("working")
                };
                computerTable.addRow(row);

                // Update total working computers count
                totalWorkingCount += rs.getInt("working");
            }

            // Retrieve data from the "damaged_computers" table
            try {
                 Statement stmt = con.createStatement();
                 ResultSet damagedRs = stmt.executeQuery("SELECT * FROM damaged_computers");

                while (damagedRs.next()) {
                    Object[] row = {
                        damagedRs.getString("room"),
                        damagedRs.getInt("pc_number"),
                        damagedRs.getString("monitor"),
                        damagedRs.getString("keyboard"),
                        damagedRs.getString("mouse"),
                        damagedRs.getString("internet"),
                        damagedRs.getString("system_unit")
                    };
                    damageTable.addRow(row);

                    // Update total damaged computers count
                    totalDamagedCount++;
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        
            // Update damageLabel with the count of damaged computers
            damageLabel.setText(Integer.toString(totalDamagedCount));

            // Calculate total working computers
            int totalComputers = getTotalComputersCount();
            int workingComputers = totalComputers - totalDamagedCount;

            // Update workingCount label with the count of working computers
            workingCount.setText(Integer.toString(workingComputers));
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(IComputersImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public int getTotalComputersCount() {
        int totalCount = 0;

        try {
            con = dbContext.getConnection();
            Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT SUM(total) AS totalComputers FROM computer_table");

            if (rs.next()) {
                totalCount = rs.getInt("totalComputers");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

        return totalCount;
    }

    
    @Override
    public void updateComputerCount(ComputerCount _count) {
        try  {
            Connection con = dbContext.getConnection();
            PreparedStatement updateStmt = con.prepareStatement("UPDATE computer_table SET total = ? WHERE room = ?");
            updateStmt.setInt(1, _count.getCount());
            updateStmt.setString(2, _count.getRoom());

            int rowsAffected = updateStmt.executeUpdate();

            JOptionPane.showMessageDialog(null," Updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to update: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   catch (Exception ex) {
                Logger.getLogger(IComputersImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
    @Override
    public boolean deleteDamagedComputer(String pcNumber, String room) {
            try {
            Connection con = dbContext.getConnection();
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM damaged_computers WHERE pc_number = ? AND room = ?");
            deleteStmt.setString(1, pcNumber);
            deleteStmt.setString(2, room);
            int rowsDeleted = deleteStmt.executeUpdate();

            return rowsDeleted > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
      }

    @Override
    public boolean deleteAllDamagedComputers() {
        try {
            Connection con = dbContext.getConnection();
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM damaged_computers");
            int rowsDeleted = deleteStmt.executeUpdate();

            return rowsDeleted > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        
      }

    
    @Override
    public void decreaseWorkingCount() {
        try {
            con = dbContext.getConnection();
            // Group by room and count distinct pc_number to ensure each damaged PC number is only counted once per room
            String query = "SELECT room, COUNT(DISTINCT pc_number) AS damageCount FROM damaged_computers GROUP BY room";
            PreparedStatement roomDamageCountStmt = con.prepareStatement(query);
            ResultSet damageCountResult = roomDamageCountStmt.executeQuery();

            // Iterate through the result set
            while (damageCountResult.next()) {
                String room = damageCountResult.getString("room");
                int damageCount = damageCountResult.getInt("damageCount");

                // Update the working column in computer_table for the current room
                String updateQuery = "UPDATE computer_table SET working = total - ? WHERE room = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setInt(1, damageCount);
                updateStmt.setString(2, room);
                updateStmt.executeUpdate();
                updateStmt.close();
            }

            damageCountResult.close();
            roomDamageCountStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    
    @Override
    public void refreshComputerTable(DefaultTableModel computerTable) {
        try {
            
            Connection con = dbContext.getConnection();
             Statement stmt = con.createStatement(); 
            // Execute query to retrieve all data from computer_table
            ResultSet rs = stmt.executeQuery("SELECT * FROM computer_table");

            // Clear existing rows in the table model
            computerTable.setRowCount(0);

            // Iterate through the result set and add rows to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("room"),
                    rs.getInt("total"),
                    rs.getInt("working")
                    // Add more columns as needed based on the table structure
                };
                computerTable.addRow(row);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean validateAdminLogin(String username, String password) {
    
        boolean loggedIn = false;
        
        try{
        con = dbContext.getConnection();
            String query = "SELECT * FROM admin_login WHERE username=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String passwordFromDB = rs.getString("password");
                if (password.equals(passwordFromDB)) {
                    loggedIn = true;
                }
            }

            
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return loggedIn;
    }

    
    @Override
    public void increaseWorkingCount() {
        try {
            con = dbContext.getConnection();
            String query = "SELECT room, COUNT(DISTINCT pc_number) AS damageCount FROM damaged_computers GROUP BY room";
            PreparedStatement roomDamageCountStmt = con.prepareStatement(query);
            ResultSet damageCountResult = roomDamageCountStmt.executeQuery();

            while (damageCountResult.next()) {
                String room = damageCountResult.getString("room");
                int damageCount = damageCountResult.getInt("damageCount");

                PreparedStatement totalWorkingStmt = con.prepareStatement("SELECT total, working FROM computer_table WHERE room = ?");
                totalWorkingStmt.setString(1, room);
                ResultSet totalWorkingResult = totalWorkingStmt.executeQuery();

                if (totalWorkingResult.next()) {
                    int currentTotal = totalWorkingResult.getInt("total");
                    int currentWorking = totalWorkingResult.getInt("working");

                    int newWorkingCount = currentTotal - damageCount;

                    PreparedStatement updateWorkingStmt = con.prepareStatement("UPDATE computer_table SET working = ? WHERE room = ?");
                    updateWorkingStmt.setInt(1, newWorkingCount);
                    updateWorkingStmt.setString(2, room);
                    updateWorkingStmt.executeUpdate();
                    updateWorkingStmt.close();
                }

                totalWorkingResult.close();
                totalWorkingStmt.close();
            }

            damageCountResult.close();
            roomDamageCountStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    @Override
    public void updateWorkingCountWhenDamagedEmpty() {
    
        try {
            Connection con = dbContext.getConnection();
            PreparedStatement roomStmt = con.prepareStatement("SELECT DISTINCT room FROM computer_table");
            ResultSet roomResult = roomStmt.executeQuery();

            while (roomResult.next()) {
                String room = roomResult.getString("room");

                // Check if damaged_computers table is empty for the current room
                PreparedStatement countStmt = con.prepareStatement("SELECT COUNT(*) AS count FROM damaged_computers WHERE room = ?");
                countStmt.setString(1, room);
                ResultSet countResult = countStmt.executeQuery();

                if (countResult.next()) {
                    int count = countResult.getInt("count");
                    if (count == 0) {
                        // Update working count to be equal to total count
                        PreparedStatement updateStmt = con.prepareStatement("UPDATE computer_table SET working = total WHERE room = ?");
                        updateStmt.setString(1, room);
                        updateStmt.executeUpdate();
                        updateStmt.close();
                    }
                }

                countResult.close();
                countStmt.close();
            }

            roomResult.close();
            roomStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean deleteRoom(String roomToDelete) {
        
        try {
            con = dbContext.getConnection();
            PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM computer_table WHERE room = ?");
            deleteStmt.setString(1, roomToDelete);
            int rowsDeleted = deleteStmt.executeUpdate();
            deleteStmt.close();

            return rowsDeleted > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            Logger.getLogger(IComputersImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean insertRoom(String room, int total) {
    
        try {
            con = dbContext.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO computer_table (room, total)VALUES(?,?)");
            
            ps.setString(1, room);
            ps.setInt(2,total);
            
            int rowsInserted = ps.executeUpdate();
            ps.close();
            return rowsInserted > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public DefaultTableModel getDashboardData() {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{},
                new String[]{"No.", "Student No", "Room", "Pc no.", "Monitor", "Keyboard", "Mouse", "Internet", "System Unit", "Date&Time"});

        String query = "SELECT `No.`, `student_number`, `room`, `pc_number`, `monitor`, `keyboard`, `mouse`, `internet`, `system_unit`, `date&time` FROM dashboard";

        try {
            con = dbContext.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getInt("No."),
                            rs.getString("student_number"),
                            rs.getString("room"),
                            rs.getInt("pc_number"),
                            rs.getString("monitor"),
                            rs.getString("keyboard"),
                            rs.getString("mouse"),
                            rs.getString("internet"),
                            rs.getString("system_unit"),
                            rs.getString("date&time")
                    });
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(IComputersImplement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return model;
    }
    
    }

    
    

    