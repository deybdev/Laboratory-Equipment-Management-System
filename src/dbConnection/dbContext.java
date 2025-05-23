package dbConnection;

import java.sql.*;

public class dbContext {
    
    static Connection con;
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/lems";
    static String uName = "root";
    static String pass = "root";
    
    public static Connection getConnection() throws Exception{
    
        if(con == null) {
            Class.forName(driver);
           con = DriverManager.getConnection(url,uName,pass);
        }
        return con;
    
    }
    
}
