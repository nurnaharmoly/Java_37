
package com.coderbd.jdbc.insert;

import com.coderbd.jdbc.connection.MySqlDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataUsingMysql {
    private static Connection conn = MySqlDbConnection.getConnection();
    
    public static void insertTable() {
        String sql = "insert into division(id, name) values(1, 'Dhaka')";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Insert data into table");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insertTable2(int diviId, String name){
      String sql = "insert into division(id, name) values(?,?)";
      
     
        try {
           PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, diviId);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Insert data into table");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    
    
    
    }
}
