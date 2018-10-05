
package evidenceprec;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        isPrime(sc.nextInt());
       
    }
    
    public static void isPrime(int number){
        if(BigInteger.valueOf(number).isProbablePrime(1)){
        
            System.out.println("Is prime");
        }else{
        System.out.println("Is not prime");
        }
    
    }
    
}
