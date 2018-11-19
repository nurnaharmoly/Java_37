
package com.coder.jdbc.insert;

import com.coder.jdbc.dom.CatagoryDomCls;
import com.coder.jdbc.dom.ProductDomCls;
import java.util.Date;

public class TestInsertDataProductTable {
    public static void main(String[] args) {
        ProductDomCls pro = new ProductDomCls();
        pro.setName("Hero 600");
        pro.setQty(4);
        pro.setUnitPrice(600000);
        pro.setTotalPrice(7000000);
        pro.setPurchesDate(new Date());
        CatagoryDomCls catagoryDomCls = new CatagoryDomCls();
        catagoryDomCls.setId(2);
        pro.setCatagoryDomCls(catagoryDomCls);
        InsertDataProductTable.insertDataProductTable(pro);
        
    }
}
