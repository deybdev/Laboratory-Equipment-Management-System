package Controllers;

import Models.Students;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

interface IStudents {
    
    public void insertStudents(Students _students);
    public void updateStudents(JTable studentTableModel, Students _students);
    public void deleteStudents(JTable studentTableModel);
    public Students findStudents(String studentID);
    public void refreshStudentsTable(DefaultTableModel studentTableModel);
    public void submitStudentInfo(String studentId, String room, int pcNumber, String monitorStatus,
                                  String keyboardStatus, String mouseStatus, String internetStatus,
                                  String systemUnitStatus, String remarksValue);
    public String getRemarksByID(int id);
}
