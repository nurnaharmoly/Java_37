
package evidenceprec;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isFactorial(sc.nextInt());
        
    }
    
    
    static void isFactorial(int n){
        BigInteger f = BigInteger.valueOf(1);
    
        for(int i =1; i <= n; i++){
         f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial is " +f);
    }
    
}
