package methodsBasic;

public class MethodEx2 {

    static int p;
    static int q = 400;
    
public MethodEx2(){
}

public MethodEx2(int p){
 this.p=p;
}


    public static void main(String[] args) {

        System.out.println(display1());
        System.out.println(display2());
        System.out.println(display3());
        System.out.println(display4());

        int m1 = display1();
        System.out.println("M1: " + m1);

        int m2 = display2();
        System.out.println("M2: " + m2);

        int m3 = display3();
        System.out.println("M3: " + m3);

        int m4 = display4();
        System.out.println("M4: " + m4);

        MethodEx2 m = new MethodEx2();
        System.out.println("Method1: " + m.display1());
        System.out.println("Method1: " + m.display2());
        System.out.println("Method1: " + m.display3());
        System.out.println("Method1: " + m.display4());
    }

    public static int display1() {
        return 100;
    }

    public static int display2() {
        int x = 200;
        return x;
    }

    public static int display3() {
        p = 300;
        return p;
    }

    public static int display4() {
        return q;
    }

}
