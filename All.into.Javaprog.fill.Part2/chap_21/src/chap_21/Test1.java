
package chap_21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;

public class Test1 {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream Output = new ObjectOutputStream(
        new FileOutputStream("E:\\git\\Java_37\\All.into.Javaprog.fill.Part2\\chap_21\\test.dat")
        );
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("New York");
        LinkedHashSet<String> set2 = (LinkedHashSet<String>)set1.clone();
        
        set1.add("Atlanta");
        Output.writeObject(set1);
        Output.writeObject(set2);
        Output.close();
        
        
        ObjectInputStream input = new ObjectInputStream(
        new FileInputStream("E:\\git\\Java_37\\All.into.Javaprog.fill.Part2\\chap_21\\test.dat")
        );
        set1 = (LinkedHashSet<String>)input.readObject();
         set2 = (LinkedHashSet<String>)input.readObject();
         System.out.println(set1);
         System.out.println(set2);
         Output.close();
    }
    
}
