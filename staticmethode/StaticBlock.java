package staticmethode;

public class StaticBlock {
    static int  a=10;
    static int b;
    static  {
        System.out.println("static block initialization");
        b=a*4;

    }
    private static void main(String []args){
        System.out.println("from main");
        System.out.println("value of a"+a);
        System.out.println("value of b"+b);
    }
}
