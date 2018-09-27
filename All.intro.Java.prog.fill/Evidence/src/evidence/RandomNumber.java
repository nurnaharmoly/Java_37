
package evidence;

import java.util.Random;

public class RandomNumber {
    
    public static void main(String[] args) {
        Random rand = new Random(100);
        
        for (int i = 1; i <= 10; i++){
        int num = rand.nextInt(99) + 1;
            System.out.println(num + " ");
        }
    }
            
}
