package addjavaevedince;

public class Student {

    private int ID;
    private String name;
    private String PassWord;
    private String email;
    private int age;
    private String gender;
    private String hobby;
    private String round;
    private String Mag;

    public Student() {
    }

    public Student(int ID, String name, String PassWord, String email, int age, String gender, String hobby, String round, String Mag) {
        this.ID = ID;
        this.name = name;
        this.PassWord = PassWord;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.Mag = Mag;
    }

    Student(String id, String name, String pw, String email, int parseInt, String gender, String hobby, String round, String mag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPassWord() {
        return PassWord;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getMag() {
        return Mag;
    }
    
    

}

