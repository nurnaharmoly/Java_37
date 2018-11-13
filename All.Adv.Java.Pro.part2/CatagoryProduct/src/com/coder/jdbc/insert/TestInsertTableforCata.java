
package com.coder.jdbc.insert;

import com.google.Category;

public class TestInsertTableforCata {
    public static void main(String[] args) {
        Category cat = new Category();
        cat.setName("Bike");
        
        InsertCatagoryTableData.insertCatagoryData(cat);
    }
}
