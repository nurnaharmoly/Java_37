
package com.coder.jdbc.insert;

import com.coder.jdbc.connection.MySqlJdbcConnection;
import com.coder.jdbc.dom.ProductDomCls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDataProductTable {
    
    private static Connection conn = MySqlJdbcConnection.getConnection();
    
    public static void insertDataProductTable(ProductDomCls p){
        
        String sql = "insert into product_table(Pro_name, qty, unit_price, total_price, purchase_date, cat_id)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getQty());
            ps.setDouble(3, p.getUnitPrice());
            ps.setDouble(4, p.getTotalPrice());
            ps.setDate(5, new java.sql.Date(p.getPurchesDate().getTime()));
            ps.setInt(6, p.getCatagoryDomCls().getId());
            ps.executeUpdate();
            System.out.println("Insert Data To Product Table");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDataProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
