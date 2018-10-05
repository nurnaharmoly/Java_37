
package evidenceprec;
public class TowDemintionArraySum {
    
    public static void main(String[] args) {
        int [][] twoD  = {
            {2, 3, 5},
            {10, 2, 4}
        };
        int sum = 0;
        for (int [] oneD : twoD){
         for(int i : oneD){
             System.out.print(i +" ");
             sum += i;
         }
          System.out.println();
        }
       
        System.out.println("Sum: " + sum);
    }
}
