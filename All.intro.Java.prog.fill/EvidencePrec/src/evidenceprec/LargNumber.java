
package evidenceprec;

import java.util.Scanner;

public class LargNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isLargeNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
    static void isLargeNumber(int n1, int n2, int n3){
    if(n1>n2 && n1>n3){
        System.out.println(n1 +" is large number");
    }else if(n2>n1 && n2>n3){
        System.out.println(n2 +" is large number");
    }else if(n3>n2 && n3>n1){
        System.out.println(n3 +" is large number");
    }else{
        System.out.println(n1 +", "+n2 +", "+ n3 +" are all number equal");
    }
    
    }
}
