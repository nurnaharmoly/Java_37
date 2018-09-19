
package chap9;
public class Animal {
    
    String name;
    String color;
    double age;
    String race;

    public Animal() {
    }

    public Animal(String name, String color, double age, String race) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }
    
    void bite(){
        System.out.println("Animal can Bite");    
    }
    
     void eat(){
        System.out.println("Animal can Bite");    
    }
     
      void sleep(){
        System.out.println("Animal can Bite");    
    }
      
       void run(){
        System.out.println("Animal can Bite");    
    }
       
        void walk(){
        System.out.println("Animal can Bite");    
    }
    
    public static void main(String[] args) {
     Animal animal = new Animal();
     
     Animal animal2 = new Animal();
     Animal animal9034 = new Animal("Pappy","black", 6.7, "gazipur");
        System.out.println(animal9034);
        System.out.println(animal);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }
    
}
