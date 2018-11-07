/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;


import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class CreatTableUsingMySql {

   private static Connection conn = MySqlDbConnection.getcConnection();
   
    public static void createTable() {
        String sql = "create table division(id int(11) primary key, name varchar(30))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            
            System.out.println("Create table");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    

    
    }
    

