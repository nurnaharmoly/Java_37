/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap2;

/**
 *
 * @author User
 */
public class NumericTypeConvertion {
    public static void main(String[] args) {
        int x = 10;
        long y = x;
        System.out.println("X: " +x+ " Y: " +y);
        
        
        long p = 15;
        int q = (int)p;
        System.out.println("P: "+ p + " Q: " + q);
        double z = p;
        float r = p;
        
        double rangOfInt = Math.pow(2, 31) - 1;
        System.out.println("rangOfInt" + rangOfInt);
        
        long c = 500;
        int d = (int)c;
        System.out.println("C: " +c+ " D: "+ d);
    }
    
}
