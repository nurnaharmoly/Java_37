package cha10;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hi, ABC, good".matches("ABC "));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C, good".replaceAll(",;", "#"));
        System.out.println("A,B;C, good".replaceAll("[,;]", "#"));
        
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i< tokens.length; i++)
            System.out.println(tokens[i]+ "");
    }
}
