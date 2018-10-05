
package evidenceprec;
public class Palindam {
    
    public static void main(String[] args) {
        String[] arrs = {"mom", "wow", "madam", "bye", "mim", "eye"};
        System.out.println(countPalindom(arrs));
    }
    
    public static boolean isPalindom(String s){
      boolean status = false;
      StringBuilder str = new StringBuilder(s);
      String newStr = String.valueOf(str.reverse());
      if(newStr.equalsIgnoreCase(s)){
          status = true;
    }
      return status;
    }
   public static int countPalindom(String[] s){
     int counter =0 ;
     for(int i =0; i<s.length; i++){
     if(isPalindom(s[i])){
      counter++;
     }
     }
     return counter;
   }
}
