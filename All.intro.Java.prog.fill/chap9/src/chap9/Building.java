
package chap9;
public class Building {
    int id;
    String name;
    String location;
    
    public static void main(String[] args) {
        Building building = new Building();
        building.setId(200);
        building.setName("Hasina villa");
        building.setLocation("Gopalganj");
        System.out.println("ID: " + building.getId());
        System.out.println("Name: " + building.getName());
        System.out.println("Locatio: " + building.getLocation());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
