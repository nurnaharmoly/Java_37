
package evidenceprec;

import java.util.Scanner;

public class SumWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        
         
        int sum = 0;
        int n = 0;
        
        do{
         sum +=n;
         n = sc.nextByte();
        }
        while(n != 0);
        System.out.println("Sum: "+ sum);  
    }
    
    
}
