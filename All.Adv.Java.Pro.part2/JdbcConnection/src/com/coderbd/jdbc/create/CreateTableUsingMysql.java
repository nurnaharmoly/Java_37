
package com.coderbd.jdbc.create;

import com.coderbd.jdbc.connection.MySqlDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTableUsingMysql {
    private static Connection conn = MySqlDbConnection.getConnection();
    
    public static void CreateTable(){
    String sql = "create table division(id int(11) primary key,name varchar(30))";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Create table");
        } catch (SQLException ex) {
            Logger.getLogger(CreateTableUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
