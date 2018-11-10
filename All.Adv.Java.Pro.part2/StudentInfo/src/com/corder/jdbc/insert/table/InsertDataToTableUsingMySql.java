
package com.corder.jdbc.insert.table;

import com.corder.jdbc.connection.MySqlConnection;
import com.corder.jdbc.dom.stu.StudentInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataToTableUsingMySql {
    
    private static Connection conn = MySqlConnection.getConnection();
    
    public static void insertDataTOTable(StudentInfo s){
     
        String sql = "insert into student_table(id, name, email) values(?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());
            ps.executeUpdate();
            System.out.println("Insert Data Successful");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataToTableUsingMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
