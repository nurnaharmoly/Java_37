
package evidence;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
  
        checkPrime(number);
    }
    static void checkPrime(int num){
       
    if(BigInteger.valueOf(num).isProbablePrime(1)){
        System.out.print(" is prime number ");
    }else{
     System.out.print(" is not prime number ");
    }
}
}