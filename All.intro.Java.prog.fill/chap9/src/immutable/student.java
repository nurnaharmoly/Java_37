
package immutable;
public class student {
    
    private final int id;
    private  final String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + '}';
    }
    
    public student displayDetails(){
    student s = new student(100, "Mr bbbb");
    return s;
    }
    public void displayDetails(student s){
        System.out.println(s);
    }
    
}
