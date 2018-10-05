
package evidenceprec;

public class ArrayDisplayAndSum1 {
    public static void main(String[] args) {
        int [] arr = {1,5,9,8,4};
        
        int sum = 0;
        for(int i : arr){
            System.out.print(i+ " ");
            sum += i;
            
        }
        System.out.println();
        System.out.println("Sum:" +sum);
    }
    
}
