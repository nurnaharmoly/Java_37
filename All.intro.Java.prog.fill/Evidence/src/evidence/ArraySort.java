
package evidence;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
       int[] arr = {4, 5, 1, 8, 6, 9};
       for (int i : arr){
        System.out.print(i + " ");
       }
       System.out.println();
        System.out.println("Sorter Array or Assending Order");
        
        int[] a = {4, 5, 1, 8, 6, 9};
        Arrays.sort(a);
        for (int j : a){
            System.out.print(j +" ");
        }
        
        System.out.println("Array decending Order");
        int[] b = {4, 5, 1, 8, 6, 9};
        Arrays.sort(b);
        for (int i = b.length -1; i>=0; i--){
            System.out.print(b[i]+" ");
        }
        System.out.println("Array decending Order using Reverse");
        Integer[] c = {4, 5, 1, 8, 6, 9};
        Arrays.sort(c);
        Collections.reverse(Arrays.asList(c));
        System.out.println("Modifiear" + Arrays.toString(c));
        
        
        
        
    }

}
