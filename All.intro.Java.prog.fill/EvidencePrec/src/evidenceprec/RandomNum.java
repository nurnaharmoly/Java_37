
package evidenceprec;

import java.util.Random;

public class RandomNum {
     public static void main(String[] args) {
        Random ran = new Random(100);
        
        for(int i=1; i<=10; i++){
        int num = ran.nextInt(50)+50;
        System.out.println(num+ " ");
        }
         
    }
}
