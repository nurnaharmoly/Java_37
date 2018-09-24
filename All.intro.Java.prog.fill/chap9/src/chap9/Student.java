
package chap9;
public class Student {

    public static void displayDetails(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int id;
    String name;

    public Student() {
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1000);
        s1.setName("Mr AAAAAAAA");
        System.out.println(s1);        
    }

    public Student(int i, String mr_Trump) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
}
