
package cha9;
public class Book {
    int id;
    String name;

    public Book() {
    }

    public Book(int id, String location) {
        this.id = id;
        this.name= location;
    }
    public static void main(String[] args) {
        Book book= new Book(302, "Menegement");
        System.out.println("ID: " + book.getId());
        System.out.println("Name: " + book.getName());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + '}';
    }
    
   
    
    
 
}
