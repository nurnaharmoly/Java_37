
package cha10;
public class PalindomeEx {
    public static void main(String[] args) {
        System.out.println(isPalindom("wow"));
        String[] arrs = {"mom", "abc", "madam", "bye", "mim", "eye", "wow"};
        System.out.println(countPalimdom(arrs));
        String s1="Mom";
        String s2="mom";
        if(s1.equalsIgnoreCase(s2)){
        System.out.println("Ture");
        }else{
            System.out.println("False");
        }
        
    }
    public static boolean isPalindom(String s){
    
     boolean status = false;
      StringBuilder str = new StringBuilder(s);
      String newStr = String.valueOf(str.reverse());
      if (newStr.equalsIgnoreCase(s)){
       status = true;
      }
     return status;
     }
    
    public static int countPalimdom(String[] s){
    int counter = 0;
    for(int i = 0; i <s.length; i++){
     if(isPalindom(s[i])){
     counter++;
     }
    }
    
    return counter;
    
}
}