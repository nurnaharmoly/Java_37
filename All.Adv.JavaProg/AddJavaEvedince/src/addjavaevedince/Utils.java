
package addjavaevedince;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//this.ID = ID;
//        this.name = name;
//        this.PassWord = PassWord;
//        this.email = email;
//        this.age = age;
//        this.gender = gender;
//        this.hobby = hobby;
//        this.round = round;
//        this.Mag = Mag;
//    }

public class Utils {
    public static void writeToFile (String filename, List<Student> students)throws Exception{
        File destFile = new File(filename + ".txt" );
        
        try {
            if(destFile.exists() == false){
             System.out.println("We had to make a new file.");
             destFile.createNewFile();
         }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for(Student s : students){
            out.append(s.getID()+", "+ s.getName()+", "+ s.getPassWord()+ ", "+ s.getEmail()+", " +s.getAge()+", "+ s.getGender()+", "+ s.getHobby()+", "+ s.getRound()+","+ s.getMag() + "\n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("COULD NOT LOG!!");
        }
    }
  public static void displayStudentsDatafromFile(String filename, DefaultTableModel model) throws FileNotFoundException{
  String line;
      BufferedReader reader;
      try {
          reader = new BufferedReader(new FileReader(filename+ ".txt"));
          while((line = reader.readLine()) != null){
          model.addRow(line.split(", "));
      }
          reader.close();
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Buffered Reder issue.");
      }
  }
        
   
    
}
