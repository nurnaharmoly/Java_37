
package xmprectice;

public class Student {
   private String id;
   private String name;
   private String email;
   private int age;
   private String gender;
   private String hobby;
   private String round;
   private String address;
   private String Password;

    public Student() {
    }

    public Student(String id, String name, String email, int age, String gender, String hobby, String round, String address, String Password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.address = address;
        this.Password = Password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return Password;
    }
   
   
    
}
