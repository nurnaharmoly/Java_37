
package cha9;
public class EncapsulatedObjectEx {
    
    private static  int id;

   
    
    public static void main(String[] args) {
        EncapsulatedObjectEx obj = new EncapsulatedObjectEx();
        obj.mayCar();
        id=200;
        obj.id=500;
        System.out.println(id);
    }
    private void mayCar(){
        System.out.println("My car private");
    }
         void mayPlane(){
        System.out.println("My plane default");
         }
         protected void myAxe(){
             System.out.println("My myAxe Protected");
         }

    public static int getId() {
        return id;
    }
         
  
}
