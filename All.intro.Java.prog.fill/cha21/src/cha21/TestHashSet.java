
package cha21;

import static java.lang.reflect.Array.set;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
     public static void main(String[] args) {
       Set<String> set = new HashSet<>();
       
       set.add("London");
       set.add("Paris");
       set.add("New York");
       set.add("San Francisco");
       set.add("Beijing");
       
         System.out.println("set1 is " + set);
         System.out.println(set.size() +" elememt in set1");
         for (String s: set){
         System.out.print(s.toUpperCase()+ " ");
         }
         
       
    }
    
}
