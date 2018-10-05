
package evidenceprec;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        factorial(sc.nextInt());
    }
    
    static void factorial(int n){
        BigInteger f =BigInteger.valueOf(1) ;
        
        for (int i=1; i<=n; i++ ){
         f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial is " + f);
    }
    
}
