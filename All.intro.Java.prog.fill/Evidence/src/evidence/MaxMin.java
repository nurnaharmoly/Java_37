
package evidence;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = sc.nextInt();
        int[] arr = new  int[n];
        
        
         for (int i = 0; i< arr.length; i ++){
              arr[i] = sc.nextInt();
        }
        
         Arrays.sort(arr);
         System.out.println(" Min: " + arr[0] + " Max:" + arr[arr.length-1]);
    }
    
}
