
package allxm;
public class MakeSummmExm {
    public static void main(String[] args) {
        System.out.println("Multiple: " + makeSummm(3, 6, "*")); 
         System.out.println("Minas: " + makeSummm(4, 3, "-")); 
         System.out.println("Sum: " + makeSummm(6, 9, "+")); 
         System.out.println("Divid: " + makeSummm(9, 3, "/")); 
         System.out.println("Modulas: " + makeSummm(7, 3, "%")); 
    }
    
    public static int makeSummm(int n1, int n2, String str){
    int rs = 0 ;
    if(str == "+"){
     rs = n1 + n2;
    }else if(str == "-"){
     rs = n1 - n2;
    }else if(str == "*"){
     rs = n1 * n2;
    }else if(str == "/"){
     rs = n1 / n2;
    }else if(str == "%"){
     rs = n1 % n2;
    }
    return rs;
    }
 
}
