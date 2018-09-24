
package immutableTest;
public class ImmutableBojai {
    private final int id;
    private  final String name;

    @Override
    public String toString() {
        return "ImmutableBojai{" + "id=" + id + ", name=" + name + '}';
    }

    public ImmutableBojai(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    
}
