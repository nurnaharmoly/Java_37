
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDbConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "bd";
    private static final String URL = HOST + "/" + DBNAME;
    private static Connection con = null;
    
    public static Connection getcConnection(){
    
        try {
            con = DriverManager.getConnection(URL, "root", "1234");
            System.out.println(":: Connection ::");
        } catch (Exception e) {
            e.printStackTrace();
        }
    return con;
    
    }
    public static void main(String[] args) {
        getcConnection();
    }
}
