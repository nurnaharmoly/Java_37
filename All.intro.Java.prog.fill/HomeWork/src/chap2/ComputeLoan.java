package chap2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ComputeLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, e.g., 7.25%: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter the number of year as an integer, e.g., 5: ");
        int numberOfYear = input.nextInt();

        System.out.println("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12));
        double totalpayment = monthlyPayment * numberOfYear * 12;

        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100);
        System.out.println("The total payment is $" + (int) (totalpayment * 100) / 100);
    }
}
