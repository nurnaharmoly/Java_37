
package evidenceprec;

import java.util.Scanner;

public class OddEvan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isOddEvan(sc.nextInt());
    
    }
    
    static void isOddEvan(int num){
     if(num %2 == 0){
         System.out.println("Is Evan Number");
     }else{
     System.out.println("Is Odd Number");
     }
    
    }


}