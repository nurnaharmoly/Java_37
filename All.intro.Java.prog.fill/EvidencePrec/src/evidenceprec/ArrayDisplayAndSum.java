
package evidenceprec;
public class ArrayDisplayAndSum {
    public static void main(String[] args) {
        int [] arr = {3,5,7,9,4};
        int sum = 0;
        
        for(int i : arr){
        sum += i;
            System.out.print(" "+i);
        }
         System.out.println();
         System.out.println("Sum: " + sum);
    }
    
}
