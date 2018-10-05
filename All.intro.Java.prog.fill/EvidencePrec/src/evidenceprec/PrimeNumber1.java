
package evidenceprec;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isPrime(sc.nextInt());
        
    }
    
    static void isPrime(int n){
        if(BigInteger.valueOf(n).isProbablePrime(1)){
            System.out.println("Is Prime");
        }else{
        System.out.println("Is not Prime");
        }
    } 
 
}
