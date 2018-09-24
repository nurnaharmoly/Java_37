
package arrayList;

import java.util.ArrayList;
import java.util.List;



public class Test {
    public static void main(String[] args) {
        
        Student s1 = new Student(1, "Joly");
         Student s2 = new Student(2, "Poly");
          Student s3 = new Student(3, "Koly");
           Student s4= new Student(4, "Moly");
           List<Student> students = new ArrayList();
           
           students.add(s1);
           students.add(s2);
           students.add(s3);
           students.add(s4);
           students.add(new Student(5, "yoly"));
           
           for(Student s: students){
               System.out.println(s);
           }
    }
}
