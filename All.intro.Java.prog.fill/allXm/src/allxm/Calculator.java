
package allxm;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double fn = sc.nextInt();
        System.out.println("Enter second number: ");
        double ln = sc.nextInt();
        
        double answer = calculate(fn, ln, "/");
        System.out.println("THe answer is: " + answer);
    }
    public static double calculate(double x, double y, String z){
     double result = 0;
     
     if(z == "+"){
     result = x + y;
    }else if(z == "-"){
     result = x - y;
    }else if(z == "*"){
     result = x * y;
    }else if(z == "/"){
     result = x / y;
    }else if(z == "%"){
     result = x % y;
    }
    return result;
    }
    } 
    
    

