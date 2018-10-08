
package chap_21;

import java.io.*;
import java.util.Scanner;

public class CountKeyWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file: ");
        String fileName = input.nextLine();
        
        File file = new File(fileName);
        if(file.exists()){
            System.out.println("The number of keywords in " + fileName) + " is " +countKeywords(file);
        }else{
            System.out.println("File " + fileName + " dose not exist");
        }
       
    }

   

    private static int CountKeyWord(File file) throws Exception {
      String[] keywordString = {"abs"
      
      
      }  
    }

   
    
}
