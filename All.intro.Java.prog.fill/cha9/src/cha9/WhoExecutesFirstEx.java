package cha9;

public class WhoExecutesFirstEx {

    public WhoExecutesFirstEx() {
        System.out.println("I am Constractor");
    }

    public static void main(String[] args) {
        System.out.println("I am method");
    }

    static {
        System.out.println("I am block");
    }

}
