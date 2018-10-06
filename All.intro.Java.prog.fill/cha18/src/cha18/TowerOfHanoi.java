
package cha18;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The Move are: ");
        
        moveDisks(n, 'A', 'B', 'C');
    }
    
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower){
    if(n == 1){
        System.out.println("Move disk "+ n + " from " + fromTower + " to " + toTower );
    }else{
        moveDisks(n-1, fromTower, toTower, auxTower);
        System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        moveDisks(n-1, fromTower, toTower, auxTower);
    }
    }
    
}
