
package com.coder.jdbc.create;

import com.coder.jdbc.connection.MySqlJdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateCategoryTable {
    private static Connection conn = MySqlJdbcConnection.getConnection();
    
    public static void createCategoryTable(){
     
        String sql = "create table category_table(id int(5) auto_increment primary key, name varchar(10))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Create A Table Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CreateCategoryTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
