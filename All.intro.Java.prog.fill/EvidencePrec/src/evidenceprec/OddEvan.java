
package evidenceprec;

import java.util.Scanner;

public class OddEvan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isOddEvan(sc.nextInt());
    }
    
    static void isOddEvan(int num){
        if( num % 2 == 0 ){
        System.out.println("Number is Evan");
    }else{
        System.out.println("Number is Odd");
        }
    }
    
}
