
package allxm;

import java.util.Scanner;

public class MakeSum {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int in = sc.nextInt();
      
        System.out.println("Enter Second Number");
        int in2= sc.nextInt();
        
        System.out.println(" sum: " + (makeSum(in, in2)));
    }
    public static int makeSum( int n1, int n2){{
      
     int sum = 0 ;
     if (n1 > 0 && n2 > 0){
         
      if(n1 > n2){
           for(int i= n1; i>=n2; i--){
           sum+=i;
           }
      }else if (n1< n2){
           for(int i=n1 ; i<=n2; i++){}
       sum = n1;
      }
     }else{ 
      sum = -1;
     }
     return sum;
    } 
    } 
    
}
