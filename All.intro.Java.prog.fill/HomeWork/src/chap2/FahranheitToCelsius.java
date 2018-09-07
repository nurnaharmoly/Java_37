/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FahranheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a dregree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenhite " + fahrenheit + " is " + celsius + " in Celsius");
    }
}
