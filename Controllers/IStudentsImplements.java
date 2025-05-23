package Controllers;

import Models.Students;
import dbConnection.dbContext;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class IStudentsImplements implements IStudents {

    Connection con;
    
    @Override
    public void insertStudents(Students _students) {
       try {
                con = dbContext.getConnection();

                PreparedStatement checkExistenceStmt = con.prepareStatement("SELECT COUNT(*) FROM students WHERE studentid = ?");
                checkExistenceStmt.setString(1, _students.getStudentID());
                ResultSet existenceResultSet = checkExistenceStmt.executeQuery();
                existenceResultSet.next();
                
                int count = existenceResultSet.getInt(1);
                checkExistenceStmt.close();

                if (count > 0) {
                                        
                     
                    JOptionPane.showMessageDialog(null, "Student with ID " + _students.getStudentID() + " already exists");
                    
                } else {
                    
                    int Id = 0;
                    Statement maxIdStatement = con.createStatement();
                    ResultSet maxIdResultSet = maxIdStatement.executeQuery("SELECT MAX(id) FROM students");
                    if (maxIdResultSet.next()) {
                        Id = maxIdResultSet.getInt(1);
                    }
                    maxIdResultSet.close();
                    maxIdStatement.close();

                    PreparedStatement stmt = con.prepareStatement("INSERT INTO students (id, studentid, surname, firstname, middlename, section) VALUES(?,?,?,?,?,?)");

                    Id++;

                    stmt.setInt(1, Id);
                    stmt.setString(2, _students.getStudentID());
                    stmt.setString(3, _students.getSurName());
                    stmt.setString(4, _students.getFirstName());
                    stmt.setString(5, _students.getMiddleName());
                    stmt.setString(6, _students.getSection());

                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New student added!", "Success", 1);
                    stmt.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
        }
        
    }
    
    @Override
    public void updateStudents(JTable studentTableModel, Students _students) {
        try {
            int row = studentTableModel.getSelectedRow();
            String tableValue = (studentTableModel.getModel().getValueAt(row, 0).toString());
            
            con = dbContext.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE students SET studentid=?, surname=?, firstname=?, middlename=?, section=? WHERE id=" + tableValue);
            ps.setString(1, _students.getStudentID());
            ps.setString(2, _students.getSurName());
            ps.setString(3, _students.getFirstName());
            ps.setString(4, _students.getMiddleName());
            ps.setString(5, _students.getSection());
            
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Update Successfully");
            ps.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void deleteStudents(JTable studTable) {
        try {
            con = dbContext.getConnection();
            int row = studTable.getSelectedRow();
            if (row != -1) {
                DefaultTableModel model = (DefaultTableModel) studTable.getModel();
                int idToDelete = (int) model.getValueAt(row, 0);
                model.removeRow(row);
                    
                    PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM students WHERE id = ?");
                    deleteStmt.setInt(1, idToDelete);
                    deleteStmt.executeUpdate();
                    deleteStmt.close();

                    PreparedStatement updateIdsStmt = con.prepareStatement("SET @counter = 0");
                    updateIdsStmt.executeUpdate();
                    updateIdsStmt.close();

                    PreparedStatement updateIdsStmt2 = con.prepareStatement("UPDATE students SET id = @counter := @counter + 1");
                    updateIdsStmt2.executeUpdate();
                    updateIdsStmt2.close();

                    PreparedStatement updateIdsStmt3 = con.prepareStatement("ALTER TABLE students AUTO_INCREMENT = 1");
                    updateIdsStmt3.executeUpdate();
                    updateIdsStmt3.close();

                JOptionPane.showMessageDialog(null, "Row Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to delete");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void refreshStudentsTable(DefaultTableModel studentTableModel) {
    try {
            con = dbContext.getConnection();
            Statement createTempTableStmt = con.createStatement();
            createTempTableStmt.executeUpdate("CREATE TEMPORARY TABLE temp_students SELECT * FROM students ORDER BY surname");
            createTempTableStmt.close();

            Statement dropTableStmt = con.createStatement();
            dropTableStmt.executeUpdate("DROP TABLE students");
            dropTableStmt.close();

            Statement createTableStmt = con.createStatement();
            createTableStmt.executeUpdate("CREATE TABLE students (id INT AUTO_INCREMENT PRIMARY KEY, studentid VARCHAR(255), surname VARCHAR(255), firstname VARCHAR(255), middlename VARCHAR(255), section VARCHAR(255))");
            createTableStmt.close();

            Statement insertRecordsStmt = con.createStatement();
            insertRecordsStmt.executeUpdate("INSERT INTO students (studentid, surname, firstname, middlename, section) SELECT studentid, surname, firstname, middlename, section FROM temp_students");
            insertRecordsStmt.close();

            Statement dropTempTableStmt = con.createStatement();
            dropTempTableStmt.executeUpdate("DROP TEMPORARY TABLE temp_students");
            dropTempTableStmt.close();

            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM students");

            studentTableModel.setRowCount(0);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String stdid = rs.getString("studentid");
                String stdSurname = rs.getString("surname");
                String stdFirstname = rs.getString("firstname");
                String stdMiddlename = rs.getString("middlename");
                String stdSection = rs.getString("section");

                studentTableModel.addRow(new Object[]{id, stdid, stdSurname, stdFirstname, stdMiddlename, stdSection});
            }

            state.close();

        } catch (SQLException ex) {
           ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            }

    @Override
    public Students findStudents(String studentID) {
        
        Students student = null;
        
        try {
            con = dbContext.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE studentid = ?");
            ps.setString(1, studentID);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                student = new Students();
                student.setStudentID(rs.getString("studentid"));
                student.setSurName(rs.getString("surname"));
                student.setFirstName(rs.getString("firstname"));
                student.setMiddleName(rs.getString("middlename"));
                student.setSection(rs.getString("section"));
            }

    } catch (SQLException ex) {
        ex.printStackTrace();
    }   catch (Exception ex) {
        ex.printStackTrace();
    }

    return student;
    
    }

    @Override
    public void submitStudentInfo(String studentId, String room, int pcNumber, String monitorStatus, String keyboardStatus, String mouseStatus, String internetStatus, String systemUnitStatus, String remarksValue) {
    
        try {
            con = dbContext.getConnection();

            // Prepare SQL statement for inserting student information into dashboard table
            String sql = "INSERT INTO dashboard (student_number, room, pc_number, monitor, keyboard, mouse, " +
                         "internet, system_unit, `date&time`, remarks) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            // Set parameters for the prepared statement
            preparedStatement.setString(1, studentId);
            preparedStatement.setString(2, room);
            preparedStatement.setInt(3, pcNumber);
            preparedStatement.setString(4, monitorStatus);
            preparedStatement.setString(5, keyboardStatus);
            preparedStatement.setString(6, mouseStatus);
            preparedStatement.setString(7, internetStatus);
            preparedStatement.setString(8, systemUnitStatus);

            // Get current date and time as formatted string
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.util.Date date = new java.util.Date();
            String formattedDate = formatter.format(date);
            preparedStatement.setString(9, formattedDate);

            preparedStatement.setString(10, remarksValue);

            // Execute the insert query
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "New record was inserted!");

                // Check if any component status is 'NW' and insert into damaged_computers table if necessary
                if ("NW".equals(monitorStatus) || "NW".equals(keyboardStatus) ||
                    "NW".equals(mouseStatus) || "NW".equals(internetStatus) ||
                    "NW".equals(systemUnitStatus)) {

                    // Prepare SQL statement for inserting damaged computer information
                    String insertSql = "INSERT INTO damaged_computers (room, pc_number, monitor, keyboard, mouse, internet, system_unit) " +
                                       "VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement insertStmt = con.prepareStatement(insertSql);
                    insertStmt.setString(1, room);
                    insertStmt.setInt(2, pcNumber);
                    insertStmt.setString(3, monitorStatus);
                    insertStmt.setString(4, keyboardStatus);
                    insertStmt.setString(5, mouseStatus);
                    insertStmt.setString(6, internetStatus);
                    insertStmt.setString(7, systemUnitStatus);

                    // Execute the insert query for damaged computers
                    insertStmt.executeUpdate();
                    insertStmt.close(); // Close PreparedStatement after use
                }
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert the record");
            }
        } catch (SQLException ex) {
            Logger.getLogger(IComputersImplement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(IStudentsImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRemarksByID(int id) {
        String remarks = "";
        String query = "SELECT remarks FROM dashboard WHERE `No.` = ?";

    try {
        con = dbContext.getConnection();
        PreparedStatement ps = con.prepareStatement(query) ;
        ps.setInt(1, id);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                remarks = rs.getString("remarks");
            } else {
                remarks = "No remarks found for the given No.";
            }
        }
    }   catch (Exception ex) {
            Logger.getLogger(IStudentsImplements.class.getName()).log(Level.SEVERE, null, ex);
        }

    return remarks;
    
}
    
}





