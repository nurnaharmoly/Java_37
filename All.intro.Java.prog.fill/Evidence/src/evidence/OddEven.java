
package evidence;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isOddEven(sc.nextInt());
    }
    
    static void  isOddEven(int num){
    if (num == 0){
            System.out.println(num + "is zero");
    } else {
    if (num == 0){
        System.out.println(num+" is even number");
    } else {
        System.out.println(num+" is odd number");
    }
    }
    }
            
    
}
