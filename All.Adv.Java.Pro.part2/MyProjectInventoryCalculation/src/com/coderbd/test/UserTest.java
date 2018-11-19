
package com.coderbd.test;

import com.coderbd.domain.UserCls;
import com.coderbd.service.UserServiceCls;
import java.util.Date;

public class UserTest {
    public static void main(String[] args) {
        //UserServiceCls.createTable();
       UserCls uc = new UserCls("mina", "456", "User", "Akter", "Mina", "mina@gmail.com", "0774948374043", new Date(), true);
        UserServiceCls.insert(uc);

          //UserCls uc = UserServiceCls.getUserByuserName("moly", "123", true);
          //System.out.println(uc);


        
    }
}
