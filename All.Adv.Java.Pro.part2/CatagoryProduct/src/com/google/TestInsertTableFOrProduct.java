
package com.google;

import java.util.Date;

public class TestInsertTableFOrProduct {
    
    public static void main(String[] args) {
       Product pro = new Product();
       pro.setName("Nokia 1700");
       pro.setQuantity(30);
       pro.setUnitPrice(5000);
       pro.setTotalPrice(15000);
       pro.setPurchesDate(new Date());
       Category category = new Category();
       category.setId(1);
       pro.setCatagory(category);
       InsertProductTable.inserProTable(pro);
   
    }
    
}
