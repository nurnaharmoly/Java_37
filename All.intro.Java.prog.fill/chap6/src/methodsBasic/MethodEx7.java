package methodsBasic;

import java.util.Scanner;

public class MethodEx7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for X: ");
        int x = sc.nextInt();
        System.out.println("Enter the value for Y: ");
        int y = sc.nextInt();

        MethodEx7 m = new MethodEx7();
        int rs = m.makeSum(x, y);
        System.out.println("Rs: " + rs);
        
        int bigSum = m.makesum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Rs bigSum: " + bigSum);

    }

    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    
   public int makesum(int n1 , int n2 , int n3 , int n4 , int n5 , int n6 , int n7 , int n8 , int n9 , int n10){
         int sum =  n1 +  n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
         return sum;
   }

}
