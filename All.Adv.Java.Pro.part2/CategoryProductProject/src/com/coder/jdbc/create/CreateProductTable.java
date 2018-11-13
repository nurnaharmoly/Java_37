
package com.coder.jdbc.create;

import com.coder.jdbc.connection.MySqlJdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateProductTable {
    
    private static Connection conn = MySqlJdbcConnection.getConnection();
    
    public static void createProductTable(){
    
        String sql = "create table Product_table(pro_id int(7) auto_increment primary key, pro_name varchar(12), qty int(10), unit_price double, total_price double, purchase_date date, cat_id int(5), foreign key(cat_id) references category_table(id))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Create Product Table Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CreateProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
