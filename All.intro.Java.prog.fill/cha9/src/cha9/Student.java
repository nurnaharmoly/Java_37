
package cha9;

public class Student {
    int id;
    String name;

    public Student() {
        
    }
     public void setId(int id) {
        this.id = id;
    }
    
      public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(3);
        s1.setName("bali");
           System.out.println(s1);
        Student s2 = new Student(1, "Shusu");
        System.out.println(s2);
                }

   

  

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
}
