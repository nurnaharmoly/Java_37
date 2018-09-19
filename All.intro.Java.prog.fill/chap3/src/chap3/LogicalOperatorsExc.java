package chap3;

import java.util.Scanner;

public class LogicalOperatorsExc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Yes 2");
        } else {
            System.out.println("No 2");
        }
        if (num % 2 == 0 ^ num % 3 == 0) {
            System.out.println("Yes 3");
        } else {
            System.out.println("No 3");
        }
    }
}
