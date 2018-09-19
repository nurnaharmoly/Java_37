
package privateex;
public class EncapsulatedObjectEx {
    private static int id;
    
    public static void main(String[] args) {
       EncapsulatedObjectEx obj = new EncapsulatedObjectEx();
       id = 20;
       obj.maycar();
       obj.id = 500;
        System.out.println("ID: "+ obj.id);
    }
    private void maycar(){
        System.out.println("My Car is private");
    }
    
    void mayPlane(){
        System.out.println("My Plane is default");
    }
    protected void myAxe(){
        System.out.println("My Axc is Protected");
    }

    public static int getId() {
        return id;
    }
    
}

