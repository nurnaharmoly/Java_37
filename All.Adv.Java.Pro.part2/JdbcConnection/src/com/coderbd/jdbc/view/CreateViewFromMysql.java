
package com.coderbd.jdbc.view;

import com.coderbd.jdbc.connection.MySqlDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateViewFromMysql {
    private static Connection conn = MySqlDbConnection.getConnection();
    
    public static ResultSet getDataBYId(int id){
        ResultSet rs = null;
        String sql = "select * from division where id=?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CreateViewFromMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
