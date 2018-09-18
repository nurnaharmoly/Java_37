package cha9;

//Setter and Getter based
// valu set korbo and get korbo
public class Teacher {

    // step 1 instance variable declare
    int id;
    String name;
    String educationQualification;

    public void setId(int id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    // step -2: Default neya (option)
    // step- 3 Take a main method  (optional)
    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    //step-4: create setter method
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.setId(2000);
        teacher.setName("Mr Rezaul");
        teacher.setEducationQualification("MBA");
        System.out.println("ID: " + teacher.getId() + " Name: " + teacher.getName() + " Edu " + teacher.getEducationQualification());

        Teacher teacher2 = new Teacher();

        teacher2.setId(3000);
        teacher2.setName("Mr rase");
        teacher2.setEducationQualification("MBA");
        System.out.println("ID: " + teacher2.getId());
        System.out.println("Name: " + teacher2.getName());
        System.out.println(teacher2.getEducationQualification());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

}
