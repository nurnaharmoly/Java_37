package chap2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class DataType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte byteValue = input.nextByte();
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2.5, 2));
        System.out.println(Math.pow(2.5, -2));
    }
}
