
package chap_21;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class SetListPerformance {
    
    static final int N = 50000;
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++)
            list.add(i);
        Collections.shuffle(list);
        
        Collection<Integer> set1 = new HashSet<>();
        System.out.println("Member test time for hash set is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove element time for hash set is " + getRemoveTime(set1) + " milliseconds" );
        
        Collection<Integer> set2 = new LinkedHashSet<>();
        System.out.println("Member test time for Linked Hash Set is " + getTestTime(set2) + " milliseconds");
        System.out.println("Remove element time for Linked Hash Set is " + getRemoveTime(set2) + " milliseconds" );
        
        Collection<Integer> set3 = new TreeSet<>();
        System.out.println("Member test time for Tree Set is " + getTestTime(set3) + " milliseconds");
        System.out.println("Remove element time for Tree Set is " + getRemoveTime(set3) + " milliseconds" );
        
        Collection<Integer> set4 = new ArrayList<>();
        System.out.println("Member test time for Array List is " + getTestTime(set4) + " milliseconds");
        System.out.println("Remove element time for Array List is " + getRemoveTime(set4) + " milliseconds" );
        
        Collection<Integer> set5 = new LinkedList<>();
        System.out.println("Member test time for Linked List is " + getTestTime(set5) + " milliseconds");
        System.out.println("Remove element time for Linked List is " + getRemoveTime(set5) + " milliseconds" );
        
        
    }
    
    public static long getTestTime(Collection<Integer> c){
    long startTime = System.currentTimeMillis();
    
    for(int i = 0; i < N; i++)
        c.contains((int)(Math.random() * 2 * N) );
    
    return System.currentTimeMillis() - startTime;
    }
    
    public static long getRemoveTime(Collection<Integer> c){
    long startTime = System.currentTimeMillis();
    
    for(int i = 0; i < N; i++)
        c.remove(i);
    
    return System.currentTimeMillis() - startTime;
    
    }
    
}
