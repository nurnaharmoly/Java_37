
package evidence;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        getFactorial(num);
       
    }
    static void getFactorial(int n){
         BigInteger f = BigInteger.valueOf(1);
         for (int i = 1; i<=n; i++){
         f = f.multiply(BigInteger.valueOf(i));
         
         
         }
         System.out.println(f);
    }
    
}
