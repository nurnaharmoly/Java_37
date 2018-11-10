
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateViwe {
    private static Connection conn = MySqlDbConnection.getcConnection();
    public static ResultSet getDataById(int id) {
    String sql = "select * from division where id=?";
       ResultSet rs = null;
         
        try {
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setInt(1, id);
        } catch (SQLException ex) {
            Logger.getLogger(CreateViwe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
    }
}
