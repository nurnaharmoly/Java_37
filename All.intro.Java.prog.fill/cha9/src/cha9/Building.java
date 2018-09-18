
package cha9;
public class Building {
    int id;
    String name;
    String location;
    
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.setId(200);
        building1.setName("Hasina Vila");
        building1.setLocation("Gopalgonge");
        System.out.println("ID: " + building1.getId());
        System.out.println("Name: " + building1.getName());
         System.out.println("Location: " + building1.getLocation());
         
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Building{" + "id=" + id + ", name=" + name + ", location=" + location + '}';
    }
    
    
}
