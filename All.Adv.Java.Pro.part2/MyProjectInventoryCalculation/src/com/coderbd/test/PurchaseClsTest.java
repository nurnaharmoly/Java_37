
package com.coderbd.test;

import com.coderbd.domain.ProductCatagoryCls;
import com.coderbd.domain.PurchaseCls;
import com.coderbd.domain.UserCls;
import com.coderbd.service.PurchaseServiceCls;
import java.util.Date;

public class PurchaseClsTest {
    public static void main(String[] args) {
        //PurchaseServiceCls.createTable();
        
        ProductCatagoryCls pro = new ProductCatagoryCls();
        pro.setId(3);
        
        UserCls uc = new UserCls();
        uc.setId(1);
        
        PurchaseCls pc = new PurchaseCls("HP 6000 Laptop", "HP6000", 10, 50000, 500000 , new Date(), pro, uc);
        PurchaseServiceCls.insert(pc);
    }
}
