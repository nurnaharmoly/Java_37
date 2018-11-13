
package com.coder.jdbc.insert;

import com.coder.jdbc.dom.ProductDomCls;
import java.util.Date;

public class TestInsertDataProductTable {
    public static void main(String[] args) {
        ProductDomCls pro = new ProductDomCls();
        pro.setName("Vivo");
        pro.setQty(5);
        pro.setUnitPrice(200000);
        pro.setTotalPrice(1000000);
        pro.setPurchesDate(new Date());
        
    }
}
