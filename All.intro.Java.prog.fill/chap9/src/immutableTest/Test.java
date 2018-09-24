
package immutableTest;

import chap9.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(101, "Mr Trump");
        Student.displayDetails(student);
    }
}
