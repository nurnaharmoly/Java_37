
package com.coderbd.jdbc.delete;

import com.coderbd.jdbc.connection.MySqlDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteDataUsingMySql {
    private static Connection conn = MySqlDbConnection.getConnection();
    
    public static void deleteData(){
      String sql = "delete from division where id = 9";
      
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Delect data");
        } catch (SQLException ex) {
            Logger.getLogger(DeleteDataUsingMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
