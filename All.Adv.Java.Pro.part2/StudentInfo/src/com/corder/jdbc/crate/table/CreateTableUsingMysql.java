
package com.corder.jdbc.crate.table;

import com.corder.jdbc.connection.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTableUsingMysql {
    
    private static Connection conn = MySqlConnection.getConnection();
    
    public static void createTable(){
    
        String sql = "create table student_table(id int(7) primary key, name varchar(20), email varchar(23))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Create table Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CreateTableUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
