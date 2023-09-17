package staticmethode;

public class StaticVariableMethod {
    static int a = m1();//static variable;
    static {
        System.out.println("static block");    //static block
    }
    static int m1(){
        System.out.println("from m1");
        return 20;

    }
    public static void main(String []args){
     //   System.out.println(m1());
     //   System.out.println("from mian");

    }
}
