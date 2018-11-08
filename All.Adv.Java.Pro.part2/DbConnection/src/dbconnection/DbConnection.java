
package dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final String HOST  = "jdbc:oracle:thin:@localhost";
    private static final String PROT = "1521";
    private static Connection connection;
    private static String url = HOST + ":" + PROT + ":";
    public static Connection getConnection(String dbname, String dbUserName, String dbPass){
    try{
   connection = DriverManager.getConnection(url + dbname,dbUserName, dbPass);
    System.out.println("::Connected::");
    }catch(SQLException ex){
    //ex.printStackTrace();
     Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
       
    }
    return connection;
    }
   
    
    
}