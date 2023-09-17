package Static;

public class staticproblem {
    static int a=10;
    static  int b=20;
    static int c=30;
    void  Myclass(){
      a =200;
    }
    static void m1(){
        b=300;

    }
    static {
        c=400;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

        }



