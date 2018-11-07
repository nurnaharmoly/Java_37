
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DelectTable {
    private static Connection conn = MySqlDbConnection.getcConnection();
    
    
    public static void delectData(){
    String sql = "delete from division where id = 3";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("data delect");
        } catch (Exception e) {
        }
}
}