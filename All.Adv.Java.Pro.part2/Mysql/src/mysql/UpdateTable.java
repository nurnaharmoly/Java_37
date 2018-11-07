
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateTable {
    private static Connection conn = MySqlDbConnection.getcConnection();
    
    
    public static void updateData(){
    String sql = "update division  set name='Chittagone' where id = 2";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("data update");
        } catch (Exception e) {
            e.printStackTrace();
        }
}

    static class updateData {

        public updateData() {
        }
    }
}
