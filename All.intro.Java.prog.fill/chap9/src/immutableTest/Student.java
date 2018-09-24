
package immutableTest;
public class Student {
    
    private final int id;
    private  final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + '}';
    }
    
    public Student displayDetails(){
    Student s = new Student(100, "Mr bbbb");
    return s;
    }
    public void displayDetails(Student s){
        System.out.println(s);
    }
    
}
