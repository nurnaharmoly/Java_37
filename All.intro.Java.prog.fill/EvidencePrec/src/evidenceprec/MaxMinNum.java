
package evidenceprec;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
     
        for(int i =0; i<arr.length; i++){
        arr [i] = sc.nextInt();
    }
        Arrays.sort(arr);
        System.out.println("Min: "+ arr[0] + " Max: " + arr[arr.length-1]);
     }
}
