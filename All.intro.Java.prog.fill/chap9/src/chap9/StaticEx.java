
package chap9;
public class StaticEx {
 
    static int x = 10;
    static final int NUMBER_OF_STUDENT =12;
    
    public static void main(String[] args) {
        x = 20;
        display();
        StaticEx s = new StaticEx();
        s.display2();
        System.out.println(display());
    }
    
    public static int display(){
     return 10;
        
    }
    
    public void display2() {
        System.out.println("Hi");
    }
}
