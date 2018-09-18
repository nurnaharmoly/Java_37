
package cha9;
// clase is a bule print of object

public class Animal {
    
    // Animal object's State
    String name;
    String coler;
    double age;
    String race;
               
     public Animal() {
    }

    public Animal(String name, String coler, String race) {
        this.name = name;
        this.coler = coler;
        this.race = race;
    }

    
    
    //// Animal object's Behavior
    
    void bite(){
        System.out.println("Animal  can bite");
   }
    
    void sleep(){
   }
    
     void run(){
   }
    public static void main(String[] args) {
       Animal a1 = new Animal() ;
        Animal tommy = new Animal() ;
         Animal animal1300 = new Animal("Nova", "black", "asia") ;
        System.out.println(animal1300);
       
       
    }

    

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", coler=" + coler + ", age=" + age + ", race=" + race + '}';
    }

   
    
}
