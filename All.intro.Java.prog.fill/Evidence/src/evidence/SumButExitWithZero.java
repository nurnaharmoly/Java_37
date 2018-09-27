
package evidence;

import java.util.Scanner;

public class SumButExitWithZero {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new  Scanner(System.in);
        int n =0;
        System.out.println("Please enter a Num: ");
        
        do{
        n = sc.nextInt();
        sum += n;
        }while (n != -1);
        sum += 1;
        System.out.println("Sum: " + sum);
    }
    
}
