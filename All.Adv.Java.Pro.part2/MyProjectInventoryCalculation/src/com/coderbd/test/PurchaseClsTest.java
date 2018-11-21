
package com.coderbd.test;

import com.coderbd.domain.ProductCatagoryCls;
import com.coderbd.domain.PurchaseCls;
import com.coderbd.domain.UserCls;
import com.coderbd.service.PurchaseServiceCls;
import java.util.Date;
import java.util.List;

public class PurchaseClsTest {
    public static void main(String[] args) {
        //PurchaseServiceCls.createTable();
        
       ProductCatagoryCls pro = new ProductCatagoryCls();
        pro.setId(3);
        
        UserCls uc = new UserCls();
        uc.setId(1);
        
        PurchaseCls pc = new PurchaseCls("ASUS VivoBook S510U", "ASUSVivoBookS510U", 50, 50000, 25000000 , new Date(), pro, uc);
        PurchaseServiceCls.insertMain(pc); 
      
       
        //List<PurchaseCls> list = PurchaseServiceCls.getProductList();
        //for (PurchaseCls p : list) {
           // System.out.println(p);  
        }
    }

