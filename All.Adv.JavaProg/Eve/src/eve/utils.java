
package eve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class utils {
    
    public static void writeTofile(String filname, List<Student> students) throws Exception {
        File destFile = new File(filname + ".txt" );
        try{
            if(destFile.exists() == false) {
                System.out.println("We had to make a new file.");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s: students){
                out.append(s.getName() +", " + s.getEmail() + ", "+ s.getAge() + s.getGender() + ", "+ s.getHobby()+ ", " + s.getRound()+ ", "+ s.getNote());
            }
            out.close();
     }catch (IOException e){
            System.out.println("COULD NOT LOG!!");
     }
    }
    public static void displayStudentsdataFromFile(String filename, DefaultTableModel model){
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while((line = reader.readLine()) != null)
                    { 
                    model.addRow(line.split(", "));
                    }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Buffered Reder issue.");
        }
    }
    
}
