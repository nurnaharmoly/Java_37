
package chap5;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10); 
         int number2 = (int) (Math.random() * 10); 
         
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("What is " + number1 + "+" + number2 + "? ");
         int answare = input.nextInt();
         
         
         
         while ( number1 + number2 != answare){
             System.out.println("Wrong answare. Try again. What is " + number1 + " + "+number2 + "? ");
               answare = input.nextInt();
         }
         
        System.out.println("You got it!");
    }
}
