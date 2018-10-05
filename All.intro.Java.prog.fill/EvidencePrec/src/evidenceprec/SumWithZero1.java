
package evidenceprec;

import java.util.Scanner;

public class SumWithZero1 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        
       do{
        n = sc.nextInt();
        sum += n;
       }
       while(n !=0);
        System.out.println("Sum: " + sum);
    }
}
