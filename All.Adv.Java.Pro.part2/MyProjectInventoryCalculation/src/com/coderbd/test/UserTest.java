
package com.coderbd.test;

import com.coderbd.domain.UserCls;
import com.coderbd.service.UserServiceCls;
import java.util.Date;

public class UserTest {
    public static void main(String[] args) {
        //UserServiceCls.createTable();
      // UserCls uc = new UserCls("dina", "456", "salesman", "akter", "dina", "dina@gmail.com", "0982326745", new Date(), true);
      // UserServiceCls.insert(uc);

          UserCls uc = UserServiceCls.getUserByuserName("moly", "123", true);
          System.out.println(uc);


        
    }
}
