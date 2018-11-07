
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertintoTable {
    private static Connection conn = MySqlDbConnection.getcConnection();
    
    
    public static void insertData(){
    String sql = "insert into division(id, name) values(1, 'Dhaka') ";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("data Insert");
        } catch (Exception e) {
        }
    }
    
    public static void insertData2(int diviId, String name) {
        
        String sql = "insert into division(id, name) values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, diviId);
            ps.setString(2, name);
            ps.executeUpdate();
            
            System.out.println("data Insert");
        } catch (Exception e) {
        }
        
    }
}
