
package cha13;

import java.math.BigInteger;

public class SortComparableObject {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city : cities)
            System.out.println(city+ " ");
        System.out.println();
        
        BigInteger [] hugeNumbers = {new BigInteger("7634387487397"), new BigInteger("48347437483473"), new BigInteger("797778757457844")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number : hugeNumbers)
            System.out.println(number+" ");
    }
    
}
