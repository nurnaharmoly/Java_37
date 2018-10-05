
package evidenceprec;

public class TwoDemintoinArray {
    public static void main(String[] args) {
        int [][] twoD = {
            {2, 3, 7},
            {2, 5, 3}
        };
         
        int sum =0;
        for(int [] oneD : twoD){
         for(int i : oneD){
             System.out.print(i+" ");
             sum += i;
         }
          System.out.println();
        }
         System.out.println("Sum: " + sum);
    }
}
