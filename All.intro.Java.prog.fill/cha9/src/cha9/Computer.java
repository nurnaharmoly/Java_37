
package cha9;
public class Computer {
 int serialNumber;
 String Bannd;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBannd() {
        return Bannd;
    }

    public void setBannd(String Bannd) {
        this.Bannd = Bannd;
    }
 
 
    public static void main(String[] args) {
      Computer computer = new Computer();
      computer.setSerialNumber(1723672362);
      computer.setBannd("HP");
      
      int x = computer.getSerialNumber();
      String b = computer.getBannd();
        System.out.println("X: "+ x);
        System.out.println("X: "+ b);
        
    }
                                                                                                                          
}
