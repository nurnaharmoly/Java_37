
package chap9;
public class Teacher {
  int id;
  String name;
  String eduQu;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEduQu(String eduQu) {
        this.eduQu = eduQu;
    }


    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setId(2000);
        teacher.setName("Mr jukar");
        teacher.setEduQu("MBA");
        
        System.out.println("ID: "+teacher.getId());
        System.out.println("Name: "+ teacher.getName());
        System.out.println("EduQu: "+ teacher.getEduQu());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEduQu() {
        return eduQu;
    }
  
}
