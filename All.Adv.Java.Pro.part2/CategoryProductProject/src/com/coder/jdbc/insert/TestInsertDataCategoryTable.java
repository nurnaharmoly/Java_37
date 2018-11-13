
package com.coder.jdbc.insert;

import com.coder.jdbc.dom.CatagoryDomCls;

public class TestInsertDataCategoryTable {
    public static void main(String[] args) {
        CatagoryDomCls cat = new CatagoryDomCls();
        cat.setName("Mobile");
        
        InsertDataCategoryTable.insertDataCategoryTable(cat);
    }
}
