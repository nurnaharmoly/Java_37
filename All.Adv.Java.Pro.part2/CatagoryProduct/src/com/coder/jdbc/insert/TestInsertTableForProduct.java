
package com.coder.jdbc.insert;

import com.google.Category;
import com.google.Product;

import java.util.Date;

public class TestInsertTableForProduct {
    
    public static void main(String[] args) {
       Product pro = new Product();
       pro.setName("hero 900");
       pro.setQuantity(7);
       pro.setUnitPrice(9000);
       pro.setTotalPrice(120000);
       pro.setPurchesDate(new Date());
       Category category = new Category();
       category.setId(3);
       pro.setCatagory(category);
       InsertProductTable.inserProTable(pro);
       
   
    }
    
}
