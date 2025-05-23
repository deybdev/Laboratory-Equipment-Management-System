package Controllers;

import java.util.*;
import Models.ComputerCount;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public interface IComputers {

    public void refreshDashboardTable(DefaultTableModel dashboardTable);
    public void refreshAndComputeCounts(DefaultTableModel computerTable, DefaultTableModel damageTable, JLabel damageLabel, JLabel workingCount);
    public void updateComputerCount(ComputerCount _count);
    public int  getTotalComputersCount();
    public boolean deleteDamagedComputer(String pcNumber, String room);
    public boolean deleteAllDamagedComputers();
    public void decreaseWorkingCount();
    public void increaseWorkingCount();
    public void updateWorkingCountWhenDamagedEmpty();
    public void refreshComputerTable(DefaultTableModel computerTable);
    public boolean validateAdminLogin(String username, String password);
    public boolean deleteRoom (String roomToDelete);
    public boolean insertRoom(String room, int total);
    public DefaultTableModel getDashboardData();
    
    
}
