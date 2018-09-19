
package cha9;
public class Studenteee {
    private final int id;
    private final String name;

    public Studenteee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studenteee{" + "id=" + id + ", name=" + name + '}';
    }
    
    public Studenteee displayDetails(){
     Studenteee s = new Studenteee(100, "Mr asasa");
     return s;
    }
    
    public void displayDetails(Studenteee s){
    
    }
    
}
