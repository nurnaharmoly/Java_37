
package evidenceprec;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isFactorial(sc.nextInt());
    }
    
    static void isFactorial(int number){
        BigInteger f =  BigInteger.valueOf(1);
        
        for(int i= 1; i <= number; i++){
        f = f.multiply(BigInteger.valueOf(i)); 
           
        
        }
         System.out.println(f + " Factorial ");
    
    }
}
