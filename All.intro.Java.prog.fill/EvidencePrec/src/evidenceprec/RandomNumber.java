
package evidenceprec;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rad = new Random(100);
        
        for(int i = 1; i<=10; i++){
            int num = rad.nextInt(60)+40;
            System.out.println(num+" ");
        }
    }
 
}
