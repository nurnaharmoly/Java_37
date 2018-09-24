
package evidence;

import java.math.BigInteger;

public class PrimeNum {
    public static void main(String[] args) {
        int []x = { 23,7, 12,57,78,11};
        checkPrime(x);
    }
    
    static void checkPrime(int [] num){
    for( int number : num){
     if(BigInteger.valueOf(number).isProbablePrime(number)){
         System.out.println(number+" ");
     }
    }
        System.out.println();
    }
}
