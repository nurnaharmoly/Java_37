
package xmfinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Utils {
    public static void writeToFile(String filename, List<Students> student) throws Exception{
        File destFile = new File(filename + ".txt");
        
        try {
            if(destFile.exists() == false){
            destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Students s : student) {
            out.append(s.getId()+", "+s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+", "+s.getHobby()+", "+s.getRound()+", "+s.getAddress()+", "+s.getPassword()+"/n");
         }
            out.close();
        } catch (Exception e) {
        }
   }
    public static void displayStudentDataFromFile(String filename, DefaultTableModel model){
        String line;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename+ ".txt"));
            while((line = reader.readLine()) != null){
            model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
        }
        
    }
    
 
}
