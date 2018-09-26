
package evidence;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        getFactorials(5);
    }
    static void getFactorials(int n){
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++){
        f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
 
}
