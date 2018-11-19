/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coder.jdbc.list;

import com.coder.jdbc.connection.MySqlJdbcConnection;
import com.coder.jdbc.dom.CatagoryDomCls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class ListForCatagorytable {
    private  static Connection conn = MySqlJdbcConnection.getConnection();
    
    public static List<CatagoryDomCls> getCatagoryDomClses(){
    List<CatagoryDomCls> list = new ArrayList<>();
    String sql = "select * from category_table";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
              list.add(new CatagoryDomCls(rs.getInt(1),rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListForCatagorytable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
}
