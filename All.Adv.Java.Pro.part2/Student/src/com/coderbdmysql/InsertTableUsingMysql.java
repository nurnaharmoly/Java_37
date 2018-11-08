
package com.coderbdmysql;

import com.corderbdsqlconnection.MySqlDbConnecsion;
import com.corderbdstudent.Student;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import static jdk.nashorn.internal.runtime.Debug.id;

public class InsertTableUsingMysql {
    private static Connection conn = MySqlDbConnecsion.getConnection();
    
    public static void insertTable(Student s){
    String sql ="insert into student_table (id, name) values(?,?)";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2,s.getName() );
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(InsertTableUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
