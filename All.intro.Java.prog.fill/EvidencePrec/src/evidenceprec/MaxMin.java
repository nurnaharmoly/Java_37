
package evidenceprec;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the array length:");
         int n = sc.nextInt();
         int []arr = new int [n];
         System.out.println("Enter the array values:");
         for (int i = 0; i < arr.length; i++){
         arr[i] = sc.nextInt();
         }
         Arrays.sort(arr);
         System.out.println("Min: " + arr[0] + " Max: " + arr[arr.length -1]);
         
    }
     
}
