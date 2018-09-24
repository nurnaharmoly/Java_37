
package chap5;

import jdk.nashorn.internal.ir.WhileNode;

public class Sum_pg159 {
    
    public static void main(String[] args) {
        
   
    int sum =0, i=1;
    
    while (i < 10){
    
    sum = sum + i;
    i++;
        System.out.println("Sum" + sum);
    }
    System.out.println("Total Sum" + sum);
     }
}
