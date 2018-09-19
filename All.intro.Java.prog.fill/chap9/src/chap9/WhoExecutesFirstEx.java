
package chap9;
public class WhoExecutesFirstEx {
    
    int x = 10;

    public WhoExecutesFirstEx() {
        System.out.println("I am from constructor" + x);
    }
    
    public static void main(String[] args) {
        System.out.println("I am from main Method");
    }
    
    static {
        System.out.println("I am static block");
    }
}
