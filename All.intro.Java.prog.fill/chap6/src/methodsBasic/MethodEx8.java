
package methodsBasic;

public class MethodEx8 {
    
    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    
    public int makeMulti(int num1, int num2){
     int multiRs = num1 * num2;
     return multiRs;
    }
    
    public int makeSubstituteFromTwoMethod(int n1, int n2){
        int rs = makeMulti(n1, n2) - makeSum(n1, n2);
        return rs;
    }
    
    protected void makeMultiStingletMethod(int num1, int num2){
      int rs = (num1 * num2) - (num1 + num2);
        System.out.println("Rs: " + rs);
    }
}
