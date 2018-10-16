
package cha17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
    public static void main(String[] args) throws IOException{
       try (
               DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
          ){
       output.writeUTF("John");
       output.writeDouble(85.5);
       output.writeUTF("Jim");
       output.writeDouble(185.5);
       output.writeUTF("George");
       output.writeDouble(105.25);
       }
       try(
               DataInputStream input = new FileInputStream("temp.dat")
               )
    }
    
}
