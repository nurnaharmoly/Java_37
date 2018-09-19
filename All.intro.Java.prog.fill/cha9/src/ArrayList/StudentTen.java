package ArrayList;

import cha9.Studenteee;
import java.util.ArrayList;
import java.util.List;

public class StudentTen {

    public static void main(String[] args) {

        Studenteee s1 = new Studenteee(1, "jiya");
        Studenteee s2 = new Studenteee(2, "hiya");
        Studenteee s3 = new Studenteee(3, "piya");
        Studenteee s4 = new Studenteee(4, "riya");
        Studenteee s5 = new Studenteee(5, "mita");
        Studenteee s6 = new Studenteee(6, "jita");
        Studenteee s7 = new Studenteee(7, "kita");
        Studenteee s8 = new Studenteee(8, "rita");
        Studenteee s9 = new Studenteee(9, "loly");
        Studenteee s10 = new Studenteee(10, "poly");
        List<Studenteee> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        
        for (Studenteee s : students){
            System.out.println(s);
        }

    }
}
