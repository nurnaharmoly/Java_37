
package com.corder.jdbc.view;

import com.corder.jdbc.connection.MySqlConnection;
import com.corder.jdbc.dom.stu.StudentInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListDataStudent {
     
    private static Connection conn = MySqlConnection.getConnection();
    
    public static List<StudentInfo> getStudentList(){
       List<StudentInfo> list = new ArrayList<>();
       String sql = "select * from student_table";
       
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
              list.add(new StudentInfo(rs.getInt(1),rs.getString(2),rs.getString(3)));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ListDataStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
