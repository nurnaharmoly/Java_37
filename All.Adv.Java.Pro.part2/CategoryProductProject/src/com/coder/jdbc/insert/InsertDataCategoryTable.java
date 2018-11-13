
package com.coder.jdbc.insert;

import com.coder.jdbc.connection.MySqlJdbcConnection;
import com.coder.jdbc.dom.CatagoryDomCls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataCategoryTable {
     
    private static Connection conn = MySqlJdbcConnection.getConnection();
    
    public static void insertDataCategoryTable(CatagoryDomCls c){
          
        String sql = "insert into category_table(name) values(?)";
         
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.executeUpdate();
            System.out.println("Insert Data To Category Table");
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataCategoryTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
