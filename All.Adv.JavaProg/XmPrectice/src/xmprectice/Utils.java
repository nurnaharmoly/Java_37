
package xmprectice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utils {
//    this.id = id;
//        this.name = name;
//        this.email = email;
//        this.age = age;
//        this.gender = gender;
//        this.hobby = hobby;
//        this.round = round;
//        this.address = address;
//        this.Password = Password;
    
    public static void writeToFile(String filename, List<Student> students)throws Exception{
        File destFile = new File(filename + ".txt");
        
        try {
            if(destFile.exists() == false){
                System.out.println("We had to make a file");
            destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter( new  FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getId()+", "+s.getName()+", "+s.getEmail()+", "+s.getAge()+", "+s.getGender()+", "+s.getHobby()+", "+s.getRound()+", "+s.getAddress()+", "+s.getPassword()+"/n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("COULD NOT LOG!!"); 
        }
    }
    @SuppressWarnings("empty-statement")
    public static void displayStudentsdataFromFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while((line = reader.readLine()) != null){
            model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reder issue.");
        }
        
    }
    
}
