
package evidenceprec;

import java.util.Scanner;

public class DiscountToPaid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int x = sc.nextInt();
        
        if(x >=100 && x<300){
            System.out.println("Amount to Paid: " + (x-x*.10));
        }else if(x >=300 && x<700){
            System.out.println("Amount to Paid: " + (x-x*.15));
        }else if(x >=700 && x<1000){
            System.out.println("Amount to Paid: " + (x-x*.20));
        }else if(x >=1000){
            System.out.println("Amount to Paid: " + (x-x*.25));
        }else{
            System.out.println("No discount applied, Amount to paid: " + x);
        }
        
    }
    
}
