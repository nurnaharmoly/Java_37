
package addjavaevi;
public class Students {
    private String id;
    private String name;
    private int age;
    private String email;
    private String gender;
    private String hobby;
    private String round;
    private String Address;
    private String password;

    public Students() {
    }

    public Students(String id, String name, int age, String email, String gender, String hobby, String round, String Address, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.Address = Address;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
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
        return Address;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
