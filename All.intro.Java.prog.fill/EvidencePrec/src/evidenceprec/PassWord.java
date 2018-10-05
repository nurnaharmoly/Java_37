
package evidenceprec;

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pas = sc.nextLine();
        
        if(pas.length() >=7){
            System.out.println("Valid");
        }else{
        System.out.println("Not Valid");
        }
    }
    
    
}
