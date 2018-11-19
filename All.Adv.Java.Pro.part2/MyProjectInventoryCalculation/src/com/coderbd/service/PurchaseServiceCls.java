
package com.coderbd.service;

import com.coderbd.connection.MySqlJdbcConnection;
import com.coderbd.domain.PurchaseCls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseServiceCls {
    
    static Connection conn = MySqlJdbcConnection.getConnection();
    
    public static void createTable(){
     
        String sql = "Create table purchase(id int auto_increment primary key, productName varchar(30) not null, productCode varchar(30) not null, qty int(11) not null, unitPrice double not null, totalPrice double not null, purchaseDate date not null, cat_id int(11) not null, foreign key(cat_id) references category(id), user_id int(11) not null, foreign key (user_id) references user(id))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Created Purchase Table");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceCls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insert(PurchaseCls pur){
     
        String sql = "insert into purchase(productName, productCode, qty, unitPrice, totalPrice, purchaseDate, cat_id, user_id) values(?,?,?,?,?,?,?,?)";
          
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pur.getProductName());
            ps.setString(2, pur.getProductCode());
            ps.setInt(3, pur.getQty());
            ps.setDouble(4, pur.getUnitPrice());
            ps.setDouble(5, pur.getTotalPrice());
            ps.setDate(6, new java.sql.Date(pur.getPurchaseDate().getTime()));
            ps.setInt(7, pur.getProductCatagoryCls().getId());
            ps.setInt(8, pur.getUserCls().getId());
            ps.executeUpdate();
            System.out.println("Data Insert into purchase Table");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceCls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
