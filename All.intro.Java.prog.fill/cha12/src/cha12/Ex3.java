
package cha12;
public class Ex3 {

    public static void main(String[] args) {
        System.out.println("1111111111111");
        try {
             System.out.println(10 / 0);
             System.out.println(Integer.parseInt("TEN"));
        } catch (ArithmeticException e) {
            System.out.println("You can not divid by zero");
        } catch (NumberFormatException e) {
            System.out.println("You can not parse TEN, FIVE etc");
        }
        
        System.out.println("2222222222222");
        
              
       
      
    }
    
}
