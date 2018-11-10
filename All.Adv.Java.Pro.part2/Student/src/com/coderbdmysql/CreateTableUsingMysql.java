
package com.coderbdmysql;

import com.corderbdsqlconnection.MySqlDbConnecsion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTableUsingMysql {
    private static Connection conn = MySqlDbConnecsion.getConnection();
    
    public static void createTable(){
    String sql = "create table student_table (id int(11) primary key, name varchar(23))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Create Table");
        } catch (SQLException ex) {
            Logger.getLogger(CreateTableUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
