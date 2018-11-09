
package com.coderbd.jdbc.update;

import com.coderbd.jdbc.connection.MySqlDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateTableUsingMysql {
   private static Connection conn = MySqlDbConnection.getConnection();
   
   public static void updateData(){
    String sql = "update division set name = 'sylittttt' where id = 9";
     
       try {
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.executeUpdate();
           System.out.println("Update Table");
       } catch (SQLException ex) {
           Logger.getLogger(UpdateTableUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
       }
   
   }
}
