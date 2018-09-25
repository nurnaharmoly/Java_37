
package cha10;
public class StrinUilder {
    public static void main(String[] args) {
        StringBuilder strinUilder = new StringBuilder();
        strinUilder.append("Welcome");
        strinUilder.append(' ');
        strinUilder.append("to");
        strinUilder.append(' ');
        strinUilder.append("Java");
        
        System.out.println(strinUilder);
        
        System.out.println(strinUilder.delete(8, 11));
        System.out.println(strinUilder.deleteCharAt(8));
        System.out.println(strinUilder.reverse());
        System.out.println( strinUilder.replace(11, 15, "HTML"));
        strinUilder.setCharAt(0, 'w');
        System.out.println(strinUilder);
    }

}
