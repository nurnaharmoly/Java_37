
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateViwe {
    private static Connection conn = MySqlDbConnection.getcConnection();
    public static ResultSet getDataById(int id) throws SQLException{
    String sql = "select * from division where id=?";
       ResultSet rs = null;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        rs
    }
}
