
package cha9;
public class ClassRoom {
    int id;
    String location;

    public ClassRoom() {
    }

    public ClassRoom(int id, String location) {
        this.id = id;
        this.location = location;
    }
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(302, "4th floor");
        System.out.println("ID: " + classRoom.getId());
        System.out.println("Location: " + classRoom.getLocation());
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
    
   
    @Override
    public String toString() {
        return "ClassRoom{" + "id=" + id + ", location=" + location + '}';
    }
 
}
